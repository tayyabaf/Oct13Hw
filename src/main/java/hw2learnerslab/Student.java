package hw2learnerslab;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long ID, String name, double totalStudyTime) {
        super(ID, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public String toString() {
        return "Student - ID:" + getID() + " Name:" + getName();
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
