
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htmercury
 */
public class GradeTracker {
    private int[] grades;
    private int count;

    public GradeTracker(Scanner reader) {
        grades = new int[] {0,0,0,0,0,0};
        count = 0;
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int grade = reader.nextInt();
            if (grade == -1) {
                break;
            }
            else if (grade < 0 || grade > 60) {
                continue;
            }
            grade = categorizeGrade(grade);
            grades[grade]++;
            count++;
        }
    }
    
    public void printResults() {
        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.format("%d: %s\n", i, strStars(grades[i]));
        }
        System.out.format("Acceptance percentage: %f", 100.0 * (count - grades[0])/count);
    }
    
    private int categorizeGrade(int score) {
        int res;
        if (60-score <= 10) {
            res = 5;
        }
        else if (49-score <= 4) {
            res = 4;
        }
        else if (44-score <= 4) {
            res = 3;
        }
        else if (39-score <= 4) {
            res = 2;
        }
        else if (34-score <= 4) {
            res = 1;
        }
        else {
            res = 0;
        }
        return res;
    }
    
    private String strStars(int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += "*";
        }
        
        return res;
    }
    
    
    
}
