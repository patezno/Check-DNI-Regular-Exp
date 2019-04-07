package NIF;

public class Nie extends Nif {

    // Atributos

    private String regex = "(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])";

    // Constructores

    public Nie() {

    }

    public Nie(String nie) {
        super(nie);
    }

    // Getters

    public String getNie() {
        return super.getNif();
    }

}
