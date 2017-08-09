package car;

/**
 * Created by user on 09.08.17.
 */
public class CarWheel {

    private float wheelState;

    public CarWheel() {
        wheelState = 1;
    }

    public CarWheel(float wheelState) {
        if (wheelState > 1){
            wheelState = 1;
        }
        else if (wheelState < 0){
            wheelState = 0;
        }
        else {
            this.wheelState = wheelState;
        }
    }

    public void putNewWheelOn(){
        wheelState = 1;
    }

    public void eraseWheelForPercent(int percent){

        //обработка, чтобы не перестереть шину
        if (percent > 99){
            System.out.println("Шина не может быть стёрта более, чем на 99%");
            percent = 99;
        }

        wheelState = wheelState * (1 - percent / 100);
    }

    public float getWheelState() {
        return wheelState;
    }

    public void objectInfo(){
        System.out.println("Объект - колесо");
        System.out.println("Состояние колеса (дробное число от 0-стерта до 1-новая): " + wheelState);
    }
}
