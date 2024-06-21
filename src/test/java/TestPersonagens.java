import Mapa.Mapa;
import Personagens.Personagens;
import Personagens.Aragon;
import Personagens.Gandalf;
import Personagens.Legolas;
import Personagens.Gimli;
import Personagens.Boromir;
import Personagens.Saruman;
import Personagens.Orc;
import Personagens.Goblin;
import Personagens.Urukai;
import Racas.Humano;
import Racas.Anao;
import Racas.Monstro;
import Racas.Maia;
import Racas.Elfo;
import Simulador.Simular;
import org.junit.Assert;
import org.junit.Test;

public class TestPersonagens {

    @Test
    public void aragronDeveSemover(){
        String esperada = "| | |A|O| | | | | | |";
        Mapa m = new Mapa();

        Orc o = new Orc();
        Aragon a = new Aragon();
        m.inserir(1, a);
        m.inserir(3,o);

        System.out.println(m.exibir());
        a.movimentar(m);
        System.out.println(m.exibir());
        Assert.assertEquals(esperada, m.exibir());


    }

    @Test
    public void deveInstanciarUmPersonagnesComOsValoresCorretamente(){

        Personagens aragon = new Aragon();

        int valorDeForçaEsperado = 10;
        int valorIntContido = aragon.getForça();
        int valorDeAgilidadeEsperado = 7;
        int valorAgiContido = aragon.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }


