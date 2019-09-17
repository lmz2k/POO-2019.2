package br.edu.ifpb;

public class Produto {


    private int codigo;
    private String descricao;
    private double preco;


    public Produto(int c, String d, double p){
        setCodigo(c);
        setDescricao(d);
        setPreco(p);
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
