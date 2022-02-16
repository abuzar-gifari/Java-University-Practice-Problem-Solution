
package taskOfJava;

public class Teacher  extends Person {
    private final String designation;
    Teacher(int id,String name,String department,String designation){
        this.id=id;
        this.name=name;
        this.department=department;
        this.designation=designation;
    }
    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("designation : "+designation);
    }
}

