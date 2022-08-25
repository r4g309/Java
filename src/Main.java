import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BaseDatosProductos db = new BaseDatosProductos();
//AGREGAR
//3  "Peras"  2700.0  33
//AGREGAR
//4  "Arandanos"  9300.0  5

//        AGREGAR
//        5  "Tomates"  2100.0  42
//        AGREGAR
//        6  "Fresas"  4100.0  3
//        AGREGAR
//        7  "Helado"  4500.0  41
//        AGREGAR
//        8  "Galletas"  500.0  8
//        AGREGAR
//        9  "Chocolates"  3500.0  80
//        AGREGAR
//        10  "Jamon"  15000.0  10

//        db.agregar(new Producto(1, "Manzanas", 5000.0, 25));
//        db.agregar(new Producto(2, "Limones", 2300.0, 15));
//        db.agregar(new Producto(3, "Peras", 2700.0, 33));
//        db.agregar(new Producto(4, "Arandanos", 9300.0, 5));
//        db.agregar(new Producto(5, "Tomates", 2100.0, 42));
//        db.agregar(new Producto(6, "Fresas", 4100.0, 3));
//        db.agregar(new Producto(7, "Helado", 4500.0, 41));
//        db.agregar(new Producto(8, "Galletas", 500.0, 8));
//        db.agregar(new Producto(9, "Chocolates", 3500.0, 80));
//        db.agregar(new Producto(10, "Jamon", 15000.0, 10));
//        System.out.println("db.generarInforme() = " + db.generarInforme());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String opc = sc.nextLine();
            String[] datos = sc.nextLine().split(" ");
            if (datos.length >= 4) {
                Producto p = new Producto(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]));
                switch (opc) {
                    case "AGREGAR" -> db.agregar(p);
                    case "ACTUALIZAR" -> db.actualizar(p);
                    case "BORRAR" -> db.eliminar(p);
                }
            }
            System.out.println(db);
        }
    }
}
