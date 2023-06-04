package JavaOOP;

public class Cat {
    private String name;
    private int appetite;
    private Plate plate;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public Cat(String name, int appetite, Plate plate) {
        this.name = name;
        this.appetite = appetite;
        this.plate = plate;
        this.satiety = false;
    }

    public void eat() {
        if (plate != null) {
            if (plate.decreaseFood(appetite)) {
                System.out.println(name + " поел(а)!");
                satiety = true;
            } else {
                System.out.println(name + " не может поесть, в тарелке недостаточно еды!");
            }
        } else {
            System.out.println("Тарелка не определена для " + name);
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
