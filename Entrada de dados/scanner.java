import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 = 0 , n2 = 0 , res = 0;

        System.out.println("Digite um numeral: ");
        n1 = scan.nextInt();

        System.out.println("Digite um outro numeral: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("Soma de %d com %d eh igual a %d",n1,n2,res);
    }
}
