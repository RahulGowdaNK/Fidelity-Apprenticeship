class Person{
    private String Name;

    public String Gender;
    public int Age;

    public Person(String Name, String Gender, int Age){
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;

    }
    public String getName(){
        return Name;


    }
    public void setName(String Name){
        this.Name = Name;

    }
    public void display(){
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Age: " + Age);

    }
    public static void main(String[] args){
        Person person = new Person("Mike", "Male", 30);
        person.display();
        person.setName("Mike");
        person.display();
    }
}
