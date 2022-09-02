package ca.fan;

public class CeilingFan implements Fan {

  protected static final int MAX_SPEED = 3;
  protected static final int OFF_SETTING = 0;

  private int speed;
  private Direction direction;

  public CeilingFan() {
    this.speed = OFF_SETTING;
    this.direction = Direction.FORWARD;
  }

  @Override
  public int getSpeed() {
    return this.speed;
  }

  @Override
  public Direction getDirection() {
    return this.direction;
  }

  @Override
  public void changeSpeed() {
    this.speed = this.speed == MAX_SPEED ? OFF_SETTING : ++speed;
  }

  @Override
  public void changeDirection() {
    this.direction =
        Direction.FORWARD.equals(this.direction) ? Direction.REVERSE : Direction.FORWARD;
  }

  @Override
  public String toString() {
    return String.format("Fan speed is %d and moving in %s direction", this.speed, this.direction);
  }
}
