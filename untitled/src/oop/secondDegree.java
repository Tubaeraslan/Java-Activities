package oop;

public class secondDegree {
    int a;
    int b;
    int c;
    int d;

    public secondDegree(int x,int y,int z){
        this.a=x;
        this.b=y;
        this.c=z;
    }

    public void result(){
        this.d=(b*b)-4*a*c;
        if(d<0){
            System.out.println("No roots");
        } else if (d==0) {
            equalRoots();
        }
        else{
            twoDigits();
        }
    }

    public void equalRoots(){
        int x= -(b)/(2*a);
        System.out.println("They are equal roots = "+x);
    }

    public void twoDigits(){
        int x=(int) ((-b +Math.sqrt((d))/(2*a)));
        int y=(int) ((-b -Math.sqrt((d))/(2*a)));
        System.out.println("There are two different roots " + x +" and "+y);
    }

}
