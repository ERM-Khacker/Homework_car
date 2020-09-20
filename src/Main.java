public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Body body = new Body();
        Body body1 = new Body();
        Body body2 = new Body();
        Engine engine = new Engine();
        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        Transmission transmission = new Transmission();
        Transmission transmission1 = new Transmission();
        Transmission transmission2 = new Transmission();
        car.setBrand("Tesla");
        car.setModel("Model 3");
        car.setPrice(50000);
        body1.setColour("White");
        body1.setType("Sedan");
        engine1.setType("Electric motor");
        engine1.setPower(258);
        transmission1.setType("1");
        transmission1.setGear("Automatic");
        System.out.println(car + " " + body1 + " " + engine1 + " " + transmission1);

        car1.setBrand("Alfa Romeo");
        car1.setModel("Giulia");
        car1.setPrice(47093);
        body2.setType("Sedan");
        body2.setColour("Red");
        engine2.setType("internalCombustionEngine");
        engine2.setPower(510);
        transmission2.setType("V8");
        transmission2.setGear("Automatic");
        System.out.println(car1 + " " + body2 + " " + engine2 + " " + transmission2);

        car2.setBrand("Aston Martin");
        car2.setModel("Vantage");
        car2.setPrice(166132);
        body.setType("Sedan 2+0");
        body.setColour("Gray");
        engine.setType("internalCombustionEngine");
        engine.setPower(503);
        transmission.setType("V8");
        transmission.setGear("Mechanic");
        System.out.println(car2 + " " + body + " " + engine + " " + transmission);
        car2.setPrice(car2.getPrice() + 2000); //повышаем цену на 2000
        System.out.println(car2);
        body.setColour("Blue");// перекрашиваем авто
        System.out.println(body);
        engine.setPower(engine.getPower() * 120 / 100); // повышаем мощность двигателя на 20%
        System.out.println(engine);
        body.setType("Pickup");// меняем тип кузова
        System.out.println(body);
        System.out.print(transmission.getGear());
        transmission.setGear(", Automatic"); // т.к. это тип данных стринг то меняем значение передачи через сет
        System.out.println(transmission.getGear());


    }
}
