import java.sql.SQLOutput;

public class Person {
    String name;//имя
    int age;//возраст
    String number;//номер телефона
    int money;//количество денег
    int zaplata;//заплата

    public Person(String name, int age, String number,int money,int zaplata) {//конструктор
        this.name = name;
        this.age = age;
        this.number = number;
        this.money= money;
        this.zaplata=zaplata;
    }

    public void zaplata() {//вывод заплаты 
        this.money += zaplata;
        System.out.println(name+" пришла заплата в размере "+ zaplata+" теперь у него "+ money);//вывод в терминал баланс человека

    }

    @Override
    public String toString() {//вывод
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", money=" + money +
                '}';
    }
    public void buy_item(Item item){//покупка предметов
        String result="";
        if (item.count<=0){//проверка на наличие предмета
            result="товара нет в наличии";
        } else if (money- item.price>=0) {//проверка на наличие денег
            this.money=money-item.price;
            item.count-=1;
            result=name+" приобрел себе "+ (String)item.name+ " по цене " + item.price +" и у него осталось "+money;//вывод кто купил за сколько и соклько осталось


        }else{
            result=name+" не смог приобрести себе "+ (String)item.name+ " по цене " + item.price +" так как у него "+money;//
        }
        System.out.println(result);


    }

}
