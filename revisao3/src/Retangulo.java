public class Retangulo implements Forma{
    double largura;
    double altura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

}
