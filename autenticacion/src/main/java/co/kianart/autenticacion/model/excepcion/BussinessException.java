package co.kianart.autenticacion.model.excepcion;

public class BussinessException extends RuntimeException{
    public BussinessException(String mensaje){
        super(mensaje);
    }
}
