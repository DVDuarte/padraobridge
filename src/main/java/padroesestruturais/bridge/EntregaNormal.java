package padroesestruturais.bridge;

public class EntregaNormal extends Entrega {

    public EntregaNormal(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase;
    }
}
