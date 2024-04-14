import java.util.Scanner;

public class MenuStudent {
    private StudentManager studentManager;
    private Scanner inputNumber;
    private Scanner inputString;

    public MenuStudent() {
        this.studentManager = new StudentManager();
        this.inputNumber = new Scanner(System.in);
        this.inputString = new Scanner(System.in);
    }


    public void showMainMenu() {
        int choice;
        do {
            System.out.println("============ Main Menu ==============");
            System.out.println("1. Add Student");
            System.out.println("2. List Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.println("=====> Let's enter your choice: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showListMenu();
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    break;
            }
        } while (choice != 0);
    }


    public void showMenuEdit() {
        System.out.println("Enter id student edit: ");
        int id = inputNumber.nextInt();
        int index = studentManager.findIndexById(id);
        if(index == -1) {
            System.out.println("No this student has this id");
        } else {
            double[] scores = new double[3];
            System.out.println("Enter Name: ");
            String name = inputString.nextLine();
            System.out.println("Enter score math: ");
            double math = inputNumber.nextDouble();
            scores[0] = math;
            System.out.println("Enter score Physical: ");
            double phy = inputNumber.nextDouble();
            scores[1] = phy;
            System.out.println("Enter core English: ");
            double english = inputNumber.nextDouble();
            scores[2] = english;
            System.out.println("Enter gender: ");
            String gender = inputString.nextLine();
            Student newStudent = new Student(id, name, scores, gender);
            studentManager.edit(id, newStudent);
        }
    }

    public void showAddMenu() {
        double[] scores = new double[3];
        System.out.println("=========== Menu Add ==========");
        System.out.println("Enter Id: ");
        int id = inputNumber.nextInt();
        System.out.println("Enter Name: ");
        String name = inputString.nextLine();
        System.out.println("Enter score math: ");
        double math = inputNumber.nextDouble();
        scores[0] = math;
        System.out.println("Enter score Physical: ");
        double phy = inputNumber.nextDouble();
        scores[1] = phy;
        System.out.println("Enter core English: ");
        double english = inputNumber.nextDouble();
        scores[2] = english;
        System.out.println("Enter gender: ");
        String gender = inputString.nextLine();
        Student newStudent = new Student(id, name, scores, gender);
        studentManager.add(newStudent);
    }


    public void showListMenu() {
        System.out.println("============ Menu Show All ===========");
        Student[] list = studentManager.getAll();
        for (int i = 0; i < studentManager.getSize(); i++) {
            System.out.println(list[i]);
        }
    }
}
