class Main {
    public static void main(String[] args) {
       System.out.println("Hola Mundo");
       Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
       car.passenger = 4;
       car.printDataCar();

       Car car2 = new Car("BJJ324", new Account("Gaston Climent", "34762"));
       car2.passenger = 3;
       car2.printDataCar();
    }
}