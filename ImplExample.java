// Implementing the remote interface
public class ImplExample implements Hello {

    // Implementing the method to handle a Serializable object
    public void printMsg(Message message) {
        System.out.println("Message received: " + message.getContent());
    }
}
