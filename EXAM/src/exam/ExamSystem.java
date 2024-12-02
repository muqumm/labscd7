package exam;
public class ExamSystem extends Thread {
    private Examm exam; // Corrected the class name from Examm to Exam
    private Student student;
    public ExamSystem(Examm exam, Student student) { // Constructor now takes Exam
        this.exam = exam; // Corrected variable name
        this.student = student;
    }
    @Override
    public void run() {
        try {
            // Simulate exam taking time
            Thread.sleep((long) (Math.random() * 3000)); // Random sleep time between 0-3 seconds
            int score = (int) (Math.random() * 100); // Random score between 0-100
            exam.submitScore(student.getId(), score); // Use the corrected variable name
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
