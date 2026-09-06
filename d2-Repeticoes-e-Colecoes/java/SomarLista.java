public class SomarLista {
    public static void main(String[] args){
        int numeros[] = {5, 9, 0, 6, 8, 4, 8, 0};

        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}

/*
*  String[] cars = new String[4]; --> cria uma array com 4 espaços pra preencher com o tempo
* No Java, quando trabalhamos com um Array tradicional (estático),
* ele tem um tamanho fixo definido na criação. Por isso, você não
* pode usar metodos como em py
* */
