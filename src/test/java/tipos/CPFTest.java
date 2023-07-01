package tipos;


import br.dev.tipos.brasil.tipos.CPF;
import org.junit.Test;

public class CPFTest {

    @Test
    public void deveRetornarCpfValidoQuandoForNumericoENaoHouverZeroAEsquerda() {

        final CPF cpf = CPF.de(5448495230L);

        assert "05448495230".equals(cpf.getTexto());
        assert "054.484.952-30".equals(cpf.getTextoFormatado());
        assert 54_484_952_30L == cpf.getNumero().longValue();

    }

    @Test
    public void deveRetornarCpfValidoQuandoForStringENaoHouverZeroAEsquerda() {

        final CPF cpf = CPF.de("5448495230");

        assert "05448495230".equals(cpf.getTexto());
        assert "054.484.952-30".equals(cpf.getTextoFormatado());
        assert 5448495230L == cpf.getNumero().longValue();

    }

    @Test
    public void deveRetornarCpfValidoQuandoTiverFormatacao() {

        final CPF cpf = CPF.de("54.484.952-30");
        final CPF cpf2 = CPF.de("54,484\\9!52/30");

        assert "05448495230".equals(cpf.getTexto());
        assert "05448495230".equals(cpf2.getTexto());


    }

    @Test
    public void deveRetornarCpfValidoForString() {

        final CPF cpf = CPF.de("32218783703");

        assert "32218783703".equals(cpf.getTexto());
        assert "322.187.837-03".equals(cpf.getTextoFormatado());
        assert 322_187_837_03L == cpf.getNumero().longValue();

    }

    @Test
    public void deveCopiarAPartirDeUmCpfExistente() {

        final CPF cpf = CPF.de("32218783703");
        final CPF copia = CPF.copia(cpf);

        assert cpf.equals(copia);
        assert cpf != copia;

    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCpfForInvalidoNumber() {
        CPF.de(123456);
        CPF.de("123456");
        CPF.de("322187837O3");//Zero trocado por O
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCpfForInvalidoString() {
        CPF.de("123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCpfForInvalidoComLetras() {
        CPF.de("322187837O3");//Zero trocado por O
    }

    @Test(expected = NullPointerException.class)
    @SuppressWarnings("Está sendo Feito assim apenas para efeito de testes")
    public void deveRetornarErroSeCpfForNulo() {
        String hue = null;
        new CPF(hue);
        CPF.de(hue);
        CPF.copia(null);
    }

    @Test(expected = NullPointerException.class)
    public void deveRetornarErroAoCopiarSeCpfForNulo() {
        CPF.copia(null);
    }


    @Test(expected = NullPointerException.class)
    @SuppressWarnings("Está sendo Feito assim apenas para efeito de testes")
    public void deveRetornarErroStaticFactorySeCpfForNulo() {
        String hue = null;
        CPF.de(hue);
    }


}
