public class Novice {
    private String name;
    private int hp;
    private int exp;
    private int level;
    private int maxexp;
    private Bags bag;
    

    public Novice(String value) {
        this.name = "Vardea";
        this.hp = 100;
        this.exp = 0;
        this.maxexp = 50;
        this.level = 0;
        
    }

    public int levelUp() {
        level = level + 1;       
        return level;

    }

    public int sleep() {
        int sleeps = 0;
        if (sleeps == 5) {
            hp = hp + 5;
        }
        return hp;
    }

    public int killmonster() {
        exp = exp + 10;
        if (exp >= maxexp) {
            this.levelUp();
        }
        hp = hp - 2;
        if (hp <= 0) {
            System.out.println("YOU DIE!!!");
        }
        exp = exp % maxexp;
        return level;
    }

    public int eatherbs() {
        int eatH = 0;
        if (eatH == 5) {
            hp = hp + 1;
        }
        return hp;
    }

    public void addItem(String itemName) {
        this.bag.addItem(itemName);

    }

    public void showItem() {
        this.bag.showItem();
        System.out.println();
    }

}

