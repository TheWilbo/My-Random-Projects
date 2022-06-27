public class Pythag {
    public static double pythag(double first, double second, boolean solveForHypotnuse){
        double returnStatement;
        if (solveForHypotnuse){
            returnStatement = Math.sqrt(Math.pow(first,2) + Math.pow(second,2));
        } else {
            returnStatement = Math.sqrt(Math.pow(first,2) - Math.pow(second,2));
        }
        return returnStatement;
    }
}
