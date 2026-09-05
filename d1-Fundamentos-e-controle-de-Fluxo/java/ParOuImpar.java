import java.util.Scanner;
        public class ParOuImpar {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite o número para verificação: ");
                int numero = sc.nextInt();

                int resto = numero % 2;

                if (resto == 0){
                    System.out.println("O número escolhido é par");
                } else if (resto == 1) {
                    System.out.println("O número escolhido é ímpar");
                }

                sc.close();
            }
}
