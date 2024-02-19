package prueba10;

public class SistemaOperativoUtils {


    public static String obtenerNombreSO() {
        return System.getProperty("os.name");
    }

    public static boolean esWindows() {
        return obtenerNombreSO().toLowerCase().contains("win");
    }

    public static boolean esMac() {
        return obtenerNombreSO().toLowerCase().contains("mac");
    }

    public static boolean esLinux() {
        return obtenerNombreSO().toLowerCase().contains("nux");
    }
}
