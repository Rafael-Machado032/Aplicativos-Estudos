import java.util.Scanner;
/**
 * array
 */
public class array {

    public static void main(String[] args) {

        final int tam = 5; //Final eh igual uma constante
        
        int [] numero = {10,20,30,40,50,60,70,80,90,100}; //Coleção de variaveis um array
        int [] num = new int [tam]; //Um array estaciado 5 posisão
        
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 2;
        num[4] = 1;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }


        char[] gabarito = {'a','a','d','b','c'};
        char[] resposta = new char[gabarito.length];
        int nota = 0;
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < gabarito.length; i++) {
                System.out.printf("Digite a resposta da questão %d: ", i);
                resposta[i] = scan.nextLine().charAt(0);

            }
        }

        for (int i = 0; i < gabarito.length; i++) {
            if (resposta[i]==gabarito[i]) {
                nota++;
            }
        }

        System.out.printf("A nota é %d.",nota);

    }
}