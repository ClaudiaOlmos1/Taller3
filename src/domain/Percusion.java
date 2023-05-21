package domain;

public class Percusion extends Instrumentos{

    private String tipoDePercusion;
    private String altura;

    public Percusion(int codigo, int precio, int stock, String nombre, String material, String tipoDePercusion, String altura) {
        super(codigo, precio, stock, nombre, material);
        this.tipoDePercusion = tipoDePercusion;
        this.altura = altura;
    }

    public String getTipoDePercusion() {
        return tipoDePercusion;
    }

    public void setTipoDePercusion(String tipoDePercusion) {
        this.tipoDePercusion = tipoDePercusion;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
