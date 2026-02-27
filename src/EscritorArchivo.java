import java.io.PrintWriter;
import java.io.FileWriter;
public class EscritorArchivo {
    private PrintWriter escritor;
    public EscritorArchivo(String nombreArchivo){
        try {
            escritor= new PrintWriter(new FileWriter(nombreArchivo));
        } catch (Exception e) {
            System.err.println("Nombre de archivo incorrecto");
        } 
    }
    public escribirEncabezado(Configuracion configuracion){
        escritor.println(tamañoPaginaTP);

    }
}
