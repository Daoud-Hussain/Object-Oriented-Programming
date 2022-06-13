import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOperation{

    public void writeAFile(Employee s){
        try {
            File f = new File("Employee.ser");
            if(f.exists()){
                MyObjectOutputStream myObject = new MyObjectOutputStream(new FileOutputStream(f, true));
                myObject.writeObject(s);
                myObject.close();
            }else{
                ObjectOutputStream myObject = new ObjectOutputStream(new FileOutputStream(f));
                myObject.writeObject(s);
                myObject.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readAFile(){
        try {
            ObjectInputStream redFile = new ObjectInputStream(new FileInputStream("Employee.ser"));
            try {
                while(true){
                    Employee s = (Employee) redFile.readObject();
                    System.out.println(s.toString());
                }
            }catch (ClassNotFoundException e) {
                System.out.println("Object not found");
            }catch(EOFException e){
                System.out.println("End of file");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found ");
        }
        catch(IOException e){
            System.out.println("some error occured");
        }
    }
    public void updateJob(String name, String designation, double salary){
        try{
            ArrayList<Employee> list = new ArrayList<Employee>();
            boolean flag = false;
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Employee.ser"));
            try {
                while(true){
                    Employee s = (Employee) obj.readObject();
                    if(s.getname().equals(name)){
                        s.setDesignation(designation);
                        s.setSalary(salary);
                        flag = true;
                    }
                    else{
                        System.out.println("No such employee present");
                    }
                    list.add(s);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Sorry! the targetted file is not found\n");
            }
            catch(IOException e){
                System.out.println("Couldn't perform the task due to some error\n");
            }
            catch(ClassNotFoundException e){
                System.out.println("Sorry! the targetted class is not found\n");
            }
            
            try {
                File f = new File("Employee.ser");
                f.delete();
                for(int i = 0; i<list.size(); i++){
                    writeAFile(list.remove(i));
                }
            }
            catch (Exception e) {
                System.out.println("Some error occured");
            }

        }
        catch(IOException e){
            System.out.println("Input output Exception occured");
        }
    }

    

}