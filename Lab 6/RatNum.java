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
    RatNum(int x, int y){
        fraction=x;
        if(fraction==0)
        section=1;
        else
        section=y;
    }

    RatNum(String text, String text0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

public void plus(RatNum r) {
   if(section==r.section){
    fraction+=r.fraction;
    xtreme();
   }
   else {
      Lcm=lcm(section,r.section);
      fraction*=(Lcm/section);
      r.fraction*=(Lcm/r.section);
      fraction+=r.fraction;
      section=Lcm;
      xtreme();
   }
}
public void multiply(RatNum r){
    fraction*=r.fraction;
    section*=r.section;
    xtreme();
}

public void xtreme(){
    Gcd=gcd(fraction,section);
    if(fraction%Gcd==0&&section%Gcd==0){
    fraction/=Gcd;
    section/=Gcd;
    }
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
        if(fraction==section||(section==1&&fraction!=0)) return 1+" ";
        else return fraction+"/"+section;
    }

    @Override
     public boolean equals(Object obj){
        RatNum h = (RatNum)obj;
        if((fraction==h.fraction)&&(section==h.section))
          return true;
        else 
           return false;
    }

}
