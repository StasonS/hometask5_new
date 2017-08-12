package car;

/**
 * Created by user on 09.08.17.
 */
public class CarDoor {

    CarWindow window = new CarWindow();

    private boolean doorIsOpen;

    public CarDoor() {
        doorIsOpen = false;
        window.windowIsOpen = false;
    }

    public CarDoor(boolean doorIsOpen, boolean windowIsOpen) {
        this.doorIsOpen = doorIsOpen;
        this.window.windowIsOpen = windowIsOpen;
    }

    public void openDoor(){
        doorIsOpen = true;
    }

    public void closeDoor(){
        doorIsOpen = false;
    }

    public void switchDoor(){
        if (doorIsOpen == true){
            closeDoor();
        }
        else {
            openDoor();
        }
    }

    public void objectInfo(){
        System.out.println("Объект - дверь");
        System.out.println("Дверь открыта: " + doorIsOpen);
        System.out.println("Окно открыто: " + window.windowIsOpen);
    }


    private class CarWindow{
        private boolean windowIsOpen;
        public void openWindow(){
            window.windowIsOpen = true;
        }

        public void closeWindow(){
            window.windowIsOpen = false;
        }

        public void switchWindow(){
            if (windowIsOpen == true){
                closeWindow();
            }
            else {
                openWindow();
            }
        }
    }
}