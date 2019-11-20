package br.edu.ifpb;

public class FuscarClassico extends Fusca{


    public FuscarClassico(){
        super();
    }

    public FuscarClassico(String Dono, String cor, double Km, double Potencia){
        super(Dono,cor,Km,Potencia);
    }



    @Override
    public String toString() {
        return super.toString() + "Versao: CLASSICA";
    }
}
