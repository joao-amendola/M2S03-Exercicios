package philips.devinhouse;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeClinica;
    private String cnpjClinica;
    private String logradouroClinica;
    private Integer codigoClinica;
    private List<Cliente> listaClientes = new ArrayList<>();

    public static float CalcularIMC(float peso, float altura){

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

    public String getCnpjClinica() {
        return cnpjClinica;
    }

    public void setCnpjClinica(String cnpjClinica) {
        this.cnpjClinica = cnpjClinica;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getLogradouroClinica() {
        return logradouroClinica;
    }

    public void setLogradouroClinica(String logradouroClinica) {
        this.logradouroClinica = logradouroClinica;
    }

    public Integer getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(Integer codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //metodo para adicionar clientes a lista de clientes
    public void addCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }
}
