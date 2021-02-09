package co.kianart.autenticacion.servicio.implementación;

import co.kianart.autenticacion.documento.UsuarioDocumento;
import co.kianart.autenticacion.seguridad.UsuarioPrincipal;
import co.kianart.autenticacion.servicio.DetallesUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsImpl implements DetallesUsuario {

    @Autowired
    UsuarioServicioImpl usuarioServicio;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        UsuarioDocumento usuarioDocumento = usuarioServicio.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuarioDocumento);
    }



}
