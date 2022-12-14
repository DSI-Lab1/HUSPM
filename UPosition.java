package HUSP_SP;

/**
 * Created by Jiexiong Zhang, Wensheng Gan @HITsz, China
 */
public class UPosition {
    private int index;
    private int utility;

    public UPosition(int index, int utility) {
        this.index = index;
        this.utility = utility;
    }
    
    public int index() {
        return index;
    }
    
    public int utility() {
        return utility;
    }
    
    @Override
    public String toString() {
        String ret = "";
        ret += "(index: " + index + "  utility: " + utility + ")";
        return ret;
    }
}
