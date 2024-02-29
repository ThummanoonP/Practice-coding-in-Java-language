/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_29;


/**
 *
 * @author HeartLess
 */
public class LAB_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] employee = new Employee[4];
        int check=0;
        
        for(int m = 0;m<4;m++){
            employee[m] = new Employee();
            employee[m].employeeID = m+1;
            for(int n = 0;n<5;n++){
                employee[m].product[n].productID =n+1;
                for(int k = 0;k<6;k++){
                    employee[m].product[n].volumePerMonth[k] =((int)( Math.random( ) * 100 ))*1000;
                    System.out.print(employee[m].product[n].volumePerMonth[k]+"\t");
                    
                }
                //System.out.print("Total = "+employee[m].product[n].totalVolume()+"\t");
                //System.out.print("\n");    
            }
            //System.out.print("\n");
        }
        for (int n=0 ; n<5 ; n++){
            check = 0;
            for(int m=0 ;m<4 ; m++){
                if(employee[check].product[n].totalVolume() <= employee[m].product[n].totalVolume()){
                    check = m;
                }
            }
            System.out.print(employee[check].employeeID+" employees have a total of 6 months selling the highest type of products "+employee[check].product[n].productID +"\n");
        }
        
        for(int m = 0;m<5;m++){
            for(int n = 0; n<6 ; n++){
                check = 0;
                for(int k = 0;k<4;k++){
                    check += employee[k].product[m].getVolumePerMonth(n);
                }
                System.out.print(" Product type "+(m+1)+" has total sales in month "+(n+1) +"  =  "+check+"\n");
            }
        }
        
    
    }
    
    
}
