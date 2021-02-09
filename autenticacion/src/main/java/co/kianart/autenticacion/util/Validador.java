package co.kianart.autenticacion.util;

import co.kianart.autenticacion.model.excepcion.BussinessException;

public class Validador {
    public static void textoNulo (String texto, String mensaje) throws BussinessException {
        if(texto == null){
            throw new BussinessException(mensaje);
        }
    }
    public static void textoVacio (String texto, String mensaje) throws BussinessException{
        if(texto.trim().equals("")){
            throw new BussinessException(mensaje);
        }
    }

}
