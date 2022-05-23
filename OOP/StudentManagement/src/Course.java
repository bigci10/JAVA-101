public class Course {

    Teacher courseTeacher ;
    private String name;
    private String code;
    private String prefix;
    private int note = 0;

    public Course(String name,String code,String prefix){
        this.setName(name);
        this.setCode(code);
        this.setPrefix(prefix);

    }

    public void  addTeacher(Teacher t){
        if(this.getPrefix().equals(t.getBranch())){
            this.courseTeacher = t;
            System.out.println("Succes");

        }
        else {
            System.out.println(t.getName()+" is can't enter this lesson");
        }
    }


    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.getName() +" academician of the course"+courseTeacher.getName());
        }
        else{
            System.out.println(this.getName() +" The course has no academiciam ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
