package instruments;

public abstract class Instrument {
    private String colour;
    private String model;
    private String make;

    public Instrument(String colour, String model, String make) {
        this.colour = colour;
        this.model = model;
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}
