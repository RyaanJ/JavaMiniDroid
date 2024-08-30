public class Droid {
    int batteryLevel;
    String name;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    
    }
    public String toString() {
      return "Hello, I'm the droid: " + name;
    }
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid.name + "'s battery level is currently: " + myDroid.batteryLevel + "%!");
        System.out.println(myDroid.name + " will now perform some tasks.");
        myDroid.performTask("Cooking");
        System.out.println("New battery level is: " + myDroid.batteryLevel + "%");
        myDroid.performTask("Lifting Weights");
        System.out.println("New battery level is: " + myDroid.batteryLevel + "%");
        myDroid.performTask("Studying");
        System.out.println("New battery level is: " + myDroid.batteryLevel + "%");
        myDroid.performTask("Cleaning");
        System.out.println("New battery level is: " + myDroid.batteryLevel + "%");
        System.out.println(myDroid.name + "'s battery level is low now, time to sleep!");
    }
}