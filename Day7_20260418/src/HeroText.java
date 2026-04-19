public class HeroText {
    public static void main(String[] args){
        Hero hero=new Hero("后裔","男",3000,"射手",50.0);
        System.out.println(hero.getName()+","+hero.getSex()+","+
                hero.getLife()+","+hero.getType()+","+hero.getMoney());

    }
}
