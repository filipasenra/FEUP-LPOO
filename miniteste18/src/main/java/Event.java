import java.util.ArrayList;
import java.util.List;

public class Event {

    protected String title;
    protected String date = "";
    protected String description = "";
    protected List<Person> attendees = new ArrayList<>();
    int audienceCount = 0;

    public Event(String title) {
        this.title = title;
    }

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }


    public Event(Event e){

        this.title = e.title;
        this.date = e.date;
        this.description = e.description;

    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addPerson(Person person)
    {
        for(Person person_tmp : this.attendees)
        {
            if (person_tmp.equals(person))
                return;
        }

        attendees.add(person);
        audienceCount++;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if(obj.getClass() != this.getClass())
            return false;

        Event tmp = (Event) obj;

        return (tmp.getTitle() == this.title) && (tmp.getDate() == this.date) && (tmp.getDescription() == this.description);
    }

    @Override
    public String toString() {
        return this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public List<Person> getAttendees() {
        return attendees;
    }
}
