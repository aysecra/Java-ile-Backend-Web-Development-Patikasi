
public class Course {
	Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int vivaNote;
    double aveNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.vivaNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Ýþlem baþarýlý");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
        }
    }
    
    public void calcAveNote() {
    	this.aveNote = (vivaNote*0.2) + (examNote*0.8);
    }
}
