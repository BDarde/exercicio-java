import Exceptions.PersonagemJaEstaNoMapaException;
import Exceptions.PersonagemNaoEncontradoNoMapaException;
import Exceptions.PosicaoOcupadaException;
import Mapa.Mapa;
import Personagens.*;
import Racas.Maia;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import sun.security.util.ByteArrayLexOrder;

public class TestMapa {


    @Test
    public void mostrarMapa(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        m.inserir(1,l);
        l.setConstituicao(0);
        System.out.println(m.buscarCasa(1));

    }

    @Test
    public void deveInserirOPersonagemCorretamente(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        m.inserir(2, l);
        System.out.println(m.exibir());
        Personagens p = m.buscarCasa(2);
        System.out.println(p);



    }

    @Test
    public void deveInserirDoisPersonagensCorretamente(){
        Mapa m = new Mapa();
        m.inserir(2, new Legolas());
        m.inserir(8, new Aragon());
        int posicaoOcupada = 0;
        int segundaPosicaoOcupada = 0;


        System.out.println( m.exibir());
        for(int i =0; i < m.getPosicoes().length; i++){
            if(m.getPosicoes()[i] != null){
                posicaoOcupada = i;
                m.getPosicoes()[i] = null;
                break;
            }
        }

        for(int i =0; i < m.getPosicoes().length; i++){
            if(m.getPosicoes()[i] != null){
                segundaPosicaoOcupada = i;
                m.getPosicoes()[i] = null;
                break;
            }
        }

        Assert.assertEquals(2, posicaoOcupada);
        Assert.assertEquals(8, segundaPosicaoOcupada);
    }


    @Test (expected = PersonagemJaEstaNoMapaException.class)
    public void deveLancarAExcecaoDePersonagemJaEstaNoMapa(){
       Mapa m1 = new Mapa();
       m1.inserir(2, new Aragon());
       m1.inserir(7, new Aragon());
    }

    @Test (expected = PosicaoOcupadaException.class)
    public void deveLancarAExcecaoDePosicaoOcupada(){
        Mapa m1 = new Mapa();
        m1.inserir(2, new Aragon());
        m1.inserir(2, new Orc());
    }

    @Test
    public void deveRetornarOIndiceCorretoDoPersonagemASerBuscado(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        m.inserir(9, s);
        int indexEsperado = 9;
        int indexBuscado = m.buscarPosicao(s);

        Assert.assertEquals(indexEsperado, indexBuscado);

    }

    @Test (expected = PersonagemNaoEncontradoNoMapaException.class)
    public void deveLancarAExcecaoCasoPersonagemNaoSejaEncontrado(){
        Mapa m = new Mapa();
        m.buscarPosicao(new Saruman());

    }

    @Test
    public void deveRetornarOPersonagemdaCasaCorretamente(){
        Mapa m = new Mapa();
        Gandalf g1 = new Gandalf();
        m.inserir(2, g1);

        Personagens personagemEsperado = g1;
        Personagens personagemDaCasa = m.buscarCasa(2);

        Assert.assertSame(personagemEsperado, personagemDaCasa);
    }

    @Test
    public void deveRetornarNuloCasoNaoExistapersonagemNaCasaBuscada(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();

        Personagens personagemEsperado = null;
        Personagens personagemRetornado = m.buscarCasa(5);

        Assert.assertSame(personagemEsperado, personagemRetornado);
    }

    @Test
    public void naoDeveMostrarUmPersonagemMorto(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        m.inserir(2, g);
        System.out.println(m.exibir());
        g.setConstituicao(0);
        System.out.println(m.exibir());

        Personagens valorEsperado = null;
        Assert.assertSame(valorEsperado, m.getPosicoes()[2]);

    }

    @Test
    public void deveRetirarPersonagemMorto(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();

        m.inserir(2,l);
        l.setConstituicao(0);
        System.out.println(m.exibir());
        System.out.println(m.buscarCasa(2));
    }
}

