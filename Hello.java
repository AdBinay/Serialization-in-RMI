import java.rmi.Remote;
import java.rmi.RemoteException;

// Creating Remote interface
public interface Hello extends Remote {
    void printMsg(Message message) throws RemoteException; // Accepts a Serializable object
}
