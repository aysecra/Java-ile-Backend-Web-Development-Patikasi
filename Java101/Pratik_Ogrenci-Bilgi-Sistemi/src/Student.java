
public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }
    public void addBulkVivaNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.vivaNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.vivaNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.vivaNote = kimya;
        }

    }

    public void isPass() {
    	fizik.calcAveNote();
    	kimya.calcAveNote();
    	mat.calcAveNote();
        if (this.mat.aveNote == 0 || this.fizik.aveNote == 0 || this.kimya.aveNote == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.aveNote + this.kimya.aveNote + this.mat.aveNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.aveNote);
        System.out.println("Fizik Notu : " + this.fizik.aveNote);
        System.out.println("Kimya Notu : " + this.kimya.aveNote);
    }

}
