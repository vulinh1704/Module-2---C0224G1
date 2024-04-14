public class Student {
    private int id;
    private String name;

    private double[] scores;
    private String gender;

    public Student(int id, String name, double[] scores, String gender) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.gender = gender;
    }


    public double getAvg() {
        double avg = 0.0;
        for (double s: scores) {
            avg += s;
        }
        avg = avg / scores.length;
        return avg;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student:  Id - " + this.id + "; Name - " + this.name + "; Score - " + this.getAvg();
    }
}
