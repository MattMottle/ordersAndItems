import java.util.ArrayList;

class Order {
// member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
// constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
// overloaded constructor
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
// order methods
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for(Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item item : items) {
            System.out.printf("%s - $%.2f \n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f \n", getOrderTotal());
    }

// getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean ready() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

