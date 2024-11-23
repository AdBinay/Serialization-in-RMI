import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}

    public static void main(String[] args) {
        try {
            // Connect to the RMI registry on localhost (default port: 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the registry for the remote object
            Hello stub = (Hello) registry.lookup("Hello");

            // Create a Serializable message object
            Message message = new Message("Hello from the client!");

            // Call the remote method with the Serializable object
            stub.printMsg(message);

            System.out.println("Remote method invoked successfully.");
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
