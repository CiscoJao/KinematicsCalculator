package kinematicscalculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class KinEqs {
    
    static final int TWO = 2;
    
    static String findVel1(String svel2, String sacc, String stime) {
        // v1 = v2 - at
        double vel1, vel2, acc, time;
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        time = Double.parseDouble(stime);
        
        vel1 = vel2 - (acc * time);
        String ans = String.valueOf(vel1);
        return ans;
    }
    
    static String findVel2(String svel1, String sacc, String stime) {
        // v2 = v1 + at
        double vel1, vel2, acc, time;
        vel1 = Double.parseDouble(svel1);
        acc = Double.parseDouble(sacc);
        time = Double.parseDouble(stime);
        
        vel2 = vel1 + (acc * time);
        String ans = String.valueOf(vel2);
        return ans;
    }
    
    static String findAcc(String svel1, String svel2, String stime) {
        // a = v2 - v1 / t
        double vel1, vel2, acc, time;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        time = Double.parseDouble(stime);
        
        acc = (vel2 - vel1) / time;
        String ans = String.valueOf(acc);
        return ans;
    }
    
    static String findDis(String svel1, String svel2, String sacc) {
        // d = v2^2 - v1^2 / 2a
        double vel1, vel2, acc, dis;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        
        dis = (pow(vel2, TWO) - pow(vel1, TWO)) / (TWO * acc);
        String ans = String.valueOf(dis);
        return ans;
    }
    
    static String findTime(String svel1, String svel2, String sacc) {
        // t = v2 - v1 / a
        double vel1, vel2, acc, time;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        
        time = (vel2 - vel1) / acc;
        String ans = String.valueOf(time);
        return ans;
    }
    
    static double[] findVel1AndVel2(String sacc, String sdis, String stime) {
        double acc, dis, time;
        acc = Double.parseDouble(sacc);
        dis = Double.parseDouble(sdis);
        time = Double.parseDouble(stime);
        
        // ans[0] = vel1, ans[1] = vel2
        double[] ans = new double[TWO];
        ans[0] = ((TWO * dis) - (acc * pow(time, TWO))) / (TWO * time);
        ans[1] = ans[0] + (acc * time);
        
        return ans;
    }
    
    static double[] findVel1AndAcc(String svel2, String sdis, String stime) {
        double vel2, dis, time;
        vel2 = Double.parseDouble(svel2);
        dis = Double.parseDouble(sdis);
        time = Double.parseDouble(stime);
        
        // ans[0] = vel1, ans[1] = acc
        double[] ans = new double[TWO];
        ans[0] = (TWO * dis / time) - vel2;
        ans[1] = TWO * ((vel2 * time) - dis) / pow(time, TWO);
        
        return ans;
    }
    
    static double[] findVel1AndDis(String svel2, String sacc, String stime) {
        double vel2, acc, time;
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        time = Double.parseDouble(stime);
        
        // ans[0] = vel1, ans[1] = dis
        double[] ans = new double[TWO];
        ans[0] = vel2 - (acc * time);
        ans[1] = ((vel2 * time) - (acc * pow(time, TWO)) / TWO);
        
        return ans;
    }
    
    static double[] findVel1AndTime(String svel2, String sacc, String sdis) {
        double vel2, acc, dis;
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        dis = Double.parseDouble(sdis);
        
        // ans[0] = vel1, ans[1] = time
        double[] ans = new double[TWO];
        ans[0] = sqrt(pow(vel2, TWO) - (TWO * acc * dis));
        ans[1] = (vel2 - ans[0]) / acc;
        
        return ans;
    }
    
    static double[] findVel2AndAcc(String svel1, String sdis, String stime) {
        double vel1, dis, time;
        vel1 = Double.parseDouble(svel1);
        dis = Double.parseDouble(sdis);
        time = Double.parseDouble(stime);
        
        // ans[0] = vel2, ans[1] = acc
        double[] ans = new double[TWO];
        ans[0] = ((TWO * dis) / time) - vel1;
        ans[1] = TWO * (dis - (vel1 * time)) / pow(time, TWO);
        
        return ans;
    }
    
    static double[] findVel2AndDis(String svel1, String sacc, String stime) {
        double vel1, acc, time;
        vel1 = Double.parseDouble(svel1);
        acc = Double.parseDouble(sacc);
        time = Double.parseDouble(stime);
        
        // ans[0] = vel2, ans[1] = dis
        double[] ans = new double[TWO];
        ans[0] = vel1 + (acc * time);
        ans[1] = (vel1 * time) + (acc * pow(time, TWO) / TWO);
        
        return ans;
    }
    
    static double[] findVel2AndTime(String svel1, String sacc, String sdis) {
        double vel1, acc, dis;
        vel1 = Double.parseDouble(svel1);
        acc = Double.parseDouble(sacc);
        dis = Double.parseDouble(sdis);
        
        // ans[0] = vel2, ans[1] = time
        double[] ans = new double[TWO];
        ans[0] = sqrt(pow(vel1, TWO) + (TWO * acc * dis));
        ans[1] = (ans[0] - vel1) / acc;
        
        return ans;
    }
    
    static double[] findAccAndDis(String svel1, String svel2, String stime) {
        double vel1, vel2, time;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        time = Double.parseDouble(stime);
        
        // ans[0] = acc, ans[1] = dis
        double[] ans = new double[TWO];
        ans[0] = (vel2 - vel1) / time;
        ans[1] = (vel1 + vel2) / TWO * time;
        
        return ans;
    }
    
    static double[] findAccAndTime(String svel1, String svel2, String sdis) {
        double vel1, vel2, dis;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        dis = Double.parseDouble(sdis);
        
        // ans[0] = acc, ans[1] = time
        double[] ans = new double[TWO];
        ans[0] = (pow(vel2, TWO) - pow(vel1, TWO)) / (TWO * dis);
        ans[1] = TWO * dis / (vel1 + vel2);
        
        return ans;
        
    }
    
    static double[] findDisAndTime(String svel1, String svel2, String sacc) {
        double vel1, vel2, acc;
        vel1 = Double.parseDouble(svel1);
        vel2 = Double.parseDouble(svel2);
        acc = Double.parseDouble(sacc);
        
        // ans[0] = dis, ans[1] = time
        double[] ans = new double[TWO];
        ans[0] = (pow(vel2, TWO) - pow(vel1, TWO)) / (TWO * acc);
        ans[1] = (vel2 - vel1) / acc;
        
        return ans;
    }
}
