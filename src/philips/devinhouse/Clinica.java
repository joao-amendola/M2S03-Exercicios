package philips.devinhouse;

public class Clinica {
    String nomeClinica;
    String cnpjClinica;
    String logradouroClinica;
    Integer codigoClinica;

    public float CalcularIMC(float peso, float altura){

        float imc = peso / (altura*altura);

        System.out.println();
        System.out.println("#####################");
        System.out.println("      RESULTADO");
        System.out.println("#####################");
        System.out.println();
        System.out.printf("IMC de %.2f => ", imc);

        if (imc <= 18.5) {
            System.out.println("MAGREZA");
            return imc;
        } else if (imc < 25) {
            System.out.println("NORMAL");
            return imc;
        } else if (imc < 30) {
            System.out.println("SOBREPESO");
            return imc;
        } else if (imc < 40) {
            System.out.println("OBESIDADE");
            return imc;
        } else {
            System.out.println("OBESIDADE GRAVE");
            return imc;
        }
    }
}
