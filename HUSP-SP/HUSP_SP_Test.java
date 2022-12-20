package HUSP_SP;

import java.io.IOException;

/**
 * This is an implementation of the HUSP-SP algorithm as presented in this paper: <br/><br/>
 * 
 *    Yuting Yang, Wensheng Gan et al. "HUSP-SP: Faster Utility Mining on Sequence Data"
 *
 * 
 * @author Yuting Yang & Wensheng Gan, HITsz, China.
 * 
 */
public class HUSP_SP_Test {
    public static void main(String[] args) throws IOException {
        double minUtilityRatio = 0.012;
        String dataset = "SIGN";
        String input = "./dataFile/" + dataset + ".txt";
        String input = "F:\\桌面\\exp\\dataFile\\" + dataset + ".txt";
        String output = "huspminer.txt";

        // run the algorithm
        HUSP_SP_Algo huspMiner = new HUSP_SP_Algo(input, minUtilityRatio, output);
        huspMiner.runAlgo();

        // print statistics
        huspMiner.printStatistics();
    }
}
