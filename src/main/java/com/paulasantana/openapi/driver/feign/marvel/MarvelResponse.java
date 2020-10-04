package com.paulasantana.openapi.driver.feign.marvel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelResponse {

  private int code;

  private String status;

  private String etag ;

  private ResponseDataMarvel data;

}
