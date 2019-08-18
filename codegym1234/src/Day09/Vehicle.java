package Day09;

public class Vehicle {
    private String bienso;
    private String tenxe;
    private String loaixe;

    public Vehicle() {
    }

    public Vehicle(String bienso, String tenxe, String loaixe) {
        this.bienso = bienso;
        this.tenxe = tenxe;
        this.loaixe = loaixe;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "bienso='" + bienso + '\'' +
                ", tenxe='" + tenxe + '\'' +
                ", loaixe='" + loaixe + '\'' +
                '}';
    }
}
