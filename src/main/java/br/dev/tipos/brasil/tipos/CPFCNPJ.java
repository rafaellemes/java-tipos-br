package br.dev.tipos.brasil.tipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

import static br.dev.tipos.brasil.tipos.TiposUtil.limpaXss;
import static br.dev.tipos.brasil.tipos.TiposUtil.removeFormatacao;

/**
 * Invólucro (Wrapper) onde o campo pode ser cpf ou cnpj a partir da quantidade de caracteres passado o <br/>
 * por exemplo: se 11 ou menor será um CPF se não será um CNPJ
 *
 * @author Rafael Lemes <br/>
 * <a href="https://twitter.com/nenhumrafael">Twitter</a>
 * <a href="https://www.linkedin.com/in/rafael-lemes/">LinkedIn</a>
 */
public final class CPFCNPJ implements Serializable {

    private final static String MSG_NUMERO_INVALIDO = "O Parâmetro numero não pode ser nulo";
    private final static String MSG_NUMERO_NAO_NEGATIVO = "Numero não pode ser negativo";

    private CPF cpf;
    private CNPJ cnpj;

    private boolean ehCpf = false;

    /**
     * Cria um <b>CPFCNPJ</b> que irá representar um <b>CPF</b> ou <b>CNPJ</b>
     * baseado no valor passado como parâmeto <br/>
     * <p>
     * Se o número tiver 11 caracteres irá representar um <b>CPF</b>
     * Se o número tiver 14 caracteres irá representar um <b>CNPJ</b>
     * <br/>
     * Primeiro sempre tentará criar um CNPJ, se Falhar tentará criar um CPF. <br/>
     * Ex: Se passar o número 191, irá criar um CNPJ
     *
     * @param numero que representa um <b>CPF</b> ou <b>CNPJ</b> <br/>
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de CPF ou CNPJ for inválido
     */
    public CPFCNPJ(String numero) {

        Objects.requireNonNull(numero, MSG_NUMERO_INVALIDO);

        criaCpfOuCnpj(numero);

    }

    /**
     * Cria um <b>CPFCNPJ</b> que irá representar um <b>CPF</b> ou <b>CNPJ</b>
     * baseado no valor passado como parâmeto <br/>
     * <p>
     * Se o número tiver 11 caracteres irá representar um <b>CPF</b>
     * Se o número tiver 14 caracteres irá representar um <b>CNPJ</b>
     * <br/>
     * Primeiro sempre tentará criar um CNPJ, se Falhar tentará criar um CPF. <br/>
     * Ex: Se passar o número 191, irá criar um CNPJ
     * @param numero que representa um <b>CPF</b> ou <b>CNPJ</b> <br/>
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de <b>CPF</b> ou <b>CNPJ</b> for inválido ou menor que zero
     */
    public CPFCNPJ(Number numero) {
        Objects.requireNonNull(numero, MSG_NUMERO_INVALIDO);
        long num = numero.longValue();
        if (num < 0) {
            throw new IllegalArgumentException(MSG_NUMERO_NAO_NEGATIVO);
        }

        criaCpfOuCnpj(String.valueOf(num));

    }

    /**
     * Cria um <b>CPFCNPJ</b> que irá representar um <b>CPF</b> ou <b>CNPJ</b>
     * baseado no valor passado como parâmeto <br/>
     * <p>
     * Se o número tiver 11 caracteres irá representar um <b>CPF</b>
     * Se o número tiver 14 caracteres irá representar um <b>CNPJ</b>
     * <br/>
     * Primeiro sempre tentará criar um CNPJ, se Falhar tentará criar um CPF. <br/>
     * Ex: Se passar o número 191, irá criar um CNPJ
     *
     * @param numero que representa um <b>CPF</b> ou <b>CNPJ</b> <br/>
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de CPF ou CNPJ for inválido
     */
    public static CPFCNPJ de(String numero) {
        return new CPFCNPJ(numero);
    }

