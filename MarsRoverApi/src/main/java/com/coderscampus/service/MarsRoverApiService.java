package com.coderscampus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coderscampus.dto.HomeDto;
import com.coderscampus.response.MarsPhoto;
import com.coderscampus.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {

  private static final String API_KEY = "f7HYj19tL9KJxtwtRPBTW7FXLDTiP1h9l6rxRy0O";
  
  public MarsRoverApiResponse getRoverData(HomeDto homeDto) {
    RestTemplate rt = new RestTemplate();
    
    List<String> apiUrlEnpoints = getApiUrlEnpoints(homeDto);
    List<MarsPhoto> photos = new ArrayList<>();
    MarsRoverApiResponse response = new MarsRoverApiResponse();
    
    apiUrlEnpoints.stream()
                  .forEach(url -> { 
                    MarsRoverApiResponse apiResponse = rt.getForObject(url, MarsRoverApiResponse.class);
                    photos.addAll(apiResponse.getPhotos());
                  });
    
    response.setPhotos(photos);
    
    return response;
  }
  
  public List<String> getApiUrlEnpoints (HomeDto homeDto) {
    List<String> urls = new ArrayList<>();
    if (Boolean.TRUE.equals(homeDto.getCameraFhaz())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=FHAZ");
    } 
    if (Boolean.TRUE.equals(homeDto.getCameraChemcam()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=CHEMCAM");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraMahli()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=MAHLI");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraMardi()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=MARDI");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraMast()) && "curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=MAST");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraMinites()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=MINITES");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraNavcam())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=NAVCAM");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraPancam()) && !"curiosity".equalsIgnoreCase(homeDto.getMarsApiRoverData())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=PANCAM");
    }
    if (Boolean.TRUE.equals(homeDto.getCameraRhaz())) {
      urls.add("https://api.nasa.gov/mars-photos/api/v1/rovers/"+homeDto.getMarsApiRoverData()+"/photos?sol="+homeDto.getMarsSol()+"&api_key=" + API_KEY + "&camera=RHAZ");
    }
    return urls;
  }
}
