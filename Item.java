public class Item {
    private String name;
    private String herb;
    private String sword;
    private String amor;
    private int attack;

    public Item(String name) {
        this.name = name;
        if (this.name.equals("sword")) {

            attack = 10; // attackmonstor
        }
    }

    }

    public void showName() {

        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("attack: " + this.attack);
    }
