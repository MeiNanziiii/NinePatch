package ninepatch.core.type;

import ninepatch.game.Status;

public class StatusAction {
    public final String type = "applyStatusEffect";
    public Status value;

    public StatusAction(Status value) {
        this.value = value;
    }
}
