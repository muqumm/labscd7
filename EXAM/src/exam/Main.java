
package exam;
public class Main {
    public static void main(String[] args) {
        Examm exam = new Examm();
        // Create and start multiple exam threads for students
        for (int i = 1; i <= 5; i++) {
            Student student = new Student("Student " + i, i);
            ExamSystem examSystem = new ExamSystem(exam, student);
            examSystem.start();
        }
        // Wait for all threads to finish
        try {
            Thread.sleep(5000); // Wait for 5 seconds for all exams to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        System.out.println("Exam submissions completed.");
    }
}

