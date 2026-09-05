import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Insira a operação a ser feita: ");
        char op = sc.next().charAt(0);

        if (op == '+'){
            System.out.println("O resultado é: " + n1+n2);
        }else if (op == '-') {
            System.out.println("O resultado é: " + (n1-n2));
        }else if (op == '*'){
            System.out.println("O resultado é: " + n1*n2);
        }else if (op == '/'){
            if (n1 == 0 || n2 == 0){
                System.out.println("Erro: divisões com 0");
            }
            else{
                System.out.println("O resultado é: " + n1/n2);
            }
        }
    }

}
