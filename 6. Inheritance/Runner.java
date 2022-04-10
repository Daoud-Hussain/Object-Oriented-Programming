//1. Runner For Laptop class
/*
public class Runner{
    public static void main(String[] args) {
        //Making child object
        Laptop myLaptop = new Laptop(12, 8, 512, 20, 10, 10, 8, 5);
        myLaptop.display();

    }
}
*/


//2. Runner for BasePlusCommisionEmployee class
/*
public class Runner{
    public static void main(String[] args) {

        BasePlusCommisionEmployee bpce1 = new BasePlusCommisionEmployee("Daoud","Hussain","SP21",20.5,3.4,20000);
        bpce1.setSalary(25000);
        bpce1.display();
        bpce1.calculateEarning();
    }
} 
*/

//3. Runner For Book and Tape classes
/*
public class Runner{
    public static void main(String[] args) {

        //Creating object for Book cLass
        Book myBook = new Book();
        myBook.setPageCount(30);
        myBook.setPrice(250);
        myBook.setTitle("Introduction to Java");
        myBook.display();


        System.out.println();


        //Creating object for Tape cLass
        Tape myTape = new Tape();
        myTape.setPlayingTimeInMinutes(60);
        myTape.setPrice(150);
        myTape.setTitle("Java For Beginners");
        myTape.display();

    }
}
*/

//4. Runner for Verified Simple class
public class Runner{
    public static void main(String[] args) {
        VerifiedSimple vs = new VerifiedSimple();
        vs.add();
        vs.sub();
        vs.mul();
        vs.div();
    }
}