package com.paulasantana.openapi.driver.feign.marvel;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class QueryMarvel {

  private int ts;

  private String apikey;

  private String hash;

  public QueryMarvel(int ts, String apikey, String hash) {
    this.ts = ts;
    this.apikey = apikey;
    this.hash = hash;
  }

  public static QueryMarvel buildDefaultQuery() {
    int ts = LocalDateTime.now().getSecond();
    String apiKeyPublic = "0548da9dcf65979ebfdb2a55b3b9ccde";
    return new QueryMarvel(ts, apiKeyPublic, buildHash(ts, apiKeyPublic));
  }

  private static String buildHash(int configurationTs, String configurationApiKeyPublic) {
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      System.out.println("Problemas ao gerar hash MD5");
    }
    String value = configurationTs+"e317b14a207ff51d1d966a08ab0e27ead20551e1"+configurationApiKeyPublic;

    BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));

    return hash.toString(16);
  }

}
