package lesson17_equals;

public class Ball {
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ball) {
            Ball b2 = (Ball)obj;
            return color.equals(b2.color) ? true : false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 7 * 11 * color.hashCode();
    }
    
    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }
    
    
}
