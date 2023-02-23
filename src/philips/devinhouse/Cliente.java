package philips.devinhouse;

public class Cliente {
    private float pesoCliente;
    private float alturaCliente;
    private int idadeCliente;

    public Cliente(float peso, float altura) {
        this.pesoCliente = peso;
        this.alturaCliente = altura;
    }

    public Cliente(float peso, float altura, int idade) {
        this.pesoCliente = peso;
        this.alturaCliente = altura;
        this.idadeCliente = idade;
    }

    public float getPesoCliente() {
        return pesoCliente;
    }

    public void setPesoCliente(float pesoCliente) {
        this.pesoCliente = pesoCliente;
    }

    public float getAlturaCliente() {
        return alturaCliente;
    }

    public void setAlturaCliente(float alturaCliente) {
        this.alturaCliente = alturaCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }
}
