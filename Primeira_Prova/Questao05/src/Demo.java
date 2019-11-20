package br.edu.ifpb;

public class Demo {
    public static void main(String[] args) {

        FuscarClassico f1= new FuscarClassico("Gabriel Lima", "Azul",0.0,2.0);
        FuscaTurbo f2 = new FuscaTurbo("Tonaho da Silva", "Dourado",0.0,1.0);


        System.out.println(f1.toString());
        System.out.println( f2.toString());

    }



}
