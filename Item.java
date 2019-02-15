public class Item {
    private String name;
    private int hp;
    private int exp;
   private String pet;
    private String water;
    private String icecream;
    private String drug;

    public Item(String name) {
        this.name = name;
       if (this.name.equals("pet")) {
            hp = 0;
            exp = 0;
        } else if (this.name.equals("water")) {
            exp = 0;
            hp = 30;
        } else if (this.name.equals("icecream")) {
            hp = 0;
            exp = 30;
        } else if (this.name.equals("drug")) {
            exp = 25;
            hp = 50;
        }
    }

    public void showName() {

        System.out.println();
        System.out.println("Name : " + this.name);
        System.out.println("Hp : " + this.hp);
        System.out.println("Exp : " + this.exp);
        System.out.println();
    }
}