    @Test
    public void deveInstanciarGandalfComOsValoresCorretamente(){

        Personagens gandalf = new Gandalf();

        int valorDeForçaEsperado = 2;
        int valorIntContido = gandalf.getForça();
        int valorDeAgilidadeEsperado = 3;
        int valorAgiContido = gandalf.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarLegolasComOsValoresCorretamente(){

        Personagens Legolas = new Legolas();

        int valorDeForçaEsperado = 5;
        int valorIntContido = Legolas.getForça();
        int valorDeAgilidadeEsperado = 10;
        int valorAgiContido = Legolas.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarGimliComOsValoresCorretamente(){

        Personagens gimli = new Gimli();

        int valorDeForçaEsperado = 9;
        int valorIntContido = gimli.getForça();
        int valorDeAgilidadeEsperado = 2;
        int valorAgiContido = gimli.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarBoromirComOsValoresCorretamente(){

        Personagens boromir = new Boromir();

        int valorDeForçaEsperado = 7;
        int valorIntContido = boromir.getForça();
        int valorDeAgilidadeEsperado = 6;
        int valorAgiContido = boromir.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarSarumanComOsValoresCorretamente(){

        Personagens saruman = new Saruman();

        int valorDeForçaEsperado = 2;
        int valorIntContido = saruman.getForça();
        int valorDeAgilidadeEsperado = 2;
        int valorAgiContido = saruman.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarOrcComOsValoresCorretamente(){

        Personagens orc = new Orc();

        int valorDeForçaEsperado = 7;
        int valorIntContido = orc.getForça();
        int valorDeAgilidadeEsperado = 4;
        int valorAgiContido = orc.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarGoblinComOsValoresCorretamente(){

        Personagens goblin = new Goblin();

        int valorDeForçaEsperado = 3;
        int valorIntContido = goblin.getForça();
        int valorDeAgilidadeEsperado = 6;
        int valorAgiContido = goblin.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveInstanciarUrukaiComOsValoresCorretamente(){

        Personagens urukai = new Urukai();

        int valorDeForçaEsperado = 8;
        int valorIntContido = urukai.getForça();
        int valorDeAgilidadeEsperado = 6;
        int valorAgiContido = urukai.getAgilidade();

        Assert.assertEquals(valorDeForçaEsperado, valorIntContido);
        Assert.assertEquals(valorDeAgilidadeEsperado, valorAgiContido);

    }

    @Test
    public void deveRetornarOToStringCorretamente(){

        Personagens urukai = new Urukai();
        Personagens aragon = new Aragon();
        Gandalf gandalf = new Gandalf();
        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Boromir boromir = new Boromir();
        Saruman saruman = new Saruman();
        Orc orc = new Orc();
        Goblin goblin = new Goblin();

        Assert.assertEquals("A", aragon.toString());
        Assert.assertEquals("L", legolas.toString());
        Assert.assertEquals("I", gimli.toString());
        Assert.assertEquals("B", boromir.toString());
        Assert.assertEquals("S", saruman.toString());
        Assert.assertEquals("O", orc.toString());
        Assert.assertEquals("M", goblin.toString());
        Assert.assertEquals("U", urukai.toString());


    }

//    @Test
//    public void deveTerOsComportamentosConformeARacaCorretamente(){
//        Aragon aragon = new Aragon();
//        String falaEsperada = "A day may come when the courage of men fails… but it is not THIS day.";
//        String falaAragon = aragon.falar();
//        int constituicaoEsperado = 59;
//        aragon.envelhecer();
//        int constituicaoAragon = aragon.getConstituicao();
//
//        Assert.assertEquals(falaEsperada, falaAragon);
//        Assert.assertEquals(constituicaoAragon, constituicaoAragon);
//
//
//        Gandalf gandalf = new Gandalf();
//        String falaEsperadaGandalf = "A Wizard is never late, nor is he early. He arrives precisely when he means to";
//        String falaGandalf = gandalf.falar();
//        int constituicaoEsperadaGandalf = 80;
//        gandalf.setConstituicao(0);
//        ;
//        int constituicaoGandalf = gandalf.getConstituicao();
//
//        Assert.assertEquals(falaEsperadaGandalf, falaGandalf);
//        Assert.assertEquals(constituicaoEsperadaGandalf, gandalf.recussitar().getConstituicao());
//
//        Boromir boromir = new Boromir();
//        String falaBoromirEsperada = "One does not simply walk into Mordor.";
//        String falaBoromir = boromir.falar();
//        int constituicaoBoromirEsperada = 38;
//        boromir.envelhecer();
//        int constituicaoBoromir = boromir.getConstituicao();
//
//        Assert.assertEquals(falaBoromirEsperada, falaBoromir);
//        Assert.assertEquals(constituicaoBoromirEsperada, constituicaoBoromir);
//    }
//
//    @Test
//    public void deveAlterarAFalaDeGimliQuandoBebado(){
//        Gimli gimli = new Gimli();
//        gimli.beber();
//        gimli.beber();
//        gimli.beber();
//
//        String falaEsperada = "What did I say? He can't hold his liquor!";
//        String falaGimli = gimli.falar();
//
//        Assert.assertEquals(falaEsperada, falaGimli);
//    }
//
//    @Test
//    public void deveFalarNormalmenteQuandoGimliForInstanciado(){
//        Gimli gimli = new Gimli();
//
//        String falaEsperada = "Let them come. There is one Dwarf yet in Moria who still draws breath.";
//        String falaGimli = gimli.falar();
//
//        Assert.assertEquals(falaEsperada, falaGimli);
//    }
//
//
//
//    @Test
//    public void deveRetornarNullAoRecussitarSaruman(){
//        Saruman s = new Saruman();
//        s.setConstituicao(0);
//        Personagens novooGandalf = s.recussitar();
//        Boolean ehDoMesmoTipo = (novooGandalf instanceof Gandalf);
//
//        Assert.assertFalse(ehDoMesmoTipo);
//    }

    @Test
    public void deveDarODanoCorretamente(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Legolas l = new Legolas();
        Orc l1 = new Orc();
        m.inserir(2, g);
        m.inserir(5,l);
        m.inserir(6,l1);

        g.atacar(m);
        g.atacar(m);

        System.out.println(l.getConstituicao());
        System.out.println(l1.getConstituicao());
    }

    @Test
    public void deveAndarOMagoCasoMapaEstejaVazio(){
    Mapa m = new Mapa();
    Gandalf g = new Gandalf();
    m.inserir(7, g);
        System.out.println(m.exibir());
    g.movimentar(m);
        System.out.println(m.exibir());


    }

    @Test
    public void DeveAndarOMagoCasoMapaTenhaAliados(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Legolas l = new Legolas();
        m.inserir(2, g);
        m.inserir(5,l);

        g.movimentar(m);

        String mapaEsperado = "| | | |G| |L| | | | |";
        Assert.assertEquals(mapaEsperado, m.exibir());
    }

    @Test
    public void naoDeveAndarOMagoCasoMapaTenhaInimigos(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Orc l = new Orc();
        m.inserir(2, g);
        m.inserir(5,l);

        g.movimentar(m);

        String mapaEsperado = "| | |G| | |O| | | | |";
        Assert.assertEquals(mapaEsperado, m.exibir());
    }

    @Test
    public void DeveAndarOMagoSarumanCasoMapaTenhaAliados(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        Orc o = new Orc();
        m.inserir(2, o);
        m.inserir(5, s);
        System.out.println(m.exibir());
        s.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | |O| |S| | | | | |";
        Assert.assertEquals(esperada, m.exibir());

    }


    @Test
    public void naoDeveAndarOMagoSarumanCasoMapaTenhaInimigos(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        Gandalf g = new Gandalf();
        m.inserir(2, g);
        m.inserir(5, s);
        System.out.println(m.exibir());
        s.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | |G| | |S| | | | |";
        Assert.assertEquals(esperada, m.exibir());

    }


    @Test
    public void DeveAndarParaEsquerdaComMagoSarumanQuandoNaoTiverOutrosPersonagens(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        m.inserir(5, s);

        System.out.println(m.exibir());
        s.movimentar(m);
        System.out.println(m.exibir());
        String esperada = "| | | | |S| | | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void naoDeveAndarParaEsquerdaComMagoSarumanQuandoTiverOutrosPersonagens(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        Gandalf g = new Gandalf();
        Orc o = new Orc();
        m.inserir(5, s);
        m.inserir(2,g);
        m.inserir(0,o);

        String esperada = "|O| |G| | |S| | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void deveDiminuirAConstituicaoDePersonagensADireitadeGandalf(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        Gandalf g = new Gandalf();
        Orc o = new Orc();
        m.inserir(5, s);
        m.inserir(2,g);
        m.inserir(9,o);

        System.out.println(s.constituicao);
        System.out.println(o.constituicao);
        g.atacar(m);
        System.out.println(s.constituicao);
        System.out.println(o.constituicao);
    }


    @Test
    public void aragonDeveAtacarSomentePersonagensDaProximaCasa(){
        Mapa m = new Mapa();
        Aragon a = new Aragon();
        Orc o = new Orc();
        m.inserir(6,o);
        m.inserir(5,a);
        a.atacar(m);
        int constituicaoEsperada = 10;
        Assert.assertEquals(constituicaoEsperada, o.getConstituicao());
    }

    @Test
    public void aragonDeveAtacarSomentePersonagensDaProximaCasaENaoOsOutros(){
        Mapa m = new Mapa();
        Aragon a = new Aragon();
        Orc o = new Orc();
        Urukai u = new Urukai();
        m.inserir(6,o);
        m.inserir(5,a);
        m.inserir(7,u);
        a.atacar(m);
        int constituicaoEsperadaOrc = 10;
        int constituicaoEsperadaUrukai = 45;
        Assert.assertEquals(constituicaoEsperadaOrc, o.getConstituicao());
        Assert.assertEquals(constituicaoEsperadaUrukai,u.getConstituicao());
    }

    @Test
    public void gandalfNaoDeveAtacarMembrodaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Aragon a = new Aragon();

        m.inserir(4, g);
        m.inserir(6, a);

        System.out.println(a.getConstituicao());
        g.atacar(m);
        System.out.println(a.getConstituicao());

    }

    @Test
    public void gandalfDeveAtacarPersonagensNaoMembrosDaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Orc o = new Orc();

        m.inserir(4, g);
        m.inserir(6, o);
        g.atacar(m);
        System.out.println(m.exibir());
        int constituicaoOrcEsperada = 20;
        Assert.assertEquals(constituicaoOrcEsperada, o.getConstituicao());
    }

    @Test
    public void gandalfNaoDeveAtacarPersonagensMembrosDaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Gandalf g = new Gandalf();
        Aragon a = new Aragon();

        m.inserir(4, g);
        m.inserir(6, a);
        g.atacar(m);

        int constituicaoAragonEsperada = 60;
        Assert.assertEquals(constituicaoAragonEsperada, a.getConstituicao());
    }

    @Test
    public void boromirDeveAtacarPersonagensSomenteSeNaoForemDaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Boromir b = new Boromir();
        Orc o = new Orc();

        m.inserir(6,o);
        m.inserir(5,b);

        b.atacar(m);
        int constituicaoEsperadaOrc = 16;

        Assert.assertEquals(constituicaoEsperadaOrc, o.getConstituicao());
        /// Nao deve Atacar

        Mapa m2 = new Mapa();
        Boromir b2 = new Boromir();
        Aragon a = new Aragon();
        m2.inserir(2,b2);
        m2.inserir(3,a);

        a.atacar(m2);
        int constituicaoAragonEsperada = 60;
        Assert.assertEquals(constituicaoAragonEsperada, a.getConstituicao());
    }
    @Test
    public void gimliNaoDeveAtacarPersonagensSeoForemDaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Gimli g = new Gimli();
        Aragon a = new Aragon();

        m.inserir(4,g);
        m.inserir(5,a);

        g.atacar(m);
        int constituicaoEsperadaAragon = 60;

        Assert.assertEquals(constituicaoEsperadaAragon, a.getConstituicao());

    }

    @Test
    public void gimliDeveAtacarPersonagensSomenteSeNaoForemDaSociedadeDoAnel(){
        Mapa m = new Mapa();
        Gimli g = new Gimli();
        Orc o = new Orc();

        m.inserir(4,g);
        m.inserir(5,o);

        g.atacar(m);
        int constituicaoEsperadaOrc = 12;

        Assert.assertEquals(constituicaoEsperadaOrc, o.getConstituicao());

    }

    @Test
    public void gimliDeveAndarParaADireita(){
        Mapa m = new Mapa();
        Gimli g = new Gimli();
        m.inserir(2, g);
        System.out.println(m.exibir());
        g.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | | |I| | | | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void goblinDeveAndarSomenteUmaCasa(){
        Mapa m = new Mapa();
        Goblin g = new Goblin();
        Orc o = new Orc();

        m.inserir(4,g);
        m.inserir(2,o);


        System.out.println(m.exibir());
        g.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | |O|M| | | | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void goblinDeveandarDuasCasasSeLivre(){
        Mapa m = new Mapa();
        Goblin g = new Goblin();
        m.inserir(4,g);

        System.out.println(m.exibir());
        g.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | |M| | | | | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void goblinDeveAtacarGandalfNaEsquerda(){
        Mapa m = new Mapa();
        Goblin a = new Goblin();
        Gandalf g = new Gandalf();

        m.inserir(4,g);
        m.inserir(5,a);

        a.atacar(m);
        int constituicaoEsperadaGandalf = 74;

        Assert.assertEquals(constituicaoEsperadaGandalf, g.getConstituicao());
    }

    @Test
    public void aragonDeveAvancarUmaCasaSeLivre(){
        Mapa m = new Mapa();
        Aragon a = new Aragon();
        m.inserir(2,a);

        String mapaEsperado = "| | | |A| | | | | | |";
        a.movimentar(m);
        Assert.assertEquals(mapaEsperado,m.exibir());
    }

    @Test
    public void legolasNaoDeveAndarUmacasa(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Gandalf g = new Gandalf();

        m.inserir(0,l);
        m.inserir(1,g);

        String esperada = "|L|G| | | | | | | | |";
        l.movimentar(m);
        Assert.assertEquals(esperada, m.exibir());

    }

    @Test
    public void legolasDeveAndarUmacasa(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Gandalf g = new Gandalf();

        m.inserir(0,l);
        m.inserir(2,g);

        String esperada = "| |L|G| | | | | | | |";
        System.out.println(m.exibir());
        l.movimentar(m);
        System.out.println(m.exibir());
        Assert.assertEquals(esperada, m.exibir());

    }

    @Test
    public void legolasDeveAndarDUascasas(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Gandalf g = new Gandalf();

        m.inserir(0,l);
        m.inserir(3,g);

        String esperada = "| | |L|G| | | | | | |";
        System.out.println(m.exibir());
        l.movimentar(m);
        System.out.println(m.exibir());
        Assert.assertEquals(esperada, m.exibir());

    }

    @Test
    public void goblimDeveAndarConformeAPossibilidade() {
        Mapa m1 = new Mapa();
        Goblin g = new Goblin();
        Aragon a = new Aragon();
        m1.inserir(3, g);
        m1.inserir(2, a);


        g.movimentar(m1);
        String esperada = "| | |A|M| | | | | | |";
        Assert.assertEquals(esperada, m1.exibir());
    }


    @Test
    public void goblinDeveAndarSomenteUmaCasa2(){
            Mapa m2 = new Mapa();
            Goblin g2 = new Goblin();
            Aragon a2 = new Aragon();
            m2.inserir(3,g2);
            m2.inserir(1,a2);

        System.out.println( m2.exibir());
            g2.movimentar(m2);
        System.out.println( m2.exibir());
             String esperada2 = "| |A|M| | | | | | | |";
            Assert.assertEquals(esperada2, m2.exibir());
    }

    @Test
    public void goblinDeveAndarDuasCasas(){
        Mapa m2 = new Mapa();
        Goblin g2 = new Goblin();

        m2.inserir(4,g2);

        System.out.println(m2.exibir());

        g2.movimentar(m2);

        System.out.println(m2.exibir());
        String esperada2 = "| | |M| | | | | | | |";
        //Assert.assertEquals(esperada2, m2.exibir());
    }





    @Test
    public void aragonNaoDeveAvancarUmaCasaSeOcupada(){
        Mapa m = new Mapa();
        Aragon a = new Aragon();
        Orc o = new Orc();
        m.inserir(2,a);
        m.inserir(3,o);

        String mapaEsperado = "| | |A|O| | | | | | |";
        a.movimentar(m);
        Assert.assertEquals(mapaEsperado,m.exibir());
    }

    @Test
    public void aragonDeveAtacarOrcConformeODanoCorreto(){
        Mapa n = new Mapa();
        Aragon a = new Aragon();
        Orc o = new Orc();
        n.inserir(7, a);
        n.inserir(8, o);
        a.atacar(n);

        int constituicaoOrcEsperada = 10;
        Assert.assertEquals(constituicaoOrcEsperada, o.getConstituicao());
    }

    @Test
    public void BoromirDeveAvancarUmaCasaSeLivre(){
        Mapa m = new Mapa();
        Boromir b = new Boromir();
        m.inserir(2,b);

        String mapaEsperado = "| | | |B| | | | | | |";
        b.movimentar(m);
        Assert.assertEquals(mapaEsperado,m.exibir());
    }

    @Test
    public void boromirDeveAtacarADireitaComODanoCorreto(){
        Mapa m = new Mapa();
        Boromir b = new Boromir();
        Orc o = new Orc();
        m.inserir(2,b);
        m.inserir(3,o);
        b.atacar(m);

        int constituicaoOrcEsperada =16;
        Assert.assertEquals(constituicaoOrcEsperada, o.getConstituicao());
    }


    @Test
    public void orcDeveAtacarrParaEsquerda(){
        Mapa m = new Mapa();
        Orc o = new Orc();
        Gandalf g = new Gandalf();
        m.inserir(4,o);
        m.inserir(3,g);

        String mapaEsperado = "| | | |G|O| | | | | |";
        Assert.assertEquals(mapaEsperado, m.exibir());

        int constituicaoEsperadaGandalfa = 66;
        o.atacar(m);
        Assert.assertEquals(constituicaoEsperadaGandalfa, g.getConstituicao());
    }

    @Test
    public void orcDeveAndarParaEsquerda(){
        Mapa m = new Mapa();
        Orc o = new Orc();
        m.inserir(4,o);
        System.out.println(m.exibir());
        o.movimentar(m);
        System.out.println(m.exibir());

        String mapaEsperado = "| | | |O| | | | | | |";
        Assert.assertEquals(mapaEsperado, m.exibir());
    }

    @Test
    public void urukaiDeveAndarParaEsquerda(){
        Mapa m = new Mapa();
        Urukai o = new Urukai();
        m.inserir(4,o);
        System.out.println(m.exibir());
        o.movimentar(m);
        System.out.println(m.exibir());

        String mapaEsperado = "| | | |U| | | | | | |";
        Assert.assertEquals(mapaEsperado, m.exibir());
    }

    @Test
    public void urukaiDeveAtacarrParaEsquerda(){
        Mapa m = new Mapa();
        Urukai u = new Urukai();
        Gandalf g = new Gandalf();
        m.inserir(4,u);
        m.inserir(3,g);

        u.atacar(m);
        int constituicaoEsperadaGandalfa = 64;
        Assert.assertEquals(constituicaoEsperadaGandalfa, g.getConstituicao());
    }

    @Test
    public void leoglasDeveDarDanoNoOrcTerceiraPosicao(){
        Legolas l = new Legolas();
        Orc o = new Orc();
        Goblin g = new Goblin();
        Mapa m = new Mapa();
        m.inserir(2, l);
        m.inserir(4,g);
        m.inserir(5,o);
        System.out.println(m.exibir());
        int constituicaoOrcEsperada = 0;
        int constituicaoGoblimEsperada =20;
        l.atacar(m);

        Assert.assertEquals(constituicaoOrcEsperada, o.getConstituicao());
        Assert.assertEquals(constituicaoGoblimEsperada, g.getConstituicao());

    }



    @Test
    public void legolasDeveDarDanoDeAcordoComAPosicao(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Orc o = new Orc();
        m.inserir(0, l);
       m.inserir(1,o);

       l.atacar(m);

       int constituicaoEsperadaDoOrc = 20;
       Assert.assertEquals(constituicaoEsperadaDoOrc, o.getConstituicao());

    }

    @Test
    public void legolasDeveAndarConformeAsCasaEstiveremVazias(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();

        m.inserir(0, l);
        System.out.println(m.exibir());
        l.movimentar(m);
        System.out.println(m.exibir());
       int posicaoLegolasEsperada = 2;
       Assert.assertEquals(posicaoLegolasEsperada,m.buscarPosicao(l));

    }

    @Test
    public void legolasDeveAndarSomenteUmaCasaQuandoAOutraEstiverOcupada(){
        Mapa m = new Mapa();
        Legolas l = new Legolas();
        Gandalf g = new Gandalf();
        Urukai u = new Urukai();
        m.inserir(0, l);
        m.inserir(1, g);
        m.inserir(3, u);
        System.out.println(m.exibir());
        l.movimentar(m);
        System.out.println(m.exibir());


    }

    @Test
    public void gobliimDeveAndarConformeAsCasaEstiveremVazias(){
        Mapa m = new Mapa();
        Goblin g = new Goblin();
        m.inserir(8, g);

        String esperada = "| | | | | | |M| | | |";

        g.movimentar(m);
        Assert.assertEquals(esperada, m.exibir());

    }

    @Test
    public void gobliimDeveAndarSomenteUmaCasa(){
        Mapa m = new Mapa();
        Goblin g = new Goblin();
        Orc o = new Orc();
        m.inserir(9, g);
        m.inserir(7,o);
        System.out.println(m.exibir());
        g.movimentar(m);
        System.out.println(m.exibir());
        int posicaoEsperada = 8;
        Assert.assertEquals(posicaoEsperada, m.buscarPosicao(g));
    }

    @Test
    public void GoblimDeveDarDanoNoOrcTerceiraPosicao(){
        Legolas l = new Legolas();
        Gimli o = new Gimli();
        Goblin g = new Goblin();
        Mapa m = new Mapa();
        m.inserir(3, l);
        m.inserir(5,g);
        m.inserir(2,o);
        g.atacar(m);
        System.out.println(m.exibir());

        int constituicaoGimliEsperada = 42;
        int constituicaoLegolasEsperada = 80;

        Assert.assertEquals(constituicaoGimliEsperada, o.getConstituicao());
        Assert.assertEquals(constituicaoLegolasEsperada, l.getConstituicao());
    }

    @Test
    public void goblinDeveDarDanoDeAcordoComADistancia(){
        Mapa m = new Mapa();
        Goblin n = new Goblin();
        Gandalf g = new Gandalf();
        m.inserir(5, n);
        m.inserir(3,g);

        n.atacar(m);
        int constituicaoEsperadaDoGandalf = 68;
        Assert.assertEquals(constituicaoEsperadaDoGandalf, g.getConstituicao());

    }

    @Test
    public void legolasDeveAtacarOrcNaPosicaoSeis(){
        Aragon aragorn = new Aragon();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Goblin goblim = new Goblin();
        Mapa mapa = new Mapa();

        mapa.inserir(1, aragorn);
        mapa.inserir(3, legolas);
        mapa.inserir(6, orc);
        mapa.inserir(7, goblim);

        legolas.atacar(mapa);

        int orcConstituicaoEsperada = 0;
        Assert.assertEquals(orcConstituicaoEsperada, orc.getConstituicao());

    }
    @Test
    public void sarumanDeveAndarParaEsquerdaSeLivre(){
        Saruman s = new Saruman();
        Mapa m = new Mapa();
        m.inserir(4, s);

        System.out.println(m.exibir());
        s.movimentar(m);
        System.out.println(m.exibir());

        String esperada = "| | | |S| | | | | | |";
        Assert.assertEquals(esperada, m.exibir());
    }

    @Test
    public void sarumanDeveAtacarGandalfAEsquerda(){
        Mapa m = new Mapa();
        Saruman s = new Saruman();
        Gandalf g = new Gandalf();
        m.inserir(9,g);
        m.inserir(7,s);
        s.atacar(m);

        int constituicaoGandalfEsperada =71;
        Assert.assertEquals(constituicaoGandalfEsperada, g.getConstituicao());
    }






}
