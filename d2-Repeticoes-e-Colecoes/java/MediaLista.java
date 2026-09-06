
public class MediaLista {
    public static void main (String[] args){
        int[] numeros = {15, 28, 42, 9, 33, 51, 18};
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        double media = soma/numeros.length;

        System.out.printf("A média dos valores é: %.2f %n", media); //aqui a formatação ficou %.2f por conta dos dois decimais e o %f pra float
    }
}
