import java.util.ArrayList;

public class StudentManager implements StudentManagerInterface {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public void sortByScoreDesc() {
        students.sort((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
        printStudents();
    }

    @Override
    public void sortByScoreAsc() {
        students.sort((s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));
        printStudents();
    }

    @Override
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printStudents() {
        System.out.printf("%-5s | %-15s | %-3s | %-20s | %-10s | %-15s | %-5s | %-5s%n",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (Student s : students) {
            System.out.printf("%-5s | %-15s | %-3d | %-20s | %-10s | %-15s | %-5.2f | %-5s%n",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(),
                    s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
        }
    }
}

