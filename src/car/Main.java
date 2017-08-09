package car;

import java.util.Scanner;

import static car.UserInterface.chooseCar;

/**
 * Created by user on 09.08.17.
 */
public class Main {

    public static void main(String[] args) {

        Car car = chooseCar();

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, с какой чайстью машины необходимо выполнить действие:\n" +
                "1. Сама машина\n2. Двери\n3. Колёса");
        int num = sc.nextInt();



    }
}
