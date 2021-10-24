package JPA.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {


    //This is the primary key
    @Id
    int id;
    String name;
    int age;
    public Person(){

    }
       public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return id+" "+name+" "+age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
