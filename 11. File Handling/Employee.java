/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filing;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
class Employee implements Serializable{
    String name;
    int age;
    Employee(String n, int a){
        name =n;
        age = a;
    }
}