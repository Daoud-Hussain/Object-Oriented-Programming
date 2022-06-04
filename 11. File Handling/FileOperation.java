import java.io.File;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class FileOperation {
    public void writeAFile(Student s){
	    File myFile = new File("Student.ser");
	    ObjectOutputStream out;
	        try{
	            if(myFile.exists()){
	              	out=new MyObjectOutputStream(new FileOutputStream(myFile,true));
	                out.writeObject(s);
	                out.close();

	            }
	            else{
	                out=new ObjectOutputStream(new FileOutputStream(myFile));
	                out.writeObject(s);
	                out.close();
	                
	            }
	        }
	        catch(IOException e){
	            System.err.println("Couldn't perform the task due to some Error ");
	        }
    }

    public void readAFile(){
    	File myFile = new File("Student.ser");
    	try{
    		ObjectInputStream in=new ObjectInputStream(new FileInputStream(myFile));
    		while(true){
    			Student stu = (Student)in.readObject();
    			System.out.println(stu.toString());
    		}
    	}
    	catch(EOFException e){
    		System.out.println("Reached end of file while parsing\n");
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Sorry! the targetted file is not Found\n");
    	}
    	catch(ClassNotFoundException e){
    		System.out.println("Sorry! the targetted class is not Found\n");
    	}
    	catch(IOException e){
    		System.out.println("Couldn't perform operation due to some error");
    	}

    }


    public boolean SearchAStudentByName(String name){
		ArrayList<Student> myArray = new ArrayList<Student>();
    	File myFile = new File("Student.ser");
    	try{
    		ObjectInputStream in=new ObjectInputStream(new FileInputStream(myFile));
    		while(true){
    			Student stu = (Student)in.readObject();
    			System.out.println(stu.toString());
    		}
    	}
    	catch(EOFException e){
    		System.out.println("Reached end of file while parsing\n");
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Sorry! the targetted file is not Found\n");
    	}
    	catch(ClassNotFoundException e){
    		System.out.println("Sorry! the targetted class is not Found\n");
    	}
    	catch(IOException e){
    		System.out.println("Couldn't perform operation due to some error");
    	}


    	//Searching the name in the list
    	boolean flag = false;
    	for(int i = 0; i < myArray.size(); i++){
    		if(myArray.get(i).getName().equals(name)){
    			System.out.println(myArray.get(i).getName() + " is present in the student record");
    			flag = true;
    		}
    	}

    	if(flag){
    		System.out.println("Yes given name is present in the student record");
    		return true;
    	}
    		System.out.println("Yes given name is not present in the student record");
    		return false;


    }


	public void updataAFile(String gpa, String name){
		ArrayList<Student> myArray = new ArrayList<Student>();
    	File myFile = new File("Student.ser");
		try{
    		ObjectInputStream in = new ObjectInputStream(new FileInputStream(myFile));
    		while(true){
    			Student stu = (Student)in.readObject();
    			myArray.add(stu);

    		}
    	}
    	catch(EOFException e){
    		System.out.println("Reached end of file while parsing\n");
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Sorry! the targetted file is not Found\n");
    	}
    	catch(ClassNotFoundException e){
    		System.out.println("Sorry! the targetted class is not Found\n");
    	}
    	catch(IOException e){
    		System.out.println("Couldn't perform operation due to some error");
    	}


    	//Searching the student by name and upating its gpa
    	for(int i = 0; i < myArray.size(); i++){
    		if(myArray.get(i).getName().equals(name)){
    			myArray.get(i).setGPA(gpa);
    		}
    	}


    	//ReWriting the data in file
       	try{
    		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Student.ser"));
    		for(int i = 0; i < myArray.size(); i++){
   				obj.writeObject(myArray.get(i)); 		
    	   	}
    	}
    	catch(EOFException e){
    		System.out.println("Reached end of file while parsing\n");
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Sorry! the targetted file is not Found\n");
    	}
    	catch(IOException e){
    		System.out.println("Couldn't perform operation due to some error");
    	}

	}	
}
