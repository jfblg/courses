public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("mercedes")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }
}
