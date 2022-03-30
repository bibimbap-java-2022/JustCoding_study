import java.util.HashMap;
import java.util.Map;

public class ItemStore {
    private static Map<Integer, Item> store = new HashMap<>();
    private static int sequence = 0;

    private int revenue;

    public ItemStore() {
        revenue = 0;
    }

    public void addItem(Item item) {
        item.setItemId(sequence);
        store.put(item.getItemId(), item);
        sequence++;
    }

    public void sellItem(int itemId, int quantity) {
        revenue += store.get(itemId).getPrice() * quantity;
        int temp = store.get(itemId).getQuantity();
        store.get(itemId).setQuantity(temp - quantity);
    }

    public void fillItem(int itemId, int quantity) {
        int temp = store.get(itemId).getQuantity();
        store.get(itemId).setQuantity(temp + quantity);
    }

    public void printItemList() {
        System.out.println("---itemStore---");
        System.out.println("[itemList]");
        for(int i = 0; i < sequence; i++){
            store.get(i).printItem();
        }
        System.out.println("revenue : " + revenue);
    }
}
