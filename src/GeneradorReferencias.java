public class GeneradorReferencias {
    private Configuracion config;
    private EscritorArchivo escritor;
    public GeneradorReferencias( Configuracion config, EscritorArchivo escritor){
        this.config= config;
        this.escritor=escritor;
    }  
    public void generar(int nf1, int nc1, int nc2) {
    for (int i = 0; i < nf1; i++) {
        for (int j = 0; j < nc2; j++) {
            for (int k = 0; k < nc1; k++) {
               long dv1= config.m1 +((long) i* config.nc1+k)*4;
               escritor.escribirReferencia("M1-"+i +"-"+k, dv1, config.tamañoPaginaTP);
               long dv2= config.m2 +((long) k* config.nc2+j)*4;
               escritor.escribirReferencia("M2-"+k +"-"+j, dv2, config.tamañoPaginaTP);
            }
            long dv3= config.m3 +((long) i* config.nc2+ j)*4;
            escritor.escribirReferencia("M3-"+i +"-"+j, dv3, config.tamañoPaginaTP);
        }
    }
}
}
