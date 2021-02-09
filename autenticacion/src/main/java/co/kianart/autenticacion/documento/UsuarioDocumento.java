package co.kianart.autenticacion.documento;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document (collection = "Usuario")
public class UsuarioDocumento {
    @Id
    private String idUsuario;
    private String nombreUsuario;
    private String apodo;
    private String contrasenya;
    private String email;

    public UsuarioDocumento() {
    }

    public UsuarioDocumento(String nombreUsuario, String contrasenya, String email, String apodo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.email = email;
        this.apodo = apodo;
    }
}
