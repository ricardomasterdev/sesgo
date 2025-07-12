package com.ricardomasterdev.banco;

public class Banco {

    /**
     * Realiza a transferência de uma conta para outra, de forma sincronizada.
     */
    public void transferir(Conta origem, Conta destino, double valor) {
        synchronized (getLock(origem, destino)) {
            if (origem.sacar(valor)) {
                destino.depositar(valor);
                System.out.printf("✔ Transferido %.2f de Conta %d para Conta %d%n",
                        valor, origem.getId(), destino.getId());
            } else {
                System.out.printf("❌ Saldo insuficiente na Conta %d para transferir %.2f%n",
                        origem.getId(), valor);
            }
        }
    }

    /**
     * Garante bloqueio consistente, sempre na mesma ordem, para evitar deadlock.
     */
    private Object[] getLock(Conta a, Conta b) {
        return a.getId() < b.getId() ? new Object[]{a, b} : new Object[]{b, a};
    }
}
