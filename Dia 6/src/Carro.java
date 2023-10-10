public class Carro {
    private String marca, modelo;
    private int ano;
    private double valor;

    public Carro(String marca, String modelo, int ano, double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        
    }
    public double calcularValor(){
        double valorFinal = valor + (valor * 0.1);
        return valorFinal;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValor() {
        return valor;
    }
    
    

}
