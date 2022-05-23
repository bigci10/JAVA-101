public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Mathematics","123213","MAT");
        Course eng = new Course("English","12314","ENG");
        Course chem = new Course("Chemistry","2311","CHEM");

        Teacher t1 = new Teacher("Jessie Pinkman","MAT","12314");
        Teacher t2 = new Teacher("Walter White","CHEM","12434");

        Student s1 = new Student("Fatih Yıldız","123124",5,mat,chem,eng);
        Student s2 = new Student("Muhammed Bilal İğci","214144",6,mat,chem,eng);

        s1.addBulkExamNotes(45,12,33);
        s1.printNote();

        System.out.println(t1.getBranch());
        System.out.println(t1.getName());
    }




}
