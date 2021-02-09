package co.kianart.autenticacion.servicio.implementación;

import co.kianart.autenticacion.documento.UsuarioDocumento;
import co.kianart.autenticacion.repositorio.UsuarioRepositorio;
import co.kianart.autenticacion.servicio.UsuarioServicio;
import co.kianart.autenticacion.util.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UsuarioServicioImpl implements UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public Optional<UsuarioDocumento> buscarUsuarioEmail(String email) {
        return usuarioRepositorio.findByEmail(email);
    }

    @Override
    public String registrarUsuario(UsuarioDocumento usuarioDocumento) {
        if(buscarUsuarioEmail(usuarioDocumento.getEmail()) == null){
            usuarioRepositorio.save(usuarioDocumento);
            return Mensajes.REGISTRO_EXITOSO;
        }
        return Mensajes.USUARIO_YA_REGISTRADO;

    }

    @Override
    public Optional<UsuarioDocumento> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepositorio.findByNombreUsuario(nombreUsuario);
    }
}
