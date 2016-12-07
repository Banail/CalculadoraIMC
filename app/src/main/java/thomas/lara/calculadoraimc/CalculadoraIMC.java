package thomas.lara.calculadoraimc;


public class CalculadoraIMC {
    private double altura;
    private double peso;

    public CalculadoraIMC() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularIMC(){
        return peso/(altura * altura);
    }
    @Override
    public String toString() {
        return
                "IMC: " +calcularIMC();

    }
}//fecha classe
