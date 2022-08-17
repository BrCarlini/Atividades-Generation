fun main() {
    /*
    enquanto - while
    faça enquanto - do while
    para - for

    */

    var cont = 0
    while(cont <= 10){
        println(cont)
        cont++
    }

    println("==============================")

    var cont2 = 0
    do{
        println(cont2)
        cont2++
    }while(cont2 <= 10)

    println("==============================")

    //downTo - Range de forma decrescente
    //step - vai indicar o número de passos entre o range
    //until - fará o range normalmente, porém desconsiderará o último número
    for(i in 10 downTo 0 step 2){
        println(i)
    }
}