package chatbot.chat;

import java.util.HashSet;

import chatbot.chat.chatuser.ChatUser;

/**
 * Chat
 */
public class Chat {
    private final HashSet<ChatUser> users = new HashSet<>();
    
    public void sayAll(Message<String> message) {
        for (ChatUser user : users) {
            user.listen(message);
        }
    }
}