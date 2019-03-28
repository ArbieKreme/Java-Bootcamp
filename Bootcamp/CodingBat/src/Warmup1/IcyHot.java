package Warmup1;

public class IcyHot {
    public boolean IcyHot(int temp1, int temp2) {
        boolean flag = false;
        if((temp1<0&&temp2>100)||(temp2<0&&temp1>100)){
            return true;
        }
        return flag;
    }
}
