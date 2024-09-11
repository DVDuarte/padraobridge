package padroesestruturais.bridge;

public abstract class Entrega {

    protected TamanhoProduto tamanhoProduto;

    protected float precoBase;

    public Entrega(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setTamanhoProduto(TamanhoProduto tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
