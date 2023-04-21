import java.io.Serializable;

public class ObjetoSerializable implements Serializable {

    private static final long serialVersionUID = 1L;

    String atributo1;
    static String atributo2;
    transient String atributo3;

    public ObjetoSerializable(String atributo1, String atributo2, String atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public ObjetoSerializable() {
        this.atributo1 = "Jose";
        this.atributo2 = "Luis";
        this.atributo3 = "Cañizares";
    }
}
