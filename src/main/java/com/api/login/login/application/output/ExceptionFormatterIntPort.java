package com.api.login.login.application.output;

/**
 * Esta interfaz define los metodos que deben ser implementados para formatear
 * la salida de errores.
 */
public interface ExceptionFormatterIntPort {
    /**
     * Método para devolver un mensaje de error de credenciales no válidas.
     *
     * @param message Mensaje descriptivo del error.
     */
    public void returnResponseBadCredentials(String message);
}
