package Exceptions;

public class PersonagemNaoEncontradoNoMapaException extends RuntimeException{

    public PersonagemNaoEncontradoNoMapaException(){
        super("O Personagem não foi encontrado no mapa");
    }
}
