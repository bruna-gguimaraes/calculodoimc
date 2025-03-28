import java.util.Scanner;

class CalculoDoIMC {
    public static String classificarIMC(double imc) {
        if (imc < 16.0) {
            return "Magreza grave";
        }
        else if (imc >= 16.0 && imc < 17.0) {
            return "Magreza moderada";
        }
        else if (imc >= 17.0 && imc < 18.5) {
            return "Magreza leve";
        }
        else if (imc >= 18.5 && imc < 25.0) {
            return "Saudável";
        }
        else if (imc >= 25.0 && imc < 30.0) {
            return "Sobrepeso";
        }
        else if (imc >= 30.0 && imc < 35.0) {
            return "Obesidade Grau I";
        }
        else if (imc >= 35.0 && imc < 40.0) {
            return "Obesidade Grau II";
        }
        else {
            return "Obesidade Grau III";
        }
    }

    public static double calcularPeso(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void programaIMC() {
        double peso, altura, imc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("      Cálculo do IMC");
        System.out.println("===========================");

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Insira o seu peso em quilogramas: ");
                peso = Double.parseDouble(scanner.nextLine());

                System.out.print("Insira o sua altura em metros: ");
                altura = Double.parseDouble(scanner.nextLine());

                imc = calcularPeso(peso, altura);

                System.out.printf("\nSeu índice de massa corporal é: %.2f kg/m²\n", imc);
                System.out.printf("Classificação: %s.\n", classificarIMC(imc));
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Por favor, insira um número válido.");
            }
        }
    }

    public static void main(String[] args) {
        programaIMC();
    }
}
