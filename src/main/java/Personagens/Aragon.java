package Personagens;

import Classes.Guerreiro;
import Mapa.Mapa;
import Racas.Humano;

public class Aragon extends Personagens implements Humano, Guerreiro {


    public Aragon() {
        super(true, 10, 7, 6, 60);
    }


    @Override
    public String toString() {
        return "A";
    }



    @Override
    public void atacar(Mapa mapa) {

        for (int i = mapa.buscarPosicao(this); i < mapa.buscarPosicao(this) + 2 && i < mapa.getPosicoes().length; i++) {
            Personagens p = mapa.buscarCasa(i);
            if (p != null && p != this && p.sociedadeAnel == false) {
                p.setConstituicao(p.getConstituicao() - (2 * this.força));
            }
        }

    }

    ;

    @Override
    public void movimentar(Mapa mapa) {
        boolean sozinho = true; // Supondo que esta variável seja declarada aqui ou em escopo maior.
        int posicaoInicial = mapa.buscarPosicao(this);
        int posicaoFinal = Math.min(posicaoInicial + 2, mapa.getPosicoes().length);

        // Verifica se há alguma casa ocupada nas duas próximas posições
        for (int i = posicaoInicial; i < posicaoFinal; i++) {
            if (mapa.buscarCasa(i) != null && mapa.buscarCasa(i) != this) {
                sozinho = false;
                break;
            }
        }

        // Se estiver sozinho, tenta mover para a próxima posição
        if (sozinho) {
            int posicaoAtual = mapa.buscarPosicao(this);
            int novaPosicao = posicaoAtual + 1;
            if (novaPosicao < mapa.getPosicoes().length) {
                mapa.movimentacao(posicaoAtual, this, novaPosicao);
            }
        }
    }

}


