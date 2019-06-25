package com.coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderscampus.response.MarsRoverApiResponse;
import com.coderscampus.service.MarsRoverApiService;

@Controller
public class HomeController {

  @Autowired
  private MarsRoverApiService roverService;
  
  @GetMapping("/")
  public String getHomeView (ModelMap model) {
    MarsRoverApiResponse roverData = roverService.getRoverData("opportunity");
    model.put("roverData", roverData);
    
    return "index";
  }
  
  @PostMapping("/")
  public String postHomeView (ModelMap model, @RequestParam String marsApiRoverData) {
    MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
    model.put("roverData", roverData);
    
    return "index";
  }
}
