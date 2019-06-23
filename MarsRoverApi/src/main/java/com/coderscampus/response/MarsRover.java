package com.coderscampus.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {
  private Long id;
  private String name;
  @JsonProperty("landing_date")
  private String landingDate;
  @JsonProperty("launch_date")
  private String launchDate;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLandingDate() {
    return landingDate;
  }
  public void setLandingDate(String landingDate) {
    this.landingDate = landingDate;
  }
  public String getLaunchDate() {
    return launchDate;
  }
  public void setLaunchDate(String launchDate) {
    this.launchDate = launchDate;
  }
  @Override
  public String toString() {
    return "MarsRover [id=" + id + ", name=" + name + ", landingDate=" + landingDate + "]";
  }
}
