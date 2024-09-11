package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaNormalTest {

    @Test
    void deveRetornarPrecoEntregaNormalProdutoPequeno() {
        TamanhoProduto tamanhoProduto = new ProdutoPequeno();
        EntregaNormal entregaNormal = new EntregaNormal(1000.0f);
        entregaNormal.setTamanhoProduto(tamanhoProduto);
        assertEquals(1000.0f, entregaNormal.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaNormalProdutoMedio() {
        TamanhoProduto tamanhoProduto = new ProdutoMedio();
        EntregaNormal entregaNormal = new EntregaNormal(1000.0f);
        entregaNormal.setTamanhoProduto(tamanhoProduto);
        assertEquals(1000.0f, entregaNormal.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaNormalProdutoGrande() {
        TamanhoProduto tamanhoProduto = new ProdutoGrande();
        EntregaNormal entregaNormal = new EntregaNormal(1000.0f);
        entregaNormal.setTamanhoProduto(tamanhoProduto);
        assertEquals(1000.0f, entregaNormal.calcularPreco(), 0.01f);
    }
}
