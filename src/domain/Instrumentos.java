package domain;

public abstract class Instrumentos {

    private int codigo;
    private int precio;
    private int stock;
    private String nombre;
    private String material;


    public Instrumentos (int codigo, int precio, int stock, String nombre, String material){
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
        this.material = material;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
