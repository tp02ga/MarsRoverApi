package com.coderscampus;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
  List<MarsPhoto> photos = new ArrayList<>();

  @Override
  public String toString() {
    return "MarsRoverApiResponse [photos=" + photos + "]";
  }
}
