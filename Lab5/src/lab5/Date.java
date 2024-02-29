/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author CS-KU
 */
public class Date {
    private int countDay=1,countMonth=0;
    private final String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

   public void next(){
    if((countDay>=31&&(countMonth==0||countMonth==2||countMonth==4||countMonth==6||countMonth==7||countMonth==9||countMonth==11))||(countDay>=30&&(countMonth==3||countMonth==5||countMonth==8||countMonth==10))||(countDay>=28&&countMonth==1)){
          countDay=1;
          ++countMonth;
          if(countMonth>11)
               countMonth=0;
          }
       else
       ++countDay;
    }
    @Override
    public String toString(){
        return countDay+" "+month[countMonth];
    }
    
}
