package ex01.classes;

public class Veiculo {
    protected String modelo;
    protected String marca;
    protected int ano;
    protected int numeroPortas;

    public Veiculo(String modelo, String marca, int numeroPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPortas = numeroPortas;
    }

    public String toString() {
        return String.format(
            """
            ============ VEÍCULO ============
            Modelo: %s
            Marca: %s 
            Ano: %d
            Número de Portas: %d
            """, modelo, marca, ano, numeroPortas
        );
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
