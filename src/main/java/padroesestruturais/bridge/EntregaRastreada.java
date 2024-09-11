package padroesestruturais.bridge;

public class EntregaRastreada extends Entrega {

    public EntregaRastreada(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.tamanhoProduto.percentualAumento());
    }
}
