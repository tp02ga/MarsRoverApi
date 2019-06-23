package com.coderscampus;

public class MarsPhoto {
  private Long id;
  private Integer sol;
  private MarsCamera camera;
  private String imgSrc;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Integer getSol() {
    return sol;
  }
  public void setSol(Integer sol) {
    this.sol = sol;
  }
  public MarsCamera getCamera() {
    return camera;
  }
  public void setCamera(MarsCamera camera) {
    this.camera = camera;
  }
  public String getImgSrc() {
    return imgSrc;
  }
  public void setImgSrc(String imgSrc) {
    this.imgSrc = imgSrc;
  }
  @Override
  public String toString() {
    return "MarsPhoto [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc + "]";
  }
}
