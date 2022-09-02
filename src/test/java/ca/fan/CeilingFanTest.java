package ca.fan;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ca.fan.Fan.Direction;

public class CeilingFanTest {

  private Fan ceilingFan;

  @Before
  public void setup() {
    ceilingFan = new CeilingFan();

    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());
  }

  @Test
  public void testChangeSpeedForwardDirection() {

    ceilingFan.changeSpeed();
    assertEquals(1, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());

    ceilingFan.changeSpeed();
    assertEquals(2, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());

    ceilingFan.changeSpeed();
    assertEquals(3, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());

    ceilingFan.changeSpeed();
    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());
  }

  @Test
  public void testChangeSpeedReverseDirection() {

    ceilingFan.changeDirection();
    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
  

    ceilingFan.changeSpeed();
    assertEquals(1, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
  

    ceilingFan.changeSpeed();
    assertEquals(2, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());

    ceilingFan.changeSpeed();
    assertEquals(3, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
    

    ceilingFan.changeSpeed();
    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
  }

  @Test
  public void testChangeSpeedAndDirection() {

    ceilingFan.changeDirection();
    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
    
    ceilingFan.changeSpeed();
    assertEquals(1, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
    
    ceilingFan.changeDirection();
    assertEquals(1, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());
    
    ceilingFan.changeSpeed();
    assertEquals(2, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());
    
    ceilingFan.changeDirection();
    assertEquals(2, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
    
    ceilingFan.changeSpeed();
    assertEquals(CeilingFan.MAX_SPEED, ceilingFan.getSpeed());
    assertEquals(Direction.REVERSE, ceilingFan.getDirection());
    
    ceilingFan.changeDirection();
    assertEquals(CeilingFan.MAX_SPEED, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());
    
    ceilingFan.changeSpeed();
    assertEquals(CeilingFan.OFF_SETTING, ceilingFan.getSpeed());
    assertEquals(Direction.FORWARD, ceilingFan.getDirection());    
  }
}
