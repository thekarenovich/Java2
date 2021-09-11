public class Main{
      
    public static void main(String[] args) {
             
        Employee sam = new Employee("Sam", "Microsoft");
        sam.display();  // Sam
                        // Works in Microsoft
    }
}
class Person {
      
    private String name;
    
    public String getName(){ 
        return name; 
        
    }
      
    public Person(String name){
      
        this.name=name;
    }
   
    public void display(){
          
        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
  
    private String company;
      
    public Employee(String name, String company) {
      
        // вызов род.конструктора, передаваемому name
        // а сам name не наследовался из-за private
        super(name);
        this.company=company;
    }
    
    //@Override
    public void display(){
          
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }
}
