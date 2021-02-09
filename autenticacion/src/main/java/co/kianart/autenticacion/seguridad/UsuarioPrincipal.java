package co.kianart.autenticacion.seguridad;

import co.kianart.autenticacion.documento.UsuarioDocumento;
import co.kianart.autenticacion.model.Usuario;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UsuarioPrincipal implements UserDetails {

    private String idUsuario;
    private String nombreUsuario;
    private String apodo;
    private String contrasenya;
    private String email;



    public UsuarioPrincipal(String idUsuario, String nombreUsuario,String apodo, String contrasenya, String email) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apodo = apodo;
        this.contrasenya = contrasenya;
        this.email = email;

    }

    public static UsuarioPrincipal build(UsuarioDocumento usuarioDocumento){
        return new UsuarioPrincipal(usuarioDocumento.getIdUsuario(), usuarioDocumento.getNombreUsuario(),usuarioDocumento.getApodo() , usuarioDocumento.getContrasenya(), usuarioDocumento.getEmail());
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return contrasenya;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
