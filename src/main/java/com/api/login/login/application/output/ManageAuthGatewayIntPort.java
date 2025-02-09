package com.api.login.login.application.output;

import java.util.Optional;

import com.api.login.login.domain.models.User;

/**
 * Esta interfaz establece las operaciones que permiten vincular la
 * autenticación con la base de datos
 */
public interface ManageAuthGatewayIntPort {

    /**
     * Método que permite buscar un usuario en la base de datos utilizando su
     * nombre de usuario.
     * 
     * @param username nombre de usuario que se desea buscar.
     * @return El usuario que se encontró en la base de datos o
     *         {@code Optional.empty()}
     *         en caso de que no se haya encontrado.
     */
    public Optional<User> findByUsername(String username);

    /**
     * Método que permite verificar si un usuario existe en la base de datos
     * utilizando su nombre de usuario.
     * 
     * @param username nombre de usuario que se desea verificar.
     * @return {@code true} si el usuario existe en la base de datos o {@code false}
     *         en caso contrario.
     */
    public boolean existsUserByUsername(String username);
}
