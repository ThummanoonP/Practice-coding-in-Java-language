/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_09;

/**
 *
 * @author HeartLess
 */
public class Controller {
    public static String list(int money){
        String list = "";
        int thousand ,fiveHundred ,hundred ,fifty ,twenty ,ten ,five ,two ,one;
        
        thousand = ThousandExchange.thousandExchange(money);
        if (thousand > 0){
            list = list+"ธนบัตร1000"+"\t"+String.valueOf(thousand)+"\t"+"ใบ"+"\n";
        }
        fiveHundred = FiveHundredExchange.fiveHundredExchange(money);
        if (fiveHundred > 0){
            list = list+"ธนบัตร500"+"\t"+String.valueOf(fiveHundred)+"\t"+"ใบ"+"\n";
        }
        hundred = HundredExchange.hundredExchange(money);
        if (hundred > 0){
            list = list+"ธนบัตร100"+"\t"+String.valueOf(hundred)+"\t"+"ใบ"+"\n";
        }
        fifty = FiftyExchange.fiftyExchange(money);
        if (fifty > 0){
            list = list+"ธนบัตร50"+"\t"+String.valueOf(fifty)+"\t"+"ใบ"+"\n";
        }
        twenty = TwentyExchange.TwentyExchange(money);
        if (twenty > 0){
            list = list+"ธนบัตร20"+"\t"+String.valueOf(twenty)+"\t"+"ใบ"+"\n";
        }
        ten = TenExchange.tenExchange(money);
        if (ten > 0){
            list = list+"เหรียญ10"+"\t"+String.valueOf(ten)+"\t"+"เหรียญ"+"\n";
        }
        five = FiveExchange.fiveExchange(money);
        if (five > 0){
            list = list+"เหรียญ5"+"\t"+String.valueOf(five)+"\t"+"เหรียญ"+"\n";
        }
        two = TwoExchange.twoExchange(money);
        if (two > 0){
            list = list+"เหรียญ2"+"\t"+String.valueOf(two)+"\t"+"เหรียญ"+"\n";
        }
        one = OneExchange.oneExchange(money);
        if (one > 0){
            list = list+"เหรียญ1"+"\t"+String.valueOf(one)+"\t"+"เหรียญ"+"\n";
        }       
        return list;
    }   
}
