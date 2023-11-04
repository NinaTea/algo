package aed;
public class SistemaCNE {
    // Completar atributos privados
    String[] nombresPartidos;
    String[] nombresDistritos;
    int[] diputadosEnDisputa;    
    int[] rangoMesasPorDistrito;    
    int[][] votosDiputados;
    int[] votosPresidenciales;

    
    // para el ballotage
    boolean hayBallotage;
    int cantidadTotalDeVotos;

    

    public class VotosPartido{
        private int presidente;
        private int diputados;
        VotosPartido(int presidente, int diputados){
            this.presidente = presidente; this.diputados = diputados;}
        public int votosPresidente(){return presidente;}
        public int votosDiputados(){return diputados;}
    }



    public SistemaCNE(String[] nombresDistritos, int[] diputadosPorDistrito, 
                      String[] nombresPartidos, int[] ultimasMesasDistritos) {

        int i = 0;
        this.nombresPartidos = new String[nombresPartidos.length];
        this.nombresDistritos = new String[nombresDistritos.length];
        this.diputadosEnDisputa = new int[diputadosPorDistrito.length];
        this.votosPresidenciales = new int[nombresPartidos.length]; //todo ceros

        this.votosDiputados = new int[nombresDistritos.length][nombresPartidos.length]; //todo ceros  

        this.votosPorMesa = new int[0];//...........................

        while (i < nombresPartidos.length){
            this.nombresPartidos[i] = nombresPartidos[i];
            i++;
        }
        i = 0;
        while ( i < diputadosPorDistrito.length){
            this.nombresDistritos[i] = nombresDistritos[i];
            this.diputadosEnDisputa[i]= diputadosPorDistrito[i];
            this.rangoMesasPorDistrito[i] = ultimasMesasDistritos[i];
            i++;
        }
        i = 0;
        int j = 0;

        


    }

    public String nombrePartido(int idPartido) {
        return this.nombresPartidos[idPartido];
    }

    public String nombreDistrito(int idDistrito) {
        return this.nombresDistritos[idDistrito];
    }

    public int diputadosEnDisputa(int idDistrito) {
        return this.diputadosEnDisputa[idDistrito];
    }

    public String distritoDeMesa(int idMesa) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void registrarMesa(int idMesa, VotosPartido[] actaMesa) {
        /*  
         * insertar la mesa 'idMesa' en el AVL q hagamos
         * y hacer
         * mesasElectorales.InicializarMesa(nroMesa, actaMesa)
         */
        throw new UnsupportedOperationException("No implementada aun");
        
    }

    public int votosPresidenciales(int idPartido) {
        return votosPresidenciales[idPartido];
    }

    public int votosDiputados(int idPartido, int idDistrito) {
        return votosDiputados[idDistrito][idPartido];
    }

    public int[] resultadosDiputados(int idDistrito){
        /* */
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean hayBallotage(){
        throw new UnsupportedOperationException("No implementada aun");
    }
}

