package com.paulasantana.openapi.driver.feign.marvel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.paulasantana.openapi.entity.Character;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDataMarvel {

  private int offset;

  private int limit;

  private int total;

  private int count;

  private List<Character> results;
}
