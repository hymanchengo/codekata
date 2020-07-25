package ifelse.case1.refactor;

import ifelse.case1.Point;

/**
 * @Author hxchen
 * @Date 2020/7/25
 */
public class CellNew {
    private Point imagePosition;
    private String title;
    private String titleFont;
    private boolean titleHidden;

    public void showCell() {
        //logic
        System.out.println(title);
    }

    public void setImagePosition(Point imagePosition) {
        this.imagePosition = imagePosition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitleFont(String titleFont) {
        this.titleFont = titleFont;
    }

    public void setTitleHidden(boolean titleHidden) {
        this.titleHidden = titleHidden;
    }
}
