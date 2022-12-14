package HUSP_SP;

/**
 * Created by Jiexiong Zhang, Wensheng Gan @HITsz, China
 */
public class UItem {
    private int itemName;
    private int utility;

    public UItem(int item, int utility) {
        this.itemName = item;
        this.utility = utility;
    }

    public int utility() {
        return utility;
    }

    public int itemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "UItem(" + itemName + ", " + utility + ')';
    }
}
