import java.util.Scanner;

public class VerifyNota {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nota a ser avaliada:");
        float n1 = sc.nextFloat();

        if (n1 >= 6){
            System.out.println("Nota maior ou igual a 6.");
        }
        else{
            System.out.println();
        }
    }
}
