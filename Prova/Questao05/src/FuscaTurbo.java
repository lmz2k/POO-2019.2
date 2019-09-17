package br.edu.ifpb;

public class FuscaTurbo extends Fusca{




    public FuscaTurbo(){
        super();
    }

    public FuscaTurbo(String Dono, String cor, double Km, double Potencia){
        super(Dono,cor,Km,Potencia);
        this.setPotenciaMotor();
    }




    @Override
    public void setPotenciaMotor() {
        this.potenciaMotor = 3.0;
    }


    @Override
    public String toString() {
        return super.toString() + "Versao: T U R B O";
    }
}
