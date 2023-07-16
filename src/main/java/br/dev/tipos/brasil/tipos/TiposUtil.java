package br.dev.tipos.brasil.tipos;

import java.text.Normalizer;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    /**
     * Sanitiza o valor removendo formataçao, xss, espaços nas laterais e espaços duplicados
     *
     * @param valor texto a ser sanitizado
     * @return texto sanitizado
     * @throws NullPointerException se valor for nulo
     */
    public static String sanitiza(String valor){
        Objects.requireNonNull(valor, MENSAGEM);
        //TODO remover espaços duplicados
        return limpaXss(valor).trim();
    }

    /**
     *
     * Transforma em maíscula a primeira letra de cada palavra separado por um delimitador
     *
     * @param valor texto a ser capitalizado
     * @param delimitador o valor que será usado para delimitar as palavras
     * @return texto com as primeiras letras maíscula
     * @throws NullPointerException se valor ou delimitador forem nulos
     */
    public static String transformaEmMaisculaPrimeiraLetraCadaPalavra(String valor, String delimitador){

        Objects.requireNonNull(valor);
        Objects.requireNonNull(delimitador);

        return Stream.of(valor.split(delimitador))
                .map(TiposUtil::capitalize)
                .collect(Collectors.joining(delimitador));

    }

    /**
     *
     * Transforma a Primeira Letra em Maíscula e o restande em mínuscula
     *
     * @param valor palavra a ser trasformada
     * @return Cadeia de caracteres com a primeira letra maíscula
     * @throws NullPointerException se valor for nulo
     */
    public static String capitalize(String valor){
        Objects.requireNonNull(valor);
        return String.join("",
                valor.substring(0,1).toUpperCase(),
                valor.substring(1).toLowerCase());
    }

    /**
     * Substitui letras com acentos por letras comuns <br/>
     * ex:Ó por O, á por a e etc
     * @param valor a ser normalizado
     * @return valor normalizado
     */
    public static String normaliza(String valor){

        return Normalizer
                .normalize(valor, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }


}
