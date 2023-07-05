package br.dev.tipos.brasil.tipos;

import java.util.Objects;

/**
 * Classe utilitária com funções comuns entre os tipos
 *
 * @author Rafael Lemes
 */
class TiposUtil {

    private static final String MENSAGEM = "o parâmetro valor não pode ser nulo";

    private TiposUtil() {
    }

    /**
     * Completa o valor base (valor) com zero a Esquerda até o limite (tamanhoMáximo) informado.
     *
     * @param tamamanhoMaximo quantidade máxima de caracteres que deve ser preenchido
     * @param valor           será usado como base para completar com zero a equerda
     * @return diferença entre o valor e o tamanho máximo com Zero a esquerda <br/>
     * se o tamanho for maior ou igual ao tamanho do valor base, o valor base será retornado
     * @throws NullPointerException     se valor for nulo
     * @throws IllegalArgumentException se tamanhoMaximo menor que zero
     */
    public static String completaComZeroAEsquerda(int tamamanhoMaximo, String valor) {

        Objects.requireNonNull(valor, MENSAGEM);
        if(tamamanhoMaximo < 0){
            throw new IllegalArgumentException("tamanhoMaximo deve ser maior ou igual a zero");
        }

        if (valor.length() < tamamanhoMaximo) {
            int quantidadeZeroAPreencher = tamamanhoMaximo - valor.length();
            return String.format("%s%s", "0".repeat(quantidadeZeroAPreencher), valor);
        }

        return valor;
    }

    /**
     * Remove toda formatação de qualquer tipo (.,_-!\/|@$%#)
     *
     * @param valor a ser formatado, se não houver nada a ser formatado retornará o valor inicial
     * @return valor sem formatação
     * @throws NullPointerException se valor for nulo
     */
    public static String removeFormatacao(String valor) {

        Objects.requireNonNull(valor, MENSAGEM);

        final String pattern = "( )|([|])|([.])|([$])|([-,/#!%_@\\\\])";

        return valor.replaceAll(pattern, "");
    }

    /**
     * Sanitiza o valor removendo possíveis ataque XSS
     *
     * @param valor a ser sanitizado, não pode ser nulo
     * @return valor sanitizado
     * @throws NullPointerException se valor for nulo
     */
    public static String limpaXss(String valor){
        //TODO implementar sanitização contra ataque Cross Site Scripting
        return valor;
    }

}
