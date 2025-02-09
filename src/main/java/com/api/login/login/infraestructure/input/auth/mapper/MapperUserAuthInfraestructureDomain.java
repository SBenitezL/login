package com.api.login.login.infraestructure.input.auth.mapper;

import org.springframework.stereotype.Component;

import com.api.login.login.domain.models.User;
import com.api.login.login.infraestructure.input.auth.dto.response.UserDTOAuthResponse;

import lombok.RequiredArgsConstructor;

/**
 * Clase que permite mapear los datos de la entidad {@link User} a un
 * {@link UserDTOAuthResponse}
 */
@Component
@RequiredArgsConstructor
public class MapperUserAuthInfraestructureDomain {
    /**
     * Mapper para los objetos de tipo {@code Role} asociados al {@code User}
     */
    private final MapperRoleAuthInfraestructureDomain roleMapper;

    /**
     * Mapea un objeto de tipo {@link User} a un objeto de tipo
     * {@link UserDTOAuthResponse}
     * 
     * @param user objeto a mapear
     * @return objeto mapeado
     */
    public UserDTOAuthResponse mapModelToResponse(User user) {
        return UserDTOAuthResponse.builder()
                .username(user.getUsername())
                .roles(roleMapper.mapModelToResponse(user.getRoles()))
                .build();
    }
}
