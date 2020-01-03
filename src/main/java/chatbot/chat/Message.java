package chatbot.chat;

import chatbot.chat.chatuser.ChatUserID;;

/**
 * Message
 */
public class Message<T> {
    private final ChatUserID id;
    private final T message;

    public Message(final ChatUserID id, final T message) {
        this.id = id;
        this.message = message;
    }

    public ChatUserID getID() {
        return id;
    }

    public T getMessage() {
        return message;
    }
}