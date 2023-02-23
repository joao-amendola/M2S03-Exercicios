import philips.devinhouse.Clinica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (quilogramas):");
        float peso = scanner.nextFloat();
        System.out.println("Digite a altura (metros):");
        float altura = scanner.nextFloat();

        Clinica clinica = new Clinica("João");
        clinica.CalcularIMC(peso, altura);

    }
}