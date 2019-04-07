package NIF;

import java.util.Arrays;

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
}
