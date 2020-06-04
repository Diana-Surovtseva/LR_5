package current;
//class - is a description of the future logic
public class Employee {
//field - is a data
    protected String name = "";
    protected String position = "";
    protected String telephone = "";

//Constructor - data initialization
     Employee(String name, String position, String telephone) {
        this.name = name;
        this.position = position;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Employee details: " + name + " " + position + " " + telephone;
        //return super.toString();
        }
    public void doWork(){
        System.out.println("I am working");
    }
}


