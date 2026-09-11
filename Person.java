public class Person {
    private String name, email;
    private int age;

    Person(String n, int a, String e){
        name = n;
        age = a;
        email = e;
    }

    Person(){
    }

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setEmail(String e){
        email = e;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public String getEmail(){
        return email;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + name);
        System.out.println("Email: " + name);
    }
}
