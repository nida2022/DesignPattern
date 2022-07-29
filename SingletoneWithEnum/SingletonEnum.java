package Singleton.DesignPattern.SingletoneWithEnum;

//Testing future branch
enum Singleton{
    Instance;
    int val;

    int getVal(){
        return val;
    }
    void setVal(int val){
        this.val = val;

    }
}
public class SingletonEnum {


    public static void main(String[] args) {
        Singleton a = Singleton.Instance;
        a.setVal(2);
        System.out.println(a.hashCode());
        Singleton a2 = Singleton.Instance;
        a2.setVal(3);

        System.out.println(a2.hashCode());


    }
}
