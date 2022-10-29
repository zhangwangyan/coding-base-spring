package event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

;

@Component
public class ALister implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.println(event.getName());
    }
}
