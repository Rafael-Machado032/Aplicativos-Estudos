public class ififelseswitchternario {
    public static void main(String[] args) {

        int nota = 70;
        int media = 60;
        String res;

        System.out.println("Reposta If Else");

        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (nota >= 40) {
            System.out.println("Recuperacao");

        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Reposta Ternaria");

        res = (nota >= media ? "Aprovado" : "Reprovado"); // Ternario

        System.out.println(res);

        int pos = 1;

        System.out.println("Resposta switch");

        switch (pos) {
        case 1:
            System.out.println("Primeiro lugar");
            break;
        case 2:
            System.out.println("Segundo lugar");
            break;
        case 3:
            System.out.println("Terceiro lugar");
            break;

        default:
            System.out.println("Nao subiu no podio");
            break;
        }

        System.out.println("Fim do programa");

    }

}