package model;

public class Kotik {
    private int prettiness;
    private int weigth;
    private String name;
    private String meow;
    private int eat_balance = 100;
    private static int count = 0;
    private String NameEat;

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, String name, int weigth, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weigth = weigth;
        this.meow = meow;
        count++;
    }

    public void setKotik(int prettiness, String name, int weigth, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weigth = weigth;
        this.meow = meow;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void eat(int plusEatBalance) {
        eat_balance += plusEatBalance;
    }

    public void eat(int plusEatBalance, String NameEat) {
        eat_balance += plusEatBalance;
        this.NameEat = NameEat;
    }

    public void eat() {
        eat(60, "Wiskas");
    }

    public Boolean play() {
        if (eat_balance <= 0) {
            System.out.println("нужна еда");
            return false;

        } else {
            eat_balance -= 10;
            System.out.println("я сделал play");
            return true;
        }
    }

    public Boolean sleep() {
        if (eat_balance <= 0) {
            System.out.println("нужна еда");
            return false;
        } else {
            eat_balance -= 5;
            System.out.println("я сделал sleep");
            return true;

        }
    }

    public Boolean chaseMouse() {
        if (eat_balance <= 0) {
            System.out.println("нужна еда");
            return false;
        } else {
            eat_balance -= 25;
            System.out.println("я сделал chaseMouse");
            return true;
        }
    }

    public Boolean tigitig() {
        if (eat_balance <= 0) {
            System.out.println("нужна еда");
            return false;
        } else {
            eat_balance -= 20;
            System.out.println("я сделал tigitig");
            return true;
        }

    }

    public Boolean jump() {
        if (eat_balance <= 0) {
            System.out.println("нужна еда");
            return false;
        } else {
            eat_balance -= 15;
            System.out.println("я сделал jump");
            return true;
        }
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            System.out.println("итерация:"+i);
            int x = getRandomDiceNumber();
            switch (x) {
                case 1:play();
                    break;
                case 2:sleep();
                    break;
                case 3:chaseMouse();
                    break;
                case 4:tigitig();
                    break;
                case 5:tigitig();
                    break;

            }
            iAmHungry();
        }
    }

    public void iAmHungry(){
        if(eat_balance<=0){
            System.out.println("нужна еда");
            eat();
        }
    }

    public int getRandomDiceNumber() {
        return (int) (Math.random() * 5);
    }

}
