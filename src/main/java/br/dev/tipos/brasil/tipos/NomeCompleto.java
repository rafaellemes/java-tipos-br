package br.dev.tipos.brasil.tipos;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static br.dev.tipos.brasil.tipos.TiposUtil.sanitiza;
import static br.dev.tipos.brasil.tipos.TiposUtil.transformaEmMaisculaPrimeiraLetraCadaPalavra;
import static java.util.Objects.requireNonNull;

/**
 * Classe que representa o Tipo NomeCompleto <br/>
 * Que deve ser composto por Nome e Sobrenome
 *
 * @author Rafael Lemes <br/>
 * <a href="https://twitter.com/nenhumrafael">Twitter</a>
 * <a href="https://www.linkedin.com/in/rafael-lemes/">LinkedIn</a>
 */
public class NomeCompleto implements Serializable {

    private final String nomePorExtenso;
    private final String nome;
    private final String sobrenome;


    public NomeCompleto(String nomeCompleto){
        requireNonNull(nomeCompleto);
        String nome = sanitiza(nomeCompleto);
        valida(nome);
        this.nomePorExtenso = nome;
        this.nome = extraiNome();
        this.sobrenome = extraiSobrenome();
    }

    public NomeCompleto(String nome, String sobrenome){
        requireNonNull(nome);
        requireNonNull(sobrenome);
        validaNomeOuSobrenome(sanitiza(nome));
        validaNomeOuSobrenome(sanitiza(sobrenome));

        String nomeCompleto = String.join(" ", nome, sobrenome);
        valida(nomeCompleto);
        this.nomePorExtenso = nomeCompleto;
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public static NomeCompleto de(String nome, String sobrenome){
        return new NomeCompleto(nome, sobrenome);
    }

    public static NomeCompleto de(String nome){
        return new NomeCompleto(nome);
    }


    public static NomeCompleto copia(NomeCompleto aCopiar){
        Objects.requireNonNull(aCopiar, "NomeCompleto é obrigatório");
        return new NomeCompleto(aCopiar.nomePorExtenso);
    }

    public String getNomePorExtenso() {
        return nomePorExtenso;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }


    public int tamanho(){
        return nomePorExtenso.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NomeCompleto that = (NomeCompleto) o;
        return TiposUtil.normaliza(this.nomePorExtenso).equalsIgnoreCase(TiposUtil.normaliza(that.nomePorExtenso))
                    && TiposUtil.normaliza(this.nome).equalsIgnoreCase(TiposUtil.normaliza(that.nome))
                    && TiposUtil.normaliza(this.sobrenome).equalsIgnoreCase(TiposUtil.normaliza(that.sobrenome));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePorExtenso, nome, sobrenome);
    }

    @Override
    public String toString() {
        return "NomeCompleto{" +
                "texto='" + nomePorExtenso + '\'' +
                '}';
    }



    private String extraiNome(){
        return nomePorExtenso.split(" ")[0];
    }

    private String extraiSobrenome(){
        return Stream.of(nomePorExtenso.split(" "))
                .skip(1)
                .collect(Collectors.joining(" "));
    }


    private void validaNomeOuSobrenome(String valor){
        if(valor.isBlank()
                || valor.trim().length() < 3){
            throw new IllegalArgumentException("Deve ter ao menos dois caracteres, e Deve ser Composto por Nome e Sobrenome");
        }
    }

    private void valida(String nomeCompleto){

        if(nomeCompleto.isBlank()
                || nomeCompleto.length() < 3
                || !nomeCompleto.contains(" ")){
            throw new IllegalArgumentException("Deve ter ao menos dois caracteres, e Deve ser Composto por Nome e Sobrenome");
        }

    }

    /**
     * Retorna uma nova Instância de NomeCompleto com o nome completo normalizado (sem acentos) <br/>
     * (ex: 'Joao Da Silva')
     * @return NomeCompleto que representa um nome
     */
    public NomeCompleto normaliza(){
        return new NomeCompleto(
                TiposUtil.normaliza(this.nome), TiposUtil.normaliza(this.sobrenome));
    }

    /**
     * Retorna uma nova Instância de NomeCompleto com o nome completo capitalizado <br/>
     * (ex: 'João Da Silva')
     * @return NomeCompleto que representa um nome
     */
    public NomeCompleto primeiraLetraCadaPalavraMaiscula(){
        return new NomeCompleto(capitaliza(this.nome), capitaliza(this.sobrenome));
    }

    /**
     * Retorna uma nova Instância de NomeCompleto com o nome completo em caixa alta <br/>
     * (ex: 'JOÃO DA SILVA')
     * @return NomeCompleto que representa um nome
     */
    public NomeCompleto caixaAlta(){
        return new NomeCompleto(
                this.nome.toUpperCase(Locale.ROOT),
                this.sobrenome.toUpperCase(Locale.ROOT));
    }


    /**
     * Retorna uma nova Instância de NomeCompleto com o nome completo em caixa baixa <br/>
     * (ex: 'joão da silva')
     * @return NomeCompleto que representa um nome
     */
    public NomeCompleto caixaBaixa(){
        return new NomeCompleto(
                this.nome.toLowerCase(Locale.ROOT),
                this.sobrenome.toLowerCase(Locale.ROOT));
    }

    private String capitaliza(String val){

        return transformaEmMaisculaPrimeiraLetraCadaPalavra(val, " ");

    }


}
