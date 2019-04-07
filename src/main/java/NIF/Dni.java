package NIF;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    // Metodos

    public Boolean checkDni(String dni) {

        Boolean checker = false;

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dni);

        while (m.find()) {
            for (TablaAsignacion letra : TablaAsignacion.values()) {
                if (m.group().equals(letra.getValor())) {
                    checker = true;
                } else {
                    checker = false;
                }
            }
        }
        return checker;
    }

}
