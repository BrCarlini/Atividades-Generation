import { Controller, Get } from '@nestjs/common';
import { AppService } from './app.service';

@Controller('api')
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get('/hello')
  getHello(): string {
    return this.appService.getHello();
  }


  @Get('/soma')
  getSoma(){
      return this.appService.getSoma(20, 2)
  }

  @Get('/subtracao')
  getSubtracao(){
      return this.appService.getSubtracao(20, 2)
  }

  @Get('/multiplicacao')
  getMultiplicacao(){
      return this.appService.getMultiplicacao(20, 2)
  }

  @Get('/divisao')
  getDivisao(){
      return this.appService.getDivisao(20, 2)
  }

  @Get('/quadrado')
  getQuadrado(){
      return this.appService.getQuadrado(20)
  }
}