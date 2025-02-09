package com.api.login.login.infraestructure.input.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase ligera que se utiliza para la transferencia de datos entre el cliente y
 * servidor.
 * Se utiliza para recibir una petición login.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTORequest {
    /** Nombre de usuario que no puede ser vacío ni nulo */
    @NotBlank(message = "The username is required")
    private String username;
    /** Contraseña del usuario, no puede ser vacío ni nulo */
    @NotBlank(message = "The password is required")
    private String password;
}
