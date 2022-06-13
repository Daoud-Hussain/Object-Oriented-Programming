
import java.io.Serializable;

class Employee implements Serializable{
    String name;
    int age;
    Employee(String n, int a){
        name =n;
        age = a;
    }
}