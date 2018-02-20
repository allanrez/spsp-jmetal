package net.rodrigoamaral.dspsp.project.events;


public class DynamicEvent {
    private int id;
    private double time;
    private EventType type;
    private IEventSubject subject;

    public DynamicEvent() { }

    public DynamicEvent(int id, double time, EventType type, IEventSubject subject) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public IEventSubject getSubject() {
        return subject;
    }

    public void setSubject(IEventSubject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "DynamicEvent{" +
                "id=" + id +
                ", time=" + time +
                ", type=" + type +
                ", subject=" + subject +
                '}';
    }

    public String description() {
        String text = "";
        switch (type) {
            case NEW_URGENT_TASK:
                text = "Urgent Task " + subject.index() + " has ARRIVED";
                break;
            case EMPLOYEE_LEAVE:
                text = "Employee "+ subject.index() + " LEFT the project";
                break;
            case EMPLOYEE_RETURN:
                text = "Employee "+ subject.index() + " RETURNED to the project";
                break;
        }
        return text;
    }
}
