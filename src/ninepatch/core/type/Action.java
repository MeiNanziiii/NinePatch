package ninepatch.core.type;

import ninepatch.game.ActionType;
import ninepatch.game.Message;

public class Action {
    public ActionType type;
    public Float value;
    public Message consumeLocMessage;

    public Action(ActionType type, Float value, Message consumeLocMessage) {
        this.type = type;
        this.value = value;
        this.consumeLocMessage = consumeLocMessage;
    }
    public Action(ActionType type, Float value) {
        this.type = type;
        this.value = value;
    }
}
