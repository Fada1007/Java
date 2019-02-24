public class Item {
    private String name;
    private String herb;
    private String sword;
    private String knife;
    private int hp;
    private int mana;
    private int attack;
    
    public Item(String value) {
        this.name = name;

        if(this.name.equals("sword")){
            this.attack = 15;
        }
        if(this.name.equals("knife")){
            this.attack = 10;
        }
        if(this.name.equals("herb")){
            this.mana = 10;
            this.hp = 10;
        }
    }

    public void showName() {
        System.out.println("Name : " + this.name);
        System.out.println("Hp : " + this.hp);
        System.out.println("Mana : " + this.mana);
        System.out.println("Attack : " + this.attack);
    }

    class Bluesword extends Item{

        private int hp;

        public int Attack(){
            hp = hp + 20;
            return hp;
        }
    }

    class PooPooHat extends Item{
        private int hp;

        public int wearHat(){
            hp = hp + 20;
            return hp;
        }
    }
        
}




