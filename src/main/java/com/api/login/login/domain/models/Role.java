package com.api.login.login.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un rol en el sistema.
 * Los roles cuentan con permisos asociados.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    /** Identificador del rol */
    private String roleId;
    /** Nombre del rol */
    private String roleName;
    /** Estado del rol */
    private boolean status;
    /** Permisos asociados al rol */
    private List<Permission> permissions;

    // Todo: Agregar validaciones
}
