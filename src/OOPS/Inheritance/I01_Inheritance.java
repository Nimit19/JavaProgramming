package OOPS.Inheritance;

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
        Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }
}
public class I01_Inheritance {
    public static void main(String[] args) {
            Surname fname = new Surname();
            fname.setName("Nimit");
            fname.setSurname("Patel");
            System.out.println("Name : " + fname.getName() + " " + fname.getSurname());
    }
}
