package com.api.login.login.infraestructure.input.auth.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase ligera que se utiliza para la transferencia de datos entre el cliente y
 * servidor.
 * Se utiliza para enviar los permisos asociados al rol de un usuario.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PermissionDTOAuthResponse {
    /** Nombre del permiso */
    private String name;
}
