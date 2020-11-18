package com.hama.carcar;

/**
 * @Author: rns
 * @Date: 2020/11/18 下午10:07
 * @Description: Test
 */
public class Test {


  public static void main(String [] args){

    DriverlessCar driverlessCar = new DriverlessCar(4, 4);
    System.out.println("park area is :"+ driverlessCar.getMaxX() +" -- "+driverlessCar.getMaxY());
    driverlessCar.move("NORTH");
    driverlessCar.move("EAST");
    driverlessCar.move("SOUTH");
    driverlessCar.move("NORTH");
    driverlessCar.move("NORTH");
    driverlessCar.move("NORTH");
//    driverlessCar.move("NORTH");
    driverlessCar.move("CLOCKWISE");
    driverlessCar.move("CLOCKWISE");
    driverlessCar.move("CLOCKWISE");
    driverlessCar.move("CLOCKWISE");
    driverlessCar.move("CLOCKWISE");
    driverlessCar.move("CLOCKWISE");


  }

}
