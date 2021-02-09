package co.kianart.autenticacion.repositorio;

import co.kianart.autenticacion.documento.UsuarioDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepositorio extends MongoRepository<UsuarioDocumento, String> {
    Optional<UsuarioDocumento> findByEmail (String email);
    Optional<UsuarioDocumento> findByNombreUsuario(String nombreUsuario);
}
