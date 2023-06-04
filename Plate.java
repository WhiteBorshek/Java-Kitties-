package JavaOOP;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Тарелочка: " + food);
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            System.out.println("Недостаточно еды в тарелке!");
            return false;
        }
    }
}
