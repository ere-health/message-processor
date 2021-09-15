package message.processor;

public interface MessageProcessor {

    boolean canProcess(String message);

    String process(String message);
}
