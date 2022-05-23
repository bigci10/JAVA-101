public class Teacher {

    private String name;
    private String branch;
    private String mpno;

    public Teacher(String name,String branch,String mpno){

        this.setName(name);
        this.setBranch(branch);
        this.setMpno(mpno);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }
}
