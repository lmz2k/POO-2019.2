package br.edu.ifpb;

  public class Fusca {


    private String Dono;
    static private String cor;
    double KmRodados;
    double potenciaMotor;


    public Fusca() {
        this("Indefinido", "Branca", 0.0, 2.0);
    }



    public Fusca(String Dono, String cor, double Km, double Potencia) {

        setDono(Dono);
        setCor(cor);
        setKmRodados(Km);
        setPotenciaMotor(Potencia);

    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKmRodados() {
        return KmRodados;
    }

    public void setKmRodados(double kmRodados) {
        KmRodados = kmRodados;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }


    //EXEMPLOS POLIMOFIRMOS (Sobrecargar, Sobre posicao,to String())
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    public void setPotenciaMotor() {
        this.potenciaMotor = 2.0;
    }

    @Override
    public String toString() {
        return
                "Dono='" + Dono + '\'' +
                ", cor='" + cor + '\'' +
                ", KmRodados=" + KmRodados +
                ", potenciaMotor=" + potenciaMotor
                ;
    }
}
