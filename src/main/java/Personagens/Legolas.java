package Personagens;

import Classes.Arqueiro;
import Mapa.Mapa;
import Racas.Elfo;

public class Legolas extends Personagens implements Elfo, Arqueiro {
    public Legolas() {
        super(true,5, 10, 6, 80);
    }

    public String toString() {
        return "L";
    }

//    @Override
//    public String falar() {
//        return "They're taking the Hobbits to Isengard!";
//    }
//
//    @Override
//    public String falarElfico() {
//        return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
//    }


    @Override
    public void atacar(Mapa mapa) {
        boolean atacou = false;
        for(int i = mapa.buscarPosicao(this) + 3; i > mapa.buscarPosicao(this); i--){
            if(i > mapa.getPosicoes().length - 1){
                break;
            }
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this && !(mapa.buscarCasa(i).getSociedadeAnel())){
               int distancia = i - mapa.buscarPosicao(this);
               Personagens p = mapa.buscarCasa(i);
                p.setConstituicao(p.getConstituicao() -( distancia * this.agilidade));
                atacou = true;
                if(atacou){
                    break;
                }
            }
        }
    }

    @Override
    public void movimentar(Mapa mapa) {
        int sozinho = 0;
        for(int i = mapa.buscarPosicao(this) + 1; i < mapa.buscarPosicao(this) + 3; i++){
            if(i < mapa.getPosicoes().length){
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
                novaPosicao = posicaoAtual + sozinho;
                if (novaPosicao < mapa.getPosicoes().length) {
                    mapa.movimentacao(posicaoAtual, this, novaPosicao);
                }
            }




    }
}
