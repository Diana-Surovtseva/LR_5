package current;

 class Engineer extends Employee {
    Engineer(String name, String position, String telephone) {
        super(name, position, telephone);
    }

     @Override
     public String toString() {
         //return super.toString();
         return "Engineer details: " + name + " " + position+" "+telephone;

     }
     @Override
     public void doWork(){
         System.out.println("I write java-program");
     }
 }
