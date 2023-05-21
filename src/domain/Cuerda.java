package domain;

public class Cuerda extends Instrumentos {

    private int numeroCuerdas;
    private String tipoCuerda;
    private String tipo;


    public Cuerda(int codigo, int precio, int stock, String nombre, String material, int numeroCuerdas, String tipoCuerda, String tipo) {
        super(codigo, precio, stock, nombre, material);
        this.numeroCuerdas = numeroCuerdas;
        this.tipoCuerda = tipoCuerda;
        this.tipo = tipo;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public String getTipoCuerda() {
        return tipoCuerda;
    }

    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
