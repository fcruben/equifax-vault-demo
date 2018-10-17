package com.atsistemas.vault.example.vaultexample.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

import com.atsistemas.vault.example.vaultexample.commond.util.Constant;
import com.atsistemas.vault.example.vaultexample.service.SecretService;

@Service
public class SecretServiceImpl implements SecretService {

	@Value("${spring.cloud.vault.kv.backend:null}" + Constant.FORWARD_SLASH + Constant.DATA + Constant.FORWARD_SLASH
			+ "${spring.cloud.vault.kv.application-name:null}")
	String pathKV;


	@Autowired
	private VaultTemplate vaultTemplate;

	@Override
	public String readKV(String secretNameToRead) {
		VaultResponse vr = vaultTemplate.read(pathKV);
		if (vr != null) {
			@SuppressWarnings("unchecked")
			Map<String, String> data = (Map<String, String>) vaultTemplate.read(pathKV).getData().get(Constant.DATA);
			return secretNameToRead + "=" + data.get(secretNameToRead).toString();
		}
		return Constant.NO_DATA_FOUND;
	}

}