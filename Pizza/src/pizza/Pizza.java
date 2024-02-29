/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza;


public class Pizza {
    private int price=100,count=0,con=0;
    private boolean[] index = new boolean[Topping.values().length] ;
    private String pizza="The topping of this pizza ",x="";
    public enum Topping {
        Ham, Cheese, Pepperoni, Pineapple, Sausage, Bacon
    }
    public void addTopping(Topping t) {
        for(int i=0;i<Topping.values().length;i++){
            if(t==Topping.values()[i]){
                con=i;
                break;
            }
        }
            if(t==Topping.values()[con]){
               if(index[con]==false){
                   price+=10;
                    count++;
               }
               index[con]=true;
            }
            else
               index[con]=false;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        con=0;
        if(count==1) pizza="The topping of this pizza is ";
        else pizza="The toppings of this pizza are ";
        if(count==0)
        return "This pizza has no toppings";
        else {
            for(int i=0;i<Topping.values().length;i++)
            {
                if(index[i]==true){
                  if(con>0) x=x+", "+Topping.values()[i].name();
                  else x+=Topping.values()[i].name();
                  con++;
                }
            }
        return pizza+=x.toLowerCase();
        }
    }
}
