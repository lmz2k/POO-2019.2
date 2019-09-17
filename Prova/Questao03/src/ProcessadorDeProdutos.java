package br.edu.ifpb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeProdutos {

    private ArrayList<Produto> listaProdutos = new ArrayList();


    ProcessadorDeProdutos(ArrayList<Produto> p) {
        setListaProdutos(p);
    }


    public void motrarGraficoDistribuicao() {

        int a[] = new int[11];
        double maiorP = 0;
        double menorP = 1000;
        int cont = 0;
        double somaPreco = 0;


        for (Produto p : listaProdutos) {

            if (p.getPreco() <= 9){
                a[0] = a[0] + 1;
            }else if (p.getPreco() <= 19){
                a[1] = a[1] + 1;

            }else if (p.getPreco() <= 29){
                a[2] = a[2] + 1;

            }
            else if (p.getPreco() <= 39){
                a[3] = a[3] + 1;

            }
            else if (p.getPreco() <= 49){
                a[4] = a[4] + 1;

            }
            else if (p.getPreco() <= 59){
                a[5] = a[5] + 1;

            }
            else if (p.getPreco() <= 69){
                a[6] = a[6] + 1;

            }
            else if (p.getPreco() <= 79){
                a[7] = a[7] + 1;

            }
            else if (p.getPreco() <= 89){
                a[8] = a[8] + 1;

            }
            else if (p.getPreco() <= 99) {
                a[9] = a[9] + 1;
            }
            else{

                a[10] = a[10] + 1;
            }

            somaPreco += p.getPreco();
            cont +=1;
            if (p.getPreco() > maiorP){
                maiorP = p.getPreco();
            }
            if (p.getPreco() < menorP){
                menorP = p.getPreco();
            }
        }


        System.out.println("Grafico de distribuição do produto: ");
        System.out.println(".....................................");
        System.out.print("00-09: ");
        for (int i = 0; i < a[0]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("10-19: ");
        for (int i = 0; i < a[1]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("20-29: ");
        for (int i = 0; i < a[2]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("30-39: ");
        for (int i = 0; i < a[3]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("40-49: ");
        for (int i = 0; i < a[4]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("50-59: ");
        for (int i = 0; i < a[5]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("60-69: ");
        for (int i = 0; i < a[6]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("70-79: ");
        for (int i = 0; i < a[7]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("80-89: ");
        for (int i = 0; i < a[8]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("90-99: ");
        for (int i = 0; i < a[9]; i++){
            System.out.print("+ ");
        }
        System.out.println("");
        System.out.print("100: ");
        for (int i = 0; i < a[10]; i++){
            System.out.print("+ ");
        }
        System.out.println("");


        System.out.println("Menor Preco: "+menorP);
        System.out.println("Maior Preco: "+maiorP);

        System.out.println("Media dos Preco: "+ (somaPreco/cont));




    }


    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
