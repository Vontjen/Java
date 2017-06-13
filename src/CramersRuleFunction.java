/**
 * Created by vdabcursist on 13/06/2017.
 */
public class CramersRuleFunction {
    public static double[] cramer(double a, double b, double c, double d, double e, double f){
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        return new double[]{x,y};

    }
}
