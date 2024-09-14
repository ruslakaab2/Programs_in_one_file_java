import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person hh= new Person("noname",15,"71998234345",50,1500);
        Item jj=new Item("Cola",50,5);
        hh.buy_item(jj);//покупка предмета 
        hh.zaplata();//заплата
        hh.buy_item(jj);//покупка предмета
        
    }

}





