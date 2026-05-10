public class Text {
    public static void main(String[] args){
        /*
        Keyboard keyboard=new Keyboard();
        keyboard.open();
        keyboard.close();
         */
        Animal cat=new Cat();
        cat.eat();
        Animal dog=new Dog();
        dog.eat();
        Dog obj=(Dog) dog;
        obj.watchDoor();

    }
}
