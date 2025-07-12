package com.ricardomasterdev.banco;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Classe que simula transferências simultâneas entre duas contas bancárias,
 * utilizando múltiplas threads e controle de concorrência.
 */
public class SimulacaoTransferencias {

    public static void executar() {
        // Cria duas contas com saldos iniciais iguais
        Conta conta1 = new Conta(1, 1000.0);
        Conta conta2 = new Conta(2, 1000.0);

        Banco banco = new Banco();

        // Executor com 10 threads paralelas
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Dispara 100 transferências concorrentes entre as contas (ida e volta)
        for (int i = 0; i < 100; i++) {
            executor.execute(() -> banco.transferir(conta1, conta2, 10));
            executor.execute(() -> banco.transferir(conta2, conta1, 10));
        }

        // Encerra o envio de novas tarefas
        executor.shutdown();

        try {
            // Aguarda no máximo 5 segundos para que todas as tarefas terminem
            if (!executor.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                System.err.println("⚠ Algumas tarefas não terminaram a tempo.");
            }
        } catch (InterruptedException e) {
            System.err.println("❌ Execução interrompida: " + e.getMessage());
            Thread.currentThread().interrupt(); // boa prática em interrupções
        }

        // Impressão final dos saldos para verificar consistência
        System.out.printf("✅ Saldo final Conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("✅ Saldo final Conta 2: %.2f%n", conta2.getSaldo());
    }
}
