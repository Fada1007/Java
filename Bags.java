import java.util.ArrayList;

public class Bags {
    private ArrayList<Item> items;
    private int limit;

    public Bags() {
        items = new ArrayList<Item>();
        limit = 10;
    }

    public void addItem(String name) {
        if(name.equals("Bluesword")){
           this.items.add(new Bluesword(name));
        }
        else if(name.equals("PooPooHat")){
            this.items.add(new PooPooHat(name));
         }
        
    }

    public void showItem() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).showName();
        }
    }

}