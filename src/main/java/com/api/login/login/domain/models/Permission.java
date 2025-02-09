package com.api.login.login.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un permiso en el sistema.
 * Los permisos son utilizados para controlar el acceso a las funcionalidades
 * del sistema.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Permission {

    /** Identificador del permiso */
    private String permissionId;
    /** Nombre del permiso */
    private String permissionName;
    /** Descripción del permiso */
    private String permissionDescription;

    // Todo: Agregar validaciones
}
