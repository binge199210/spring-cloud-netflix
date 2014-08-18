package org.springframework.platform.netflix.eureka.event;

import com.netflix.appinfo.InstanceInfo;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author Spencer Gibb
 */
@Data
public class EurekaInstanceRegisteredEvent extends ApplicationEvent {
    private InstanceInfo instanceInfo;
    private int leaseDuration;
    boolean replication;

    public EurekaInstanceRegisteredEvent(Object source, InstanceInfo instanceInfo, int leaseDuration, boolean replication) {
        super(source);
        this.instanceInfo = instanceInfo;
        this.leaseDuration = leaseDuration;
        this.replication = replication;
    }
}
