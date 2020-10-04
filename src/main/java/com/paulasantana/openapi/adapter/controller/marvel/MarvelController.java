package com.paulasantana.openapi.adapter.controller.marvel;

import com.paulasantana.openapi.entity.Character;
import com.paulasantana.openapi.usecase.marvel.MarvelService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class MarvelController {

  private static final Logger logger = LogManager.getLogger(MarvelController.class);

  @Autowired
  MarvelService marvelService;

  @GetMapping
  public List<Character> consult() {
    logger.info("Consultando heróis");
    return marvelService.consult();
  }

  @GetMapping("/{id}")
  public Character consultById(@PathVariable int id) {
    logger.info("Consultando herói por id "+id);
    return marvelService.consultById(id);
  }

}
