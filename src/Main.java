
public class Main {
    public static void main(String[] args) {


        Teacher t1 =new Teacher("mahmut","123","TRH");

        Teacher t2 = new Teacher ("GRAHAMMBEL", "125","FZK");
        Teacher t3 = new Teacher("kulyutmaz", "111", "BIO");
        Teacher t4 = new Teacher ("sozlu", "111", "SOZ");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fzik", "102", "FZK");

        fizik.addTeacher(t2);
        Course biyo = new Course("Bioloji", "101", "BIO");

        biyo.addTeacher(t3);

        Course sozlu = new Course("Sozlu", "158","SOZ");
        sozlu.addTeacher(t4);
        Student s1 = new Student("SAMET", "391", "4.SINIF",tarih ,fizik, biyo,sozlu);
        s1.addBulkExamNote(50,100,45,45);

        s1.isPass();

        Student s2 = new Student("KAMİL", "444", "4", tarih,fizik,biyo,sozlu);
        s1.addBulkExamNote(100,100,100,50);
        s2.isPass();







    }
}
