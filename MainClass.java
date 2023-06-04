package JavaOOP;

public class MainClass {
    public static void main(String[] args) {
        Plate plate1 = new Plate(10);
        Plate plate2 = new Plate(20);
        Plate plate3 = new Plate(8);
        Cat cat1 = new Cat("Филя", 10, plate1);
        Cat cat2 = new Cat("Мурка", 15, plate2);
        Cat cat3 = new Cat("Бааарсик", 10, plate3);

        plate1.info();  // Выводим информацию о тарелке 1
        plate2.info();  // Выводим информацию о тарелке 2
        plate3.info();  // Выводим информацию о тарелке 3
        cat1.eat();    // Филя пытается поесть
        cat2.eat();    // Мурка пытается поесть
        cat3.eat();    // Бааарсик пытается поесть

        System.out.println("Филя сыт? " + cat1.isSatiety());
        System.out.println("Мурка сыта? " + cat2.isSatiety());
        System.out.println("Бааарсик накушался? " + cat3.isSatiety());
    }
}