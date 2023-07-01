package br.dev.tipos.brasil.tipos;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Classe que representa um CPF (Cadastro de Pessoa Física)
 *
 * @author Rafael Lemes
 *
 */
public class CPF {

    private static final String CPF_INVALIDO = "CPF Inválido";
    private static final int[] peso = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    private final String numero;

    /**
     * Cria um CPF baseado no número de cpf
     *
     * @param numero que representa um cpf <br/>
     *               (pode ser passado como um texto simples ou seguindo a formatação  ###.###.###-##)
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de cpf inválido
     */
    public CPF(String numero) {

        Objects.requireNonNull(numero, CPF_INVALIDO);
        String semFormatacao = preencheComZeroAEsquerda(removeFormatacao(numero));
        validaCpf(semFormatacao);
        this.numero = semFormatacao;
    }


    /**
     * Cria um CPF baseado no número de cpf
     *
     * @param numero que representa um cpf*
     * @throws IllegalArgumentException se o número for menor que zero ou o cpf inválido
     * @throws NullPointerException se o parâmetro numero for nulo
     */
    public CPF(Number numero) {

        Objects.requireNonNull(numero, CPF_INVALIDO);
        long numCpf = numero.longValue();
        if (numCpf < 0) {
            throw new IllegalArgumentException(CPF_INVALIDO);
        }
        String str = preencheComZeroAEsquerda(String.valueOf(numCpf));
        validaCpf(str);
        this.numero = str;

    }


    /**
     * Cria um CPF baseado no número de cpf
     *
     * @param numero que representa um cpf <br/>
     *               (pode ser passado como um texto simples ou seguindo a formatação  ###.###.###-##)
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de cpf inválido
     */
    public static CPF de(String numero){
        return new CPF(numero);
    }

    /**
     * Cria um CPF baseado no número de cpf
     *
     * @param numero que representa um cpf*
     * @throws IllegalArgumentException se o número for menor que zero ou o cpf inválido
     * @throws NullPointerException se o parâmetro numero for nulo
     */
    public static CPF de(Number numero){
        return new CPF(numero);
    }


    /**
     * Cria uma cópia de um CPF a partir de um já existente
     *
     * @param aCopiar representa um CPF já existente
     * @return uma nova instância de CPF
     * @throws NullPointerException se parâmetro aCopiar for nulo
     */
    public static CPF copia(CPF aCopiar){

        Objects.requireNonNull(aCopiar, CPF_INVALIDO);
        return new CPF(aCopiar.getNumero());
    }


    /**
     * Retorna o Cpf como texto no formato ###.###.###-## <br/>
     *
     * @return Cpf formatado ou null se houver problema de conversão
     */
    public String getTextoFormatado() {
        //TODO marcar como nullalble, Optional ou lançar uma RuntimeException?
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(getTexto());
        } catch (ParseException ignored) {
        }

        return null;
    }

    /**
     * Retorna o número do CPF como um texto simples sem formatação
     *
     * @return cpf
     */
    public String getTexto() {
        return this.numero;
    }


    /**
     * Retorna o CPF como um valor numérico
     *
     * @return cpf
     */
    public Number getNumero() {
        return Long.valueOf(numero);
    }




    @Override
    public String toString() {
        return getTexto();
    }
    private void validaCpf(String numero) {

        if (numero.isBlank() || !isCPF(numero)) {
            throw new IllegalArgumentException(CPF_INVALIDO);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf = (CPF) o;
        return numero.equals(cpf.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }


    private boolean isCPF(String cpf) {
        // Verifica se o número está fora do padrão de cpf ou de cpf formatado.
        // Pattern do CPF com e sem formatação
        String pattern = "\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (!Pattern.compile(pattern).matcher(cpf).matches()) {
            return false;
        }

        // Remove caracteres não númericos para cpf formatado
        if (cpf.length() == 14) {
            cpf = cpf.trim().replaceAll("\\D", "");
        }

        // Verifica se todos os números estão repetidos
        String repetidos = "(\\d)\\1{10}";
        if (Pattern.compile(repetidos).matcher(cpf).matches()) {
            return false;
        }

        int digito1 = calcularDigito(cpf.substring(0, 9));
        int digito2 = calcularDigito(cpf.substring(0, 9) + digito1);

        return cpf.equals(String.format("%s%d%d", cpf.substring(0, 9), digito1, digito2));
    }

    private int calcularDigito(String str) {
        int soma = 0;

        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    private String removeFormatacao(String cpf) {
        return cpf.replaceAll("([-,/!\\.\\\\])", "");
    }

    private String preencheComZeroAEsquerda(String cpf) {

        if (cpf.length() < 11) {
            int quantidadeZeroAPreencher = 11 - cpf.length();

            return String.format("%s%s", "0".repeat(quantidadeZeroAPreencher), cpf);

        }

        return cpf;
    }


}
