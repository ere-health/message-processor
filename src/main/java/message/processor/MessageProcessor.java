package message.processor;

public interface MessageProcessor {

    boolean canProcess(String type);

    void process(String message);
}
