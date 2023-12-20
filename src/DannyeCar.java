public class DannyeCar {
    private int godVypuska;
    private String modelAuto;
    private int price;
    private String color;

//    public DannyeCar() {
//    }

    public DannyeCar(int godVypuska, String modelAuto, int price, String color) {
        this.godVypuska = godVypuska;
        this.modelAuto = modelAuto;
        this.price = price;
        this.color = color;
    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(String modelAuto) {
        this.modelAuto = modelAuto;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DannyeCar{" +
                "godVypuska=" + godVypuska +
                ", modelAuto='" + modelAuto + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
