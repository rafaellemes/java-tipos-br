package br.dev.tipos.brasil.tipos;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

import static br.dev.tipos.brasil.tipos.TiposUtil.sanitiza;
import static br.dev.tipos.brasil.tipos.TiposUtil.transformaEmMaisculaPrimeiraLetraCadaPalavra;
import static java.util.Objects.requireNonNull;

/**
 * Classe que representa o Tipo Sigla <br/>
 * que é composto por um acrônimo e um nome por extenso
 *
 * @author Rafael Lemes <br/>
 * <a href="https://twitter.com/nenhumrafael">Twitter</a>
 * <a href="https://www.linkedin.com/in/rafael-lemes/">LinkedIn</a>
 */
public final class Sigla  implements Serializable {

    private final String acronimo;
    private final String nomeExtenso;


    /**
     * Cria uma Sigla a partir de um acrônimo e um nome por extenso <br/>
     * Ex: 'TSE - Tribunal Superior Eleitoral' <br/>
     * Obs: o acrônimo e o nome deve ser separado por ' - ' (espaço, traço, espaço)
     *
     * @param nomeCompleto obrigatório (não pode ser nulo)
     *
     * @throws IllegalArgumentException se não tiver o delimitador: ' - '; Se acrônimo menor que 2 caracteres;
     * se nome por extenso não tiver ao menos duas palavras e 3 caracteres cada
     * @throws NullPointerException se parâmetro for nulo
     */
    public Sigla(String nomeCompleto){

        requireNonNull(nomeCompleto);

        if(!nomeCompleto.contains(" - ")){
            throw new IllegalArgumentException("O Acrônimo e o Nome por extenso deve estar separado por ' - '");
        }

        final String sanitizado = sanitiza(nomeCompleto);
        final String[] split = sanitizado.split(" - ");

        final String sigla = split[0];
        final String nome = split[1];

        valida(sigla, nome);

        this.acronimo = sigla.toUpperCase(Locale.ROOT);
        this.nomeExtenso = nome;

    }

    /**
     * Cria uma Sigla a partir de um acrônimo (Ex: 'TSE') e um nome por extenso (Ex: 'Tribunal Superior Eleitoral') <br/>
     *
     * @param acronimo obrigátorio (não pode ser nulo)
     * @param nomeExtenso obrigátorio (não pode ser nulo)
     *
     * @throws IllegalArgumentException Se acrônimo menor que 2 caracteres;
     * se nome por extenso não tiver ao menos duas palavras e 3 caracteres cada
     * @throws NullPointerException se parâmetro for nulo
     */
    public Sigla(String acronimo, String nomeExtenso) {

        requireNonNull(acronimo);
        requireNonNull(nomeExtenso);

        final String sigla = sanitiza(acronimo);
        final String nome = sanitiza(nomeExtenso);

        valida(sigla, nome);

        this.acronimo = TiposUtil.normaliza(sigla.toUpperCase(Locale.ROOT));
        this.nomeExtenso = nome;
    }


    /**
     * Cria uma Sigla a partir de um acrônimo (Ex: 'TSE') e um nome por extenso (Ex: 'Tribunal Superior Eleitoral') <br/>
     *
     * @param acronimo obrigátorio (não pode ser nulo)
     * @param nomeExtenso obrigátorio (não pode ser nulo)
     *
     * @throws IllegalArgumentException Se acrônimo menor que 2 caracteres;
     * se nome por extenso não tiver ao menos duas palavras e 3 caracteres cada
     * @throws NullPointerException se parâmetro for nulo
     */
    public static Sigla de(String acronimo, String nomeExtenso){
         return new Sigla(acronimo, nomeExtenso);
    }

    /**
     * Cria uma Sigla a partir de um acrônimo e um nome por extenso <br/>
     * Ex: 'TSE - Tribunal Superior Eleitoral' <br/>
     * Obs: o acrônimo e o nome deve ser separado por ' - ' (espaço, traço, espaço)
     *
     * @param nomeCompleto obrigatório (não pode ser nulo)
     *
     * @throws IllegalArgumentException se não tiver o delimitador: ' - '; Se acrônimo menor que 2 caracteres;
     * se nome por extenso não tiver ao menos duas palavras e 3 caracteres cada
     * @throws NullPointerException se parâmetro for nulo
     */
    public static Sigla de(String nomeCompleto){
        return new Sigla(nomeCompleto);
    }

