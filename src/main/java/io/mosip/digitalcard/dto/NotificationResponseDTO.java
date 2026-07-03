package io.mosip.digitalcard.dto;

import io.mosip.kernel.core.http.ResponseWrapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @since 2026-07-03
 * @editedBy Issaka K.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NotificationResponseDTO extends ResponseWrapper {
    private String status;
    private String message;
}