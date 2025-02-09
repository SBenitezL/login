package com.api.login.login.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa un usuario en el sistema.
 * Los usuarios son los actores principales del sistema.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /** Documento de identificación del usuario */
    private Long documentNumber;
    /** Tipo de documento de identificación del usuario */
    private Long documentType;
    /** Nombres del usuario */
    private String names;
    /** Apellidos del usuario */
    private String lastNames;
    /** telefono de contacto del usuario */
    private String phone;
    /** Correo electrónico del usuario */
    private String email;
    /** Número de teléfono del usuario */
    private String username;
    /** Contraseña del usuario */
    private String password;
    /** Estado lógico del usuario */
    private boolean state;
    /** Roles que posee el usuario */
    private List<Role> roles;

    // Todo: Agregar validaciones
}
