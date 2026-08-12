import java.util.Scanner;

public class LoopWhile {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;
        int totalNota = 0;

        while (nota != -1) {
            System.out.println("Digite a nota");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaNota += nota;
                totalNota++;
            }
        }
        double result = mediaNota/totalNota;
        System.out.println(String.format("Media é de %.2f", result));
    }
}
