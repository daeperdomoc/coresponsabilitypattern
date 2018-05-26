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
public class CarFactory {
   public Car getCar(String carType){
      if(carType == null){
         return null;
      }		
      if(carType.equalsIgnoreCase("AUDI")){
         return new AudiCar();
         
      } else if(carType.equalsIgnoreCase("MERCEDES")){
         return new MercedesCar();         
      } else if(carType.equalsIgnoreCase("MCLAREN")){
         MclarenCar object = MclarenCar.getInstance();
         return object;
      }
      
      return null;
   }   
}
