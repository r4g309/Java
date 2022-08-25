public class Producto {
    private final int codigo;
    private final int inventario;
    private final double precio;
    private final String nombre;

    public Producto(int codigo, String nombre, double precio, int inventario) {
        this.codigo = codigo;
        this.inventario = inventario;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getInventario() {
        return inventario;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto p = (Producto) obj;
        return codigo == p.codigo && inventario == p.inventario && precio == p.precio && nombre.equals(p.nombre);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", inventario=" + inventario + ", precio=" + precio + ", nombre='" + nombre + '\'' + '}';
    }
}
