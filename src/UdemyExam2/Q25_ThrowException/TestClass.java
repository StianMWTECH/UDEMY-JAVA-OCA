package UdemyExam2.Q25_ThrowException;

class PortConnector {
    public PortConnector(int port) {
        if (Math.random() > 0.5) {
//            throw new IOException();
        }
        throw new RuntimeException();
    }
}
public class TestClass {
    public static void main(String[] args) {
        try {
            PortConnector pc = new PortConnector(10);
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
    }
}

// We can either add IOException to PortConnector and main OR
// We add Exception to PortConnector and we replace RuntimeException with Exception in try catch