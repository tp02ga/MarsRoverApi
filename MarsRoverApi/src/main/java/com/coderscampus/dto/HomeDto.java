package com.coderscampus.dto;

public class HomeDto {
  private Long userId;
  private String marsApiRoverData;
  private Integer marsSol;
  private Boolean cameraFhaz;
  private Boolean cameraRhaz;
  private Boolean cameraMast;
  private Boolean cameraChemcam;
  private Boolean cameraMahli;
  private Boolean cameraMardi;
  private Boolean cameraNavcam;
  private Boolean cameraPancam;
  private Boolean cameraMinites;
  private Boolean rememberPreferences;
  
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public String getMarsApiRoverData() {
    return marsApiRoverData;
  }
  public void setMarsApiRoverData(String marsApiRoverData) {
    this.marsApiRoverData = marsApiRoverData;
  }
  public Integer getMarsSol() {
    return marsSol;
  }
  public void setMarsSol(Integer marsSol) {
    this.marsSol = marsSol;
  }
  public Boolean getCameraFhaz() {
    return cameraFhaz;
  }
  public void setCameraFhaz(Boolean cameraFhaz) {
    this.cameraFhaz = cameraFhaz;
  }
  public Boolean getCameraRhaz() {
    return cameraRhaz;
  }
  public void setCameraRhaz(Boolean cameraRhaz) {
    this.cameraRhaz = cameraRhaz;
  }
  public Boolean getCameraMast() {
    return cameraMast;
  }
  public void setCameraMast(Boolean cameraMast) {
    this.cameraMast = cameraMast;
  }
  public Boolean getCameraChemcam() {
    return cameraChemcam;
  }
  public void setCameraChemcam(Boolean cameraChemcam) {
    this.cameraChemcam = cameraChemcam;
  }
  public Boolean getCameraMahli() {
    return cameraMahli;
  }
  public void setCameraMahli(Boolean cameraMahli) {
    this.cameraMahli = cameraMahli;
  }
  public Boolean getCameraMardi() {
    return cameraMardi;
  }
  public void setCameraMardi(Boolean cameraMardi) {
    this.cameraMardi = cameraMardi;
  }
  public Boolean getCameraNavcam() {
    return cameraNavcam;
  }
  public void setCameraNavcam(Boolean cameraNavcam) {
    this.cameraNavcam = cameraNavcam;
  }
  public Boolean getCameraPancam() {
    return cameraPancam;
  }
  public void setCameraPancam(Boolean cameraPancam) {
    this.cameraPancam = cameraPancam;
  }
  public Boolean getCameraMinites() {
    return cameraMinites;
  }
  public void setCameraMinites(Boolean cameraMinites) {
    this.cameraMinites = cameraMinites;
  }
  public Boolean getRememberPreferences() {
    return rememberPreferences;
  }
  public void setRememberPreferences(Boolean rememberPreferences) {
    this.rememberPreferences = rememberPreferences;
  }
  @Override
  public String toString() {
    return "HomeDto [userId=" + userId + ", marsApiRoverData=" + marsApiRoverData + ", marsSol=" + marsSol
        + ", cameraFhaz=" + cameraFhaz + ", cameraRhaz=" + cameraRhaz + ", cameraMast=" + cameraMast
        + ", cameraChemcam=" + cameraChemcam + ", cameraMahli=" + cameraMahli + ", cameraMardi=" + cameraMardi
        + ", cameraNavcam=" + cameraNavcam + ", cameraPancam=" + cameraPancam + ", cameraMinites=" + cameraMinites
        + ", rememberPreferences=" + rememberPreferences + "]";
  }
}
