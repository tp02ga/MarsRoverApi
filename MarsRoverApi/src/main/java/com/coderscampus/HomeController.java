package com.coderscampus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String getHomeView (ModelMap model) {
    
    return "index";
  }
  
}
