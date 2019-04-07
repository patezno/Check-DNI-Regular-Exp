package NIF;

public class Dni extends Nif {

    // Atributos

    private String regex = "(^\\d{8}[A-Z&&[^IÑOU]])";

    // Constructores

    public Dni() {

    }

    public Dni(String dni) {
        super(dni);
    }

    // Getters

    public String getDni() {
        return super.getNif();
    }

}
