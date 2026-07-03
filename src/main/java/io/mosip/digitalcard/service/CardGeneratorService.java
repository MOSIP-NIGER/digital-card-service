package io.mosip.digitalcard.service;


import org.json.JSONObject;

import java.util.Map;

/**
 * @since 2026-07-03
 * @author Issaka K.
 */
public interface CardGeneratorService {

	/**
	 * The PDFCardService
	 *
	 * @param decryptedCredentialJson
	 * @param credentialType
	 * @param password
	 * @param templateLang
	 * @return
	 */
	public byte[] generateCard(JSONObject decryptedCredentialJson, String credentialType, String password, Map<String,Object> additionalAttributes, String templateLang) throws Exception;

}