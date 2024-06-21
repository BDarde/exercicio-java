package Personagens;

import Classes.Arqueiro;
import Racas.Monstro;
import Mapa.Mapa;

public class Goblin extends Personagens implements Monstro, Arqueiro {
    public Goblin() {
        super(false,3, 6, 1, 20);
    }

    public String toString() {
        return "M";
    }

//    @Override
//    public String Grunir() {
//        return "Liisshhhh";
//    }



    @Override
    public void atacar(Mapa mapa) {
        int posicaoAtual = mapa.buscarPosicao(this);
        boolean atacou = false;
        for(int i = posicaoAtual - 3; i < posicaoAtual; i++){
            if( i >= 0){
                if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && mapa.buscarCasa(i).getSociedadeAnel() == true){
                    int distancia = mapa.buscarPosicao(this) - i;
                    Personagens p = mapa.buscarCasa(i);
                    p.setConstituicao(p.getConstituicao() -( distancia * this.agilidade));
                    atacou = true;
                    if(atacou){
                        break;
                    }

                }
            }

        }

    }

    @Override
    public void movimentar(Mapa mapa) {
        int sozinho = 0;
        for(int i = mapa.buscarPosicao(this) - 1; i > mapa.buscarPosicao(this) - 3; i--){
           if(i >= 0){
               if(mapa.buscarCasa(i) != null){
                   break;
               }else{
                   sozinho += 1;
               }
           }

        }

        int posicaoAtual = mapa.buscarPosicao(this);
        int novaPosicao;
        if(sozinho != 0){
            novaPosicao = posicaoAtual - sozinho;
            if (novaPosicao > 0) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }




    }
}
