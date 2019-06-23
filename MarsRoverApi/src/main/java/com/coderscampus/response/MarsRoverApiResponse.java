package com.coderscampus.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
  List<MarsPhoto> photos = new ArrayList<>();

  public List<MarsPhoto> getPhotos() {
    return photos;
  }

  public void setPhotos(List<MarsPhoto> photos) {
    this.photos = photos;
  }

  @Override
  public String toString() {
    return "MarsRoverApiResponse [photos=" + photos + "]";
  }
}
