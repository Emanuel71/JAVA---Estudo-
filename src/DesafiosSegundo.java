import java.util.Scanner;

public class DesafiosSegundo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num =  sc.nextInt();
        if (num >=0){
            System.out.println("Número Positivo");
            }
        else{
            System.out.println("Número Negativo");
            }
        }

    static void exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1° numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite 2° numero: ");
        int num2 = sc.nextInt();
            if (num1 == num2){
                System.out.println("Números iguais");
            }
            else if (num1 != num2 && num1 > num2){
                System.out.println("Números diferente e primeiro numero é maior");
            }
            else if (num1 != num2 && num2 > num1){
                System.out.println("Números diferente e segundo numero é maior");
            }
        }
    static void exercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a operação: 1-área do quadrado / 2-área do círculo");
        int opcao = sc.nextInt();
        System.out.println("Digite a area: ");
        double num = sc.nextDouble();

        if (opcao == 1) {
            double pot = Math.pow(num,2);
            System.out.println("Area do quadro é de: " + pot);

        } else if (opcao == 2) {
            double pot = Math.pow(num, 2);
            double mult = (pot * 3.14);
            System.out.println("Area do círculo é de: " + mult);

        } else if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida");
        }
    }

    static void exercicio4() {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite numero da tabuada que deseja:");
        int num = sc.nextInt();
        System.out.println("Tabuada do " + num);
        while (cont <= 10) {
            int mult = num * cont;
            System.out.println(String.format("%d x %d = %d", num, cont, mult));
            cont++;
        }

    }
}