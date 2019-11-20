package br.edu.ifpb.persistencia.api;

public class Conversor {

    public String decimalToBinario(int valor){
        return  Integer.toBinaryString(valor);
    }

    public String decimalToHexa(int valor){
        return  Integer.toHexString(valor);
    }


}
