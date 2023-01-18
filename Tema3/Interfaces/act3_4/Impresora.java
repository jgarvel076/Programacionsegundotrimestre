public class Impresora implements Borrable, Imprimible {
    private String pagina;
    
    Impresora(){
        pagina=Imprimible.TEXTO_POR_DEFECTO;
    }

    public void establecerContenido(String contenido){
        pagina = contenido;
    }

    @Override
    public void imprime(){

        System.out.println(pagina);
    }

    @Override
    public void establecerContenido() {
        System.out.println(pagina);
    }

    @Override
    public void borrar(){
        pagina=" ";
        //System.out.println(" ");

    }
}
