package com.paulasantana.openapi.usecase.marvel;

import com.paulasantana.openapi.adapter.controller.marvel.MarvelController;
import com.paulasantana.openapi.driver.feign.marvel.MarvelClient;
import com.paulasantana.openapi.driver.feign.marvel.QueryMarvel;
import com.paulasantana.openapi.entity.Character;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelService {

  @Autowired
  private MarvelClient marvelClient;

  private static final Logger logger = LogManager.getLogger(MarvelController.class);

  public List<Character> consult() {
    logger.info("Antes de chamar o serviço da Marvel");

    QueryMarvel queryMarvel = QueryMarvel.buildDefaultQuery();

    logger.info("Depois de chamar o serviço da Marvel");

    return Character.list(marvelClient.characterList(queryMarvel));
  }

  public Character consultById(int id) {
    logger.info("Antes de chamar o serviço da Marvel");

    QueryMarvel queryMarvel = QueryMarvel.buildDefaultQuery();

    logger.info("Depois de chamar o serviço da Marvel");

    return Character.get(marvelClient.characterById(id,queryMarvel));
  }
}
