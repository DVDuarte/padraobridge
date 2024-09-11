package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EntregaExpressaTest {

    @Test
    void deveRetornarPrecoEntregaExpressaProdutoPequeno() {
        TamanhoProduto tamanhoProduto = new ProdutoPequeno();
        EntregaExpressa entregaExpressa = new EntregaExpressa(2000.0f);
        entregaExpressa.setTamanhoProduto(tamanhoProduto);
        assertEquals(3000.0f, entregaExpressa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaExpressaProdutoMedio() {
        TamanhoProduto tamanhoProduto = new ProdutoMedio();
        EntregaExpressa entregaExpressa = new EntregaExpressa(2000.0f);
        entregaExpressa.setTamanhoProduto(tamanhoProduto);
        assertEquals(3300.0f, entregaExpressa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoEntregaExpressaProdutoGrande() {
        TamanhoProduto tamanhoProduto = new ProdutoGrande();
        EntregaExpressa entregaExpressa = new EntregaExpressa(2000.0f);
        entregaExpressa.setTamanhoProduto(tamanhoProduto);
        assertEquals(3600.0f, entregaExpressa.calcularPreco(), 0.01f);
    }
}
