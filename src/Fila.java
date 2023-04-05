public class Fila {
    private static Fila instancia;
    private Fila() {

    }
    public void imprimeDocumento()    {

    }
    public void removeDocumento()   {

    }
    public void removeTodosDocumentos() {

    }
    public  static  Fila getInstance()
    {
        if (instancia == null) {
            instancia = new Fila();
        }
        return  instancia;
    }
}
