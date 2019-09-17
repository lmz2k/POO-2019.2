package br.edu.ifpb;

import br.edu.ifpb.persistencia.api.Conversor;

import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Insira um numero em decimal!");
        int valor = r.nextInt();
        Conversor c = new Conversor();
        System.out.println("DECIMAL - BINARIO: "+ c.decimalToBinario(valor));
        System.out.println("DECIMAL - HEXADECIMAL: "+ c.decimalToHexa(valor));


    }
}
