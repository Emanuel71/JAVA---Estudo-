import javax.sound.midi.SysexMessage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main (String[] args)  {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: maverick");

        //declarando uma variavel
        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        //Media das notas de filmes
        double media = ((9.8+6.3+8.0)/3);
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //Calcular a estrela do filme
        int classificacao;
        classificacao = (int)(media / 2); //Estamos forçando a converção (casting) de float para inteiro
        System.out.println(classificacao);

        //Atividade -> Conversão de Temperaturas
        double cels = 30.4;
        double fahren = (cels * 1.8) + 32;
        System.out.println(fahren);

    }
}