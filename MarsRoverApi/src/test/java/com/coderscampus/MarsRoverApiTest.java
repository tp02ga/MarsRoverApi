package com.coderscampus;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverApiTest {

  @Test
  public void smallTest () {
    RestTemplate rt = new RestTemplate();
    
    ResponseEntity<String> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", String.class);
    System.out.println(response.getBody());
  }
}
