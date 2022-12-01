public class Student
{
    private String firstName;
    private String lastName;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public boolean isInClub() {
        return inClub;
    }

    public void setInClub(boolean inClub) {
        this.inClub = inClub;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private int gradYear;
    private double gpa;
    private boolean inClub;

    public Student(String first, String last, int gradYear, double gpa, boolean inClub)
    {
        firstName = first;
        lastName = last;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.inClub = inClub;
    }

    public String toString()
    {
        return "first name: " + firstName + ", last name: " + lastName +
                ", grad year: " + gradYear + ", gpa: " + gpa +
                ", is in club: " + inClub;
    }
}
