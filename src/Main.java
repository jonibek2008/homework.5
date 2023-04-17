public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtectType("Shield");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss protect type: " + boss.getProtectType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " "
                    + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero mag = new Hero(250, 20, "magic");
        Hero bowman = new Hero(150, 30);
        Hero swordsman = new Hero(200, 25);
        Hero[] allHeroes = {mag, bowman, swordsman};
        return allHeroes;
    }
}