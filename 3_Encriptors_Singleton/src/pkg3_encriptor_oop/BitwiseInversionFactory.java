/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_encriptor_oop;

/**
 *
 * @author lenova
 */
public class BitwiseInversionFactory implements IEncriptorsFactory
{

    @Override
    public Encriptors getInstence() {
      return  BitwiseInversion.instance();   
    }

    @Override
    public Encriptors newInstence()
    {
      return new  BitwiseInversion();    
    }
    
}