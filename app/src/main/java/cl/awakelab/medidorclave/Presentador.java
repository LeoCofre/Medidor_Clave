package cl.awakelab.medidorclave;

public class Presentador {

    private Modelo modelo;
    private IVistaPresentador vistaPresentador;

    public Presentador(IVistaPresentador vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo = new Modelo();
    }

    public void evaluarClave(String password) {

        int nivelFuerza = modelo.validarClave(password);

        if (nivelFuerza == Modelo.DEVIL) {

            this.vistaPresentador.mostrarDevil();

        } else if (nivelFuerza == Modelo.MEDIA) {

            this.vistaPresentador.mostrarMedia();

        } else if (nivelFuerza == Modelo.FUERTE) {

            this.vistaPresentador.mostrarFuerte();

        } else {

            this.vistaPresentador.mostrarError();

        }
    }
}
