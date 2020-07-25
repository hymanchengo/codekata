package ifelse.case1;

/**
 * @Author hxchen
 * @Date 2020/7/25
 */
public class Cell {

    private String businessType;
    private Point imagePosition;

    public void showCell() {
        if (businessType.equals("ba")) {
            imagePosition = new Point(1, 1);
        } else if (businessType.equals("bb")) {
            imagePosition = new Point(1, 2);
        } else if (businessType.equals("bc")) {
            imagePosition = new Point(1, 3);
        }
    }
}
