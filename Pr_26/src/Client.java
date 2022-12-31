import java.util.HashMap;

public class Client {
    private final HashMap<String, Integer> Bill;

    public Client(){
        this.Bill = new HashMap<>();
    }

    public void setBill(String product, int price){
        Bill.put(product, price);
    }

    public HashMap<String, Integer> getBill(){
        return Bill;
    }
}
