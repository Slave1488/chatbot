package chatbot.chat;

/**
 * Sender
 */
public interface Sender<T> {

    void send(final T message);
}