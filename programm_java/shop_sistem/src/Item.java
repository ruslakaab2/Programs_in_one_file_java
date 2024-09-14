public class Item {
    String name;
    int price;
    int count;
    boolean sell;


    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public void minus_Count() {
        this.count -=1;
    }
}
