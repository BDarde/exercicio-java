package Personagens;

import Classes.Guerreiro;
import Mapa.Mapa;
import Racas.Humano;

public class Boromir extends Personagens implements Humano, Guerreiro {
    public Boromir() {
        super(true,7, 6, 3, 40);
    }

    @Override
    public void atacar(Mapa mapa) {
        for(int i = mapa.buscarPosicao(this); i < mapa.buscarPosicao(this) + 2 && i < mapa.getPosicoes().length; i++){
            Personagens pe = mapa.buscarCasa(i);
            if(pe != null && pe != this && pe.getSociedadeAnel() == false){
                pe.setConstituicao(pe.getConstituicao() -(2 *this.força));
            }
        }
    }

    @Override
    public void movimentar(Mapa mapa) {
        boolean sozinho = true;
        for(int i = mapa.buscarPosicao(this); i < mapa.buscarPosicao(this) + 2 && i < mapa.getPosicoes().length; i++){
            Personagens pe = mapa.buscarCasa(i);
            if(pe != null && pe != this){
                sozinho = false;
                break;
            }
        }

        if(sozinho){
            int posicaoAtual = mapa.buscarPosicao(this);
            int novaPosicao = posicaoAtual + 1;
            if (novaPosicao < mapa.getPosicoes().length) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }
    }

    public String toString() {
        return "B";
    }





}
