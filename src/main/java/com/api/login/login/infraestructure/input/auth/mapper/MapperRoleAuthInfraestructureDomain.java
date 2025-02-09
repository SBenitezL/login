package com.api.login.login.infraestructure.input.auth.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.login.login.domain.models.Role;
import com.api.login.login.infraestructure.input.auth.dto.response.RoleDTOAuthResponse;

import lombok.RequiredArgsConstructor;

/**
 * Clase que permite mapear los datos de la entidad {@link Role} a
 * un {@link RoleDTOAuthResponse}
 */
@Component
@RequiredArgsConstructor
public class MapperRoleAuthInfraestructureDomain {
    /**
     * Mapper para los objetos de tipo {@code Permission} asociados al {@code Role}
     */
    private final MapperPermisionAuthInfraestructureDomain permissionMapper;

    /**
     * Mapea un objeto de tipo {@link Role} a un objeto de tipo
     * {@link RoleDTOAuthResponse}
     * 
     * @param role objeto a mapear
     * @return objeto mapeado
     */
    RoleDTOAuthResponse mapModelToResponse(Role role) {
        return RoleDTOAuthResponse.builder()
                .name(role.getRoleName())
                .permissions(permissionMapper.mapModelToResponse(role.getPermissions()))
                .build();
    }

    /**
     * Mapea una lista de objetos de tipo {@link Role} a una lista de objetos de
     * tipo {@link RoleDTOAuthResponse}
     * 
     * @param roles lista de objetos a mapear
     * @return lista de objetos mapeados
     */
    List<RoleDTOAuthResponse> mapModelToResponse(List<Role> roles) {
        return roles.stream()
                .map(this::mapModelToResponse)
                .collect(Collectors.toList());
    }
}
