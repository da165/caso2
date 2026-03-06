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
    public void escribirEncabezado(Configuracion configuracion){
        escritor.println("TP=" + configuracion.tamañoPaginaTP);
        escritor.println("NF1=" + configuracion.nf1);
        escritor.println("NC1="+ configuracion.nc1);
        escritor.println("NF2="+ configuracion.nf2);
        escritor.println("NC2="+ configuracion.nc2);
        escritor.println("NR=" + configuracion.nr);
        escritor.println("NP=" + configuracion.np);
    }
    public  void escribirReferencia(String etiqueta, long dv, int tp){
        int pagina= (int) (dv/tp);
        int offset=(int) (dv%tp);
        escritor.println("["+ etiqueta +"],"+ pagina + ","+ offset);
    }
    public void cerrar(){
        escritor.close();
    }
}
