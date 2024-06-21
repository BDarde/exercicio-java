import Exceptions.PersonagemJaEstaNoMapaException;
import Exceptions.PersonagemNaoEncontradoNoMapaException;
import Exceptions.PosicaoOcupadaException;
import Exceptions.SauronDominaOMundoException;
import Personagens.*;
import Mapa.Mapa;
import Simulador.Simular;
import org.junit.Assert;
import org.junit.Test;

public class TestObrigatorios {

    @Test
    public void deveVencerSociedadeQuandoAragornELegolasBatalharemContraOrcEGoblim()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|A|L| | | | | |O| |M|"
        String resultadoEsperado = "| | | | |A| | | | |L|";

        Aragon aragorn = new Aragon();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblin goblim = new Goblin();
        Mapa mapa = new Mapa();
        Simular simulador = new Simular(mapa);

        mapa.inserir(0, aragorn);
        mapa.inserir(1, legolas);
        mapa.inserir(7, orc);
        mapa.inserir(9, goblim);
        simulador.simulacao();
        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoInimigosDerrotaremMembrosDaSociedade()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início: "|A| |I| | | | |U|O|M|"
        // Fim:    "| | | | | | |O|M| | |"

        Aragon aragorn = new Aragon();
        Gimli gimli = new Gimli();
        Urukai urukhai = new Urukai();
        Orc orc = new Orc();
        Goblin goblim = new Goblin();
        Mapa mapa = new Mapa();
        Simular simulador = new Simular(mapa);

        mapa.inserir(0, aragorn);
        mapa.inserir(2, gimli);
        mapa.inserir(7, urukhai);
        mapa.inserir(8, orc);
        mapa.inserir(9, goblim);
        simulador.simulacao();
    }


    @Test
    public void deveVencerSociedadeQuandoGandalfBatalharSozinhoContraSaruman()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|G| | | | | | | | |S|"
        String resultadoEsperado = "| | | | | | | | | |G|";

        Gandalf gandalf = new Gandalf();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        Simular simulador = new Simular(mapa);

        mapa.inserir(0, gandalf);
        mapa.inserir(9, saruman);
        simulador.simulacao();

        Assert.assertEquals(resultadoEsperado, mapa.exibir());
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoLegolasBatalharSozinhoContraOrcEUrukhai()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|L| | | | | | | |U|O|"
        // Fim:     "| | | | | |U| | | | |";

        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Urukai urukhai = new Urukai();
        Mapa mapa = new Mapa();
        Simular simulador = new Simular(mapa);

        mapa.inserir(0, legolas);
        mapa.inserir(8, urukhai);
        mapa.inserir(9, orc);
        simulador.simulacao();
    }

    @Test(expected = SauronDominaOMundoException.class)
    public void deveLancarSauronDominaOMundoExceptionQuandoBoromirBatalharSozinhoContraUrukhai()
            throws PersonagemJaEstaNoMapaException, PosicaoOcupadaException, SauronDominaOMundoException, PersonagemNaoEncontradoNoMapaException {
        // Início:  "|B| | | | | | | | |U|"
        // Fim:     "| | | | |U| | | | | |";

        Boromir boromir = new Boromir();
        Urukai urukhai = new Urukai();
        Mapa mapa = new Mapa();
        Simular simulador = new Simular(mapa);

        mapa.inserir(0, boromir);
        mapa.inserir(9, urukhai);
        simulador.simulacao();
    }







    @Test
    public void testandoSeAlistaPegaOsPersonagensDoMapa(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Aragon a = new Aragon();
        m.inserir(2, a);
        m.inserir(4,l);

        Simular s = new Simular(m);
        s.simulacao();

    }

    @Test
    public void gandalfDeveGanharERestarApenasEle(){
        Gandalf g = new Gandalf();
        Orc o = new Orc();
        Mapa m = new Mapa();
        m.inserir(5,g);
        m.inserir(9,o);
        Simular s = new Simular(m);

        System.out.println(m.exibir());
        s.simulacao();
        System.out.println(m.exibir());
    }

    @Test
    public void deveRetornarAPosicaoDoGoblin(){
        Mapa m = new Mapa();
        Goblin g = new Goblin();
        m.inserir(5,g);

        int posicaoEsperada = 5;
        Assert.assertEquals(posicaoEsperada, m.buscarPosicao(g));

    }


}