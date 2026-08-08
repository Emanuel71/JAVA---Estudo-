import java.util.Scanner;

public class LeituraDados {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento");
        int ano = leitura.nextInt();
        System.out.println("Digite sua avaliação para esse filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}