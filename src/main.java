public class main {
    public static void main(String[] args) {
// define coordinate for rectangle 1
        int x1=6,y1=6,x2=8,y2=8;
// define coordinate for rectangle 2
        int x3=1,y3=8,x4=4,y4=9;
// find x_max y_max, x_min, y_min
        int x_max=Math.max(Math.max(x1,x2),Math.max(x3,x4));
        int y_max=Math.max(Math.max(y1,y2),Math.max(y3,y4));
        int x_min=Math.min(Math.min(x1,x2),Math.min(x3,x4));
        int y_min=Math.min(Math.min(y1,y2),Math.min(y3,y4));
// return area of min square to cover rectangle 1 and rectangle 2
        int l_max=Math.max(x_max-x_min,y_max-y_min);
        System.out.println(l_max*l_max);
    }
}