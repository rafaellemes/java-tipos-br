package tipos;

import br.dev.tipos.brasil.tipos.CNPJ;
import br.dev.tipos.brasil.tipos.CPF;
import br.dev.tipos.brasil.tipos.CPFCNPJ;
import org.junit.Test;

import java.util.Optional;

public class CPFCNPJTest {

    @Test
    public void deveRetornarCNPJseMenorQue11CaracteresE191() {

        final CPFCNPJ cnpj = CPFCNPJ.de(191);

        assert !cnpj.isCPF();
        assert cnpj.isCNPJ();
        assert 191 == cnpj.getNumero().intValue();
        assert "00.000.000/0001-91".equals(cnpj.getTextoFormatado());

    }


    @Test
    public void deveRetornarOptionalCNPJ() {

        final CPFCNPJ cnpj = CPFCNPJ.de(191);

        assert !cnpj.isCPF();
        assert cnpj.isCNPJ();

        final Optional<CPF> cpf = cnpj.asCpf();
        final Optional<CNPJ> optCnpj = cnpj.asCnpj();

        assert cpf.isEmpty();
        assert optCnpj.isPresent();


    }

    @Test
    public void deveRetornarOptionalCPF() {

        final CPFCNPJ cpf = CPFCNPJ.de(6858748342L);

        assert cpf.isCPF();
        assert !cpf.isCNPJ();

        final Optional<CPF> optCpf = cpf.asCpf();
        final Optional<CNPJ> optCnpj = cpf.asCnpj();

        assert optCnpj.isEmpty();
        assert optCpf.isPresent();


    }

    @Test
    public void deveRetornarCPFseMenorQue11CaracteresEValido() {

        final CPFCNPJ cpf = CPFCNPJ.de(6858748342L);

        assert cpf.isCPF();
        assert !cpf.isCNPJ();
        assert 6858748342L == cpf.getNumero().longValue();
        assert "068.587.483-42".equals(cpf.getTextoFormatado());

    }

    @Test
    public void deveRetornarCNPJseMaiorQue11CaracteresValido() {

        final CPFCNPJ cnpj = CPFCNPJ.de("05.100.525/0001-12");

        assert cnpj.isCNPJ();
        assert !cnpj.isCPF();
        assert 5_100_525_0001_12L == cnpj.getNumero().longValue();

    }

    @Test
    public void deveRetornarCNPJse14CaracteresValido() {

        final CPFCNPJ cnpj = CPFCNPJ.de(98_749_867_0001_49L);

        assert cnpj.isCNPJ();
        assert !cnpj.isCPF();
        assert 98_749_867_0001_49L == cnpj.getNumero().longValue();
        assert "98.749.867/0001-49".equals(cnpj.getTextoFormatado());

    }

    @Test
    public void deveRetornarCNPJseMaiorQue11Caracteres191() {

        final CPFCNPJ cnpj = CPFCNPJ.de("000000000001-91");

        assert cnpj.isCNPJ();
        assert !cnpj.isCPF();
        assert 191L == cnpj.getNumero().longValue();
        assert "00.000.000/0001-91".equals(cnpj.getTextoFormatado());

    }

    @Test
    public void deveRetornarSucessoAoCopiarCnpj() {
        final CPFCNPJ cnpj = CPFCNPJ.de(191);
        final CPFCNPJ copia = CPFCNPJ.copia(cnpj);

        assert cnpj.equals(copia);
        assert cnpj != copia;
    }

    @Test
    public void deveRetornarSucessoAoCopiarCPF() {
        final CPFCNPJ cpf = CPFCNPJ.de(6858748342L);
        final CPFCNPJ copia = CPFCNPJ.copia(cpf);

        assert cpf.equals(copia);
        assert cpf != copia;
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCpfInvalido() {
        CPFCNPJ.de(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarErroSeCnpjInvalido() {
        CPFCNPJ.de(11111111111111L);
    }


}
