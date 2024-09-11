package padroesestruturais.bridge;

public class EntregaExpressa extends Entrega {

    public EntregaExpressa(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * 1.5f * (1 + this.tamanhoProduto.percentualAumento());
    }
}
