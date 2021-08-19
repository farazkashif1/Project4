import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        cashier emp = new cashier(24000,"hamza", "89AB7", "gulberg3 lahore") ;
        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());//assocciation

        Student s1 = new Student("Ali", 1, "CS"); //aggregation example
        Student s2 = new Student("sheraz", 2, "CS");//in aggregation
        Student s3 = new Student("bilal", 1, "EE");
        Student s4 = new Student("zain", 2, "EE");

        // making a List of CS Students.
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);

        // making a List of EE Students
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        // creating an instance of Institute.
        institute institute = new institute("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
        Book1 b1 = new Book1("EffectiveJ Java", "Joshua Bloch");//composotion example
        Book1 b2 = new Book1("Thinking in Java", "Bruce Eckel");
        Book1 b3 = new Book1("Java: The Complete Reference", "Herbert Schildt");

        // Creating the list which contains the no. of books.
        List<Book1> books = new ArrayList<Book1>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book1> bks = library.getTotalBooksInLibrary();
        for(Book1 bk : bks){

            System.out.println("Title : " + bk.title + " and "
                    +" Author : " + bk.author);
        }
        Printer printer = new Printer();//delegation example
        printer.print();
    }
}
