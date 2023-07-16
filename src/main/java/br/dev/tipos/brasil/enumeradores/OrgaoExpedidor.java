package br.dev.tipos.brasil.enumeradores;

import br.dev.tipos.brasil.tipos.Sigla;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lista de Orgãos Expedidores
 * <a href="https://gist.github.com/eduardo-mior/b316e376002f90f00e5671b81467c5ba">Fonte</a>
 *
 * @author Rafael Lemes <br/>
 * <a href="https://twitter.com/nenhumrafael">Twitter</a>
 * <a href="https://www.linkedin.com/in/rafael-lemes/">LinkedIn</a>
 */
@SuppressWarnings("unused")
public enum OrgaoExpedidor {

    /**
     * <b>Sigla</b>: ABNC <br/>
     * <b>Nome por extenso</b>: Academia Brasileira de Neurocirurgia
     */
    ACADEMIA_BRASILEIRA_NEUROCIRURGIA(Sigla.de("ABNC", "Academia Brasileira de Neurocirurgia")),
    /**
     * <b>Sigla</b>: AGU <br/>
     * <b>Nome por extenso</b>: Advocacia Geral da União
     */
    ADVOCACIA_GERAL_UNIAO(Sigla.de("AGU", "Advocacia Geral da União")),
    /**
     * <b>Sigla</b>: ANAC <br/>
     * <b>Nome por extenso</b>: Agência Nacional de Aviação Civil
     */
    AGENCIA_NACIONAL_AVIACAO_CIVIL(Sigla.de("ANAC", "Agência Nacional de Aviação Civil")),
    /**
     * <b>Sigla</b>: CAER <br/>
     * <b>Nome por extenso</b>: Clube de Aeronáutica
     */
    CLUBE_AERONAUTICA(Sigla.de("CAER", "Clube de Aeronáutica")),
    /**
     * <b>Sigla</b>: CAU <br/>
     * <b>Nome por extenso</b>: Conselho de Arquitetura e Urbanismo
     */
    CONSELHO_ARQUITETURA_URBANISMO(Sigla.de("CAU", "Conselho de Arquitetura e Urbanismo")),
    /**
     * <b>Sigla</b>: CBM <br/>
     * <b>Nome por extenso</b>: Corpo de Bombeiros Militar
     */
    CORPO_BOMBEIROS_MILITAR(Sigla.de("CBM", "Corpo de Bombeiros Militar")),
    /**
     * <b>Sigla</b>: CFA <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Administração
     */
    CONSELHO_FEDERAL_ADMINISTRACAO(Sigla.de("CFA", "Conselho Federal de Administração")),
    /**
     * <b>Sigla</b>: CFB <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Biblioteconomia
     */
    CONSELHO_FEDERAL_BIBLIOTECONOMIA(Sigla.de("CFB", "Conselho Federal de Biblioteconomia")),
    /**
     * <b>Sigla</b>: CFBIO <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Biologia
     */
    CONSELHO_FEDERAL_BIOLOGIA(Sigla.de("CFBIO", "Conselho Federal de Biologia")),
    /**
     * <b>Sigla</b>: CFBM <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Biomedicina
     */
    CONSELHO_FEDERAL_BIOMEDICINA(Sigla.de("CFBM", "Conselho Federal de Biomedicina")),
    /**
     * <b>Sigla</b>: CFC <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Contabilidade
     */
    CONSELHO_FEDERAL_CONTABILIDADE(Sigla.de("CFC", "Conselho Federal de Contabilidade")),
    /**
     * <b>Sigla</b>: CFESS <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Serviço Social
     */
    CONSELHO_FEDERAL_SERVICO_SOCIAL(Sigla.de("CFESS", "Conselho Federal de Serviço Social")),
    /**
     * <b>Sigla</b>: CFF <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Farmácia
     */
    CONSELHO_FEDERAL_FARMACIA(Sigla.de("CFF", "Conselho Federal de Farmácia")),
    /**
     * <b>Sigla</b>: CFFA <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Fonoaudiologia
     */
    CONSELHO_FEDERAL_FONOAUDIOLOGIA(Sigla.de("CFFA", "Conselho Federal de Fonoaudiologia")),
    /**
     * <b>Sigla</b>: CFM <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Medicina
     */
    CONSELHO_FEDERAL_MEDICINA(Sigla.de("CFM", "Conselho Federal de Medicina")),
    /**
     * <b>Sigla</b>: CFMV <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Medicina Veterinária
     */
    CONSELHO_FEDERAL_MEDICINA_VETERINARIA(Sigla.de("CFMV", "Conselho Federal de Medicina Veterinária")),
    /**
     * <b>Sigla</b>: CFN <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Nutrição
     */
    CONSELHO_FEDERAL_NUTRICAO(Sigla.de("CFN", "Conselho Federal de Nutrição")),
    /**
     * <b>Sigla</b>: CFO <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Odontologia
     */
    CONSELHO_FEDERAL_ODONTOLOGIA(Sigla.de("CFO", "Conselho Federal de Odontologia")),
    /**
     * <b>Sigla</b>: CFP <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Psicologia
     */
    CONSELHO_FEDERAL_PSICOLOGIA(Sigla.de("CFP", "Conselho Federal de Psicologia")),
    /**
     * <b>Sigla</b>: CRQ <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Química
     */
    CONSELHO_FEDERAL_QUIMICA(Sigla.de("CRQ", "Conselho Federal de Química")),
    /**
     * <b>Sigla</b>: CFT <br/>
     * <b>Nome por extenso</b>: Conselho Federal dos Técnicos Industriais
     */
    CONSELHO_FEDERAL_TECNICOS_INDUSTRIAIS(Sigla.de("CFT", "Conselho Federal dos Técnicos Industriais")),
    /**
     * <b>Sigla</b>: CFTA <br/>
     * <b>Nome por extenso</b>: Conselho Federal dos Técnicos Agrícolas
     */
    CONSELHO_FEDERAL_TECNICOS_AGRICOLAS(Sigla.de("CFTA", "Conselho Federal dos Técnicos Agrícolas")),
    /**
     * <b>Sigla</b>: CGPI <br/>
     * <b>Nome por extenso</b>: Coordenação Geral de Privilégios e Imunidades
     */
    COORDEMACAO_GERAL_PRIVILEGIOS_IMUNIDADES(Sigla.de("CGPI", "Coordenação Geral de Privilégios e Imunidades")),
    /**
     * <b>Sigla</b>: CGPMAF <br/>
     * <b>Nome por extenso</b>: Coordenadoria Geral de Polícia Marítima
     */
    COORDENADORIA_GERAL_POLICIA_MARITIMA(Sigla.de("CGPMAF", "Coordenadoria Geral de Polícia Marítima")),
    /**
     * <b>Sigla</b>: CIPC <br/>
     * <b>Nome por extenso</b>: Centro de Inteligência da Polícia Civil
     */
    CENTRO_INTELIGENCIA_POLICIA_CIVIL(Sigla.de("CIPC", "Centro de Inteligência da Polícia Civil")),
    /**
     * <b>Sigla</b>: CNIG <br/>
     * <b>Nome por extenso</b>: Conselho Nacional de Imigração
     */
    CONSELHO_NACIONAL_IMIGRACAO(Sigla.de("CNIG", "Conselho Nacional de Imigração")),
    /**
     * <b>Sigla</b>: CNT <br/>
     * <b>Nome por extenso</b>: Confederação Nacional do Transporte
     */
    CONFEDERACAO_NACIONAL_TRANSPORTE(Sigla.de("CNT", "Confederação Nacional do Transporte")),
    /**
     * <b>Sigla</b>: CNTV <br/>
     * <b>Nome por extenso</b>: Confederação nacional de Vigilantes e Prestadores de Serviços
     */
    CONFEDERACAO_NACIONAL_VIGILANTES_PRESTADORES_SERVICOS(Sigla.de("CNTV", "Confederação nacional de Vigilantes e Prestadores de Serviços")),
    /**
     * <b>Sigla</b>: COFECI <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Corretores de Imóveis
     */
    CONSELHO_FEDERAL_CORRETORES_IMOVEIS(Sigla.de("COFECI", "Conselho Federal de Corretores de Imóveis")),
    /**
     * <b>Sigla</b>: COFECON <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Economia
     */
    CONSELHO_FEDERAL_ECONOMIA(Sigla.de("COFECON", "Conselho Federal de Economia")),
    /**
     * <b>Sigla</b>: COFEM <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Museologia
     */
    CONSELHO_FEDERAL_MUSEOLOGIA(Sigla.de("COFEM", "Conselho Federal de Museologia")),
    /**
     * <b>Sigla</b>: COFEN <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Enfermagem
     */
    CONSELHO_FEDERAL_ENFERMAGEM(Sigla.de("COFEN", "Conselho Federal de Enfermagem")),
    /**
     * <b>Sigla</b>: COFFITO <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Fisioterapia e Terapia Ocupacional
     */
    CONSELHO_REGIONAL_FISIOTERAPIA_TERAPIA_OCUPACIONAL(Sigla.de("COFFITO", "Conselho Regional de Fisioterapia e Terapia Ocupacional")),
    /**
     * <b>Sigla</b>: COMAER <br/>
     * <b>Nome por extenso</b>: Comando da Aeronáutica
     */
    COMANDO_AERONAUTICA(Sigla.de("COMAER", "Comando da Aeronáutica")),
    /**
     * <b>Sigla</b>: CONFE <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Estatística
     */
    CONSELHO_FEDERAL_ESTATISTICA(Sigla.de("CONFE", "Conselho Federal de Estatística")),
    /**
     * <b>Sigla</b>: CONFEA <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Engenharia e Agronomia
     */
    CONSELHO_FEDERAL_ENGENHARIA_AGRONOMIA(Sigla.de("CONFEA", "Conselho Federal de Engenharia e Agronomia")),
    /**
     * <b>Sigla</b>: CONFEF <br/>
     * <b>Nome por extenso</b>: Conselho Federal de Educação Física
     */
    CONSELHO_FEDERAL_EDUCACAO_FISICA(Sigla.de("CONFEF", "Conselho Federal de Educação Física")),
    /**
     * <b>Sigla</b>: CONFERE <br/>
     * <b>Nome por extenso</b>: Conselho Federal dos Representantes Comerciais
     */
    CONSELHO_FEDERAL_REPRESENTANTES_COMERCIAIS(Sigla.de("CONFERE", "Conselho Federal dos Representantes Comerciais")),
    /**
     * <b>Sigla</b>: CONRE <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Estatística
     */
    CONSELHO_REGIONAL_ESTATISTICA(Sigla.de("CONRE", "Conselho Regional de Estatística")),
    /**
     * <b>Sigla</b>: CONRERP <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Profissionais de Relações Públicas
     */
    CONSELHO_REGIONAL_PROFISSIONAIS_RELACOES_PUBLICAS(Sigla.de("CONRERP", "Conselho Regional de Profissionais de Relações Públicas")),
    /**
     * <b>Sigla</b>: CORE <br/>
     * <b>Nome por extenso</b>: Conselho Regional dos Representantes Comerciais
     */
    CONSELHO_REGIONAL_REPRESENTANTES_COMERCIAIS(Sigla.de("CORE", "Conselho Regional dos Representantes Comerciais")),
    /**
     * <b>Sigla</b>: CORECON <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Economia
     */
    CONSELHO_REGIONAL_ECONOMIA(Sigla.de("CORECON", "Conselho Regional de Economia")),
    /**
     * <b>Sigla</b>: COREM <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Museologia
     */
    CONSELHO_REGIONAL_MUSEOLOGIA(Sigla.de("COREM", "Conselho Regional de Museologia")),
    /**
     * <b>Sigla</b>: COREN <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Enfermagem
     */
    CONSELHO_REGIONAL_ENFERMAGEM(Sigla.de("COREN", "Conselho Regional de Enfermagem")),
    /**
     * <b>Sigla</b>: CRA <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Administração
     */
    CONSELHO_REGIONAL_ADMINISTRACAO(Sigla.de("CRA", "Conselho Regional de Administração")),
    /**
     * <b>Sigla</b>: CRAS <br/>
     * <b>Nome por extenso</b>: Centro de Referência de Assistência Social
     */
    CENTRO_REFERENCIA_ASSISTENCIA_SOCIAL(Sigla.de("CRAS", "Centro de Referência de Assistência Social")),
    /**
     * <b>Sigla</b>: CRB <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Biblioteconomia
     */
    CONSELHO_REGIONAL_BIBLIOTECONOMIA(Sigla.de("CRB", "Conselho Regional de Biblioteconomia")),
    /**
     * <b>Sigla</b>: CRBIO <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Biologia
     */
    CONSELHO_REGIONAL_BIOLOGIA(Sigla.de("CRBIO", "Conselho Regional de Biologia")),
    /**
     * <b>Sigla</b>: CRBIO <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Biologia
     */
    CONSELHO_REGIONAL_BIOMEDICINA(Sigla.de("CRBM", "Conselho Regional de Biomedicina")),
    /**
     * <b>Sigla</b>: CRC <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Contabilidade
     */
    CONSELHO_REGIONAL_CONTABILIDADE(Sigla.de("CRC", "Conselho Regional de Contabilidade")),
    /**
     * <b>Sigla</b>: CREA <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Engenharia e Agronomia
     */
    CONSELHO_REGIONAL_AGRONOMIA(Sigla.de("CREA", "Conselho Regional de Engenharia e Agronomia")),
    /**
     * <b>Sigla</b>: CRECI <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Corretores de Imóveis
     */
    CONSELHO_REGIONAL_CORRETORES_IMOVEIS(Sigla.de("CRECI", "Conselho Regional de Corretores de Imóveis")),
    /**
     * <b>Sigla</b>: CREF <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Educação Física
     */
    CONSELHO_REGIONAL_EDUCACAO_FISICA(Sigla.de("CREF", "Conselho Regional de Educação Física")),
    /**
     * <b>Sigla</b>: CREFITO <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Fisioterapia e Terapia Ocupacional
     */
    CONSELHO_REGIONAL_FISIOTERIA_TERAPIA_OCUPACIONAL(Sigla.de("CREFITO", "Conselho Regional de Fisioterapia e Terapia Ocupacional")),
    /**
     * <b>Sigla</b>: CRESS <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Serviço Social
     */
    CONSELHO_REGIONAL_SERVICO_SOCIAL(Sigla.de("CRESS", "Conselho Regional de Serviço Social")),
    /**
     * <b>Sigla</b>: CRF <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Farmácia
     */
    CONSELHO_REGIONAL_FARMACIA(Sigla.de("CRF", "Conselho Regional de Farmácia")),
    /**
     * <b>Sigla</b>: CRFA <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Fonoaudiologia
     */
    CONSELHO_REGIONAL_FONOAUDIOLOGIA(Sigla.de("CRFA", "Conselho Regional de Fonoaudiologia")),
    /**
     * <b>Sigla</b>: CRM <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Medicina
     */
    CONSELHO_REGIONAL_MEDICINA(Sigla.de("CRM", "Conselho Regional de Medicina")),
    /**
     * <b>Sigla</b>: CRMV <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Medicina Veterinária
     */
    CONSELHO_REGIONAL_MEDICINA_VETERINARIA(Sigla.de("CRMV", "Conselho Regional de Medicina Veterinária")),
    /**
     * <b>Sigla</b>: CRN <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Nutrição
     */
    CONSELHO_REGIONAL_NUTRICAO(Sigla.de("CRN", "Conselho Regional de Nutrição")),
    /**
     * <b>Sigla</b>: CRO <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Odontologia
     */
    CONSELHO_REGIONAL_ODONTOLOGIA(Sigla.de("CRO", "Conselho Regional de Odontologia")),
    /**
     * <b>Sigla</b>: CRP <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Psicologia
     */
    CONSELHO_REGIONAL_PSICOLOGIA(Sigla.de("CRP", "Conselho Regional de Psicologia")),
    /**
     * <b>Sigla</b>: CRPRE <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Profissionais de Relações Públicas
     */
    CONSELHO_REGIONAL_PROFISSIONAIS_RELACOES_PUBLICAS_CRPRE(Sigla.de("CRPRE", "Conselho Regional de Profissionais de Relações Públicas")),
    /**
     * <b>Sigla</b>: CRQ <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Química
     */
    CONSELHO_REGIONAL_QUIMICA(Sigla.de("CRQ", "Conselho Regional de Química")),
    /**
     * <b>Sigla</b>: CRT <br/>
     * <b>Nome por extenso</b>: Conselho Regional dos Técnicos Industriais
     */
    CONSELHO_REGIONAL_TECNICOS_INDUSTRIAIS(Sigla.de("CRT", "Conselho Regional dos Técnicos Industriais")),
    /**
     * <b>Sigla</b>: CRTA <br/>
     * <b>Nome por extenso</b>: Conselho Regional de Técnicos de Administração
     */
    CONSELHO_REGIONAL_TECNICOS_ADMINISTRACAO(Sigla.de("CRTA", "Conselho Regional de Técnicos de Administração")),
    /**
     * <b>Sigla</b>: CTPS <br/>
     * <b>Nome por extenso</b>: Carteira de Trabalho e Previdência Social
     */
    CARTEIRA_TRABALHO_PREVIDENCIA_SOCIAL(Sigla.de("CTPS", "Carteira de Trabalho e Previdência Social")),
    /**
     * <b>Sigla</b>: CV <br/>
     * <b>Nome por extenso</b>: Cartório Civil
     */
    CARTORIO_CIVIL(Sigla.de("CV", "Cartório Civil")),
    /**
     * <b>Sigla</b>: DELEMIG <br/>
     * <b>Nome por extenso</b>: Delegacia de Polícia de Imigração
     */
    DELEGACIA_POLICIA_IMIGRACAO(Sigla.de("DELEMIG", "Delegacia de Polícia de Imigração")),
    /**
     * <b>Sigla</b>: DETRAN <br/>
     * <b>Nome por extenso</b>: Departamento Estadual de Trânsito
     */
    DERPATAMENTO_ESTADUAL_TRANSITO(Sigla.de("DETRAN", "Departamento Estadual de Trânsito")),
    /**
     * <b>Sigla</b>: DGPC <br/>
     * <b>Nome por extenso</b>: Diretoria Geral da Polícia Civil
     */
    DIRETORIA_GERAL_POLICIA_CIVIL(Sigla.de("DGPC", "Diretoria Geral da Polícia Civil")),
    /**
     * <b>Sigla</b>: DIC <br/>
     * <b>Nome por extenso</b>: Diretoria de identificação Civil
     */
    DIRETORIA_IDENTIFICACAO_CIVIL(Sigla.de("DIC", "Diretoria de identificação Civil")),
    /**
     * <b>Sigla</b>: DICC <br/>
     * <b>Nome por extenso</b>: Diretoria de identificação Civil e Criminal
     */
    DIRETORIA_IDENTIFICACAO_CIVIL_CRIMINAL(Sigla.de("DICC", "Diretoria de identificação Civil e Criminal")),
    /**
     * <b>Sigla</b>: DIREX <br/>
     * <b>Nome por extenso</b>: Diretoria Executiva
     */
    DIRETORIA_EXECUTIVA(Sigla.de("DIREX", "Diretoria Executiva")),
    /**
     * <b>Sigla</b>: DPF <br/>
     * <b>Nome por extenso</b>: Departamento de Polícia Federal
     */
    DEPARTAMENTO_POLICIA_FEDERAL(Sigla.de("DPF", "Departamento de Polícia Federal")),
    /**
     * <b>Sigla</b>: DPMAF <br/>
     * <b>Nome por extenso</b>: Divisão de Polícia Marítima
     */
    DIVISAO_POLICIA_MARITIMA(Sigla.de("DPMAF", "Divisão de Polícia Marítima")),
    /**
     * <b>Sigla</b>: DPT <br/>
     * <b>Nome por extenso</b>: Departamento de Polícia Técnica Geral
     */
    DEPARTAMENTO_POLICIA_TECNICA_GERAL(Sigla.de("DPT", "Departamento de Polícia Técnica Geral")),
    /**
     * <b>Sigla</b>: DPTC <br/>
     * <b>Nome por extenso</b>: Departamento de Polícia Técnico Científica
     */
    DEPARTAMENTO_POLICIA_TECNICA_CIENTIFICA(Sigla.de("DPTC", "Departamento de Polícia Técnico Científica")),
    /**
     * <b>Sigla</b>: DREX <br/>
     * <b>Nome por extenso</b>: Delegacia Regional Executiva
     */
    DELEGACIA_REGIONAL_EXECUTIVA(Sigla.de("DREX", "Delegacia Regional Executiva")),
    /**
     * <b>Sigla</b>: DRT <br/>
     * <b>Nome por extenso</b>: Delegacia Regional do Trabalho
     */
    DELEGACIA_REGIONAL_TRABALHO(Sigla.de("DRT", "Delegacia Regional do Trabalho")),
    /**
     * <b>Sigla</b>: EB <br/>
     * <b>Nome por extenso</b>: Exército Brasileiro
     */
    EXERCITO_BRASILEIRO(Sigla.de("EB", "Exército Brasileiro")),
    /**
     * <b>Sigla</b>: FAB <br/>
     * <b>Nome por extenso</b>: Força Aérea Brasileira
     */
    FORCA_AEREA_BRASILEIRA(Sigla.de("FAB", "Força Aérea Brasileira")),
    /**
     * <b>Sigla</b>: FENAJ <br/>
     * <b>Nome por extenso</b>: Federação Nacional dos Jornalistas
     */
    FEDERACAO_NACIONAL_JORNALISTAS(Sigla.de("FENAJ", "Federação Nacional dos Jornalistas")),
    /**
     * <b>Sigla</b>: FGTS <br/>
     * <b>Nome por extenso</b>: Fundo de Garantia do Tempo de Serviço
     */
    FUNDO_GARANTIA_TEMPO_SERVICO(Sigla.de("FGTS", "Fundo de Garantia do Tempo de Serviço")),
    /**
     * <b>Sigla</b>: FIPE <br/>
     * <b>Nome por extenso</b>: Fundação Instituto de Pesquisas Econômicas
     */
    FUNDACAO_INSTITUTO_PESQUISAS_ECONOMICAS(Sigla.de("FIPE", "Fundação Instituto de Pesquisas Econômicas")),
    /**
     * <b>Sigla</b>: FLS <br/>
     * <b>Nome por extenso</b>: Fundação Lyndolpho Silva
     */
    FUNDACAO_LYNDOLPHO_SILVA(Sigla.de("FLS", "Fundação Lyndolpho Silva")),
    /**
     * <b>Sigla</b>: FUNAI <br/>
     * <b>Nome por extenso</b>: Fundação Nacional do Índio
     */
    FUNDACAO_NACIONAL_INDIO(Sigla.de("FUNAI", "Fundação Nacional do Índio")),
    /**
     * <b>Sigla</b>: GEJSP <br/>
     * <b>Nome por extenso</b>: Gerência de Estado de Justiça e Segurança Pública
     */
    GERENCIA_ESTADO_JUSTICA(Sigla.de("GEJSP", "Gerência de Estado de Justiça e Segurança Pública")),
    /**
     * <b>Sigla</b>: GEJSPC <br/>
     * <b>Nome por extenso</b>: Gerência de Estado de Justiça, Segurança Pública e Cidadania
     */
    GERENCIA_ESTADO_JUSTICA_SEGURANCA_PUBLICA_CIDADANIA_GEJSPC(Sigla.de("GEJSPC", "Gerência de Estado de Justiça, Segurança Pública e Cidadania")),
    /**
     * <b>Sigla</b>: GEJUSPC <br/>
     * <b>Nome por extenso</b>: Gerência de Estado de Justiça, Segurança Pública e Cidadania
     */
    GERENCIA_ESTADO_JUSTICA_SEGURANCA_PUBLICA_CIDADANIA(Sigla.de("GEJUSPC", "Gerência de Estado de Justiça, Segurança Pública e Cidadania")),
    /**
     * <b>Sigla</b>: GESP <br/>
     * <b>Nome por extenso</b>: Gerência de Estado de Segurança Pública
     */
    GERENCIA_ESTADO_SEGURANCA_PUBLICA(Sigla.de("GESP", "Gerência de Estado de Segurança Pública")),
    /**
     * <b>Sigla</b>: GOVGO <br/>
     * <b>Nome por extenso</b>: Governo do Estado de Goiás
     */
    GOVERNO_ESTADO_GOIAS(Sigla.de("GOVGO", "Governo do Estado de Goiás")),
    /**
     * <b>Sigla</b>: ICLA <br/>
     * <b>Nome por extenso</b>: Carteira de identidade Classista
     */
    CARTEIRA_IDENTIDADE_CLASSISTA(Sigla.de("ICLA", "Carteira de identidade Classista")),
    /**
     * <b>Sigla</b>: ICP <br/>
     * <b>Nome por extenso</b>: Instituto de Polícia Científica
     */
    INSTITUTO_POLICIA_CIENTIFICA(Sigla.de("ICP", "Instituto de Polícia Científica")),
    /**
     * <b>Sigla</b>: IDAMP <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Dr. Aroldo Mendes Paiva
     */
    INSTITUTO_IDENTIFICACAO_DR_AROLDO_MENDES_PAIVA(Sigla.de("IDAMP", "Instituto de identificação Dr. Aroldo Mendes Paiva")),
    /**
     * <b>Sigla</b>: IFP <br/>
     * <b>Nome por extenso</b>: Instituto Félix Pacheco
     */
    INSTITUTO_FELIX_PACHECO(Sigla.de("IFP", "Instituto Félix Pacheco")),
    /**
     * <b>Sigla</b>: IGP <br/>
     * <b>Nome por extenso</b>: Instituto Geral de Perícias
     */
    INSTITUTO_GERAL_PERICIAS(Sigla.de("IGP", "Instituto Geral de Perícias")),
    /**
     * <b>Sigla</b>: IIACM <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Aderson Conceição de Melo
     */
    INSTITUTO_IDENTIFICACAO_ANDERSON_CONCEICAO_MELO(Sigla.de("IIACM", "Instituto de identificação Aderson Conceição de Melo")),
    /**
     * <b>Sigla</b>: IICC <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Civil e Criminal
     */
    INSTITUTO_IDENTIFICACAO_CIVIL_CRIMINAL(Sigla.de("IICC", "Instituto de identificação Civil e Criminal")),
    /**
     * <b>Sigla</b>: IICCECF <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Civil e Criminal Engrácia da Costa Francisco
     */
    INSTITUTO_IDENTIFICACAO_CIVIL_CRIMINAL_ENGRACIA_COSTA_FRANCISCO(Sigla.de("IICCECF", "Instituto de identificação Civil e Criminal Engrácia da Costa Francisco")),
    /**
     * <b>Sigla</b>: IICM <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Carlos Menezes
     */
    INSTITUTO_IDENTIFICACAO_CARLOS_MENEZES(Sigla.de("IICM", "Instituto de identificação Carlos Menezes")),
    /**
     * <b>Sigla</b>: IIGP <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Gonçalo Pereira
     */
    INSTITUTO_IDENTIFICACAO_GONCALO_PEREIRA(Sigla.de("IIGP", "Instituto de identificação Gonçalo Pereira")),
    /**
     * <b>Sigla</b>: IIJDM <br/>
     * <b>Nome por extenso</b>: Instituto de identificação João de Deus Martins
     */
    INSTITUTO_IDENTIFICACAO_JOAO_DEUS_MARTINS(Sigla.de("IIJDM", "Instituto de identificação João de Deus Martins")),
    /**
     * <b>Sigla</b>: IIRGD <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Ricardo Gumbleton Daunt
     */
    INSTITUTO_IDENTIFICACAO_RICARDO_GLUMBLETON_DAUNT(Sigla.de("IIRGD", "Instituto de identificação Ricardo Gumbleton Daunt")),
    /**
     * <b>Sigla</b>: IIPC <br/>
     * <b>Nome por extenso</b>: Instituto de identificação da Polícia Civil
     */
    INSTITUTO_IDENTIFICACAO_POLICIA_CIVIL(Sigla.de("IIPC", "Instituto de identificação da Polícia Civil")),
    /**
     * <b>Sigla</b>: IIPM <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Pedro Mello
     */
    INSTITUTO_IDENTIFICACAO_PEDRO_MELLO(Sigla.de("IIPM", "Instituto de identificação Pedro Mello")),
    /**
     * <b>Sigla</b>: IIRHM <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Raimundo Hermínio de Melo
     */
    INSTITUTO_IDENTIFICACAO_RAIMUNDO_HERMINIO_MELO(Sigla.de("IIRHM", "Instituto de identificação Raimundo Hermínio de Melo")),
    /**
     * <b>Sigla</b>: IITB <br/>
     * <b>Nome por extenso</b>: Instituto de identificação Tavares Buril
     */
    INSTITUTO_IDENTIFICACAO_TAVARES_BURIL(Sigla.de("IITB", "Instituto de identificação Tavares Buril")),
    /**
     * <b>Sigla</b>: IML <br/>
     * <b>Nome por extenso</b>: Instituto Médico-Legal
     */
    INSTITUTO_MEDICO_LEGAL(Sigla.de("IML", "Instituto Médico-Legal")),
    /**
     * <b>Sigla</b>: INI <br/>
     * <b>Nome por extenso</b>: Instituto Nacional de identificação
     */
    INSTITUTO_NACIONAL_IDENTIFICACAO(Sigla.de("INI", "Instituto Nacional de identificação")),
    /**
     * <b>Sigla</b>: IPF <br/>
     * <b>Nome por extenso</b>: Instituto Pereira Faustino
     */
    INSTITUTO_PEREIRA_FAUSTINO(Sigla.de("IPF", "Instituto Pereira Faustino")),
    /**
     * <b>Sigla</b>: ITCP <br/>
     * <b>Nome por extenso</b>: Instituto Técnico-Científico de Perícia
     */
    INSTITUTO_TECNICO_CIENTIFICO_PERICIA(Sigla.de("ITCP", "Instituto Técnico-Científico de Perícia")),
    /**
     * <b>Sigla</b>: ITEP <br/>
     * <b>Nome por extenso</b>: Instituto Técnico-Científico de Perícia
     */
    INSTITUTO_TECNICO_CIENTIFICO_PERICIA_ITEP(Sigla.de("ITEP", "Instituto Técnico-Científico de Perícia")),
    /**
     * <b>Sigla</b>: MAER <br/>
     * <b>Nome por extenso</b>: Ministério da Aeronáutica
     */
    MINISTERIA_AERONAUTICA(Sigla.de("MAER", "Ministério da Aeronáutica")),
    /**
     * <b>Sigla</b>: MB <br/>
     * <b>Nome por extenso</b>: Marinha do Brasil
     */
    MARINHA_BRASIL(Sigla.de("MB", "Marinha do Brasil")),
    /**
     * <b>Sigla</b>: MD <br/>
     * <b>Nome por extenso</b>: Ministério da Defesa
     */
    MINISTERIO_DEFESA(Sigla.de("MD", "Ministério da Defesa")),
    /**
     * <b>Sigla</b>: MDS <br/>
     * <b>Nome por extenso</b>: Ministério da Cidadania
     */
    MINISTERIO_CIDADANIA(Sigla.de("MDS", "Ministério da Cidadania")),
    /**
     * <b>Sigla</b>: MEC <br/>
     * <b>Nome por extenso</b>: Ministério da Educação e Cultura
     */
    MINISTERIO_EDCACAO_CULTURA(Sigla.de("MEC", "Ministério da Educação e Cultura")),
    /**
     * <b>Sigla</b>: MEX <br/>
     * <b>Nome por extenso</b>: Ministério do Exército
     */
    MINISTERIO_EXERCITO(Sigla.de("MEX", "Ministério do Exército")),
    /**
     * <b>Sigla</b>: MINDEF <br/>
     * <b>Nome por extenso</b>: Ministério da Defesa
     */
    MINISTERIO_DEFESA_MINDEF(Sigla.de("MINDEF", "Ministério da Defesa")),
    /**
     * <b>Sigla</b>: MJ <br/>
     * <b>Nome por extenso</b>: Ministério da Justiça
     */
    MINISTERIO_JUSTICA(Sigla.de("MJ", "Ministério da Justiça")),
    /**
     * <b>Sigla</b>: MM <br/>
     * <b>Nome por extenso</b>: Ministério da Marinha
     */
    MINISTERIO_MARINHA(Sigla.de("MM", "Ministério da Marinha")),
    /**
     * <b>Sigla</b>: MMA <br/>
     * <b>Nome por extenso</b>: Ministério da Marinha
     */
    MINISTERIO_MARINHA_MMA(Sigla.de("MMA", "Ministério da Marinha")),
    /**
     * <b>Sigla</b>: MP <br/>
     * <b>Nome por extenso</b>: Ministério da Marinha
     */
    MINISTERIO_PUBLICO(Sigla.de("MP", "Ministério Público")),
    /**
     * <b>Sigla</b>: MPAS <br/>
     * <b>Nome por extenso</b>: Ministério da Previdência e Assistência Social
     */
    MINISTERIO_PREVIDENCIA_ASSISTENCIA_SOCIAL(Sigla.de("MPAS", "Ministério da Previdência e Assistência Social")),
    /**
     * <b>Sigla</b>: MPE <br/>
     * <b>Nome por extenso</b>: Ministério Público Estadual
     */
    MINISTERIO_PUBLICO_ESTADUAL(Sigla.de("MPE", "Ministério Público Estadual")),
    /**
     * <b>Sigla</b>: MPF <br/>
     * <b>Nome por extenso</b>: Ministério Público Federal
     */
    MINISTERIO_PUBLICO_FEDERAL(Sigla.de("MPF", "Ministério Público Federal")),
    /**
     * <b>Sigla</b>: MPT <br/>
     * <b>Nome por extenso</b>: Ministério Público do Trabalho
     */
    MINISTERIO_PUBLICO_TRABALHO(Sigla.de("MPT", "Ministério Público do Trabalho")),
    /**
     * <b>Sigla</b>: MRE <br/>
     * <b>Nome por extenso</b>: Ministério das Relações Exteriores
     */
    MINISTERIO_RELACOES_EXTERIORES(Sigla.de("MRE", "Ministério das Relações Exteriores")),
    /**
     * <b>Sigla</b>: MT <br/>
     * <b>Nome por extenso</b>: Ministério do Trabalho
     */
    MINISTERIO_TRABALHO(Sigla.de("MT", "Ministério do Trabalho")),
    /**
     * <b>Sigla</b>: MTE <br/>
     * <b>Nome por extenso</b>: Ministério da Economia
     */
    MINISTERIO_ECONOMIA(Sigla.de("MTE", "Ministério da Economia")),
    /**
     * <b>Sigla</b>: MTPS <br/>
     * <b>Nome por extenso</b>: Ministério do Trabalho e Previdência Social
     */
    MINISTERIO_TRABALHO_PREVIDENCIA_SOCIAL(Sigla.de("MTPS", "Ministério do Trabalho e Previdência Social")),
    /**
     * <b>Sigla</b>: NUMIG <br/>
     * <b>Nome por extenso</b>: Núcleo de Polícia de Imigração
     */
    NUCLEO_POLICIA_IMIGRACAO(Sigla.de("NUMIG", "Núcleo de Polícia de Imigração")),
    /**
     * <b>Sigla</b>: OAB <br/>
     * <b>Nome por extenso</b>: Ordem dos Advogados do Brasil
     */
    ORDEM_ADVOGADOS_BRASIL(Sigla.de("OAB", "Ordem dos Advogados do Brasil")),
    /**
     * <b>Sigla</b>: OMB <br/>
     * <b>Nome por extenso</b>: Ordem dos Músicos do Brasil
     */
    ORDEM_MUSICOS_BRASIL(Sigla.de("OMB", "Ordem dos Músicos do Brasil")),
    /**
     * <b>Sigla</b>: PC <br/>
     * <b>Nome por extenso</b>: Polícia Civil
     */
    POLICIA_CIVIL(Sigla.de("PC", "Polícia Civil")),
    /**
     * <b>Sigla</b>: PF <br/>
     * <b>Nome por extenso</b>: Polícia Federal
     */
    POLICIA_FEDERAL(Sigla.de("PF", "Polícia Federal")),
    /**
     * <b>Sigla</b>: PGFN <br/>
     * <b>Nome por extenso</b>: Procuradoria Geral da Fazenda Nacional
     */
    PROCURADORIA_GERAL_FAZENDA_NACIONAL(Sigla.de("PGFN", "Procuradoria Geral da Fazenda Nacional")),
    /**
     * <b>Sigla</b>: PM <br/>
     * <b>Nome por extenso</b>: Polícia Militar
     */
    POLICIA_MILITAR(Sigla.de("PM", "Polícia Militar")),
    /**
     * <b>Sigla</b>: POLITEC <br/>
     * <b>Nome por extenso</b>: Perícia Oficial e Identificação Técnica
     */
    PERICIA_OFICIAL_IDENTIFICACAO_TECNICA(Sigla.de("POLITEC", "Perícia Oficial e Identificação Técnica")),
    /**
     * <b>Sigla</b>: PRF <br/>
     * <b>Nome por extenso</b>: Polícia Rodoviária Federal
     */
    POLICIA_RODOVIARIA_FEDERAL(Sigla.de("PRF", "Polícia Rodoviária Federal")),
    /**
     * <b>Sigla</b>: PTC <br/>
     * <b>Nome por extenso</b>: Polícia Tecnico-Científica
     */
    POLICIA_TECNICO_CIENTIFICA(Sigla.de("PTC", "Polícia Tecnico-Científica")),
    /**
     * <b>Sigla</b>: SSC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Casa Civil
     */
    SECRETARIA_ESTADO_CASA_CIVIL(Sigla.de("SSC", "Secretaria de Estado da Casa Civil")),
    /**
     * <b>Sigla</b>: SCJDS <br/>
     * <b>Nome por extenso</b>: Secretaria Coordenadora de Justiça e Defesa Social
     */
    SECRETARIA_COORDENADORA_JUSTICA_DEFESA_SOCIAL(Sigla.de("SCJDS", "Secretaria Coordenadora de Justiça e Defesa Social")),
    /**
     * <b>Sigla</b>: SDS <br/>
     * <b>Nome por extenso</b>: Secretaria de Defesa Social
     */
    SECRETARIA_DEFESA_SOCIAL(Sigla.de("SDS", "Secretaria de Defesa Social")),
    /**
     * <b>Sigla</b>: SECC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Casa Civil
     */
    SECRETARIA_ESTADO_CASA_CIVIL_SECC(Sigla.de("SECC", "Secretaria de Estado da Casa Civil")),
    /**
     * <b>Sigla</b>: SECCDE <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Casa Civil e Desenvolvimento Econômico
     */
    SECRETARIA_ESTADO_CASA_CIVIL_DESENVOLVIMENTO_ECONOMICO(Sigla.de("SECCDE", "Secretaria de Estado da Casa Civil e Desenvolvimento Econômico")),
    /**
     * <b>Sigla</b>: SEDS <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Defesa Social
     */
    SECRETARIA_DEFESA_SOCIAL_SEDS(Sigla.de("SEDS", "Secretaria de Estado da Defesa Social")),
    /**
     * <b>Sigla</b>: SEGUP <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança Pública e da Defesa Social
     */
    SECRETARIA_ESTADO_SEGURANCA_PUBLICA_DEFESA_SOCIAL(Sigla.de("SEGUP", "Secretaria de Estado da Segurança Pública e da Defesa Social")),
    /**
     * <b>Sigla</b>: SEJSP <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado de Justiça e Segurança Pública
     */
    SECRETARIA_ESTADO_JUSTICA_SEGURANCA_PUBLICA(Sigla.de("SEJSP", "Secretaria de Estado de Justiça e Segurança Pública")),
    /**
     * <b>Sigla</b>: SEJUC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Justica
     */
    SECRETARIA_ESTADO_JUSTICA(Sigla.de("SEJUC", "Secretaria de Estado da Justica")),
    /**
     * <b>Sigla</b>: SEJUSP <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado de Justiça e Segurança Pública
     */
    SECRETARIA_ESTADO_JUSTICA_SEGURANCA_PUBLICA_SEJUSP(Sigla.de("SEJUSP", "Secretaria de Estado de Justiça e Segurança Pública")),
    /**
     * <b>Sigla</b>: SEPC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Polícia Civil
     */
    SECRETARIA_ESTADO_POLICIA_CIVIL(Sigla.de("SEPC", "Secretaria de Estado da Polícia Civil")),
    /**
     * <b>Sigla</b>: SES <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança
     */
    SECRETARIA_ESTADO_SEGURANCA(Sigla.de("SES", "Secretaria de Estado da Segurança")),
    /**
     * <b>Sigla</b>: SESC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança e Cidadania
     */
    SECRETARIA_ESTADO_SEGURANCA_CIDADANIA(Sigla.de("SESC", "Secretaria de Estado da Segurança e Cidadania")),
    /**
     * <b>Sigla</b>: SESDC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança, Defesa e Cidadania
     */
    SECRETARIA_ESTADO_SEGURANCA_DEFESA_CIDADANIA(Sigla.de("SESDC", "Secretaria de Estado da Segurança, Defesa e Cidadania")),
    /**
     * <b>Sigla</b>: SESDEC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança, Defesa e Cidadania
     */
    SECRETARIA_ESTADO_SEGURANCA_DEFESA_CIDADANIA_SESDEC(Sigla.de("SESDEC", "Secretaria de Estado da Segurança, Defesa e Cidadania")),
    /**
     * <b>Sigla</b>: SESEG <br/>
     * <b>Nome por extenso</b>: Secretaria Estadual de Segurança
     */
    SECRETARIA_ESTADUAL_SEGURANCA(Sigla.de("SESEG", "Secretaria Estadual de Segurança")),
    /**
     * <b>Sigla</b>: SESP <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança Pública
     */
    SECRETARIA_ESTADO_SEGURANCA_PUBLICA(Sigla.de("SESP", "Secretaria de Estado da Segurança Pública")),
    /**
     * <b>Sigla</b>: SESPAP <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado da Segurança Pública e Administração Penitenciária
     */
    SECRETARIA_ESTADO_SEGURANCA_PUBLICA_ADMINISTRACAO_PENITENCIARIA(Sigla.de("SESPAP", "Secretaria de Estado da Segurança Pública e Administração Penitenciária")),
    /**
     * <b>Sigla</b>: SESPDC <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado de Segurança Publica e Defesa do Cidadão
     */
    SECRETARIA_ESTADO_SEGURANCA_PUBLICA_DEFESA_CIDADAO(Sigla.de("SESPDC", "Secretaria de Estado de Segurança Publica e Defesa do Cidadão")),
    /**
     * <b>Sigla</b>: SESPDS <br/>
     * <b>Nome por extenso</b>: Secretaria de Estado de Segurança Pública e Defesa Social
     */
    SECRETARIA_ESTADO_SEGURANCA_PUBLICA_DEFESA_SOCIAL_SESPDS(Sigla.de("SESPDS", "Secretaria de Estado de Segurança Pública e Defesa Social")),
    /**
     * <b>Sigla</b>: SGPC <br/>
     * <b>Nome por extenso</b>: Superintendência Geral de Polícia Civil
     */
    SUPERINTENDENCIA_GERAL_POLICIA_CIVIL(Sigla.de("SGPC", "Superintendência Geral de Polícia Civil")),
    /**
     * <b>Sigla</b>: SGPJ <br/>
     * <b>Nome por extenso</b>: Superintendência Geral de Polícia Judiciária
     */
    SUPERINTENDENCIA_GERAL_POLICIA_JUDICIARIA(Sigla.de("SGPJ", "Superintendência Geral de Polícia Judiciária")),
    /**
     * <b>Sigla</b>: SIM <br/>
     * <b>Nome por extenso</b>: Serviço de Identificação da Marinha
     */
    SERVICO_IDENTIFICACAO_MARINHA(Sigla.de("SIM", "Serviço de Identificação da Marinha")),
    /**
     * <b>Sigla</b>: SJ <br/>
     * <b>Nome por extenso</b>: Secretaria da Justiça
     */
    SECRETARIA_JUSTICA(Sigla.de("SJ", "Secretaria da Justiça")),
    /**
     * <b>Sigla</b>: SJCDH <br/>
     * <b>Nome por extenso</b>: Secretaria da Justiça e dos Direitos Humanos
     */
    SECRETARIA_JUSTICA_DIREITOS_HUMANOS(Sigla.de("SJCDH", "Secretaria da Justiça e dos Direitos Humanos")),
    /**
     * <b>Sigla</b>: SJDS <br/>
     * <b>Nome por extenso</b>: Secretaria Coordenadora de Justiça e Defesa Social
     */
    SECRETARIA_COORDENADORA_JUSTICA_DEFESA_SOCIAL_SJDS(Sigla.de("SJDS", "Secretaria Coordenadora de Justiça e Defesa Social")),
    /**
     * <b>Sigla</b>: SJS <br/>
     * <b>Nome por extenso</b>: Secretaria da Justiça e Segurança
     */
    SECRETARIA_JUSTICA_SEGURANCA(Sigla.de("SJS", "Secretaria da Justiça e Segurança")),
    /**
     * <b>Sigla</b>: SJTC <br/>
     * <b>Nome por extenso</b>: Secretaria da Justiça do Trabalho e Cidadania
     */
    SECRETARIA_JUSTICA_TRABALHO_CIDADANIA(Sigla.de("SJTC", "Secretaria da Justiça do Trabalho e Cidadania")),
    /**
     * <b>Sigla</b>: SJTS <br/>
     * <b>Nome por extenso</b>: Secretaria da Justiça do Trabalho e Segurança
     */
    SECRETARIA_JUSTICA_TRABALHO_SEGURANCA(Sigla.de("SJTS", "Secretaria da Justiça do Trabalho e Segurança")),
    /**
     * <b>Sigla</b>: SNJ <br/>
     * <b>Nome por extenso</b>: Secretaria Nacional de Justiça / Departamento de Estrangeiros
     */
    SECRETARIA_NACIONAL_JUSTICA(Sigla.de("SNJ", "Secretaria Nacional de Justiça / Departamento de Estrangeiros")),
    /**
     * <b>Sigla</b>: SPMAF <br/>
     * <b>Nome por extenso</b>: Serviço de Polícia Marítima, Aérea e de Fronteiras
     */
    SERVICO_POLICIA_MARITIMA_AEREA_FRONTEIRAS(Sigla.de("SPMAF", "Serviço de Polícia Marítima, Aérea e de Fronteiras")),
    /**
     * <b>Sigla</b>: SPTC <br/>
     * <b>Nome por extenso</b>: Secretaria de Polícia Técnico-Científica
     */
    SECRETARIA_POLICIA_TECNICO_CIENTIFICA(Sigla.de("SPTC", "Secretaria de Polícia Técnico-Científica")),
    /**
     * <b>Sigla</b>: SRDPF <br/>
     * <b>Nome por extenso</b>: Superintendência Regional do Departamento de Polícia Federal
     */
    SUPERINTENDENCIA_REGIONAL_DEPARTAMENTO_POLICIA_FEDERAL(Sigla.de("SRDPF", "Superintendência Regional do Departamento de Polícia Federal")),
    /**
     * <b>Sigla</b>: SRF <br/>
     * <b>Nome por extenso</b>: Receita Federal
     */
    RECEITA_FEDERAL(Sigla.de("SRF", "Receita Federal")),
    /**
     * <b>Sigla</b>: SRTE <br/>
     * <b>Nome por extenso</b>: Superintendência Regional do Trabalho
     */
    SUPERINTENDENCIA_REGIONAL_TRABALHO(Sigla.de("SRTE", "Superintendência Regional do Trabalho")),
    /**
     * <b>Sigla</b>: SSDC <br/>
     * <b>Nome por extenso</b>: Secretaria da Segurança, Defesa e Cidadania
     */
    SECRETARIA_SEGURANCA_DEFESA_CIDADANIA(Sigla.de("SSDC", "Secretaria da Segurança, Defesa e Cidadania")),
    /**
     * <b>Sigla</b>: SSDS <br/>
     * <b>Nome por extenso</b>: Secretaria da Segurança e da Defesa Social
     */
    SECRETARIA_SEGURANCA_DEFESA_SOCIAL(Sigla.de("SSDS", "Secretaria da Segurança e da Defesa Social")),
    /**
     * <b>Sigla</b>: SSI <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança e Informações
     */
    SECRETARIA_SEGURANCA_INFORMACOES(Sigla.de("SSI", "Secretaria de Segurança e Informações")),

