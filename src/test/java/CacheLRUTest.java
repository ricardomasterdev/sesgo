import cache.CacheLRU;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CacheLRUTest {

    private CacheLRU<Integer, String> cache;

    /**
     * Este método é executado antes de cada teste.
     * Criamos uma nova instância da cache com capacidade 3 para isolar os testes.
     */
    @Before
    public void setup() {
        cache = new CacheLRU<>(3);
    }

    /**
     * Testa a inserção e recuperação de elementos simples na cache.
     */
    @Test
    public void testPutAndGet() {
        cache.put(1, "A");
        cache.put(2, "B");

        Assert.assertEquals("A", cache.get(1));  // Espera-se que retorne "A"
        Assert.assertEquals("B", cache.get(2));  // Espera-se que retorne "B"
        Assert.assertNull(cache.get(3));         // Não foi inserido, deve retornar null
    }

    /**
     * Verifica se o tamanho da cache está correto após inserções.
     */
    @Test
    public void testSize() {
        Assert.assertEquals(0, cache.size());

        cache.put(1, "A");
        cache.put(2, "B");

        Assert.assertEquals(2, cache.size());
    }

    /**
     * Testa a remoção de uma chave.
     */
    @Test
    public void testRemove() {
        cache.put(1, "A");
        cache.remove(1);

        Assert.assertNull(cache.get(1));       // Elemento removido, deve retornar null
        Assert.assertEquals(0, cache.size());  // Nenhum elemento na cache
    }

    /**
     * Testa a política de remoção LRU:
     * - Quando a capacidade é excedida, o elemento menos usado deve ser removido.
     */
    @Test
    public void testLRUEviction() {
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        // Acessa o 1, agora ele é o mais recentemente usado
        cache.get(1);

        // Inserção do quarto elemento deve remover o menos usado: 2
        cache.put(4, "D");

        Assert.assertNull(cache.get(2));     // 2 deve ter sido removido
        Assert.assertNotNull(cache.get(1));  // 1 deve ainda existir
        Assert.assertNotNull(cache.get(3));  // 3 deve ainda existir
        Assert.assertNotNull(cache.get(4));  // 4 foi inserido agora
    }
}
