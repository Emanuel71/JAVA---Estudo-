import java.util.Random;
import java.util.Scanner;

public class Desafio_ProgramaSorteio {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int tentativa = 0;
        int numero = 0;
        int numeroSort = new Random().nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite seu nuemro da sorte:");
            numero = leitura.nextInt();
            System.out.println(numeroSort);

            if (numero == numeroSort) {
                System.out.println("Parabens voce acerto o numero sorteado " + numero);
                break;
        }    else if (i < 5 && numero > numeroSort) {
                System.out.println("Não foi dessa vez - Tente numero menor");

            }else if (i < 5 && numero < numeroSort) {
                System.out.println("Não foi dessa vez - Tente numero maior");
        }   else if (i == 5){
                System.out.println("Suas tentativas acabou, tente no proxómo bingo");

            }

    }
}
}