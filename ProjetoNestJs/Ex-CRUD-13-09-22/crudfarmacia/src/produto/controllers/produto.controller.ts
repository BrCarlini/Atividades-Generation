import { Controller, Get, HttpCode, HttpStatus, Param, ParseIntPipe, Post, Body, Put, Delete } from "@nestjs/common";
import { Produto } from "../entities/produto.entity";
import { ProdutoService } from "../service/produto.service";


@Controller('/produtoFarm')
export class ProdutoController {
    constructor(private readonly service: ProdutoService){}
    
    @Get()
    @HttpCode(HttpStatus.OK)
    findAll():Promise<Produto[]>{
        return this.service.findAll()
    }

    @Get('/:id') //tarefa/id
    @HttpCode(HttpStatus.OK)
    findBtId(@Param('id', ParseIntPipe) id: number): Promise<Produto> {
        return this.service.findById(id)
    }

    @Get('/buscar/:nome')
    @HttpCode(HttpStatus.OK)
    findByNome(@Param('nome') nome: string): Promise<Produto[]>{
        return this.service.findByNome(nome)
    }

    @Post()
    @HttpCode(HttpStatus.CREATED)
    create(@Body() tarefa: Produto): Promise<Produto>{
        return this.service.create(tarefa)
    }

    @Put()
    @HttpCode(HttpStatus.OK)
    update(@Body() tarefa: Produto): Promise<Produto>{
        return this.service.update(tarefa)
    }

    @Delete('/:id')
    @HttpCode(HttpStatus.NO_CONTENT)
    delete(@Param('id', ParseIntPipe) id: number){
        return this.service.delete(id)
    }
}