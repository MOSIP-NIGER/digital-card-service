package io.mosip.digitalcard.dto;

import lombok.Data;

/**
 * @since 2026-07-03
 * @editedBy Issaka K.
 */
@Data
public class LanguageDto {

    private String code;

    private String name;

    private String family;

    private String nativeName;

    private Boolean isActive;

}
