package Personagens;

public abstract class Personagens {

    public Boolean sociedadeAnel;
    public int força;
    public int agilidade;
    public int inteligencia;
    public int constituicao;

    public Personagens(Boolean sociedadeAnel, int força, int agilidade, int inteligencia, int constituicao) {
        this.força = força;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.sociedadeAnel = sociedadeAnel;
    }

    public Boolean getSociedadeAnel() {
        return sociedadeAnel;
    }

    public int getForça() {
        return força;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getConstituicao() {

        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        if(constituicao > 0){
            this.constituicao = constituicao;
        }else{
            this.constituicao = 0;
        }

    }

    @Override
    public abstract String toString();

}
