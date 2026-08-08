import java.util.Scanner;

public class Condiocionais {
    static void main(String[] args) {
        int anoDeLancamento = 1998;
        boolean incluirPlano = true;
        double notaDoFilme = 8.6;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assitir");

        }
        if (incluirPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }

}