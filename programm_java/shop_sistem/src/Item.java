public class Item {
    String name;//название предмета
    int price;//цена
    int count;//количетво
   


    public Item(String name, int price, int count) {//конструктор
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {//вывод
        return "item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

}
