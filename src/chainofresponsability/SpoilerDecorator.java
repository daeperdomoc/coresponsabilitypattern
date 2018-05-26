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
public class SpoilerDecorator extends CarDecorator {
      public SpoilerDecorator(Car decoratedCar) {
      super(decoratedCar);		
   }

   @Override
   void startDecorate() {
      System.out.println("Puting deluxe Spoiler Started. ");
   }
   @Override
   void endDecorate() {
      System.out.println("Puting deluxe Spoiler Finished. ");
   }
   @Override
   public void process() {
      startDecorate();
      endDecorate();
      decoratedCar.process();	       
      setSpoiler(decoratedCar);
   }

   private void setSpoiler(Car decoratedCar){
      System.out.println("Spoiler type: Deluxe");
   }
    
}
