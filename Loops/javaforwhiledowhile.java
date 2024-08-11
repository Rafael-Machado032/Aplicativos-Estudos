/**
 * javaforwhiledowhile
 */
public class javaforwhiledowhile {

    public static void main(String[] args) {

        /*FOR */
        for (int i = 0; i <= 10; i++) { //Utiliza quando saber o quanto quer contar
            System.out.println(i);  //Imprime do 1 ao 10
        }

        /*WHILE */
        int cont = 0;
        while (cont<20) {
            System.out.println(cont);
            cont++;
        }

        do {
            System.out.println(cont);
            cont--;
        } while (cont>0);

    }
}