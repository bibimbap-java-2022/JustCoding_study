package bibimbap.test.domain;

public class Item {
    private int itemId;
    private String itemName;
    private int price;
    private int quantity;

    // itemName, price, quantity : 생성자에서 초기화해주세요
    public Item(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // itemId, price, quantity 에 대한 getter/setter를 생성해주세요
    public int getItemId() {
        return itemId;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // item 정보를 출력해주세요
    public void printItem() {
        System.out.printf("[%d] %s : ₩%d / %dea\n", itemId, itemName, price, quantity);
    }
}
