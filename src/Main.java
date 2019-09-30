public class Main
{
    public static void main(String... args){
        Milk[] milk = new Milk[5];
        milk[0] = new Milk("Простоквашино", 2.8, true);
        milk[1] = new Milk("Стары Менск", 3.2, true);
        milk[2] = new Milk("Беллакт",2.5,true);
        milk[3] = new Milk("Бабушкина крынка",3.2, true);
        milk[4] = new Milk("Минская маркаа",1.8, true);

        for(int i = 0; i < milk.length; i++)
        {
            System.out.println("Название молока: " + milk[i].getNameMilk());
            System.out.println("Жирность молока: " + milk[i].getPercentMilk());
            System.out.println("Наличие: " + milk[i].isIsMilk() + "\n");
        }

        double fatSumm = 0;
        for(int i = 0; i < milk.length; i++)
        {
            fatSumm  = milk[i].getPercentMilk() +  fatSumm ;
        }

        double avrgFat =  fatSumm / milk.length;
        System.out.println("Средняя жирность молока: " + String.format("%.1f", avrgFat));
    }
}
