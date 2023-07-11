package cl.awakelab.medidorclave;

public class Presentador {

    private Modelo modelo;

    public void evaluarClave(String password){

        int nivelFuerza = modelo.validarClave(password);

        if (nivelFuerza == Modelo.DEVIL){
        }else if (nivelFuerza == Modelo.MEDIA){


        }else if (nivelFuerza == Modelo.FUERTE){

        }else {

        }
    }
}
