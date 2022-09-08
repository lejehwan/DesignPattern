package templateMethodPattern;

public abstract class Teacher {

    public void startClass(){
        come();
        teach();
        out();
    }

    public void come(){
        System.out.println("선생님 입장");
    }

    public abstract void teach();

    public void out(){
        System.out.println("선생님 퇴장");
    }
}
