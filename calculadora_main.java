public class calculadora_main {

    private double numeroUm;
    private double numeroDois;

    public void setNumeroUm(double novovalorNumeroUm) {
        numeroUm = novovalorNumeroUm;
    }
    public void setNumeroDois(double novovalorNumeroDois) {
            numeroDois = novovalorNumeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public double dividir() {
        return numeroUm / numeroDois;
    }

    public double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double raiz() {
        return Math.sqrt(numeroDois);
    }
}