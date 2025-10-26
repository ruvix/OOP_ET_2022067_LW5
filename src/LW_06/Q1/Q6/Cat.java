package LW_06.Q1.Q6;

public class Cat extends Pets{
    private String coatColor;

    public Cat(String name, String coatColor) {
        super(name);
        this.coatColor=coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}
