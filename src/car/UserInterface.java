package car;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;


public class UserInterface {



    public static Car chooseCar(){
        Car car = null;
        Car car1 = new Car(new Date());
        Car car2 = new Car(new Date(), "Дизель", (float) 333.3, new Time(4000), 5, 4, 100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Перед Вами две машины: у первой указана только дата производства\n" +
                "и о ней ничего не известно, а о второй известны дата производства,\n" +
                "тип двигателя, максимальная скорость, время разгона до 100 км/ч,\n" +
                "пасажироёмкость, текущее количество пасажиров и текущая скорость");
        System.out.println("Выберите, с какой машиной будем выполнять дальнейшие действия");

        try {
            int num = sc.nextInt();
            if (num == 1)
                car = car1;
            else if (num == 2)
                car = car2;
            else
                chooseCar();
        }
        catch (Exception e){
            chooseCar();
        }

        return car;
    }

    public static void choosePart(Car car){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Выберите, с какой чайстью машины необходимо выполнить действие:\n" +
                "1. Сама машина\n2. Двери\n3. Колёса");
        try {
            num = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Некорректный выбор");
            choosePart(car);
        }

        if (num == 1){

        }
        else if (num == 2){

        }
        else if (num == 3){

        }
    }

    public static void carActions(Car car){

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Вы можете:\n" +
                "1. Изменить текущую скорость\n" +
                "2. Посадить 1 пассажира в машину\n" +
                "3. Высадить 1 пассажира\n" +
                "4. Высадить всех пассажиров\n" +
                "5. Получить дверь по индексу\n" +
                "6. Получить колесо по индексу\n" +
                "7. Снять все колеса с машины\n" +
                "8. Установить на машину X новых колес\n" +
                "9. Вычислить текущую возможную максимальную скорость\n" +
                "10. Вывести в консоль данные об объекте");

        try{
            num = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Некорректный выбор");
            carActions(car);
        }

        if (num == 1){
            car.changeSpeed();
        }
        else if (num == 2){
            car.addPassenger();
        }
        else if (num == 3){
            car.removePassenger();
        }
        else if (num == 4){
            car.removeAllPassengers();
        }
        else if (num == 5){
            Scanner sc1 = new Scanner(System.in);
            CarDoor carDoor = car.getDoorByIndex(1);

        }
        else if (num == 6){}
        else if (num == 7){}
        else if (num == 8){}
        else if (num == 9){}
        else if (num == 10){}
        else{}
    }



}