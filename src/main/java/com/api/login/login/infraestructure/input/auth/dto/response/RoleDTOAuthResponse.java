package com.api.login.login.infraestructure.input.auth.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase ligera que se utiliza para la transferencia de datos entre el cliente y
 * servidor.
 * Se utiliza para enviar los roles que posee un usuario.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTOAuthResponse {
    /** Nombre del rol */
    private String name;
    /** Estado actual del rol */
    private boolean state;
    /** Permisos asociados al rol */
    private List<PermissionDTOAuthResponse> permissions;
}
