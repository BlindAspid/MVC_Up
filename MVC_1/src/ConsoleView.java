public class ConsoleView implements View {
    @Override
    public void showStudend(Student s) {
        System.out.println("Student name is: " + s.getName() + "\n" + "Student age is: " + s.getAge());
    }
}
