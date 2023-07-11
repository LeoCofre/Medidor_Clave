package cl.awakelab.medidorclave;

public class Modelo {
    public static final int DEVIL = 0;
    public static final int MEDIA = 1;
    public static final int FUERTE = 2;

    public int validarClave(String password) {
        if (password.length() < 5) {
            return DEVIL;
        } else if (password.equals(password.toLowerCase())) {
            return MEDIA;
        } else {
            return FUERTE;
        }
    }
}
