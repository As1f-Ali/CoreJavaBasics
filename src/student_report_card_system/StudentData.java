package student_report_card_system;

class StudentData {
    String name;
    int rollNumber;
    int[] marks = new int[5];
    int totalMarks = 0;

    void calculateGrade() {
        for (int  mark : marks) {
            totalMarks += mark;
        }
        double percentage = ((double)totalMarks/500)*100;

        System.out.println("Total Marks Are: " + totalMarks);
        System.out.println("Percentage is: " + percentage);

        if (percentage >= 90) System.out.println("A");
        else if (percentage >= 75) System.out.println("B");
        else if (percentage >= 50) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail!");
        }
    }

    void printReportCard() {
        System.out.println("Name: " + name);
        calculateGrade();
    }

}
