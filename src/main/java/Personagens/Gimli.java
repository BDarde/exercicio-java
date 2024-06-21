package Personagens;

import Classes.Guerreiro;
import Racas.Anao;
import Mapa.Mapa;

public class Gimli extends Personagens implements Anao, Guerreiro {

    private int sobriedade = 3;
    public Gimli() {
        super(true,9, 2, 4, 60);
    }

    public int getSobriedade() {
        return sobriedade;
    }

    public void setSobriedade(int sobriedade) {
        this.sobriedade = sobriedade;
    }

    public String toString() {
        return "I";
    }

//    @Override
//    public void beber() {
//        if(getSobriedade() == 0){
//            setSobriedade(0);
//        }else{
//            setSobriedade(getSobriedade() - 1);
//        }
//    }
//
//    @Override
//    public String falar() {
//        if(getSobriedade()==0){
//            return "What did I say? He can't hold his liquor!";
//        }
//        return "Let them come. There is one Dwarf yet in Moria who still draws breath.";
//    }


    @Override
    public void movimentar(Mapa mapa) {
        boolean sozinho = true;
        int limiteMaximo = 9;
        int limiteMin = 0;
        for(int i = mapa.buscarPosicao(this); i < mapa.buscarPosicao(this) + 2 && i < mapa.getPosicoes().length; i++){

            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this){
                sozinho = false;
                break;
            }
        }

        if(sozinho){
            int posicaoAtual = mapa.buscarPosicao(this);
            int novaPosicao = Math.max(limiteMin, Math.min(limiteMaximo, (posicaoAtual + 1)));
            if (novaPosicao < mapa.getPosicoes().length) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }
    }

    @Override
    public void atacar(Mapa mapa) {
        for(int i = mapa.buscarPosicao(this); i < mapa.buscarPosicao(this) + 2 && i < mapa.getPosicoes().length; i++){
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && mapa.buscarCasa(i).getSociedadeAnel() == false){
                Personagens p = mapa.buscarCasa(i);
                mapa.buscarCasa(i).setConstituicao(p.getConstituicao() - (2 *this.força));
            }
        }
    }
}
