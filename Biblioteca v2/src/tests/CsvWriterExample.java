package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvWriterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados no formato CSV (ex: nome,sobrenome,idade): ");
        String dadosCsv = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/tests/dados.csv", true))) {
            writer.write(dadosCsv);
            System.out.println("Dados foram escritos no arquivo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
