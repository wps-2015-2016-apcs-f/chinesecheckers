/*
 * Marble.java
 *
 * @author 2015-2016 APCS F-Block
 * @author David C. Petty <dpetty@winchesterps.org>
 */
package chinesecheckers;

import java.awt.*;

/**
 * Marble class which IS-A {@link Location}.
 */
public class Marble extends Location {
    /** RED_FLAG: temporary until we have a default Color in Grid */
    private static final Color NONE = Color.PINK;
    /** Holds marble {@link Color}. */
    private Color color;

    /**
     * Constructs a {@link Marble}.
     *
     * @param row row of this Marble
     * @param col col of this Marble
     * @param color color of this Marble
     */
    public Marble(int row, int col, Color color) {
        super(row, col);
        setColor(color);
    }

    /**
     * Constructs a {@link Marble}.
     *
     * @param row row of this Marble
     * @param col col of this Marble
     */
    public Marble(int row, int col) {
        this(row, col, NONE);
    }

    /**
     * Constructs a copy of a {@link Marble}.
     *
     * @param that Marble to copy
     */
    public Marble(Marble that) {
        this(that.getRow(), that.getCol(), that.getColor());
    }

    /**
     * Returns color of this {@link Marble}.
     *
     * @return color of this Marble
     */
    public Color getColor() { return color; }

    /**
     * Returns oposite color of this {@link Marble}.
     *
     * @return opposite color of this Marble
     */
    public Color getOppositeColor() {
        return new Color(
            (color.getRGB() >> 16 ^ 255) & 255,
            (color.getRGB() >>  8 ^ 255) & 255,
            (color.getRGB() >>  0 ^ 255) & 255);
    }

    /**
     * Set the {@link Color} of this {@link Location}.
     *
     * @param color new color for this Marble
     */
    public void setColor(Color color) { this.color = color; }

    /**
     * Returns true if <code>this</code> {@link Location} is a {@link Hole},
     * false otherwise.
     *
     * @return true if this Location is a Hole, false otherwise
     */
    public boolean isHole() {
        return false;
    }

    /**
     * Return {@link String} representation of <code>this</code>.
     *
     * @return String representation of this
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        return sb.append(",").append(color).append(")").toString();
    }
}