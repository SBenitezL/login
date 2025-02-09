package com.api.login.login.infraestructure.input.auth.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.login.login.domain.models.Permission;
import com.api.login.login.infraestructure.input.auth.dto.response.PermissionDTOAuthResponse;

/**
 * Clase que permite mapear los datos de la entidad {@link Permission} a un
 * {@link PermissionDTOAuthResponse}
 */
@Component
public class MapperPermisionAuthInfraestructureDomain {
    /**
     * Mapea un objeto de tipo {@link Permission} a un objeto de tipo
     * {@link PermissionDTOAuthResponse}
     * 
     * @param permission objeto a mapear
     * @return objeto mapeado
     */
    PermissionDTOAuthResponse mapModelToResponse(Permission permission) {
        return PermissionDTOAuthResponse.builder()
                .name(permission.getPermissionName())
                .build();
    }

    /**
     * Mapea una lista de objetos de tipo {@link Permission} a una lista de objetos
     * {@link PermissionDTOAuthResponse}
     * 
     * @param permissions lista de objetos a mapear
     * @return lista de objetos mapeados
     */
    List<PermissionDTOAuthResponse> mapModelToResponse(List<Permission> permissions) {
        return permissions.stream()
                .map(this::mapModelToResponse)
                .collect(Collectors.toList());
    }
}
