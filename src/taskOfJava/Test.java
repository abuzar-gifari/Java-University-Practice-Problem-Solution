
package taskOfJava;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher(7771109,"Jamal Bhuiyan","Software  Engineering","Lecturer");
        Teacher t2=new Teacher(7771189,"Sharif Ahmed","Software  Engineering","Lecturer"); 
        Student s1=new Student(2992,"Anas","Software Engineering","31"); 
        Student s2=new Student(2993,"Khokon","Software Engineering","31");
        System.out.println("Teacher Information : ");
        t1.showInfo();
        System.out.println();
        t2.showInfo();
        System.out.println();
        System.out.println("Student Information : ");
        s1.showInfo();
        System.out.println();
        s2.showInfo();
        System.out.println();
        
    }
    
}
