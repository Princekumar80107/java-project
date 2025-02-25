package OOPs;

public class HondaCity {
    public static void main(String[] args) {
        // instance

        // class_name object_name = new class_name();
        Car hondaCity = new Car(); // new keyword is used to dynamically allocate memory in the heap

        hondaCity.color = "White";
        hondaCity.noOfWheels = 4;

//        System.out.println(hondaCity.color);
//        System.out.println(hondaCity.noOfWheels);
        hondaCity.accelerate();
        hondaCity.brake();

        Car bmw = new Car();
        bmw.color = "Black";
        bmw.noOfWheels = 8;

//        System.out.println(bmw.color);
//        System.out.println(bmw.noOfWheels);

    }
}
