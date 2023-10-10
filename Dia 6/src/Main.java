public class Main {
    public static void main(String[] args) throws Exception {
        Carro c = new Carro("BMW", "X6", 2024, 125000);
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Ano: " + c.getAno());
        System.out.println("Valor de venda: " + c.calcularValor());
    }
}
