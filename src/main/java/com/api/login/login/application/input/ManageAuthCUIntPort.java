package com.api.login.login.application.input;

import com.api.login.login.domain.models.Credential;

/**
 * Esta interfaz establece las operaciones para el servicio de autenticación de
 * usuarios
 */
public interface ManageAuthCUIntPort {
    /**
     * Método que permite autenticar a un usuario en el sistema utilizando su nombre
     * de usuario y contraseña.
     * 
     * @param username nombre de usuario que intenta autenticarse.
     * @param password contraseña del usuario que intenta autenticarse.
     * @return La credencial del usuario autenticado en caso de que los datos sean
     *         válidos o {@code Error} en caso contrario u ocurra un error.
     */
    public Credential login(String username, String password);
}
