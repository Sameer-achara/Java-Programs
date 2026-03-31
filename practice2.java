package java_lab;

public class Bank {

    static class Banks {
        double ROI() {
            return 0;
        }
    }

    static class SBI extends Banks {
        double ROI() {
            return 7.0;
        }
    }

    static class ICICI extends Banks {
        double ROI() {
            return 8.0;
        }
    }
   
    public static void main(String[] args) {
        Banks b;
 System.out.println("Sameer Achara(24EARCS145)");
        b = new SBI();
        System.out.println("SBI ROI: " + b.ROI());

        b = new ICICI();
        System.out.println("ICICI ROI: " + b.ROI());
    }
}
