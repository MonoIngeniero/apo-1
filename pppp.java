import java.util.Scanner;

public class pppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de referencias de productos diferentes vendidos en el día: ");
        int numReferencias = sc.nextInt();

        double[] precios = new double[numReferencias];
        int[] cantidades = new int[numReferencias];

        for (int i = 0; i < numReferencias; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
            System.out.print("Ingrese la cantidad vendida del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
        }

        int totalUnidades = calcularTotalUnidades(cantidades);
        double precioPromedio = calcularPrecioPromedio(precios);
        double totalVentas = calcularVentasTotales(precios, cantidades);

        System.out.println("\nCantidad total de unidades vendidas: " + totalUnidades);
        System.out.println("Precio promedio de las referencias de productos: $" + precioPromedio);
        System.out.println("Ventas totales del día: $" + totalVentas);

        System.out.print("Ingrese el límite mínimo de ventas para consulta: ");
        double limite = sc.nextDouble();
        int productosSuperanLimite = contarProductosSuperanLimite(precios, cantidades, limite);

        System.out.println("Número de productos que superaron el límite de ventas de $" + limite + ": " + productosSuperanLimite);
        
        sc.close();
    }

    public static int calcularTotalUnidades(int[] cantidades) {
        int total = 0;
        for (int cantidad : cantidades) {
            total += cantidad;
        }
        return total;
    }

    public static double calcularPrecioPromedio(double[] precios) {
        double suma = 0;
        for (double precio : precios) {
            suma += precio;
        }
        return suma / precios.length;
    }

    public static double calcularVentasTotales(double[] precios, int[] cantidades) {
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            total += precios[i] * cantidades[i];
        }
        return total;
    }

    public static int contarProductosSuperanLimite(double[] precios, int[] cantidades, double limite) {
        int contador = 0;
        for (int i = 0; i < precios.length; i++) {
            if ((precios[i] * cantidades[i]) > limite) {
                contador++;
            }
        }
        return contador;
    }
}
