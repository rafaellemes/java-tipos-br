package tipos;

import br.dev.tipos.brasil.tipos.CNPJ;
import org.junit.Test;

public class CNPJTest {

    @Test
    public void deveRetornarCNPJValidoQuandoForNumerico191() {

        final CNPJ cnpj = CNPJ.de(191L);

        assert "00000000000191".equals(cnpj.getTexto());
        assert "00.000.000/0001-91".equals(cnpj.getTextoFormatado());
        assert 191L == cnpj.getNumero().longValue();

    }
    @Test
    public void deveRetornarCNPJValidoQuandoForNumericoENaoHouverZeroAEsquerda() {

        final CNPJ cnpj = CNPJ.de(676_227_0001_51L);

        assert "00676227000151".equals(cnpj.getTexto());
        assert "00.676.227/0001-51".equals(cnpj.getTextoFormatado());
        assert 676_227_0001_51L == cnpj.getNumero().longValue();

    }

    @Test
    public void deveRetornarCNPJValidoQuandoForStringENaoHouverZeroAEsquerda() {

        final CNPJ cnpj = CNPJ.de("00.676.227/0001-51");

        assert "00676227000151".equals(cnpj.getTexto());
        assert "00.676.227/0001-51".equals(cnpj.getTextoFormatado());
        assert 676_227_0001_51L == cnpj.getNumero().longValue();

    }

    @Test
    public void deveRetornarCNPJValidoQuandoTiverFormatacao() {

        final CNPJ cnpj = CNPJ.de("00.676.227/0001-51");
        final CNPJ cnpj2 = CNPJ.de("0@0.6_7|6,227\\0001/51");

        assert "00676227000151".equals(cnpj.getTexto());
        assert "00676227000151".equals(cnpj2.getTexto());


    }

    @Test
    public void deveRetornarCNPJValidoForString() {

        final CNPJ cnpj = CNPJ.de("31.861.541/0001-38");

        assert "31861541000138".equals(cnpj.getTexto());
        assert "31.861.541/0001-38".equals(cnpj.getTextoFormatado());
        assert 31_861_541_0001_38L == cnpj.getNumero().longValue();

    }

    @Test
    public void deveCopiarAPartirDeUmCNPJExistente() {

        final CNPJ cnpj = CNPJ.de("31.861.541/0001-38");
        final CNPJ copia = CNPJ.copia(cnpj);

        assert cnpj.equals(copia);
        assert cnpj != copia;

    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCNPJForInvalidoNumber() {
        CNPJ.de(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCNPJForInvalidoString() {
        CNPJ.de("123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCNPJForInvalidoComLetras() {
        CNPJ.de("31.861.541/00O1-38");//Zero trocado por O
    }

    @Test(expected = NullPointerException.class)
    @SuppressWarnings("Está sendo Feito assim apenas para efeito de testes")
    public void deveRetornarErroSeCNPJForNulo() {
        String hue = null;
        new CNPJ(hue);
        CNPJ.de(hue);
        CNPJ.copia(null);
    }

    @Test(expected = NullPointerException.class)
    public void deveRetornarErroAoCopiarSeCNPJForNulo() {
        CNPJ.copia(null);
    }


    @Test(expected = NullPointerException.class)
    @SuppressWarnings("Está sendo Feito assim apenas para efeito de testes")
    public void deveRetornarErroStaticFactorySeCNPJForNulo() {
        String hue = null;
        CNPJ.de(hue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNumerosRepetidos(){
        CNPJ.de("77777777777777");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNumerosMaiorQue14(){
        CNPJ.de("31.861.541/0001-387");
    }


}
