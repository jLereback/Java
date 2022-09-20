package se.iths.solid.lsp;

public class Square extends Rectangle {


    public Square(float size) {
        super(size, size);
    }

    @Override
    public void setLength(float length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + super.getWidth() +
                ", length=" + super.getLength() +
                '}';
    }
}
