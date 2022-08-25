import java.util.HashMap;
import java.util.Map;

public class BaseDatosProductos {
    private final HashMap<Integer, Producto> listaProductos;

    public BaseDatosProductos() {
        listaProductos = new HashMap<>();
    }

    public void agregar(Producto producto) {
        if (!verificarExistencia(producto)) {
            listaProductos.put(producto.getCodigo(), producto);
            return;
        }
        System.out.println("ERROR");
    }

    public void actualizar(Producto producto) {
        if (verificarExistencia(producto)) {
            listaProductos.put(producto.getCodigo(), producto);
            return;
        }
        System.out.println("ERROR");
    }

    public void eliminar(Producto producto) {
        Producto p = listaProductos.get(producto.getCodigo());
        if (!verificarExistencia(producto)) {
            System.out.println("ERROR");
            return;
        }
        if(p.equals(producto))
            listaProductos.remove(producto.getCodigo());
    }

    public double generarInforme() {
        double total = 0;
        for (Map.Entry<Integer, Producto> productoEntry : listaProductos.entrySet()) {
            Producto p = productoEntry.getValue();
            total += p.getPrecio() * p.getInventario();
        }
        return total;
    }

    public boolean verificarExistencia(Producto producto) {
        return this.listaProductos.containsKey(producto.getCodigo());
    }

    @Override
    public String toString() {
        return "BaseDatosProductos{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
