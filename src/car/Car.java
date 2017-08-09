package car;

import java.sql.Time;
import java.util.*;


public class Car {

    private static Date dateOfProduction;
    private static String engineType;
    private static float maxSpeed;
    private static Time accelerationTo100kmphTime;
    private static int passengersCount;
    private static int currentPassengersCount;
    private static float currentSpeed;
    private static ArrayList<CarWheel> wheels = new ArrayList<>();
    static {
        for (int i = 0; i < 4; i++){
            wheels.add(new CarWheel());
        }
    }
    private static ArrayList<CarDoor> doors;
    static {
        for (int i = 0; i < 5; i++){
            doors.add(new CarDoor());
        }
    }

    public Car(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public Car(Date dateOfProduction, String engineType, float maxSpeed, Time accelerationTo100kmphTime,
               int passengersCount, int currentPassengersCount, float currentSpeed) {

        this.dateOfProduction = dateOfProduction;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTo100kmphTime = accelerationTo100kmphTime;
        this.passengersCount = passengersCount;
        this.currentPassengersCount = currentPassengersCount;
        this.currentSpeed = currentSpeed;
    }

    public static void changeSpeed(){
        Scanner sc = new Scanner(System.in);
        float newSpeed = 0;
        System.out.println("Введите новую скорость");
        try{
            newSpeed = sc.nextFloat();
        }
        catch (Exception e){
            changeSpeed();
        }
        currentSpeed = newSpeed;
    }

    public static void addPassenger(){
        currentPassengersCount++;
    }

    public static void removePassenger(){
        currentPassengersCount--;
    }

    public static void removeAllPassengers(){
        currentPassengersCount = 0;
    }

    public CarDoor getDoorByIndex(int index){
        return doors.get(index);
    }

    public CarWheel getWheelByIndex(int index){
        return wheels.get(index);
    }

    public static void removeAllWheels(){
        for (int i = 0; i < wheels.size(); i++){
            wheels.set(i, null);
        }
    }

    public static void addWheels(int wheelsCount){
        for (int i = 0; i < wheelsCount; i++){
            wheels.add(new CarWheel());
        }
    }

    public static float getPossibleMaxSpeed(){

        float speed = 0;
        float wheelState = 1;

        if (currentPassengersCount == 0){
            return speed;
        }

        for (CarWheel carWheel : wheels){
            if (carWheel.getWheelState() < wheelState){
                wheelState = carWheel.getWheelState();
            }
        }

        speed = maxSpeed * wheelState;

        return speed;
    }

    public static void objectInfo(){
        System.out.println("Объект - машина");
        System.out.println("Дата производства: " + dateOfProduction);
        System.out.println("Тип вигателя: " + engineType);
        System.out.println("Максимальная скорость" + maxSpeed);
        System.out.println("Время разгона до 100 км/ч: " + accelerationTo100kmphTime);
        System.out.println("Пассажироёмкость: " + passengersCount);
        System.out.println("Текущее количество пассажиров в данный момент: " + currentPassengersCount);
        System.out.println("Текущая скорость: " + currentSpeed);
        System.out.println("Возможная максимальная скорость в данный момент: " + getPossibleMaxSpeed());
//        System.out.println("");
    }
}