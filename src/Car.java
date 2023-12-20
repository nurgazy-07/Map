public class Car {
    private int id;
    private long numberAuto;

//    public Car() {
//    }

    public Car(int id, long numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(long numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
