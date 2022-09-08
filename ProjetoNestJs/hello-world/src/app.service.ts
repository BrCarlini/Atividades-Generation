import { Injectable } from '@nestjs/common';

@Injectable()
export class AppService {
  getHello(): string {
    return 'Hello World!';
  }

  getSoma(n1: number, n2: number): string{
    return `${n1} + ${n2} = ${n1 + n2}`
  }


  getSubtracao(n1: number, n2: number): string{
    return `${n1} - ${n2} = ${n1 - n2}`
  }


  getMultiplicacao(n1: number, n2: number): string{
    return `${n1} x ${n2} = ${n1 * n2}`
  }


  getDivisao(n1: number, n2: number): string{
    return `${n1} / ${n2} = ${n1 / n2}`
  }


  getQuadrado(n1: number): string{
    return `${n1} x ${n1} = ${n1 * n1}`
  }

  
}
