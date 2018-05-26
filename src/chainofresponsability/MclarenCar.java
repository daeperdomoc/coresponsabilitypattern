/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author daeperdomocr
 */
public class MclarenCar implements Car {
   private static MclarenCar instance = new MclarenCar();
   //make the constructor private so that this class cannot be
   //instantiated
   private MclarenCar(){}
   //Get the only object available
   public static MclarenCar getInstance(){
      return instance;
   }
   @Override
   public void process() {
      System.out.println("Brand: Mclaren");
   }
}
