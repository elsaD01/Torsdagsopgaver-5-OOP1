package Task1;


public class Driver {

    private String name;
    private int age;

    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString() { return " is driven by "+name+ ", age"+age;}

    public static void main(String[] args)
    {
        Driver driver = new Driver("Maja", 20);
        Car car = new Car("Audi", "A4", 2011, "mellembil");

        System.out.println(driver);
        System.out.println(car);



    }
}






