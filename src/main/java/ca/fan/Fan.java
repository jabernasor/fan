package ca.fan;

public interface Fan {

  enum Direction {
    FORWARD,
    REVERSE
  }

  int getSpeed();

  Direction getDirection();
  
  void changeSpeed();
  
  void changeDirection();
}
