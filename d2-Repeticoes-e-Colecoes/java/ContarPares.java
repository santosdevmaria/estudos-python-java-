import java.util.ArrayList;


public class ContarPares {
    public static void main(String[] args){

        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 0; i < 1501; i+=2){
            pares.add(i);
        }

        System.out.println(pares);
        System.out.println(pares.size());
    }
}

/*
* Outras funções do Arraylist:
*.add()
*.remove()
*.get()
*.size()
*.contains()
*.indexOf()
*.isEmpty()
*
* Collections --> import java.util.Collections
* .sort()
* .reverse()
* .max()
* .min()
* */
