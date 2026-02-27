public class Configuracion {
    int tamañoPaginaTP;
    int nf1, nc1, nf2, nc2;
    long m1, m2, m3;
    long nr;
    int np;
    public Configuracion(int tamañoPaginaTP, int nf1, int nf2, int nc1, int nc2) {
        this.tamañoPaginaTP=tamañoPaginaTP;
        this.nf1= nf1;
        this.nf2= nf2;
        this.nc1=nc1;
        this.nc2= nc2;
        m1=0;
        m2= (long) nf1*nc1*4;
        m3=m2+ ((long) nf2*nc2*4);
        nr=((long) nf1*nc2*nc1*2)+((long)nf1*nc2);
        long totalBytes;
        totalBytes= m3 + ((long) nf1*nc2*4);
        np=(int) Math.ceil((double) totalBytes/tamañoPaginaTP);        
    }
        
    
}
