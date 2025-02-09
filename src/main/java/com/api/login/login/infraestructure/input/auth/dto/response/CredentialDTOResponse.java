package com.api.login.login.infraestructure.input.auth.dto.response;

import com.api.login.login.domain.models.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase ligera que se utiliza para la transferencia de datos entre el cliente y
 * servidor.
 * Se utiliza para enviar la respuesta de la autenticación del usuario.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CredentialDTOResponse {
    /** Token de autenticación del usuario */
    private String token;
    /** Información básica del usuario en el sistema */
    private User user;

}
