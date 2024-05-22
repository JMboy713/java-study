package collection.compare.test;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private Shape shape;
    private int number;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    public Shape getShape() {
        return shape;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return number == card.number && Objects.equals(shape, card.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, number);
    }

    @Override
    public int compareTo(Card o) {
        if (this.number != o.number) {
            return Integer.compare(this.number, o.number);
        }else{
            return this.shape.compareTo(o.shape);
        }
    }

    @Override
    public String toString() {
        return
                number +"(" +shape.getIcon() + ")";
    }
}
