package com.hama.carcar;

/**
 * @Author: rns
 * @Date: 2020/11/18 下午9:51
 * @Description: Car
 */
public interface Car {

  void move(String command);

  int getPositionX();

  int getPositionY();

  String getOrientation();
}
