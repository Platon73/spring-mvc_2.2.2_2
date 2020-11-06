package web.models;

public class Car {

    private Long id;
    private String model;

    private int seriy;

    public Car() {}

    public Car(Long id, String model, int seriy) {
        this.id = id;
        this.model = model;
        this.seriy = seriy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeriy() {
        return seriy;
    }

    public void setSeriy(int seriy) {
        this.seriy = seriy;
    }
}
