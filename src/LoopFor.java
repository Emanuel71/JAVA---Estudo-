import java.util.Scanner;
public class LoopFor {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota= 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite sua nota:");
            nota = leitura.nextDouble();
           mediaNota+= nota;
        }
        System.out.println(String.format("Média do aluno: %.2f",mediaNota));
    }
}
