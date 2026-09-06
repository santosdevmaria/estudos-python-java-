public class MaiorDoConj {
    public static void main(String[] args) {
        int numeros[] = {1, 10,9, 4, 8, 11, 20, 1,0};

        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println(maior);
    }
    
}
