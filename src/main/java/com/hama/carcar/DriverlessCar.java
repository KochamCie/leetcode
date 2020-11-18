package com.hama.carcar;

/**
 * @Author: rns
 * @Date: 2020/11/18 下午9:43
 * @Description: DriverlessCar
 */
public class DriverlessCar implements Car {

  private int x = 1;
  private int y = 1;
  private DirectionEnum direction = DirectionEnum.NORTH;

  private int maxX;
  private int maxY;


  @Override
  public void move(String command) {

    int originX = this.x, originY = this.y;
    DirectionEnum originDirection = this.direction;
    DirectionEnum commandDirectionEnum = DirectionEnum.valueOf(command);
    this.checkBoundary(commandDirectionEnum);
    // after every move , check the boundary and print the log
    int moveX = commandDirectionEnum.getX();
    int moveY = commandDirectionEnum.getY();
    int seq = commandDirectionEnum.getSeq();
    int turn = commandDirectionEnum.getTurn();
    this.x += moveX;
    this.y += moveY;
    // check the boundary, if break the rule no need to set new direction of the car
    this.checkBoundary(commandDirectionEnum);

    // update the direction
    DirectionEnum currentDirection = DirectionEnum.valueOf(this.getOrientation());
    int targetSeq = commandDirectionEnum.getSeq() == 0 ? currentDirection.getSeq():commandDirectionEnum.getSeq();
    DirectionEnum newDirection = DirectionEnum.getDirectionAfterTurn(targetSeq + turn);
    this.direction = newDirection;
    this.reportPosition(commandDirectionEnum, originX, originY, originDirection);
  }

  @Override
  public int getPositionX() {
    return this.x;
  }

  @Override
  public int getPositionY() {
    return this.y;
  }

  @Override
  public String getOrientation() {
    return this.direction.name();
  }

  public int getMaxX() {
    return this.maxX;
  }

  public int getMaxY() {
    return this.maxY;
  }

  public DriverlessCar(int maxX, int maxY) {
    this.maxX = maxX;
    this.maxY = maxY;
  }

  public void reportPosition(DirectionEnum directionEnum, int originX, int originY, DirectionEnum originDirection) {
    System.out.println(".......");
    System.out.println("Driverless car receives Command [" + directionEnum.name() + "] ...");
    System.out.println("Driverless car previous position X:[" + originX + "], Y:[" + originY + "], Direction:[" + originDirection + "]");
    System.out.println("Driverless car .current position X:[" + this.x + "], Y:[" + this.y + "], Direction:[" + this.direction + "]");
    System.out.println(".......");
  }

  public void checkBoundary(DirectionEnum directionEnum) {
    if (this.x < 1 || this.y < 1) {
      throw new RuntimeException("wrong position/direction for the command:" + directionEnum);
    }

    if (this.x > 4 || this.y > 4) {
      throw new RuntimeException("wrong position/direction for the command:" + directionEnum);
    }
  }
}
