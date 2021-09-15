package message.processor.outgoing;

public interface OutgoingMessageProcessor {

    boolean canProcess(String message);

    String process(String message);
}