    /**
     * <b>Sigla</b>: SSP <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança Pública
     */
    SECRETARIA_SEGURANCA_PUBLICA(Sigla.de("SSP", "Secretaria de Segurança Pública")),
    /**
     * <b>Sigla</b>: SSPCGP <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança Pública e Coordenadoria Geral de Perícias
     */
    SECRETARIA_SEGURANCA_PUBLICA_COORDENADORIA_GERAL_PERICIAS(Sigla.de("SSPCGP", "Secretaria de Segurança Pública e Coordenadoria Geral de Perícias")),
    /**
     * <b>Sigla</b>: SSPDC <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança Pública e Defesa do Cidadão
     */
    SECRETARIA_SEGURANCA_PUBLICA_DEFESA_CIDADAO(Sigla.de("SSPDC", "Secretaria de Segurança Pública e Defesa do Cidadão")),
    /**
     * <b>Sigla</b>: SSPDS <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança Pública e Defesa Social
     */
    SECRETARIA_SEGURANCA_PUBLICA_DEFESA_SOCIAL(Sigla.de("SSPDS", "Secretaria de Segurança Pública e Defesa Social")),
    /**
     * <b>Sigla</b>: SSPPC <br/>
     * <b>Nome por extenso</b>: Secretaria de Segurança Pública Polícia Civil
     */
    SECRETARIA_SEGURANCA_PUBLICA_POLICIA_CIVIL(Sigla.de("SSPPC", "Secretaria de Segurança Pública Polícia Civil")),
    /**
     * <b>Sigla</b>: SUSEP <br/>
     * <b>Nome por extenso</b>: Superintendência de Seguros Privados
     */
    SUPERINTENDENCIA_SEGUROS_PRIVADOS(Sigla.de("SUSEP", "Superintendência de Seguros Privados")),
    /**
     * <b>Sigla</b>: SUSEPE <br/>
     * <b>Nome por extenso</b>: Superintendência dos Serviços Penitenciários
     */
    SECRETARIA_SERVICOS_PENITENCIARIOS(Sigla.de("SUSEPE", "Superintendência dos Serviços Penitenciários")),
    /**
     * <b>Sigla</b>: TJ <br/>
     * <b>Nome por extenso</b>: Tribunal de Justiça
     */
    TRIBUNAL_JUSTICA(Sigla.de("TJ", "Tribunal de Justiça")),
    /**
     * <b>Sigla</b>: TJAEM <br/>
     * <b>Nome por extenso</b>: Tribunal Arbitral e Mediação dos Estados Brasileiros
     */
    TRIBUNAL_ARBITRAL_MEDIACAO_ESTADOS_BRASILEIS(Sigla.de("TJAEM", "Tribunal Arbitral e Mediação dos Estados Brasileiros")),
    /**
     * <b>Sigla</b>: TRE <br/>
     * <b>Nome por extenso</b>: Tribunal Regional Eleitoral
     */
    TRIBUNAL_REGIONAL_ELEITORAL(Sigla.de("TRE", "Tribunal Regional Eleitoral")),
    /**
     * <b>Sigla</b>: TRF <br/>
     * <b>Nome por extenso</b>: Tribunal Regional Federal
     */
    TRIBUNAL_REGIONAL_FEDERAL(Sigla.de("TRF", "Tribunal Regional Federal")),
    /**
     * <b>Sigla</b>: TRF <br/>
     * <b>Nome por extenso</b>: Tribunal Regional Federal
     */
    TRIBUNAL_SUPERIOR_ELEITORAL(Sigla.de("TSE", "Tribunal Superior Eleitoral")),
    /**
     * <b>Sigla</b>: XXX <br/>
     * <b>Nome por extenso</b>: Orgão Estrangeiro
     */
    ORGAO_ESTRANGEIRO(Sigla.de("XXX", "Orgão Estrangeiro")),
    /**
     * <b>Sigla</b>: ZZZ <br/>
     * <b>Nome por extenso</b>: Outro
     */
    OUTRO(Sigla.de("ZZZ", "Outro Orgão"));


