package exam;
import java.util.HashMap;
import java.util.Map;
public class Examm {
    private Map<Integer, Integer> studentScores; // studentId -> score
    public Examm() {
        studentScores = new HashMap<>();
    }
    public synchronized void submitScore(int studentId, int score) {
        studentScores.put(studentId, score);
        System.out.println("Score submitted for student ID " + studentId + ": " + score);
    }
    public synchronized int getScore(int studentId) {
        return studentScores.getOrDefault(studentId, 0);
    }
}


