public class Student {
    private int studentId;
    private String name;
    private int daysAttended;

    public Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }
    
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }
   
    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }
	
    public void displayStudent() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended);
    }
}

public class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom() {
        students = new Student[10];
        studentCount = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

    classroom.addStudent(new Student(101, "Alice Smith", 12));
    classroom.addStudent(new Student(102, "Bob Jones", 15));
    classroom.addStudent(new Student(103, "Carol Lee", 10));  
    }
}  