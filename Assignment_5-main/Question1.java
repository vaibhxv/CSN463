class Mammals{
    void print(){
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    void print(){
        System.out.println("I am a marine animal");
    }
    void printParent(){
        super.print();
    }
}
class BlueWhale extends MarineAnimals{
    void print(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void printP1(){
        super.print();
    }
    void printP2(){
        super.printParent();
    }
}

public class Question1{
    public static void main(String args[]){
        Mammals M=new Mammals();
        MarineAnimals mA=new MarineAnimals();
        BlueWhale bW=new BlueWhale();

        M.print();
        mA.print();
        bW.print();

        bW.printP1();
        bW.printP2();
    }
}

