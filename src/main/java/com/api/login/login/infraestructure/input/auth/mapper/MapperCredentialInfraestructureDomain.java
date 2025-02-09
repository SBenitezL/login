package com.api.login.login.infraestructure.input.auth.mapper;

import com.api.login.login.domain.models.Credential;
import com.api.login.login.infraestructure.input.auth.dto.response.CredentialDTOResponse;

/**
 * Clase que permite mapear los datos de la entidad {@link Credential} a un
 * {@link CredentialDTOResponse}
 */
public class MapperCredentialInfraestructureDomain {

    /**
     * Mapea un objeto de tipo {@link Credential} a un objeto de tipo
     * {@link CredentialDTOResponse}
     * 
     * @param credential objeto a mapear
     * @return objeto mapeado
     */
    CredentialDTOResponse mapModelToResponse(Credential credential) {
        return CredentialDTOResponse.builder()
                .token(credential.getToken())
                .user(credential.getUser())
                .build();
    }
}
