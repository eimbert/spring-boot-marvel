package com.eib.marvel.models.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eib.marvel.models.json.MarvelCharactersInfo;

@Service
public class MarvelServiceImpl implements IMarvelService {

	@Override
	public MarvelCharactersInfo findMarvelCharacters() {
		RestTemplate template = new RestTemplate();
		
		String urlConnect = "https://gateway.marvel.com:443/v1/public/characters?ts=1&apikey=c01a00f143618c6a3ab1b52126edd6c0&hash=2a92a5c9560254097bb3d83474b49c12";
		
		ResponseEntity<MarvelCharactersInfo> response = template.exchange(urlConnect, HttpMethod.GET, null,
				new ParameterizedTypeReference<MarvelCharactersInfo>() {
				});
	
		MarvelCharactersInfo marvel = response.getBody();
		return marvel;
	}

}
