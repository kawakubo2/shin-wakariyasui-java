package chapter23;

public class SmartPhone {
    private String type;
    private Color color;
    public SmartPhone(String type, Color color) {
        this.type = type;
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "SmartPhone [type=" + type + ", color=" + color + "]";
    }
    
}
