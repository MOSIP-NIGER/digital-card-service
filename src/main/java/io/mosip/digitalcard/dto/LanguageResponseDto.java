package io.mosip.digitalcard.dto;

import lombok.Data;

import java.util.List;

/**
 * @since 2026-07-03
 * @editedBy Issaka K.
 */
@Data
public class LanguageResponseDto {

    /**
     * List of Languages.
     */
    private List<LanguageDto> languages;

}
