package Warmup1;

public class StartHi {
    public boolean StartHi(String str) {
        String[] arrStr = str.split(" ");
        if(arrStr[0].toLowerCase().equals("hi")){
            return true;
        }
        return false;
    }
}
