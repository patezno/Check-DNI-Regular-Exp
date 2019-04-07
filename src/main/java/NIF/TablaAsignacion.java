package NIF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TablaAsignacion {

    // Enum

    T("T"), R("R"), W("W"), A("A"), G("G"), M("M"), Y("Y"), P("P"),
    F("F"), D("D"), X("X"), B("B"), N("N"), J("J"), Z("Z"), S("S"),
    Q("Q"), V("V"), H("H"), L("L"), C("C"), K("K"), E("E");

    // Atributos

    private String valor = null;
    private static final int size = TablaAsignacion.values().length;

    // Constructor

    TablaAsignacion(String valor) {
        this.valor = valor;
    }

    // Getters

    public static int getSize() {
        return size;
    }

    public String getValor() {
        return valor;
    }

    // Metodos

    public static Boolean wordAllowed(String letra) {
        String tablaString = Arrays.toString(TablaAsignacion.values());
        return tablaString.contains(letra);
    }

    public static void showWords() {
        System.out.println(Arrays.toString(TablaAsignacion.values()));
    }

    public static TablaAsignacion getWord(int position) {

        List<TablaAsignacion> tableValues = new ArrayList<>();

        tableValues.addAll(Arrays.asList(TablaAsignacion.values()));

        return tableValues.get(position);
    }
}
