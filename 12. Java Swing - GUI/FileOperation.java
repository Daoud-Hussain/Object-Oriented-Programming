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

    public void writeAFile(Student s){
        try {
            File f = new File("Student.ser");
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
            ObjectInputStream redFile = new ObjectInputStream(new FileInputStream("Student.ser"));
            try {
                while(true){
                    Student s = (Student) redFile.readObject();
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

    public String SearchAStudentByName(String name) throws IOException{
        String str = "";
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Student.ser"));
        try {
            while(true){
                Student s = (Student) obj.readObject();
                if(s.getName().equals(name)){
                    str  += "\n"+s.toString();
                }
            }
        }catch (ClassNotFoundException e) {
            System.out.println("Sorry! the targetted class is not Found\n");
        }catch(EOFException e){
            obj.close();
            System.out.println("Sorry! the targetted file has ended\n");
        }catch(ArithmeticException  e){
            System.out.println("Couldn't perform operation due to some error");
        }
        catch(IOException e){
            System.out.println("Couldn't perform operation due to some error");
        }
        return str;
    }

    public String updateGpaByName(String name, String gpa) throws IOException{
        ArrayList<Student> list = new ArrayList<Student>();
        boolean flag = false;
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Student.ser"));
        try {
            while(true){
                Student s = (Student) obj.readObject();
                if(s.getName().equals(name)){
                    s.setGPA(gpa);
                    flag = true;
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
            File f = new File("Student.ser");
            f.delete();
            for(int i = 0; i<list.size(); i++){
                writeAFile(list.remove(i));
            }
        }
        catch (Exception e) {
            System.out.println("Some error occured");
        }

        if(flag){
        	return ("Updated the file successfully!");
        	
        }
        else{
        	return ("Couldn't Update the file successfully!");
        }
    }

    public String removeByName(String name) throws IOException{

        ArrayList<Student> list = new ArrayList<Student>();
        boolean flag = false;
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Student.ser"));
        try {
            while(true){
                Student s = (Student) obj.readObject();
                list.add(s);
            }
        }
        catch(SecurityException e){
            System.out.println("Security");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(EOFException e){
            obj.close();
            System.out.println("End of file");
        }
        catch(IOException e){
            System.out.println("Io exception");
        }
        catch (Exception e) {
            System.out.println("Some error occured");
        }

        try {
            File f = new File("Student.ser");
            f.delete();
            for(int i = 0; i<list.size(); i++){
                if(name.equals(list.get(i).getName())){
                    list.remove(i);
                    System.out.println("iNside loop if");
                }else{
                    writeAFile(list.remove(i));
                }
            }
        }catch(SecurityException e){
            System.out.println("Security");
        }catch (Exception e) {
            System.out.println("Some error occured");
        }
        if(flag){
        	return ("Removed successfully!");
        	
        }
        else{
        	return ("Couldn't remove successfully!");
        }
    }

}