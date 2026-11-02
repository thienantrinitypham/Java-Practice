public class SpaceTelemetry {
    public static void main(String[] args) {
        byte sectorID = 0b00000111;       
        int systemStatus = 0x2F;           
        long distanceTraveled = 5670000L;  
        float batteryCharge = 49.5f;       
        double orbitalSpeed = 3658.67;     
        char signalGrade = 'B';            
        boolean oxygenOK = false;            

        int tick = 1;
        
        int truncatedSpeed = (int) orbitalSpeed;

        float powerConsumed = 100.0f - batteryCharge;

        boolean isSystemFunctioning = (batteryCharge > 20.0f) && (oxygenOK == true);
        System.out.println("=========================================");
        System.out.println("        MARS ROVER TELEMETRY HUB        ");
        System.out.println("=========================================");
        System.out.println("Mission Cycle             : " + (++tick));
        System.out.println("Sector ID (Binary 0b111)  : " + sectorID);
        System.out.println("System Hex Status         : " + systemStatus);
        System.out.println("Distance Traveled         : " + distanceTraveled + " m");
        System.out.println("Signal Grade              : " + signalGrade);
        System.out.println("-----------------------------------------");
        System.out.println("Orbital Speed (Exact)     : " + orbitalSpeed + " km/h");
        System.out.println("HUD Display Speed (int)   : " + truncatedSpeed + " km/h");
        System.out.println("Power Consumed            : " + powerConsumed + "%");
        System.out.println("-----------------------------------------");
        System.out.println("Systems Nominal           : " + isSystemFunctioning);
        System.out.println("=========================================");
    }
}