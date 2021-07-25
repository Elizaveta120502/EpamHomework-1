package com.epam.jwd.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.jwd.app.MyMath;
 public class ArrClass { 
 private static final Logger LOG = LogManager.getLogger(ArrClass.class);

 public static void main(String args[]){
 LOG.trace("Program start");
  if (args.length < 4){
  LOG.error("Not enough arg");
return;
 }
  int a = Integer.valueOf(args[0]);
  int b = Integer.valueOf(args[1]);
  int c = Integer.valueOf(args[2]);
  int d = Integer.valueOf(args[3]);

  int res = MyMath.fractionSum(a,b,c,d);
  
  LOG.info("Res= " , res);
  LOG.trace("Program end");
}
}