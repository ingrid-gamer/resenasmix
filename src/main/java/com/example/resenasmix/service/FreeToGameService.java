package com.example.resenasmix.service;

import com.example.resenasmix.dto.JuegoExternoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class FreeToGameService {

    @Value("${external.api.base-url}")
    private String baseUrl;

    public List<JuegoExternoDTO> listarJuegosExternos() {
        RestTemplate restTemplate = new RestTemplate();
        JuegoExternoDTO[] respuesta = restTemplate.getForObject(baseUrl, JuegoExternoDTO[].class);
        return respuesta == null ? List.of() : Arrays.asList(respuesta);
    }
}