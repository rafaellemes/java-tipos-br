package enumeradores;

import br.dev.tipos.brasil.enumeradores.OrgaoExpedidor;
import br.dev.tipos.brasil.tipos.Sigla;
import org.junit.Test;

import java.util.Collection;
import java.util.Optional;

public class OrgaoExpedidorTest {


    @Test
    public void deveRetornarListaDeSigla(){

        final Collection<String> acronimos = OrgaoExpedidor.acronimos();

        assert !acronimos.isEmpty();
        final Optional<String> first = acronimos.stream()
                .filter(OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.getAcronimo()::equalsIgnoreCase)
                .findFirst();
        assert first.isPresent();

    }

    @Test
    public void deveRetornarListaDeNomesPorExtenso(){
        final Collection<String> nomes = OrgaoExpedidor.nomesPorExtensos();

        assert !nomes.isEmpty();

        final Optional<String> first = nomes.stream()
                .filter(OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.getNomeExtenso()::equalsIgnoreCase)
                .findFirst();

        assert first.isPresent();

    }

    @Test
    public void deveRetornarListaDeAcronimosENomePorExtenso(){
        final Collection<String> acronimosENomePorExtenso = OrgaoExpedidor.acronimosENomePorExtenso();

        assert !acronimosENomePorExtenso.isEmpty();

        final Optional<String> first = acronimosENomePorExtenso.stream()
                .filter(OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.toString()::equalsIgnoreCase)
                .findFirst();

        assert first.isPresent();
    }

    @Test
    public void deveRetornarListaDeSiglas(){
        final Collection<Sigla> siglas = OrgaoExpedidor.siglas();

        assert !siglas.isEmpty();

        final Optional<Sigla> first = siglas.stream()
                .filter(OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.getSigla()::equals)
                .findFirst();

        assert first.isPresent();

    }

    @Test
    public void deveConsultarPorSigla(){
        final Sigla tse = Sigla.de("TSE", "Tribunal Superior Eleitoral");

        final Optional<OrgaoExpedidor> orgaoExpedidor = OrgaoExpedidor.getOrgaoExpedidorPorSigla(tse);

        assert orgaoExpedidor.isPresent();

        final OrgaoExpedidor oeTSE = orgaoExpedidor.get();

        assert OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.equals(oeTSE);
        assert oeTSE.getSigla().equals(tse);

    }


    @Test
    public void deveConsultarPorAcronimo(){

        final Optional<OrgaoExpedidor> orgaoExpedidor = OrgaoExpedidor.getOrgaoExpedidorPorAcronimo("tse");

        assert orgaoExpedidor.isPresent();

        final OrgaoExpedidor oeTSE = orgaoExpedidor.get();

        assert OrgaoExpedidor.TRIBUNAL_SUPERIOR_ELEITORAL.equals(oeTSE);
        assert oeTSE.getSigla().getAcronimo().equals("TSE");

    }
}
