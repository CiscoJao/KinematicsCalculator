package kinematicscalculator;

public class OtherMethods {
    
    // checks how many of the values are empty
    static int checkEmpty(String a, String b, String c, String d, String e) {
        
        int x = 0;
        
        if(a.isEmpty()) {
            x++;
        }
        
        if(b.isEmpty()) {
            x++;
        }
        
        if(c.isEmpty()) {
            x++;
        }
        
        if(d.isEmpty()) {
            x++;
        }
        
        if(e.isEmpty()) {
            x++;
        }
        
        return x;
    }
    
    // returns an int based on what scenario it is
    static int chooseEquation(String vel1, String vel2, String acc, String dis, String time) {
        
        if(vel1.isEmpty()) {
            if(vel2.isEmpty()) {
                return 6;
            }
            else if(acc.isEmpty()) {
                return 7;
            }
            else if(dis.isEmpty()) {
                return 8;
            }
            else if(time.isEmpty()) {
                return 9;
            }
            else {
                return 1;
            }
        }
        
        if(vel2.isEmpty()) {
            if(acc.isEmpty()) {
                return 10;
            }
            else if(dis.isEmpty()) {
                return 11;
            }
            else if(time.isEmpty()) {
                return 12;
            }
            else {
                return 2;
            }
        }
        
        if(acc.isEmpty()) {
            if(dis.isEmpty()) {
                return 13;
            }
            else if(time.isEmpty()) {
                return 14;
            }
            else {
                return 3;
            }
        }
        
        if(dis.isEmpty()) {
            if(time.isEmpty()) {
                return 15;
            }
            else {
                return 4;
            }
        }
        
        if(time.isEmpty()) {
            return 5;
        }
        
        return 0;
    }
}
