import java.util.Scanner;

public class Fatorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para ver seu fatorial: ");
        int numero = sc.nextInt();
        int fatorial = 1; //off: amo não ser obrigada a inicializar uma variavel (mas aqui preciso)

        for(int i = numero; i >= 1; i--){
            fatorial *= i;
            System.out.println(fatorial);
        }

        System.out.printf("%d! = %d", numero,fatorial);
    }
}
