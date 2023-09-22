package ex01.classes;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, int numeroPortas) {
        super(modelo, marca, numeroPortas);
    }

    @Override
    public String toString() {
        return String.format(
            """
            ============ CARRO ============
            Modelo: %s
            Marca: %s 
            Ano: %d
            Número de Portas: %d
            """, modelo, marca, ano, numeroPortas
        );
    }
}
