package CoreJavaExercisesOOP.Hotel;

public abstract class Huesped {
    private String nombre;
    private int IdDocumento;
    private boolean esTitular;

    public Huesped(String nombre, int IdDocumento, boolean esTitular){
        this.nombre = nombre;
        this.IdDocumento = IdDocumento;
        this.esTitular = esTitular;
    }

    public String verNombreHuesped(){
        return nombre;
    }

    public int verDocumentoHuesped (){
        return IdDocumento;
    }
}
