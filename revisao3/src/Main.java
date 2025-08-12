public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(3, 5);
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        
        Circulo circulo = new Circulo(7);
        System.out.println("Area do circulo: " + circulo.calcularArea());
        
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Area do quadrado: " + quadrado.calcularArea());
    }
}
