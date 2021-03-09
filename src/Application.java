import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1=new Kotik(4,"vasya",15,"meeeew");
        Kotik kotik2 = new Kotik();
        kotik1.liveAnotherDay();
        System.out.println("имя первого котика:"+kotik1.getName());
        System.out.println("вес первого котика:"+kotik1.getWeigth());
        kotik2.setMeow("mew");
        System.out.println("так говорит первый котик:"+kotik1.getMeow()+" так говорит второй котик:"+kotik2.getMeow());

    }
}
