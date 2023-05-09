package week10.no8;





//20190647 이용준
public class Main {
    public static double average(Student[] objects) {
        double sum = 0;
        for (Student obj : objects) {
            sum += obj.getValue();
        }
        return sum / objects.length;
    }

    public static void main(String[] args) {
        Student[] students = {new Student("이용준",4.0), new Student("홍길동",3.5)};
        System.out.println("평균 성적 :"+average(students));
    }
}
