package ex01.classes;

public class Veiculo {
    // Atributos:
    private String modelo;
    private String marca;
    private int ano;
    private int numeroPortas;
    private double velocidade = 0;  // em Km/h

    // Construtor:


    public Veiculo(String modelo, String marca, int ano, int numeroPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numeroPortas = numeroPortas;
    }

    // To String:
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

    // Métodos públicos:
    public void acelerar(double velocidade) {
        this.velocidade += Math.abs(velocidade);  // garantindo que o parâmetro não será negativo;
    }

    public void frear(double velocidade) {
        velocidade = Math.abs(velocidade);  // garantindo que o parâmetro será positivo.
        if (velocidade >= this.velocidade) {
            this.velocidade = 0;
        } else {
            this.velocidade -= velocidade;
        }
    }

    // Getters & Setters:
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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
