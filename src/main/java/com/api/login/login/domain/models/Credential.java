package com.api.login.login.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa las credenciales de un usuario.
 * Las credenciales son utilizadas para autenticar a un usuario en el sistema.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Credential {
    /** Token de autenticación asociado a las credenciales */
    private String token;
    /** Usuario asociado a las credenciales */
    private User user;
}
