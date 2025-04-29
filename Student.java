public class Student {
    String name;
    int id;
    String course;
    long  phone;
    String location;
    Student(String name, int id, String course, long phone, String location) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phone = phone;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone: " + phone);
        System.out.println("Location: " + location);
    }
    public static void main(String[] args) {
        Student student = new Student("Shraddha", 270, "Computer Science", 1234567890, "Bangalore");
        student.displayInfo();
    }
}
