package co.kianart.autenticacion.model;

import co.kianart.autenticacion.model.excepcion.BussinessException;
import co.kianart.autenticacion.util.Mensajes;
import co.kianart.autenticacion.util.Validador;
import lombok.Data;

@Data
public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String contrasenya;
    private String email;

    private Usuario () {
        super();
    }
    public static class UsuarioBuilder{
        private String idUsuario;
        private String nombreUsuario;
        private String contrasenya;
        private String email;

        public UsuarioBuilder setIdUsuario (String idUsuario){
            this.idUsuario = idUsuario;
            return this;
        }
        public UsuarioBuilder setNombreUsuario(String nombreUsuario){
            this.nombreUsuario = nombreUsuario;
            return this;
        }
        public UsuarioBuilder setContrasenya (String contrasenya){
            this.contrasenya = contrasenya;
            return this;
        }
        public UsuarioBuilder setEmail (String email){
            this.email = email;
            return this;
        }

        /*public Usuario build ()throws BussinessException{
            Usuario usuario =new Usuario();

            Validador.textoNulo(idUsuario, Mensajes.ID_NULO_VACIO);
            Validador.textoVacio(idUsuario, Mensajes.ID_NULO_VACIO);
            usuario.idUsuario = idUsuario;
            Validador.
        }*/
    }
}
