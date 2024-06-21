package Mapa;

import Exceptions.PersonagemJaEstaNoMapaException;
import Exceptions.PersonagemNaoEncontradoNoMapaException;
import Exceptions.PosicaoOcupadaException;
import Personagens.Personagens;
import Personagens.Saruman;
import Personagens.Aragon;

import java.util.Arrays;

public class Mapa {
    private Personagens[] posicoes;

    public Mapa() {
        posicoes = new Personagens[10];
    }

    public Personagens[] getPosicoes() {
        return posicoes;
    }

    public String exibir() {
        StringBuilder sb = new StringBuilder();
        sb.append("|");

        for (int i = 0; i < posicoes.length; i++) {

            if (posicoes[i] != null && posicoes[i].getConstituicao() > 0) {
                sb.append(posicoes[i].toString());
            } else {
                sb.append(" ");
                this.getPosicoes()[i] = null;
            }
            sb.append("|");

        }

        return sb.toString();
    }


    public void inserir(int posicao, Personagens personagem) {

        if (this.posicoes[posicao] != null) {
            throw new PosicaoOcupadaException();
        }

        for (Personagens p : this.posicoes) {
            if (p != null && p.toString().equals(personagem.toString())) {
                throw new PersonagemJaEstaNoMapaException();
            }
        }

        this.posicoes[posicao] = personagem;

    }

    public int buscarPosicao(Personagens personagem) {
        int index = 0;
        for (Personagens p : this.posicoes) {
            if (p != null && p.toString().equals(personagem.toString())) {
                return index;
            }
            index++;
        }
        throw new PersonagemNaoEncontradoNoMapaException();
    }



    public Personagens buscarCasa(int casa) {
      return this.posicoes[casa];
    }

    public void movimentacao(int posicaoAtual, Personagens personagem, int novaPosicao){

            getPosicoes()[novaPosicao] = personagem;
            getPosicoes()[posicaoAtual] = null;

    }
}
