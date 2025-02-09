package com.api.login.login.infraestructure.input.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.login.login.application.input.ManageAuthCUIntPort;
import com.api.login.login.infraestructure.input.auth.dto.request.LoginDTORequest;
import com.api.login.login.infraestructure.input.auth.dto.response.CredentialDTOResponse;
import com.api.login.login.infraestructure.input.auth.mapper.MapperCredentialInfraestructureDomain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/**
 * Controlador que expone los endpoints relacionados con la autenticación.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthRestController {
    /** Caso de uso asociado a la autenticación. */
    private final ManageAuthCUIntPort authCU;
    /** Mapper que permite dar el formato correcto a las respuestas del dominio. */
    private final MapperCredentialInfraestructureDomain mapperCredential;

    /**
     * Endpoint que permite autenticar a un usuario.
     * 
     * @param request petición con los datos de autenticación.
     * @return respuesta con el token en caso de que se complete la autenticación.
     */
    @PostMapping("/login")
    public ResponseEntity<CredentialDTOResponse> login(@Valid @RequestBody LoginDTORequest request) {
        CredentialDTOResponse response = mapperCredential
                .mapModelToResponse(authCU.login(request.getUsername(), request.getPassword()));
        return new ResponseEntity<CredentialDTOResponse>(response, HttpStatus.OK);
    }

}
