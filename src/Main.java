import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Trying with RED and BLACK, should return rgb(127;0;0)
        Color blendedcolor = blendColors(Color.RED,Color.BLACK);
        System.out.println(blendedcolor);

        //Re-blending this color with YELLOW
        Color reblendedcolor = blendColors(blendedcolor, Color.YELLOW);
        System.out.println(reblendedcolor);

    }

    /**
     * Get a blended color from 2 initial colors
     * @param color1 the first color to blend
     * @param color2 the second color to blend
     * @return a blended Color object
     */
    public static Color blendColors(Color color1, Color color2) {
        //Get the initial R G B elements of colors
        int r1 = color1.getRed();
        int g1 = color1.getGreen();
        int b1 = color1.getBlue();

        int r2 = color2.getRed();
        int g2 = color2.getGreen();
        int b2 = color2.getBlue();

        // Merge colors
        int r = (r1 + r2) / 2;
        int g = (g1 + g2) / 2;
        int b = (b1 + b2) / 2;

        return new Color(r, g, b);
    }
}