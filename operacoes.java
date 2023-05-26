import java.util.Scanner;

class operacoes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculadora_main calculadora = new calculadora_main();
        String operacao;
        
        System.out.println("\n======== Calculadora ========");
        System.out.println("\nInforme qual operção será realizada. Selecione uma das opções: s = somar, u = subtrair, m = multiplicar, d = dividir, p = potência e r = raíz. ");
        operacao = scanner.next().toLowerCase();

        System.out.println("\nInforme o primeiro número: ");
            calculadora.setNumeroUm(scanner.nextDouble());
    
            System.out.println("\nInforme o segundo número: ");
            calculadora.setNumeroDois(scanner.nextDouble());

        switch(operacao) {
            case "s":
            double resultadoSoma = calculadora.somar();
            System.out.println("\nResultado da Adição: " + resultadoSoma);
            break;
    
            case "u":
            double resultadoSubtracao = calculadora.subtrair();
            System.out.println("\nResultado da substração: " + resultadoSubtracao);
            break;

            case "m":
            double resultadoMultiplicacao = calculadora.multiplicar();
            System.out.println("\nResultado da multiplicação: " + resultadoMultiplicacao);
            break;

            case "d":
            double resultadoDivisao = calculadora.dividir();
            System.out.println("\nResultado da divisão: " + resultadoDivisao);
            break;

            case "p":
            double resultadoPotencia = calculadora.potencia();
            System.out.println("\nResultado da potência: " + resultadoPotencia);
            break;

            case "r":
            double resultadoRaiz = calculadora.raiz();
            System.out.println("\nResultado da radiciação: " + resultadoRaiz);
            break;
            
            default:
            System.out.println("Valor invalido! " );




        }
        scanner.close();


        
        }
    }