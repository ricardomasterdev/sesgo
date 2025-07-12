package com.ricardomasterdev.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Classe genérica que implementa uma cache com política de remoção do tipo LRU (Least Recently Used).
 *
 * A implementação usa LinkedHashMap com ordenação por acesso, o que permite
 * detectar automaticamente o item menos recentemente acessado.
 */
public class CacheLRU<K, V> {

    // Capacidade máxima da cache (definida no momento da criação)
    private final int capacidade;

    // Estrutura interna da cache usando LinkedHashMap com acesso ordenado
    private final Map<K, V> cache;

    /**
     * Construtor da cache LRU.
     *
     * @param capacidade número máximo de elementos que a cache pode armazenar
     */
    public CacheLRU(int capacidade) {
        this.capacidade = capacidade;

        // LinkedHashMap com:
        // - capacidade inicial
        // - fator de carga (load factor)
        // - ordenação por acesso (true)
        this.cache = new LinkedHashMap<K, V>(capacidade, 0.75f, true) {
            // Este método é chamado automaticamente após cada inserção.
            // Remove o elemento mais antigo se exceder a capacidade
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > CacheLRU.this.capacidade;
            }
        };
    }

    /**
     * Adiciona ou atualiza um elemento na cache.
     *
     * @param key   chave do elemento
     * @param value valor do elemento
     */
    public void put(K key, V value) {
        cache.put(key, value);
    }

    /**
     * Recupera o valor associado à chave, se existir.
     *
     * @param key chave de busca
     * @return valor associado ou null se não existir
     */
    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    /**
     * Remove um elemento da cache pela chave.
     *
     * @param key chave a ser removida
     */
    public void remove(K key) {
        cache.remove(key);
    }

    /**
     * Retorna o número atual de elementos armazenados.
     *
     * @return quantidade de elementos na cache
     */
    public int size() {
        return cache.size();
    }

    /**
     * Método auxiliar para imprimir o conteúdo da cache no console.
     */
    public void printCache() {
        System.out.println("Cache atual: " + cache);
    }
}
