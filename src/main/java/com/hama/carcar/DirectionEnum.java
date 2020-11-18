package com.hama.carcar;

/**
 * direction/command enum for the car,
 */
public enum DirectionEnum {

  CLOCKWISE(0, 0, 0, 1),
  COUNTERCLOCKWISE(0, 0, 0, -1),
  NORTH(0, 1, 1, 0),
  EAST(1, 0, 2, 0),
  SOUTH(0, -1, 3, 0),
  WEST(-1, 0, 4, 0);

  private int x;  // move in x
  private int y;  // move in y

  private int seq;  // direction sequence, easier to recalculate new direction
  private int turn; // apply for the clockwise and counterclockwise, without move x or y, just change the direction of the car


  DirectionEnum(int x, int y, int seq, int turn) {
    this.x = x;
    this.y = y;
    this.seq = seq;
    this.turn = turn;
  }

  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }
  public int getTurn(){
    return this.turn;
  }
  public int getSeq(){
    return this.seq;
  }

  /**
   * after turn the direction, will recalculate the car direction
   * using the new seq value to retrieve new Direction Enum
   *
   * check the boundary before refresh the car direction
   * @param seq
   * @return
   */
  public static DirectionEnum getDirectionAfterTurn(int seq) {
    int realSeq = seq%4 == 0 ? 4:seq%4;
    for (DirectionEnum value : DirectionEnum.values()) {
      if(value.seq == realSeq) {
        return value;
      }
    }
    return null;
  }
}
