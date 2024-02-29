/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

/**
 *
 * @author CS-KU
 */


public class RatNum {
    public int fraction,section,Gcd,Lcm;

    RatNum(int x, int y) {
        fraction=x;
        if(fraction==0)
        section=1;
        else
        section=y;
    }

public void plus(RatNum r) {
   if(section==r.section){
    fraction+=r.fraction;
    Gcd=gcd(fraction,section);
    fraction/=Gcd;
    section/=Gcd;
   }
   else {
      Lcm=lcm(section,r.section);
      fraction*=(Lcm/section);
      r.fraction*=(Lcm/r.section);
      fraction+=r.fraction;
      section=Lcm;
      Gcd=gcd(fraction,section);
      fraction/=Gcd;
      section/=Gcd;
   }
}
public void multiply(RatNum r){
    fraction*=r.fraction;
    section*=r.section;
    Gcd=gcd(fraction,section);
    fraction/=Gcd;
    section/=Gcd;
}

    public static int gcd(int a, int b) {
          if (b > a) return gcd(b, a);
          return (a % b == 0) ? b : gcd(a, a % b);
        }

    public static int lcm(int a, int b) {
          return ((a * b) / gcd(a, b));
        }



    @Override
    public String toString(){
        return fraction+"/"+section;
    }    
    @Override
     public boolean equals(Object obj){
        RatNum h = (RatNum)obj;
        if((fraction==h.fraction)&&(section==h.section)){
          return true;
        }
        else{ 
           return false;
        }
    }

}
