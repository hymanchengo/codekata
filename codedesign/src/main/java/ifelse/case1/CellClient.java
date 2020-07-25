package ifelse.case1;

import ifelse.case1.refactor.CellNew;

/**
 * @Author hxchen
 * @Date 2020/7/25
 */
public class CellClient {
    public static void main(String[] args) {
        CellNew bizACell = new CellNew();
        bizACell.setImagePosition(new Point(1, 2));
        bizACell.setTitle("bizACell");
        bizACell.showCell();

        CellNew bizBCell = new CellNew();
        bizBCell.setImagePosition(new Point(2, 3));
        bizBCell.setTitle("bizBCell");
        bizBCell.showCell();
    }
}
