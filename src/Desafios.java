public class Desafios {
    public static void main(){
        // Desaf1.1 - Media de duas notas
        double media1 = 8.0;
        double media2 = 4.5;
        double mediaF = ((media1+media2)/2);
        System.out.println(String.format("1.A media do aluno - é de: %.2f.%n", mediaF));


        //Desaf1.2 - Declare uma variavel double e uma int e faz casting
        int num1 = 6;
        double num2 = 5.3;
        int resul = (int) (num1+num2);
        System.out.println(String.format("2.O resultado convertido para inteiro, ficou de %d.%n",resul));


        //Desaf1.3 - Concatenar duas variaveis diferente
        String str2 = "Emanuel";
        char str1 = 'C';
        System.out.println(String.format("3.Meu nome é: %s %s.%n",str2, str1));

        //Desaf1.4 - Faz uma multiplicação entre duas variaveis e apresente o result em uma mensagem
        double precoProd = 15.99;
        int qtd = 7;
        int result = (int) (precoProd*qtd);
        System.out.println(String.format("4.Comprando %d pizza de R$ %.2f. Sairá no valor de R$ %d,00.%n", qtd, precoProd, result));


        //Desaf1.5 - Faz uma conversão de valor em dólar para reais e imprima o resultado
        double valorD = 153.67;
        double valorR = 4.94; // = Dólar - $1.00
        double conver = (153.67*4.94);
        System.out.println(String.format("5.Valor de $%.2f em dólar, convertido ficára em R$%.2f.%n", valorD, conver));

        //Desaf1.6 - Aplicar um desconto em um valor original.
        double precoO = 110.00;
        double desconto = 0.10;
        double precoDesc = (precoO-(precoO*desconto));
        System.out.println(String.format("6.Oferta, comprando qualquer camisa de time e o pagamento via pix terá dez porcento de desconto - de R$%.2f por R$%.2f.%n", precoO, precoDesc));
    // subindo para git
    }
}
