package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaRastreadaTest {

    @Test
    void deveRetornarPrecoEntregaRastreadaProdutoPequeno() {
        TamanhoProduto tamanhoProduto = new ProdutoPequeno();
        EntregaRastreada entregaRastreada = new EntregaRastreada(2000.0f);
        entregaRastreada.setTamanhoProduto(tamanhoProduto);
        assertEquals(2000.0f, entregaRastreada.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaRastreadaProdutoMedio() {
        TamanhoProduto tamanhoProduto = new ProdutoMedio();
        EntregaRastreada entregaRastreada = new EntregaRastreada(2000.0f);
        entregaRastreada.setTamanhoProduto(tamanhoProduto);
        assertEquals(2200.0f, entregaRastreada.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaRastreadaProdutoGrande() {
        TamanhoProduto tamanhoProduto = new ProdutoGrande();
        EntregaRastreada entregaRastreada = new EntregaRastreada(2000.0f);
        entregaRastreada.setTamanhoProduto(tamanhoProduto);
        assertEquals(2400.0f, entregaRastreada.calcularPreco(), 0.01f);
    }
}
