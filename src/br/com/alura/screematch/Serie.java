package br.com.alura.screematch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int episodiostemporada;
    private int minutosepisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiostemporada() {
        return episodiostemporada;
    }

    public void setEpisodiostemporada(int episodiostemporada) {
        this.episodiostemporada = episodiostemporada;
    }

    public int getMinutosepisodio() {
        return minutosepisodio;
    }

    public void setMinutosepisodio(int minutosepisodio) {
        this.minutosepisodio = minutosepisodio;
    }

}