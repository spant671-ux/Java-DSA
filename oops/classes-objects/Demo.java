public class Demo{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Grey";
        System.out.println(car1.brand);
        System.out.println(car1.color);
    }
}

class Car{
    String brand;
    String color;

    void drive(){
        System.out.println("Driving the car");
    }
}

// Car is a class.
// Brand and color -> Properties of the car
// drive() -> method