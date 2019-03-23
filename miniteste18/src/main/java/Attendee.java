public class Attendee extends User {

    boolean paid = false;

    public Attendee(String name, int age) {
        super(name, age);
    }

    public Attendee(String name) {
        super(name);
    }

    public boolean hasPaid() {
        return paid;
    }

    @Override
    public String toString() {
        return "Attendee "+ name +(this.hasPaid() ? " has":" hasn't") +" paid its registration.";
    }
}
