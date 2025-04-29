public class Villain {
    private String name;
    private int evilLevel;

    public Villain(String name, int evilLevel) {
        this.name = name;
        this.evilLevel = evilLevel;
    }

    public void attack() {
        System.out.println(name + " lanza un ataque malvado!");
    }

    public void showEvilLevel() {
        System.out.println(name + " tiene un nivel de maldad de " + evilLevel);
    }
}