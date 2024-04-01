package screenmatch;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class main {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Fodase");
        meuFilme.setDuracaoEmMinutos(1);
        meuFilme.setDuracaoEmMinutos(2024);
        meuFilme.exibeFichaTecnica();

        System.out.println(meuFilme.getTotalAvaliacao());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2007);
        lost.setTemporadas(9);
        lost.exibeFichaTecnica();

        System.out.println(lost.getTotalAvaliacao());

    }
}