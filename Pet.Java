public class Pet{
    private String name;
    private String age;

    public Pet(){
        name = "";
        age = "";
    }

    public Pet(String aName, String anAge){
        name = aName;
        age = anAge;
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String anAge){
        age = anAge;
    }

    public String toString(){
        return "Hi my name is" + name;
    }

    public static void main(String[] args){
        Pet pet1 = new Pet("Lucy", "5");
        Pet pet2 = new Pet();

        pet2.setAge("2");
        pet2.setName("Chloe");

        System.out.println("Woof! My name is " + pet1.getName() + "and i am " + pet1.getAge() + " years old.");
    }

}