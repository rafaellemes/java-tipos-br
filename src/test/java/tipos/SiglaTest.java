package tipos;

import br.dev.tipos.brasil.tipos.Sigla;
import org.junit.Test;

public class SiglaTest {

    @Test
    public void deveCriarUmaSiglaAPartirDeUmNomeCompleto(){
        final Sigla sigla = Sigla.de("tse - tribunal superior eleitoral");
        assert "TSE".equals(sigla.getAcronimo());
        assert "tribunal superior eleitoral".equals(sigla.getNomeExtenso());

    }

    @Test
    public void deveCriarUmaSiglaAPartirDeUmAcronimoENome(){
        final Sigla sigla = Sigla.de("susépe", "Superintendência dos Serviços Penitenciários");
        assert "SUSEPE".equals(sigla.getAcronimo());

        assert "Superintendência dos Serviços Penitenciários".equals(sigla.getNomeExtenso());

        final Sigla siglaCaixaAlta = sigla.caixaAlta();
        assert "SUPERINTENDÊNCIA DOS SERVIÇOS PENITENCIÁRIOS".equals(siglaCaixaAlta.getNomeExtenso());

        final Sigla siglaCaixaBaixa = sigla.caixaBaixa();
        assert "superintendência dos serviços penitenciários".equals(siglaCaixaBaixa.getNomeExtenso());

        final Sigla siglaCapitalizado= siglaCaixaAlta.primeiraLetraCadaPalavraMaiscula();
        assert "Superintendência Dos Serviços Penitenciários".equals(siglaCapitalizado.getNomeExtenso());

        final Sigla siglaNormalizado= siglaCapitalizado.normaliza();
        assert "Superintendencia Dos Servicos Penitenciarios".equals(siglaNormalizado.getNomeExtenso());



    }

    @Test(expected = IllegalArgumentException.class)
    public void deveDarErroSeCriarAcronimoComMenosQue2Caracteres() {
        Sigla.de("T", "Tribunal Superior Eleitoral");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveDarErroSeHouverMenosQue3CaracteresNoNome() {
        Sigla.de("TSE", "Tr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveDarErroSeNomeTiveApenasUmaPalavra() {
         Sigla.de("TSE", "Tribunal");
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveDarErroSeNaoPassarNomeCompletoComEspacoETraco(){
        Sigla.de("TSE tribunal superior eleitoral");
    }

    @Test
    public void deveCopiarAPartirDeUmNomeCompletoExistente() {

        final Sigla sigla = Sigla.de("TSE - TRIBUNAL SUPERIOR ELEITORAL");
        final Sigla copia = Sigla.copia(sigla);

        assert sigla.equals(copia);
        assert sigla != copia;

    }

    @Test(expected = NullPointerException.class)
    public void deveRetornarErroSeAcopiarForNulo(){
        Sigla.copia(null);
    }


    @Test
    public void deveRetornarVerdadeiroSeIgual(){
        final Sigla sigla = Sigla.de("SUSEPE", "Superintendência dos Serviços Penitenciários");
        final Sigla siglaNormalizado = Sigla.de(
                "SUSEPE", "Superintendência dos Serviços Penitenciários")
                .normaliza();

        assert sigla.equals(siglaNormalizado);
        assert sigla.caixaAlta().equals(sigla.caixaBaixa());
        assert sigla.caixaAlta().equals(sigla.primeiraLetraCadaPalavraMaiscula());
        assert sigla.equals(sigla.normaliza());

        //Por ser imutavel cada istância deve ser diferente

        assert sigla != siglaNormalizado;


    }





}
