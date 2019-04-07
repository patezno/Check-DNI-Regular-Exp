package NIF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TablaAsignacion {

    // Enum

    T, R, W, A, G, M, Y, P, F, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E;

    // Atributos

    private static final int size = TablaAsignacion.values().length;

    // Getters

    public static int getSize() {
        return size;
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
