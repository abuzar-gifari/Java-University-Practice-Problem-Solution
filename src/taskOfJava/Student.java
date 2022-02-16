
package taskOfJava;

public class Student extends Person{
    private final String batch;

    Student(int id,String name,String department,String batch){
        this.id=id;
        this.name=name;
        this.department=department;
        this.batch=batch;
    }
    @Override
    void showInfo(){
       super.showInfo();
       System.out.println("batch : "+batch);
    }
    
}
