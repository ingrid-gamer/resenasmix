package com.example.resenasmix.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JuegoExternoDTO {

    private Long id;
    private String title;

    @JsonProperty("short_description")
    private String shortDescription;

    private String genre;
    private String platform;
    private String publisher;
    private String thumbnail;

    @JsonProperty("game_url")
    private String gameUrl;
}