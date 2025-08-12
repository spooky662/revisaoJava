public class Circulo implements Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * 3.14;
    }
    
}
