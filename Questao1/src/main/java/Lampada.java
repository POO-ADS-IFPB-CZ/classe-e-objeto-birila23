public class Lampada {
    private String tipo;
    private String marca;
    private float preco;

    public Lampada(String tipo, String marca, float preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getTipo(){
            return tipo;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(){
        this.marca = marca;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(){
        this.preco = preco;
    }
}


