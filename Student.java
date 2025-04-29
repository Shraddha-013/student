public class Student {
    String name;
    int id;
    String course;
    Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        Student student = new Student("Shraddha", 270, "Computer Science");
        student.displayInfo();
    }
}
