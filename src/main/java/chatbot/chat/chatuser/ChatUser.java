package chatbot.chat.chatuser;

import chatbot.chat.Message;
import chatbot.chat.Sender;

/**
 * ChatUser
 */
public class ChatUser
implements Sender<String> {
    private final ChatUserID id;
    private final Sender<Message<String>> sender;
    
    public ChatUser(final ChatUserID id, final Sender<Message<String>> sender) {
        this.id = id;
        this.sender = sender;
    }

    public boolean isMe(final ChatUserID id) {
        return this.id == id;
    }

    @Override
    public void send(final String messageText) {
        sender.send(new Message<>(id, messageText));
    }

    public void listen(final Message<String> message) {

    }
}