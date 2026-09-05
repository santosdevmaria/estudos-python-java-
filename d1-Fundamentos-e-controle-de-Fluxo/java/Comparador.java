import java.util.Scanner;

public class Comparador {
    public void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int n1 = sc.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else if (n1 == n2) {
            System.out.println("Os valores são iguais");
        }
        else{
            System.out.println(n2 + " é maior que " + n1);
        }
    }
}