    /**
     * Cria um <b>CPFCNPJ</b> que irá representar um <b>CPF</b> ou <b>CNPJ</b>
     * baseado no valor passado como parâmeto <br/>
     *
     * Se o número tiver 11 caracteres irá representar um <b>CPF</b> <br/>
     * Se o número tiver 14 caracteres irá representar um <b>CNPJ</b>
     * <br/>
     * Primeiro sempre tentará criar um CNPJ, se Falhar tentará criar um CPF. <br/>
     * Ex: Se passar o número 191, irá criar um CNPJ
     *
     * @param numero que representa um <b>CPF</b> ou <b>CNPJ</b> <br/>
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de <b>CPF</b> ou <b>CNPJ</b> for inválido ou menor que zero
     */
    public static CPFCNPJ de(Number numero) {
        return new CPFCNPJ(numero);
    }

    /**
     * Cria uma cópia de um CPFCNPJ a partir de um já existente
     *
     * @param aCopiar representa um CPFCNPJ já existente
     * @return uma nova instância de CPFCNPJ
     * @throws NullPointerException se parâmetro aCopiar for nulo
     */
    public static CPFCNPJ copia(CPFCNPJ aCopiar) {

        Objects.requireNonNull(aCopiar, MSG_NUMERO_INVALIDO);
        return new CPFCNPJ(aCopiar.getNumero());
    }

    private void criaCpfOuCnpj(String numero) {

        String cpfcnpj = removeFormatacao(limpaXss(numero));


        try {
            this.cnpj = CNPJ.de(cpfcnpj);
            this.ehCpf = false;
            return;
        } catch (IllegalArgumentException ignored) {
        }

        try {
            this.cpf = CPF.de(cpfcnpj);
            this.ehCpf = true;
        } catch (IllegalArgumentException ignored) {
            throw new IllegalArgumentException(MSG_NUMERO_INVALIDO);
        }

    }


    /**
     * Retorna o <b>CPF</b> ou <b>CNPJ</b> como um valor numérico
     *
     * @return número que representa um  <b>CPF</b> ou <b>CNPJ</b>
     */
    public Number getNumero() {
        if (this.ehCpf) {
           return this.cpf.getNumero();
        }
        return this.cnpj.getNumero();
    }

    /**
     * Retorna o número do <b>CPF</b> ou <b>CNPJ</b> como um texto simples sem formatação
     *
     * @return texto que representa um cpf
     */
    public String getTexto() {
        if (this.ehCpf) {
            return this.cpf.getTexto();
        }
        return this.cnpj.getTexto();
    }

    /**
     * Se for <b>CPF</b> Retorna o valor no formato ###.###.###-##  <br/>
     * Se for <b>CNPJ</b> Retorna o valor no formato ##.###.###/####-## <br/>
     *
     * @return CNPJ formatado ou null se houver problema de conversão
     */
    public String getTextoFormatado() {
        if (this.ehCpf) {
            return this.cpf.getTextoFormatado();
        }
        return this.cnpj.getTextoFormatado();
    }

    /**
     * Informa se <b>CPFCNPJ</b> é um <b>CPF</b>
     *
     * @return verdadeiro se for um <b>CPF</b>
     */
    public boolean isCPF() {
        return ehCpf;
    }

    /**
     * Informa se <b>CPFCNPJ</b> é um <b>CNPJ</b>
     *
     * @return verdadeiro se for um <b>CNPJ</b>
     */
    public boolean isCNPJ() {
        return !ehCpf;
    }

    /**
     * Retorna um CPF caso represente um cpf ou vazio se for cnpj
     * @return opcional de CPF
     */
    public Optional<CPF> asCpf(){
        if(this.ehCpf){
            return Optional.of(CPF.copia(this.cpf));
        }
        return Optional.empty();
    }

    /**
     * Retorna um CNPJ caso Represente um cnpj ou vazio se for cpf
     * @return opcional de cnpj
     */
    public Optional<CNPJ> asCnpj(){
        if(!this.ehCpf){
            return Optional.of(CNPJ.copia(this.cnpj));
        }
        return Optional.empty();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPFCNPJ cpfcnpj = (CPFCNPJ) o;
        return Objects.equals(cpf, cpfcnpj.cpf) && Objects.equals(cnpj, cpfcnpj.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, cnpj);
    }

    @Override
    public String toString() {
        return "CPFCNPJ{" +
                "numero=" + (isCPF() ? cpf.getTextoFormatado() : cnpj.getTextoFormatado()) +
                ", isCpf=" + isCPF() +
                ", isCnpj=" + isCNPJ() +
                '}';
    }
}
