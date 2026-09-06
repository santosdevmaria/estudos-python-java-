public class For1a100 {
    public static void main (String[] args){
        for(int i = 0; i <= 100; i++){ // aqui tem que declarar int i e não tem range
            System.out.println(i);
        }

        for(int i = 1; i < 101; i++){ // só colocaria 101 se fosse desse jeito, ele não seria incluso
            System.out.println(i);
        }

        for(int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }
    }
}