    /**
     * Cria uma cópia de uma Sigla a partir de um já existente <br/>
     * @param aCopiar representa uma Sigla já existente
     * @return uma nova instância de Sigla
     * @throws NullPointerException se parâmetro aCopiar for nulo
     */
    public static Sigla copia(Sigla aCopiar){
        Objects.requireNonNull(aCopiar, "Sigla obrigatória");
        return new Sigla(aCopiar.acronimo, aCopiar.nomeExtenso);
    }


    /**
     *
     * Retorna o Acrônimo da Sigla (ex: ´TSE´)
     *
     * @return string que representa um acrônimo
     */
    public String getAcronimo() {
        return acronimo;
    }

    /**
     * Retorna o nome completo (por extenso) da sigla (ex: 'Tribunal Superior Eleitoral')
     * @return String que representa um nome por extenso
     */
    public String getNomeExtenso() {
        return nomeExtenso;
    }


    /**
     * Retorna uma nova Instância de Sigla com o nome completo (por extenso) da sigla Capitalizado (sem acentos) <br/>
     * (ex: se 'Superintendência dos Serviços Penitenciários' ficará: 'Superintendencia dos Servicos Penitenciarios')
     * @return Sigla que representa uma sigla (acrônimo e Nome por Extenso)
     */
    public Sigla normaliza(){
        return new Sigla(
                this.acronimo, TiposUtil.normaliza(this.nomeExtenso));
    }


    /**
     * Retorna uma nova Instância de Sigla com o nome completo (por extenso) da sigla Capitalizado <br/>
     * (ex: 'Tribunal Superior Eleitoral')
     * @return Sigla que representa uma sigla (acrônimo e Nome por Extenso)
     */
    public Sigla primeiraLetraCadaPalavraMaiscula(){
        return new Sigla(this.acronimo, capitaliza(this.nomeExtenso));
    }

    /**
     * Retorna uma nova Instância de Sigla com o acrônimo e o nome completo (por extenso) da sigla em caixa alta <br/>
     * (ex: 'TRIBUNAL SUPERIOR ELEITORAL')
     * @return Sigla que representa uma sigla (acrônimo e Nome por Extenso)
     */
    public Sigla caixaAlta(){
        return new Sigla(
                this.acronimo,
                this.nomeExtenso.toUpperCase(Locale.ROOT));
    }



    /**
     * Retorna uma nova Instância de Sigla com o acrônimo e o nome completo (por extenso) da sigla em caixa alta <br/>
     * (ex: 'tribunal superior eleitoral')
     * @return Sigla que representa uma sigla (acrônimo e Nome por Extenso)
     */
    public Sigla caixaBaixa(){
        return new Sigla(
                this.acronimo,
                this.nomeExtenso.toLowerCase(Locale.ROOT));
    }

    @Override
    public String toString() {
        return "Sigla{" +
                "acronimo='" + acronimo + '\'' +
                ", nomeExtenso='" + nomeExtenso + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sigla sigla = (Sigla) o;
        return this.acronimo.equals(sigla.acronimo)
                && TiposUtil.normaliza(this.nomeExtenso).equalsIgnoreCase(TiposUtil.normaliza(sigla.nomeExtenso));
    }

    @Override
    public int hashCode() {
        return Objects.hash(acronimo, nomeExtenso);
    }

    private static void valida(String acronimo, String nomeExtenso) {
        if(acronimo.trim().length() < 2){
            throw new IllegalArgumentException("Acrônimo deve ter ao menos 2 caracteres");
        }

        if(!nomeExtenso.trim().contains(" ")){
            throw new IllegalArgumentException("Nome por extenso Deve ter ao menos 2 Palavras");
        }

    }
    private String capitaliza(String val){

        return transformaEmMaisculaPrimeiraLetraCadaPalavra(val, " ");

    }
}
