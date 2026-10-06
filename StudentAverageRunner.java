class Student {
    private String name;
    private int[] resultArray = new int[5];

    public Student(String name, int[] resultArray) {
        this.name = name;
        this.resultArray = resultArray;
    }

    public String getName() {
        return name;
    }

    public int[] getResultArray() {
        return resultArray;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            sum += resultArray[i];
        }
        return (double) sum / resultArray.length;
    }
}

public class StudentAverageRunner {
    public static void main(String[] args) {

        Student s1 = new Student("Ali", new int[]{80, 75, 90, 85, 70});
        Student s2 = new Student("Sara", new int[]{88, 92, 79, 95, 84});

        double avg1 = s1.average();
        double avg2 = s2.average();

        System.out.println(s1.getName() + " average: " + avg1);
        System.out.println(s2.getName() + " average: " + avg2);

        if (avg1 > avg2) {
            System.out.println(s1.getName() + " has the higher average.");
        } else if (avg2 > avg1) {
            System.out.println(s2.getName() + " has the higher average.");
        } else {
            System.out.println("Both students have the same average.");
        }

        Student s3 = new Student(s1.getName(), s2.getResultArray());
        System.out.println("Third student: " + s3.getName()
                + ", average: " + s3.average());
    }
}
