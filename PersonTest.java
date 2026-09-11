public class PersonTest {
    public static void main(String args []){

        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Charlie");
        person2.setName("Anthony");
        person1.setAge(17);
        person2.setAge(16);
        person1.setEmail("barra.charles@student.ccm.edu");
        person2.setEmail("guttridge.anthony@student.ccm.edu");
        
        System.out.println("Person 1 Info: ");
        person1.displayInfo();
        System.out.println("Person 2 Info: ");
        person2.displayInfo();
    }
}
