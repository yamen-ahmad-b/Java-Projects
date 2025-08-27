
public class Main {
    public static void main(String[] args) {


Car Toyota = new Car();
Toyota.make="Toyota";
Toyota.model ="Elantra";
Toyota.color="black";
Toyota.year= 2025;
Toyota.price =23025;

        Car nissan = new Car();
        nissan.make="nissan";
        nissan.model ="Pathfinder";
        nissan.color="red";
        nissan.year= 2025;
        nissan.price =38000;

nissan.start();
nissan.stop();
Toyota.start();
Toyota.stop();
nissan.showInfo();
Toyota.showInfo();



        }
    }