    private final Sigla sigla;

    OrgaoExpedidor(Sigla sigla){
        this.sigla = sigla;
    }



    /**
     * Obtém um orgão expedidor a partir uma Sigla
     *
     * @param nomeEnum que será usado para identificar o Orgão expedidor
     * @return orgão expedidor
     */
    public static Optional<OrgaoExpedidor> getOrgaoExpedidorPorSigla(String nomeEnum){
        Objects.requireNonNull(nomeEnum);
        return Stream.of(values())
                .filter(o -> o.name().equals(nomeEnum))
                .findFirst();
    }

    /**
     * Obtém um orgão expedidor a partir uma Sigla
     *
     * @param sigla que será usado para identificar o Orgão expedidor
     * @return orgão expedidor
     */
    public static Optional<OrgaoExpedidor> getOrgaoExpedidorPorSigla(Sigla sigla){
        Objects.requireNonNull(sigla);
        return Stream.of(values())
                .filter(o -> o.sigla.equals(sigla))
                .findFirst();
    }

    /**
     * Obtém um orgão expedidor a partir dos eu acrônimo que representa uma Sigla
     *
     * @param acronimo que será usado para identificar o Orgão expedidor
     * @return orgão expedidor
     */
    public static Optional<OrgaoExpedidor> getOrgaoExpedidorPorAcronimo(String acronimo){
        Objects.requireNonNull(acronimo);
        return Stream.of(values())
                .filter(o -> o.sigla.getAcronimo().equalsIgnoreCase(acronimo))
                .findFirst();
    }


