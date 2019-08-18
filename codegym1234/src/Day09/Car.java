package Day09;

public class Car {
    private String numbercar;

    public Car(String numbercar) {
        this.numbercar = numbercar;
    }

    public String getNumbercar() {
        return numbercar;
    }

    public void setNumbercar(String numbercar) {
        this.numbercar = numbercar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numbercar='" + numbercar + '\'' +
                '}';
    }
}
