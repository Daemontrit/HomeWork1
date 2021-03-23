import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1=new Kotik(4,"vasya",15,"meeeew");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(5,"vasiliy",13,"meeeeeeeeeeew");
        kotik1.liveAnotherDay();
        System.out.println("имя первого котика:"+kotik1.getName());
        System.out.println("вес первого котика:"+kotik1.getWeigth());
        kotik2.setMeow("mew");
        System.out.println("так говорит первый котик:"+kotik1.getMeow()+" так говорит второй котик:"+kotik2.getMeow());
        for (int i=0;i<5;i++){
            kotik1.chaseMouse();
        }
        System.out.println(Kotik.getCount());

    }
}
