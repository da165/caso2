import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz 1: ");
        int nf1= scaner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz 1: ");
        int nc1= scaner.nextInt();
        System.out.println("Ingrese el numero de filas de la matriz 2: ");
        int nf2= scaner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz 2: ");
        int nc2= scaner.nextInt();
        System.out.println("Ingrese el tamaño de pagina: ");
        int tamañoPagina= scaner.nextInt();
        System.out.println("Ingrese el nombre del archivo");
        String nombreArchivo= scaner.next();
        Configuracion configuracion = new  Configuracion(tamañoPagina, nf1, nf2, nc1, nc2);
        EscritorArchivo escritorArchivo= new EscritorArchivo(nombreArchivo);
        escritorArchivo.escribirEncabezado(configuracion);
        GeneradorReferencias generador= new GeneradorReferencias(configuracion, escritorArchivo);
        generador.generar(nf1, nc1, nc2);
        escritorArchivo.cerrar();
        scaner.close();
        System.out.println(nombreArchivo + "Funciono bien");
    }
}