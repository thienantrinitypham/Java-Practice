public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTING MOTOR 1 ===");
        Motor motor1 = new Motor("SparkMAX");
        
        motor1.displayInfo();
        
        motor1.setSpeed(2500.5);
        
        motor1.run();
        motor1.setSpeed(2500.5);
        motor1.displayInfo();
        
        motor1.stop();
        motor1.displayInfo();
        
        System.out.println("\n=== TESTING MOTOR 2 ===");
        Motor motor2 = new Motor("Falcon500");
        motor2.displayInfo();
        motor2.run();
        motor2.setSpeed(5000.0);
        motor2.displayInfo();
        motor2.stop();
        motor2.displayInfo();
    }
}
