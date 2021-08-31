package message.processor;

public interface MessageProcessor<T> {

    boolean canProcess(String type);

    T process(String message);
}
