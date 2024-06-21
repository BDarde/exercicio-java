package Personagens;
import Classes.Mago;
import Racas.Maia;
import Mapa.Mapa;

import java.util.ArrayList;

public class Gandalf extends Personagens implements Maia, Mago {


    public Gandalf() {
        super(true, 2, 3, 10, 80);

    }

    public String toString() {
        return "G";
    }

//    @Override
//    public Personagens recussitar() {
//        if (getConstituicao() == 0) {
//            return new Gandalf();
//        } else {
//            return null;
//        }
//    }
//
//    @Override
//    public String falar() {
//        return "A Wizard is never late, nor is he early. He arrives precisely when he means to";
//    }


    public void movimentar(Mapa mapa){
        boolean sozinho = true;

        for (int i = 0; i < mapa.getPosicoes().length; i++) {
            if (mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this ) {
               if(!(mapa.buscarCasa(i).sociedadeAnel)){
                   sozinho = false;
                   break;
               }
            }
        }
        if (sozinho) {
            int posicaoAtual = mapa.buscarPosicao(this);
            int novaPosicao = posicaoAtual + 1;
            if (novaPosicao < mapa.getPosicoes().length) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }

    };


    @Override
    public void atacar(Mapa mapa) {
        for(int i = 0; i < mapa.getPosicoes().length; i++){
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && mapa.buscarCasa(i).getSociedadeAnel() == false){
                   Personagens personagemAtacado = mapa.buscarCasa(i);
                    mapa.buscarCasa(i).setConstituicao( personagemAtacado.getConstituicao() - this.inteligencia);
            }
        }
    }


}
