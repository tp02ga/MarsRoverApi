package com.coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.dto.HomeDto;
import com.coderscampus.response.MarsRoverApiResponse;
import com.coderscampus.service.MarsRoverApiService;

@Controller
public class HomeController {

  @Autowired
  private MarsRoverApiService roverService;
  
  @GetMapping("/")
  public String getHomeView (ModelMap model, HomeDto homeDto) {
    // if request param is empty, then set a default value
    if (StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
      homeDto.setMarsApiRoverData("Opportunity");
    }
    if (homeDto.getMarsSol() == null)
      homeDto.setMarsSol(1);
    
    MarsRoverApiResponse roverData = roverService.getRoverData(homeDto.getMarsApiRoverData(), homeDto.getMarsSol());
    model.put("roverData", roverData);
    model.put("homeDto", homeDto);
    
    return "index";
  }
  
}
