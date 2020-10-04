package com.paulasantana.openapi.driver.feign.marvel;

import javax.websocket.server.PathParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="marvel", url="${feign.client.config.marvel.url}")
public interface MarvelClient {

  @GetMapping(path = "v1/public/characters")
  public MarvelResponse characterList(@SpringQueryMap QueryMarvel queryMarvel);

  @GetMapping(path = "v1/public/characters/{id}")
  public MarvelResponse characterById(@PathVariable int id , @SpringQueryMap QueryMarvel queryMarvel);
}
