package LW_06.Q1;

public class Pet {
    private String name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName( ) {
        return name;
    }
    public void setName(String petName) {
        name = petName;
    }
    public String speak( ) {
        return "I'm your cuddly little pet.";
    }
}
