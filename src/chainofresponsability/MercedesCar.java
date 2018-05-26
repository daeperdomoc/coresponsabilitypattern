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
public class MercedesCar implements Car {

   @Override
   public void process() {
      System.out.println("Brand: Mercedes");
   }
}