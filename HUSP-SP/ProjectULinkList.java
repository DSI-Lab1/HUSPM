package HUSP_SP;

import java.util.ArrayList;

/**
 * Created by Jiexiong Zhang, Wensheng Gan @HITsz, China
 */
public class ProjectULinkList {
    /** the ULinkList, which transformed from the transaction in original database. */
    private ULinkList uLinkList;
    
    /** a sequence has multiple match in one transaction, represented as UPosition here. */
    private ArrayList<UPosition> uPositions;
    
    /** the utility of a sequence in this transaction, defined as the maximal utility of matches,
     * in other word, is the maximum utility of UPositions. */
    private double utility;

    /**
     * Project ULink-list
     * 
     * @param uLinkList
     * @param uPositions
     * @param utility
     */
    public ProjectULinkList(ULinkList uLinkList, ArrayList<UPosition> uPositions, double utility) {
        this.uLinkList = uLinkList;
        this.uPositions = uPositions;
        this.utility = utility;
    }

    public ULinkList getULinkList() {
        return uLinkList;
    }

    public ArrayList<UPosition> getUPositions() {
        return uPositions;
    }

    public double utility() {
        return utility;
    }

    @Override
    public String toString() {
        String ret = "ProjectULinkList: <Position: [";
        for (UPosition position: uPositions) {
            ret += position + "  ";
        }
        ret += "]";
        ret += ">";
//        ret += "\n";
//        ret += uLinkList;
        return ret;
    }
}
