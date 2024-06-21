package Personagens;

import Classes.Guerreiro;
import Mapa.Mapa;
import Racas.Humano;
import Racas.Monstro;

public class Urukai extends Personagens implements Monstro, Humano, Guerreiro {
    public Urukai() {
        super(false,8, 6, 3, 45);
    }

    @Override
    public String toString() {
        return "U";
    }

//    @Override
//    public void envelhecer() {
//        setConstituicao(getConstituicao() - 2);
//    }

//    @Override
//    public String falar() {
//        return "Looks like meat´s back on the menu boys!";
//    }
//
//    @Override
//    public String Grunir() {
//        return "Uuurrrrrr";
//    }

    @Override
    public void movimentar(Mapa mapa) {
        boolean sozinho = true;
        for(int i = mapa.buscarPosicao(this); i >= mapa.buscarPosicao(this) - 2 ; i--){
            Personagens p = mapa.buscarCasa(i);
            if(p != null && p != this){
                sozinho = false;
                break;
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
       for(int i = mapa.buscarPosicao(this); i >= mapa.buscarPosicao(this) - 2 ; i--){

           Personagens p = mapa.buscarCasa(i);
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && mapa.buscarCasa(i).getSociedadeAnel() == true){
                p.setConstituicao(p.getConstituicao() -(2 *this.força));
            }
       }
    }



}
