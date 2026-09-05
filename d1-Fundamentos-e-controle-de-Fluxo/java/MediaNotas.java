import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota: ");
        float n1 = sc.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        float n2 = sc.nextFloat();

        System.out.println("Digite o valor da terceira nota: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3)/3;

        System.out.printf("A média das três notas foi de: %.2f%n", media);

    }
}
