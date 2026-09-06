import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        System.out.printf("A tabuada de %d é: %n", numero);

        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, numero, (i*numero));
        }
    }
}

/*
* Formatação no printf
* %d - int
* %f - float
* %s - string
* %c - char
* %b - bool
* %n - quebra de linha
*
* */