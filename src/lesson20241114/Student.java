package lesson20241114;

public class Student {

    private String name;

//    private Subject[] studiedSubjects = new Subject[Subject.values().length];
    private boolean[] studiedSubjects = new boolean[Subject.values().length];

    public Student(String name) {
        this.name = name;
    }

    public boolean knows(Subject subject){
//        return studiedSubjects[subject.ordinal()] == subject;
        return studiedSubjects[subject.ordinal()];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getStudiedSubjects() {
        return studiedSubjects;
    }

    public void setStudiedSubjects(boolean[] studiedSubjects) {
        this.studiedSubjects = studiedSubjects;
    }

    public void learn(Subject subject) {
        studiedSubjects[subject.ordinal()] = true;
    }
}
