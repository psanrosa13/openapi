package com.paulasantana.openapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paulasantana.openapi.driver.feign.marvel.MarvelResponse;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

  private int id;

  private String name;

  private String description;

  private String resourceURI;

  public static List<Character> list(MarvelResponse response) {
      return response.getData().getResults();
  }

  public static Character get(MarvelResponse response) {
    return response.getData().getResults().get(0);
  }

}
