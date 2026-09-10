import java.util.Scanner;
import java.util.ArrayList;

public class SistemaNotas {
    private static void addNota(ArrayList<Integer> lista, int nota){
        lista.add(nota);
    }

    private static double mediaNotas(ArrayList<Integer> lista){
        double soma = 0;
        for(int i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }
        return soma/ lista.size();
    }

    private static String verSituacao(ArrayList<Integer> lista){
        double media = mediaNotas(lista);
        if(media >= 6){
            return "aprovado";
        }else{
            return "reprovado";
        }
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNotas = new ArrayList<>();
        boolean executando = true;

        while (executando){
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Inserir nota: ");
            System.out.println("2 - Ver média: ");
            System.out.println("3 - Ver situação: ");
            System.out.println("4 - Sair");
            int opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Insira nota: ");
                    int nota = sc.nextInt();
                    addNota(listaNotas, nota);
                    System.out.println(listaNotas);
                    System.out.println();
                    break;

                case 2:
                    double media = mediaNotas(listaNotas);
                    System.out.printf("A média do aluno é: %.2f%n", media);
                    System.out.println();
                    break;

                case 3:
                    String situacao = verSituacao(listaNotas);
                    System.out.printf("O aluno está atualmente %s%n", situacao);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    System.out.println();
                    executando = false;
                    break;
            }
        }

    }
}
