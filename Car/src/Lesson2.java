import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.List;

public class Lesson2 {
    //создаю поле для храниния ссылки на объект типа класса Auto
    Auto auto = new Auto();

    static String []colorsForColor = new String[] {"Black","Blue","Green","Yellow","Wite"};
    static Integer[]speedsForSpeed = new Integer[] {100,250,80,97};

    //создаю контейнер для коллекции объектов типа Auto
    List<Auto> autoList = new LinkedList<Auto>();
    //список предустановленных цветов для случайных автомобилей
    static List<String> color = new LinkedList<String>();


    //список предустановленных скоростей для случайных автомобилей
    static List<Integer> speed = new LinkedList<Integer>();



    //добавляем в список color данные из массива colorsForColors

    void sendDataColorToList(List<String>list,String[]mass) {
        Collections.addAll(list, mass);
    }
    //добавляем в список speed данные из массива speedForSpeed
    void sendDataSpeedToList(List<Integer>list,Integer[]mass) {
        Collections.addAll(list, mass);
    }
    //добавление объектов типа Car в контрейнер
    void generateCarsObject() {
        for(int i =0;i<5;i++) {

            autoList.add(auto);
        }
    }

    //произвольно берем число из диапазона длины полученного массива(если длина массива равена 5, то диапазон чисел будет  от 0 до 4)
    public int randomIndexForList(List<?> arr) {
        Random random = new Random();
        int randomNum = random.nextInt(arr.size());
        System.out.println(randomNum);
        return randomNum;
    }

    //обращение к элементу массива по номеру индекса, полученного случайным образом
    public String getElementInListColor(int numberForIndex,List<String> list) {
        //System.out.println(list.get(numberForIndex));
        String elem =  list.get(numberForIndex);
        System.out.println(elem);
        return elem;
    }

    //обращение к элементу массива по номеру индекса, полученного случайным образом
    public int getElementInListSpeed(int numberForIndex,List<Integer> list) {
        //System.out.println(list.get(numberForIndex));
        int elem = list.get(numberForIndex);
        System.out.println(elem);
        return elem;
    }

    public void generationCarsObject() {
        sendDataColorToList(color,colorsForColor);
        sendDataSpeedToList(speed,speedsForSpeed);
        for(int i = 0;i<3;i++) {
            int indexForColor =  randomIndexForList(color);
            int indexForSpeed =  randomIndexForList(speed);

            String colorForObj = getElementInListColor(indexForColor,color);
            int speedForObj = getElementInListSpeed(indexForSpeed,speed);
            Auto auto = new Auto(speedForObj,colorForObj);

            autoList.add(auto);
        }
        System.out.println(autoList);
    }


    //autoList.add()
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Lesson2 lesson2 = new Lesson2();
        lesson2.generationCarsObject();
    }

}


class Auto{
    int speed = 0;
    String color = "";

    Auto(){};

    Auto(int speed_arg){
        this(speed_arg,"Black");
    }

    Auto(int speed_arg,String arg_color){
        speed = speed_arg;
        color = arg_color;
    }

    void setSpeed(int speed_arg) {
        speed = speed_arg;
    }

    void setColor(String color_arg) {
        color = color_arg;
    }

    int getSpeed() {
        return speed;
    }

    String getColor() {
        return color;
    }

    public String toString(){
        return "color: "+ color+", "+"speed: "+ speed;
    }
}
