package practice.helpers;

public class Shirt {
    private String number;
    private String name;
    private String color;
    private String size;

    public Shirt(String desc) {
        String[] _desc = desc.split(",");
        number = _desc[0];
        name = _desc[1];
        color = _desc[2];
        size = _desc[3];
    }

    @Override
    public String toString() {
        return String.format("Shirt:\nNumber: %1$s;\nName: %2$s;\nColor: %3$s;\nSize: %4$s;\n",number,name,color,size);
    }
}
