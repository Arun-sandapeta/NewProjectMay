package immutable;

public class AbcCar {
    private String color;
    private String wheel;
    private String dashboard;
    private String engine;

    public AbcCar(String color,String dashBoard,String wheel){
        this(color,dashBoard,wheel,"2000");
    }
    public AbcCar(String color,String dashboard,String wheel,String engine){
        this.color=color;
        this.dashboard=dashboard;
        this.engine=engine;
        this.wheel=wheel;

    }

    public String getColor() {
        return color;
    }

    public String getWheel() {
        return wheel;
    }

    public String getDashboard() {
        return dashboard;
    }

    public String getEngine() {
        return engine;
    }
}
