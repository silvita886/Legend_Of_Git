public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " ataca con su espada!");
    }
}