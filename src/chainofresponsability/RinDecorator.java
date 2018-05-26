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
public class RinDecorator extends CarDecorator {

   public RinDecorator(Car decoratedCar) {
      super(decoratedCar);		
   }

   @Override
   void startDecorate() {
      System.out.println("Puting deluxe rin Started. ");
   }
   @Override
   void endDecorate() {
      System.out.println("Puting deluxe rin Finished. ");
   }
   @Override
   public void process() {
      startDecorate();
      endDecorate();
      decoratedCar.process();	       
      setRin(decoratedCar);
   }

   private void setRin(Car decoratedCar){
      System.out.println("Rin type: Deluxe");
   }
}