public class Controller {
    Model m = new MVCDB();
    View v = new ConsoleView();
    void execute() {
        Student s = m.getStudent();
        v.showStudend(s);
    }
}
