package NIF;

public class Dni extends Nif {

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
