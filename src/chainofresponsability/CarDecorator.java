/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

public abstract class CarDecorator implements Car {
   protected Car decoratedCar;

   public CarDecorator(Car decoratedCar){
      this.decoratedCar = decoratedCar;
   }
   
   abstract void startDecorate();
   abstract void endDecorate(); 
   
   @Override   
   public void process(){     
      startDecorate();
      endDecorate();
      decoratedCar.process();
   }	
   
}