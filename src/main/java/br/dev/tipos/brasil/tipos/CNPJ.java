package br.dev.tipos.brasil.tipos;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.regex.Pattern;

import static br.dev.tipos.brasil.tipos.TiposUtil.completaComZeroAEsquerda;
import static br.dev.tipos.brasil.tipos.TiposUtil.removeFormatacao;

/**
 * Classe que representa o Tipo CNPJ (Cadastro Nacional de Pessoa Jurídica)
 *
 * @author Rafael Lemes
 */
public final class CNPJ {
    private static final String CNPJ_INVALIDO = "CNPJ Inválido";
    private static final int TAMANHO_CNPJ = 14;

    private final String numero;

    /**
     * Cria um CNPJ baseado no número de CNPJ
     *
     * @param numero que representa um CNPJ <br/>
     *               (pode ser passado como um texto simples ou seguindo a formatação  ###.###.###-##)
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de CNPJ inválido
     */
    public CNPJ(String numero) {

        Objects.requireNonNull(numero, CNPJ_INVALIDO);
        String semFormatacao = preencheComZeroAEsquerda(removeFormatacao(numero));
        validaCnpj(semFormatacao);
        this.numero = semFormatacao;
    }

    /**
     * Cria um CNPJ baseado no número de CNPJ
     *
     * @param numero que representa um CNPJ*
     * @throws IllegalArgumentException se o número for menor que zero ou o CNPJ inválido
     * @throws NullPointerException     se o parâmetro numero for nulo
     */
    public CNPJ(Number numero) {

        Objects.requireNonNull(numero, CNPJ_INVALIDO);
        long numCnpj = numero.longValue();
        if (numCnpj < 0) {
            throw new IllegalArgumentException(CNPJ_INVALIDO);
        }
        String str = preencheComZeroAEsquerda(String.valueOf(numCnpj));
        validaCnpj(str);
        this.numero = str;

    }


    /**
     * Cria um CNPJ baseado no número de CNPJ
     *
     * @param numero que representa um CNPJ <br/>
     *               (pode ser passado como um texto simples ou com formatação)
     * @throws NullPointerException     se parâmetro numero for nulo
     * @throws IllegalArgumentException se o número de CNPJ inválido
     */
    public static CNPJ de(String numero) {
        return new CNPJ(numero);
    }

    /**
     * Cria um CNPJ baseado no número de CNPJ
     *
     * @param numero que representa um CNPJ
     * @throws IllegalArgumentException se o número for menor que zero ou o CNPJ inválido
     * @throws NullPointerException     se o parâmetro numero for nulo
     */
    public static CNPJ de(Number numero) {
        return new CNPJ(numero);
    }

    /**
     * Cria uma cópia de um CNPJ a partir de um já existente
     *
     * @param aCopiar representa um CPF já existente
     * @return uma nova instância de CPF
     * @throws NullPointerException se parâmetro aCopiar for nulo
     */
    public static CNPJ copia(CNPJ aCopiar) {

        Objects.requireNonNull(aCopiar, CNPJ_INVALIDO);
        return new CNPJ(aCopiar.getNumero());
    }


    /**
     * Retorna o CNPJ como texto no formato ##.###.###/####-## <br/>
     *
     * @return CNPJ formatado ou null se houver problema de conversão
     */
    public String getTextoFormatado() {
        //TODO marcar como nullalble, Optional ou lançar uma RuntimeException?
        try {
            MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(getTexto());
        } catch (ParseException ignored) {
        }

        return null;
    }

    /**
     * Retorna o número do CNPJ como um texto simples sem formatação
     *
     * @return CNPJ
     */
    public String getTexto() {
        return this.numero;
    }


    /**
     * Retorna o CNPJ como um valor numérico
     *
     * @return Número que representa umCNPJ
     */
    public Number getNumero() {
        return Long.valueOf(numero);
    }


    private void validaCnpj(String cnpj) {

        if (!isCNPJ(cnpj)) {
            throw new IllegalArgumentException(CNPJ_INVALIDO);
        }
    }

    private String preencheComZeroAEsquerda(String cnpj) {

        return completaComZeroAEsquerda(TAMANHO_CNPJ, cnpj);
    }


    private boolean isCNPJ(String cnpj) {

        if (cnpj.trim().isBlank() || cnpj.length() > TAMANHO_CNPJ) {
            return false;
        }

        String repetidos = "(\\d)\\1{13}";
        if (Pattern.compile(repetidos).matcher(cnpj).matches()) {
            return false;
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do cnpj em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = cnpj.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig13 = '0';
            else dig13 = (char) ((11 - r) + 48);

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = cnpj.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig14 = '0';
            else dig14 = (char) ((11 - r) + 48);

// Verifica se os dígitos calculados conferem com os dígitos informados.
            return (dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13));
        } catch (InputMismatchException ignored) {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CNPJ cnpj = (CNPJ) o;
        return Objects.equals(numero, cnpj.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return getTexto();
    }
}