    /**
     * Lista de nomes por extenso de todos os orgãos expedirores (pode haver repetidos)<br/>
     *
     * @return coleção de nome por extenso de orgão expedidor
     */
    public static Collection<String> nomesPorExtensos(){
        return Stream.of(values())
                .map(OrgaoExpedidor::getNomeExtenso)
                .collect(Collectors.toList());
    }

    /**
     * Lista de siglas e nome por extenso todos os orgãos expedirores<br/>
     * ex: 'TSE - Tribunal Superior Eleitoral'
     * @return coleção de nome por extenso de orgão expedidor
     */
    public static Collection<String> acronimosENomePorExtenso(){
        return Stream.of(values())
                .map(OrgaoExpedidor::toString)
                .collect(Collectors.toList());
    }

    /**
     * Lista de siglas e nome por extenso todos os orgãos expedirores<br/>
     * ex: 'TSE - Tribunal Superior Eleitoral'
     * @return coleção de nome por extenso de orgão expedidor
     */
    public static Collection<Sigla> siglas(){
        return Stream.of(values())
                .map(e -> e.sigla)
                .collect(Collectors.toList());
    }

    /**
     * Lista de siglas todos os orgãos expedidores <br/>
     * ex: 'TSE'
     * @return coleção de nome por extenso de orgão expedidor
     */
    public static Collection<String> acronimos(){
        return Stream.of(values())
                .map(OrgaoExpedidor::getAcronimo)
                .collect(Collectors.toList());
    }

    /**
     * retorna Sigla que representa o Orgão expedidor <br/>*
     *
     * @return Sigla do orgão expedidor
     */
    public Sigla getSigla() {
        return sigla;
    }


    /**
     * Mostra o nome por extenso do orgãa expedidor <br/>
     * ex: TSE <br/>
     *
     * @return sigla do orgão expedidor
     */
    public String getAcronimo() {
        return this.sigla.getAcronimo();
    }

    /**
     * Mostra o nome por extenso do orgãa expedidor <br/>
     * ex: Tribunal Superior Eleitoral <br/>
     * OBS: Pode haver dois orgão expedidor com o mesmo nome
     *
     * @return nome por extenso do orgão expedidor
     */
    public String getNomeExtenso() {
        return this.sigla.getNomeExtenso();
    }

    /**
     * Mostra sigla e o nome por extenso do orgão expedidor <br/>
     * Ex: 'TSE - Tribunal Superior Eleitoral'
     *
     * @return 'sigla - nome por extenso'
     */
    @Override
    public String toString() {
        return String.format("%s - %s", sigla.getAcronimo(), sigla.getNomeExtenso());
    }
}
