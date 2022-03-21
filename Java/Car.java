class Car {
    Integer id;
    String license;
    Account Driver;
    Integer passenger;
    
    public Car(String license, Account Driver) {
        this.license = license;
        this.Driver = Driver;
    }


    void printDataCar () {
        System.out.println("Licence: " + license  + " Name Driver: " + Driver.name);
    }
}
