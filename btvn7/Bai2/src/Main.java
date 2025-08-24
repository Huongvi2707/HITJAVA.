//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student sv = new Student("S001", "Vi", 8.0, 19, "thv270706@gmail.com", "12A7", "Bắc Ninh");
        System.out.println("Name: " + sv.getName() + " id: " + sv.getId() + " score: "+ sv.getScore() + " age: " + sv.getAge() + " email: " + sv.getEmail());
        String grade = sv.getGrade();
        System.out.println("Xếp loại: " + grade);

    }

}