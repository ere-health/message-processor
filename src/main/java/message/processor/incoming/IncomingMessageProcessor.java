package message.processor.incoming;

public interface IncomingMessageProcessor {

    boolean canProcess(String message);

    String process(String message);
}
