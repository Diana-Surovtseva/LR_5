package current;

public class Manager extends Employee{
    Manager(String name, String position, String telephone) {
        super(name, position, telephone);
    }

    @Override
    public String toString() {
        return ("Manager details: " + name + " " + position+" "+telephone);
    }
    @Override
    public void doWork(){
        System.out.println("I am planning");
}
}

