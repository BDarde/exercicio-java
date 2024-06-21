package Exceptions;

public class PersonagemJaEstaNoMapaException extends RuntimeException{

    public PersonagemJaEstaNoMapaException(){
        super("O personagem já está no mapa");
    }
}
