package Exceptions;

public class PosicaoOcupadaException extends RuntimeException{
    public PosicaoOcupadaException(){
        super("Posição já ocupada");
    }
}
