package com.api.login.login.infraestructure.input.auth.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase ligera que se utiliza para la transferencia de datos entre el
 * cliente y servidor.
 * Se utiliza para la respuesta de la autenticación de un usuario evitando el
 * envío de información sensible.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTOAuthResponse {
    /** Nombre de usuario */
    private String username;
    /** Email registrado */
    private String email;
    /** Nombre(s) registrado */
    private String name;
    /** Apellido(s) registrados */
    private String lastname;
    /** Estado actual del usuario */
    private boolean state;
    /** Roles registrados para el usuario */
    private List<RoleDTOAuthResponse> roles;

}
