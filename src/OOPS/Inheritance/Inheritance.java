package Inheritance;

class Name{
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
class Surname extends Name{
    public String Surname;

    public void setSurname(String surname){
        Surname=surname;
    }

    public String getSurname() {
        return Surname;
    }
}
public class Inheritance {
    public static void main(String[] args) {
            Surname fname = new Surname();
            fname.setName("Methods_Examples");
            fname.setSurname("patel");
            System.out.println("Name : " + fname.getName() + " " + fname.getSurname());
    }
}
