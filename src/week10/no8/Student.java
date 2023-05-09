package week10.no8;


//20190647 이용준
public class Student implements GetInfo{

    String name;
    double score;

    @Override
    public double getValue() {
        return score;
    }

    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }
}
