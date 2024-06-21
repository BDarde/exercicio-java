package Personagens;

import Classes.Guerreiro;
import Mapa.Mapa;
import Racas.Monstro;

public class Orc extends Personagens implements Monstro, Guerreiro {
    public Orc() {
        super(false,7, 4, 1, 30);
    }

    public String toString() {
        return "O";
    }


    @Override
    public void movimentar(Mapa mapa) {
        boolean sozinho = true;
        for(int i = mapa.buscarPosicao(this); i > mapa.buscarPosicao(this) - 2; i--){
            Personagens pe = mapa.buscarCasa(i);
       if(i >= 0){
           if(pe != null && pe != this){
               sozinho = false;
               break;
           }
       }

        }

        if(sozinho){
            int posicaoAtual = mapa.buscarPosicao(this);
            int novaPosicao = posicaoAtual - 1;
            if (novaPosicao >= 0) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }
    }

    @Override
    public void atacar(Mapa mapa) {
        for(int i = mapa.buscarPosicao(this); i > mapa.buscarPosicao(this) - 2 ; i--){
            Personagens p = mapa.buscarCasa(i);
            if(i >= 0){
                if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && p.getSociedadeAnel() == true){
                    p.setConstituicao(p.getConstituicao() -(2 *this.força));
                }
            }else{
                break;
            }

        }
    }
}
