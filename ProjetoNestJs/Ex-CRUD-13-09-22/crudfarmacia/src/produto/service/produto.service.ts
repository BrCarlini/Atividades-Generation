import { HttpException, HttpStatus, Injectable } from "@nestjs/common";
import { InjectRepository } from "@nestjs/typeorm";
import { DeleteResult, ILike, Repository } from "typeorm";
import { Produto } from "../entities/produto.entity";

@Injectable()
export class ProdutoService {
    
    constructor(
        @InjectRepository(Produto)
        private produtoRepository: Repository<Produto>
    ){}

    async findAll(): Promise<Produto[]> {
        return this.produtoRepository.find({

            relations: {
                categoria: true
            }
        })
    }


    async findById(id: number): Promise<Produto> {
        let produto = await this.produtoRepository.findOne({
            where: {
                id
            },

            relations: {
                categoria: true
            }
        })

        if(!produto)
            throw new HttpException('Produto não foi encontrado!', HttpStatus.NOT_FOUND)
        return produto
    }

    async findByNome(nome: string): Promise<Produto[]>{
        return this.produtoRepository.find({
            where: {
                nome: ILike(`%${nome}%`)
            },
            relations: {
                categoria: true
            }
        })
    }

    async create(tarefa: Produto): Promise<Produto> {
        return this.produtoRepository.save(tarefa)
    }

    async update(tarefa: Produto): Promise<Produto> {
        let tarefaUpdate = await this.findById(tarefa.id)

        if(!tarefaUpdate || !tarefa.id)
            throw new HttpException('Produto não foi encontrado!', HttpStatus.NOT_FOUND)

        return this.produtoRepository.save(tarefa)
    }

    async delete(id: number): Promise<DeleteResult> {
        let tarefaDelete = await this.findById(id)

        if(!tarefaDelete)
            throw new HttpException('Produto não foi encontrado!', HttpStatus.NOT_FOUND)

        return this.produtoRepository.delete(id)
    }
}