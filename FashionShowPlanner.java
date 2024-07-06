import java.util.HashMap;
import java.util.Map;

public class FashionShowPlanner {

    // Data structure to store participant names and creativity scores
    private static final Map<String, Double> participantScores = new HashMap<>();

    public static void main(String[] args) {
        // Example usage of methods with updated names
        addParticipantScore("Melissa", 85.5);
        addParticipantScore("Sofia", 92.0);
        addParticipantScore("Isabella", 78.3);

        double averageScore = calculateAverageScore();
        System.out.println("Average Creativity Score: " + averageScore);

        displayParticipantInfo();
    }

    // Method 1: Add participant name and creativity score to the data structure
    private static void addParticipantScore(String participantName, double creativityScore) {
        // Using a Map to associate each participant with their creativity score
        participantScores.put(participantName, creativityScore);
        // Displaying a confirmation message
        System.out.println("Added participant: " + participantName + ", Creativity Score: " + creativityScore);
    }

    // Method 2: Calculate and return the average creativity score of all participants
    private static double calculateAverageScore() {
        double sum = 0;
        // Looping through all creativity scores to calculate the sum
        for (double creativityScore : participantScores.values()) {
            sum += creativityScore;
        }
        // Returning the average score (handling potential division by zero)
        return participantScores.isEmpty() ? 0 : sum / participantScores.size();
    }

    // Method 3: Determine and return the performance grade based on creativity score
    private static String determinePerformanceGrade(double creativityScore) {
        // Using if-else branching to assign a grade based on creativity score
        if (creativityScore >= 90) {
            return "Exceptional";
        } else if (creativityScore >= 80) {
            return "Excellent";
        } else if (creativityScore >= 70) {
            return "Good";
        } else if (creativityScore >= 60) {
            return "Fair";
        } else {
            return "Needs Improvement";
        }
    }

    // Method 4: Display information for each participant, including name, creativity score, and performance grade
    private static void displayParticipantInfo() {
        // Displaying header for participant information
        System.out.println("Participant Information:");
        // Iterating over participant data using a for-each loop
        for (Map.Entry<String, Double> entry : participantScores.entrySet()) {
            String participantName = entry.getKey();
            double creativityScore = entry.getValue();
            // Determining performance grade using Method 3
            String performanceGrade = determinePerformanceGrade(creativityScore);
            // Displaying information for each participant
            System.out.println("Name: " + participantName + ", Creativity Score: " +
                    creativityScore + ", Performance Grade: " + performanceGrade);
        }
    }
}