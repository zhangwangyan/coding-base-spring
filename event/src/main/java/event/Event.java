package event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class Event extends ApplicationEvent {

    private String name;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public Event(Object source,String name) {
        super(source);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
