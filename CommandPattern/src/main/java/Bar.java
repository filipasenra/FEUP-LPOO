import java.util.ArrayList;
import java.util.List;

public class Bar {
    protected boolean happy_hour = false;
    protected List<BarObserver> observers = new ArrayList<BarObserver>();

    public boolean isHappyHour()
    {
        return happy_hour;
    }


    public void startHappyHour() {

        this.happy_hour = true;

        this.notifyObservers();
    }

    public void endHappyHour() {
        this.happy_hour = false;
    }

    void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
