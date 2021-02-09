package co.kianart.autenticacion.servicio;

import co.kianart.autenticacion.documento.UsuarioDocumento;

import java.util.Optional;

public interface UsuarioServicio {
    Optional<UsuarioDocumento> buscarUsuarioEmail (String email);
    String registrarUsuario (UsuarioDocumento usuarioDocumento);
    Optional<UsuarioDocumento> getByNombreUsuario(String nombreUsuario);
}
