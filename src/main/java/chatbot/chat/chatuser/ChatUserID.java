package chatbot.chat.chatuser;

/**
 * ChatUserID
 */
public abstract class ChatUserID {

    @Override
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}