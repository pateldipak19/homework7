public class Person {

    String firstName ;
    String lastname;
    int age;

    public String getFirstName() {

        return firstName;
    }
    public String getLastname(){

        return lastname;
    }
    public int getAge(){

        return age;
    }

    public String setFirstNAme(String setFName){
        this.firstName=setFName;
        return setFName;
    }
    public String setLastName(String setLName){
        this.lastname=setLName;
        return setLName;
    }
    public int setAge(int sa) {
        this.age = sa;
        if (sa == 0 || sa > 100) { sa = 0; }
        return sa;
    }
    public boolean isTeen (){
        boolean a;

        if (age>12 && age<20){
            a=true;
        }else {
            a = false;
        }
        return a;
    }

    public String getFullName(){

        //fullN = firstName+""+lastname;
        if (firstName==null && lastname==null){
            return "";
        }else if (firstName==null && lastname!=null){
            return lastname;
        }else if (firstName!= null && lastname==null){
            return firstName;
        }else {
            String fullN = firstName.concat(lastname);
            return fullN;
        }
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
