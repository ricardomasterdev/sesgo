package com.ricardomasterdev.arquivos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que remove todas as linhas em branco de um arquivo de texto.
 * Lê o conteúdo do arquivo input.txt e gera output.txt sem as linhas vazias.
 */
public class RemoverLinhasEmBranco {

    private static final String INPUT_FILE = "input.txt";
    private static final String OUTPUT_FILE = "output.txt";

    public static void executar() {
        try {
            // Lê todas as linhas do arquivo de entrada
            List<String> linhas = Files.readAllLines(Paths.get(INPUT_FILE));

            // Filtra apenas as linhas não vazias (sem espaços)
            List<String> linhasFiltradas = linhas.stream()
                    .filter(linha -> !linha.trim().isEmpty())
                    .collect(Collectors.toList());

            // Grava o resultado no arquivo de saída
            Files.write(Paths.get(OUTPUT_FILE), linhasFiltradas);

            System.out.println("✅ Linhas em branco removidas com sucesso.");
            System.out.println("📄 Arquivo gerado: " + OUTPUT_FILE);
        } catch (IOException e) {
            System.err.println("❌ Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
