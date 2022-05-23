public class Student {

    private String name;

    private String stdNo;

    private int classes;

    Course mat;
    Course chem;
    Course eng;

    double average;
    boolean isPass;

    public Student(String name, String stdNo,int classes,Course mat,Course chem, Course eng){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.mat = mat;
        this.chem = chem;
        this.eng = eng;
    }

    public void addBulkExamNotes(int mat,int chem,int eng) {
        if (mat >= 0 & mat <= 100) {
            this.mat.setNote(mat);
        }
        if (chem >= 0 & chem <= 100) {
            this.chem.setNote(chem);
        }

        if (eng >= 0 & eng <= 100) {
            this.eng.setNote(eng);
        }

    }

    public void isPass(){
        this.isPass = isCheckPass();

    }

    public void calcAverage(){
        this.average = (this.eng.getNote() + this.chem.getNote() + this.mat.getNote()) / 3;

    }

    public boolean isCheckPass(){
        calcAverage();

        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Mat : " + this.mat.getNote());
        System.out.println("Eng : " + this.eng.getNote());
        System.out.println("Chem : " + this.chem.getNote());
        System.out.println("isPass " + isCheckPass());
    }


}
