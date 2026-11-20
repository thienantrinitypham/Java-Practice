public class Motor {
    private String brand;
    private double speed;
    private boolean isRunning;

    public Motor() {
        this.brand = "idk";
        this.speed = 0.0;
        this.isRunning = false;
    }

    public Motor(String brand) {
        this.brand = brand;
        this.speed = 0.0;
        this.isRunning = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void run() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " motor started.");
        } else {
            System.out.println(brand + " motor is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0.0; // Reset speed when stopped
            System.out.println(brand + " motor stopped.");
        } else {
            System.out.println(brand + " motor is already stopped.");
        }
    }

    public void setSpeed(double newSpeed) {
        if (isRunning) {
            this.speed = newSpeed;
            System.out.println(brand + " speed set to " + speed + " RPM.");
        } else {
            System.out.println(brand + " is currently stopped. Start the motor before setting speed.");
        }
    }

    public void displayInfo() {
        System.out.println("--- " + brand + " Motor Status ---");
        System.out.println("Status: " + (isRunning ? "RUNNING" : "STOPPED"));
        System.out.println("Speed:  " + speed + " RPM");
        System.out.println("-----------------------------------------");
    }
}
