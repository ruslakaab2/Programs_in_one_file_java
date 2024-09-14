import java.sql.SQLOutput;

public class Person {
    String name;
    int age;
    String number;
    int money;
    int zaplata;

    public Person(String name, int age, String number,int money,int zaplata) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.money= money;
        this.zaplata=zaplata;
    }

    public void zaplata() {
        this.money += zaplata;
        System.out.println(name+" пришла заплата в размере "+ zaplata+" теперь у него "+ money);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", money=" + money +
                '}';
    }
    public void buy_item(Item item){
        String result="";
        if (item.count<=0){
            result="товара нет в наличии";
        } else if (money- item.price>=0) {
            this.money=money-item.price;
            item.count-=1;
            result=name+" приобрел себе "+ (String)item.name+ " по цене " + item.price +" и у него осталось "+money;


        }else{
            result=name+" не смог приобрести себе "+ (String)item.name+ " по цене " + item.price +" так как у него "+money;
        }
        System.out.println(result);


    }

}
