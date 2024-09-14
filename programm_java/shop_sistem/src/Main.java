import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person hh= new Person("тимур",15,"71998234345",50,1500);
        Item jj=new Item("чипсы",1500,5);
        hh.buy_item(jj);
        hh.zaplata();
        hh.zaplata();
        hh.zaplata();
        hh.buy_item(jj);
        hh.buy_item(jj);
        hh.buy_item(jj);

    }

}





