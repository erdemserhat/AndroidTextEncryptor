package com.example.rsa.crypto;
import java.math.BigInteger;
public class Rsa {
  private int securityLevel;
  //Aggregation relationship with RsaCore class.
  private RsaCore rsaCore; 
  
 
  
  public Rsa(){
             rsaCore= new RsaCore(100,200);

      }


  
  public int encrypt(int message){
   
  BigInteger chiperText=rsaCore.encrypt(BigInteger.valueOf(message));
  String strC=chiperText.toString();
  return Integer.parseInt(strC);
  }
  
  
  public int decrypt(int chiperText){
   
  BigInteger message=rsaCore.decrypt(BigInteger.valueOf(chiperText));
  String strM=message.toString();
  return Integer.parseInt(strM);
  }
  

    
    
}
