package Simulador;
import Classes.Arqueiro;
import Classes.Guerreiro;
import Classes.Mago;
import Exceptions.SauronDominaOMundoException;
import Mapa.Mapa;
import Personagens.Personagens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Simular {


    private Mapa mapa;
    private  List<Personagens> listaPersonagens;
    private boolean ultimaCasaEhSociedadeAnel;

    public Simular(Mapa mapa) {
        this.listaPersonagens = new ArrayList<>();
        this.mapa = mapa;
        this.ultimaCasaEhSociedadeAnel = false;

    }

    public Mapa getMapa() {
        return mapa;
    }

    public void verifcarMorreu(){
        for(int j = 0; j < listaPersonagens.size(); j++){
            Personagens verifcado = listaPersonagens.get(j);
            if(verifcado.getConstituicao() == 0){
                listaPersonagens.remove(verifcado);
                int index = mapa.buscarPosicao(verifcado);
                mapa.getPosicoes()[index] = null;
            }
        }
    }
    public void simulacao() {
        Boolean temSociedadoAnel = false;
        //Inicializando a lista de acordo com os personagens no array do mapa
        for(Personagens i : mapa.getPosicoes()){
            if(i != null && !(listaPersonagens.contains(i))){ //se nao for num e nao contet na lista ele adiciona
                listaPersonagens.add(i);
            }
        }


            do{

                temSociedadoAnel = false;
                //Percorrendo a lista para jogar na ordem da lista
                for(int i = 0; i < listaPersonagens.size(); i++){
                    Personagens personagemRodada = listaPersonagens.get(i);
                    if(personagemRodada instanceof Mago){

                        ((Mago) personagemRodada).atacar(this.mapa);
                        verifcarMorreu();
//                        for(int j = 0; j < listaPersonagens.size(); j++){
//                            Personagens verifcado = listaPersonagens.get(j);
//                            if(verifcado.getConstituicao() == 0){
//                                listaPersonagens.remove(verifcado);
//                                int index = mapa.buscarPosicao(verifcado);
//                                mapa.getPosicoes()[index] = null;
//                            }if(verifcado.getSociedadeAnel()){
//                                temSociedadoAnel = true;
//                            }
//                        }
                        ((Mago) personagemRodada).movimentar(this.mapa);

                    }else if(personagemRodada instanceof Guerreiro){

                        ((Guerreiro) personagemRodada).atacar(this.mapa);
                        verifcarMorreu();
//                        for(int j = 0; j < listaPersonagens.size(); j++){
//                            Personagens verifcado = listaPersonagens.get(j);
//                            if(verifcado.getConstituicao() == 0){
//                                listaPersonagens.remove(verifcado);
//                                int index = mapa.buscarPosicao(verifcado);
//                                mapa.getPosicoes()[index] = null;
//                            }if(verifcado.getSociedadeAnel()){
//                                temSociedadoAnel = true;
//                            }
//                        }
                        ((Guerreiro) personagemRodada).movimentar(this.mapa);

                    }else if(personagemRodada instanceof Arqueiro){

                        ((Arqueiro) personagemRodada).atacar(this.mapa);
                        verifcarMorreu();
//                        for(int j = 0; j < listaPersonagens.size(); j++){
//                            Personagens verifcado = listaPersonagens.get(j);
//                            if(verifcado.getConstituicao() == 0){
//                                listaPersonagens.remove(verifcado);
//                                int index = mapa.buscarPosicao(verifcado);
//                                mapa.getPosicoes()[index] = null;
//                            }if(verifcado.getSociedadeAnel()){
//                                temSociedadoAnel = true;
//                            }
//                        }
                        ((Arqueiro) personagemRodada).movimentar(this.mapa);

                    }

                    for(Personagens p : listaPersonagens){
                        if(p.getSociedadeAnel()){
                            temSociedadoAnel = true;
                        }
                    }
                    if (!temSociedadoAnel) {
                        throw new SauronDominaOMundoException();
                    }
                    //verificando se a ultima casa tem soceidade do anel
                    Personagens personagemUltimaCasa = getMapa().buscarCasa(9);
                    if(personagemUltimaCasa != null && personagemUltimaCasa.sociedadeAnel){
                        ultimaCasaEhSociedadeAnel = true;
                        System.out.println(mapa.exibir());
                        break; //encerrando se tiver
                    }
                    // Removendo personagens mortos usando e verificando se ha sociedade anel comIterator para evitar ConcurrentModificationException
//                    Iterator<Personagens> it = listaPersonagens.iterator();
//                    while (it.hasNext()) {
//                        Personagens personagem = it.next();
//                        if (personagem.getConstituicao() == 0) {
//                            it.remove(); // Remove o personagem da lista
//                            int i = mapa.buscarPosicao(personagem);
//                            mapa.getPosicoes()[i] = null;
//                        }
//                    }


                }//fim do for dos turnos
           //------------------------------------------------------------------------------------------//
                System.out.println(mapa.exibir());
            }while (!(listaPersonagens.isEmpty()) && !(ultimaCasaEhSociedadeAnel));
    }
}



       /* for (int i = 0; i < this.mapa.getPosicoes().length; i++) {
            System.out.println(i + ", LOOP for");
            System.out.println("Casa é nula: " + (boolean) (this.mapa.buscarCasa(i) == null));
            System.out.println("Pesonagem da casa: " + mapa.buscarCasa(i));
            System.out.println("Casa é guerreiro: " + (boolean) (this.mapa.buscarCasa(i) instanceof Guerreiro));
            if (this.mapa.buscarCasa(i) != null && this.mapa.buscarCasa(i) instanceof Mago) {
                System.out.println(i + "entrou no if");
                ((Mago) this.mapa.buscarCasa(i)).atacar(this.mapa);
                ((Mago) this.mapa.buscarCasa(i)).movimentar(this.mapa);

            } else if (this.mapa.buscarCasa(i) != null && this.mapa.buscarCasa(i) instanceof Guerreiro) {

                System.out.println(i + "entrou no else if");
                ((Guerreiro) this.mapa.buscarCasa(i)).atacar(this.mapa);
                ((Guerreiro) this.mapa.buscarCasa(i)).movimentar(this.mapa);

            }
        }
     */




