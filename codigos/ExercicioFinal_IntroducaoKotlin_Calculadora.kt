fun main(){
       // Substitua os valores das variáveis 'a' e 'b' a seguir por números decimais
       // Para isso, utilize ponto no lugar da vírgula e 'f' no final
       // Substitua o valor da variável 'opção' conforme números a seguir:
       // 1- Soma 
       // 2- Subtração 
       // 3- Divisão 
       // 4- Multiplicação

        var a:Float? = 10.99f
        var b:Float? = 1.01f

        if (a != null && b != null) {
              println("Valores preenchidos corretamente. Aplicando operador...")
              
        	val opcao = 1
              var resultado:Float? = null

              when (opcao) {
            	1 -> resultado = a.plus(b)
              2 -> resultado = a.minus(b)
              3 -> resultado = a.div(b)
              4 -> resultado = a.times(b)
            	else -> {
              println("Operador inválido. Substitua o valor de 'opcao' conforme orientações iniciais.")}}
              println("Resultado da operação: $resultado")
        } else {
        println("Erro: valor nulo. Substituia 'a' e 'b' por números válidos.")}
    }
