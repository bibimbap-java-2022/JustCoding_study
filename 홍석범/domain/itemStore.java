package bibimbap.test.domain;

import java.util.HashMap;
import java.util.Map;

public class ItemStore {
    private static Map<Integer, Item> store = new HashMap<>(); // item이 저장됩니다.
    private static int sequence = 0; // 이 값을 활용해 item에 id를 부여합니다.

    private int revenue; // 수익

    public ItemStore() {revenue =0;}

    public void addItem(Item item) {
        store.put(sequence, item);
        store.get(sequence).setItemId(sequence);
        sequence = sequence+1;
    }

    public void sellItem(int itemId, int quantity) {
        store.get(itemId).setQuantity(store.get(itemId).getQuantity() - quantity);
        revenue = store.get(itemId).getPrice() * quantity;
    }
    public void fillItem(int itemId, int quantity) {
        store.get(itemId).setQuantity(store.get(itemId).getQuantity() + quantity);
    }
    // 형식에 맞게 현재 보유중인 아이템들을 출력해주세요
    public void printItemList() {
        System.out.println("---itemStore---");
        System.out.println("[itemList]");
        for(int i=0; i<sequence; i++){
            store.get(i).printItem();
        }
        System.out.println("revenue : "+revenue);
    }
}
