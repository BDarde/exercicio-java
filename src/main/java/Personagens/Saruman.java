package Personagens;

import Classes.Mago;
import Mapa.Mapa;
import Racas.Maia;

import java.util.ArrayList;

public class Saruman extends Personagens implements Maia, Mago {
    public Saruman() {
        super(false,2, 2, 9, 70);
    }

    public String toString() {
        return "S";
    }

//    @Override
//    public Personagens recussitar() {
//        return null;
//    }
//
//    @Override
//    public String falar() {
//        return null;
//    }


    @Override
    public void movimentar(Mapa mapa) {
            boolean sozinho = true;

        for (int i = mapa.getPosicoes().length - 1; i >= 0; i--) {
            if (mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this) {
                if(mapa.buscarCasa(i).sociedadeAnel){
                    sozinho = false;
                    break;
                }
            }
        }
            if (sozinho) {
                int posicaoAtual = mapa.buscarPosicao(this);
                int novaPosicao = posicaoAtual - 1;
                if (novaPosicao < mapa.getPosicoes().length) {
                    mapa.movimentacao(posicaoAtual, this, novaPosicao);
                }
            }


    }

    @Override
    public void atacar(Mapa mapa) {
        for(int i = 0; i < mapa.getPosicoes().length; i++){
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && mapa.buscarCasa(i).getSociedadeAnel() == true){
                Personagens p = mapa.buscarCasa(i);
                p.setConstituicao(p.getConstituicao() - this.inteligencia);
            }
        }
    }
}
