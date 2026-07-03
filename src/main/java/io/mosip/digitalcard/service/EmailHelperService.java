package io.mosip.digitalcard.service;

import java.util.Map;

/**
 * @since 2026-07-03
 * @editedBy Issaka K.
 */
public interface EmailHelperService {

    /**
     * Email service
     * @param fileName
     * @param additionalAttributes
     * @param pdfBytes
     */
    void sendDigitalCardInEmail( String fileName, Map<String,Object> additionalAttributes, byte[] pdfBytes, String templateLang);
}
