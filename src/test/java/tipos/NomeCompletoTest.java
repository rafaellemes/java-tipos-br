package tipos;

import br.dev.tipos.brasil.tipos.NomeCompleto;
import org.junit.Test;

public class NomeCompletoTest {
    @Test
    public void deveRetornarSucessoSeNomeCompletoValido() {
        NomeCompleto nomeCompleto = NomeCompleto.de("João da Silva");
        assert "João da Silva".equals(nomeCompleto.getNomePorExtenso());
        assert "João".equals(nomeCompleto.getNome());
        assert "da Silva".equals(nomeCompleto.getSobrenome());
        assert 13 == nomeCompleto.tamanho();
    }

    @Test
    public void deveRetornarSucessoSeNomeCompletoValidoCaixaAlta() {
        NomeCompleto nomeCompleto = NomeCompleto
                .de("joão da silva")
                .caixaAlta();

        assert "JOÃO DA SILVA".equals(nomeCompleto.getNomePorExtenso());
        assert "JOÃO".equals(nomeCompleto.getNome());
        assert "DA SILVA".equals(nomeCompleto.getSobrenome());
    }
    @Test
    public void deveRetornarSucessoSeNomeCompletoValidoCaixaBaixa() {
        NomeCompleto nomeCompleto = NomeCompleto
                .de("JOÃO DA SILVA")
                .caixaBaixa();

        assert "joão da silva".equals(nomeCompleto.getNomePorExtenso());
        assert "joão".equals(nomeCompleto.getNome());
        assert "da silva".equals(nomeCompleto.getSobrenome());
    }

    @Test
    public void deveRetornarSucessoSeNomeCompletoValidoCaixaCapitalizado() {
        NomeCompleto nomeCompleto = NomeCompleto
                .de("JOÃO DA SILVA")
                .caixaBaixa()
                .primeiraLetraCadaPalavraMaiscula();

        assert "João Da Silva".equals(nomeCompleto.getNomePorExtenso());
        assert "João".equals(nomeCompleto.getNome());
        assert "Da Silva".equals(nomeCompleto.getSobrenome());
    }
    @Test
    public void deveRetornarSucessoSeNomeCompletoValidoNormalizado() {
        NomeCompleto nomeCompleto = NomeCompleto
                .de("Joana D'Arc")
                .caixaAlta()
                .normaliza();

        assert "JOANA D'ARC".equals(nomeCompleto.getNomePorExtenso());
        assert "JOANA".equals(nomeCompleto.getNome());
        assert "D'ARC".equals(nomeCompleto.getSobrenome());

        NomeCompleto outroNome = NomeCompleto
                .de("João Guiné Cação Agüero Acrônimo ")
                .normaliza()
                .caixaBaixa();

        assert "joao guine cacao aguero acronimo".equals(outroNome.getNomePorExtenso());
        assert "joao".equals(outroNome.getNome());
        assert "guine cacao aguero acronimo".equals(outroNome.getSobrenome());
    }

    @Test
    public void deveRetornarSucessoSeNomeESobrenomeCompostoValido() {
        NomeCompleto nomeCompleto = NomeCompleto.de("joão da silva e silva");
        assert "joão da silva e silva".equals(nomeCompleto.getNomePorExtenso());
    }


    @Test
    public void deveRetornarSucessoSeNomeCompostoValido() {
        NomeCompleto nomeCompleto = NomeCompleto.de("juliana cristina", "da silva e silva");
        assert "juliana cristina".equals(nomeCompleto.getNome());
        assert "da silva e silva".equals(nomeCompleto.getSobrenome());
    }

    @Test
    public void deveRetornarSucessoSeNomeESobrenomeValido() {
        NomeCompleto nomeCompleto = NomeCompleto.de("JOÃO", "DA SILVA");
        assert "JOÃO DA SILVA".equals(nomeCompleto.getNomePorExtenso());
        assert "JOÃO".equals(nomeCompleto.getNome());
        assert "DA SILVA".equals(nomeCompleto.getSobrenome());
        assert 13 == nomeCompleto.tamanho();
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNomeCompletoEmBranco() {
        NomeCompleto.de(" ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNomeCompletoMenorQue2Characteres() {
        NomeCompleto.de("J");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNomeCompletoSemEspacos() {
        NomeCompleto.de("JoãodaSilva");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeSobreonomeComMenosQue2Characteres() {
        NomeCompleto.de("Jo");
    }


    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNaoHouverNome() {

        new NomeCompleto("", "Da Silva");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeNaoTiverSobrenome() {
        NomeCompleto.de("João");
    }

    @Test
    public void deveCopiarAPartirDeUmNomeCompletoExistente() {

        final NomeCompleto nomeCompleto = NomeCompleto.de("joão da silva");
        final NomeCompleto copia = NomeCompleto.copia(nomeCompleto);

        assert nomeCompleto.equals(copia);
        assert nomeCompleto != copia;

    }

    @Test(expected = NullPointerException.class)
    public void deveRetornarErroSeAcopiarForNulo(){
        NomeCompleto.copia(null);
    }

    @Test
    public void deveRetornarVerdadeiroSeIgual(){

        NomeCompleto joao = NomeCompleto.de("João Agüero");
        NomeCompleto joaoNormalizado = NomeCompleto.de("João Agüero").normaliza();

        assert joao.equals(joaoNormalizado);
        assert joao.caixaBaixa().equals(joaoNormalizado.caixaAlta());
        assert joao.caixaBaixa().primeiraLetraCadaPalavraMaiscula().equals(joaoNormalizado.caixaAlta());
        //Por ser imutavel cada istância deve ser diferente
        assert joao != joaoNormalizado;
        assert joao.caixaBaixa() != joao.caixaBaixa();
        assert joao.caixaAlta() != joao.caixaAlta();
        assert joao.primeiraLetraCadaPalavraMaiscula() != joao.primeiraLetraCadaPalavraMaiscula();



    }

}