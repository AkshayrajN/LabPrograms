interface test{

int square(int num);
int add(int x,int y);
int sub(int x,int y);
}

class arithmatic implements test{

public int square(int num){

return num*num;

}
public int add(int x,int y){

return x+y;
}
public int sub(int x,int y){
        return x-y;
}
}
class ToTestInt{

public int ans(int x){
        arithmatic a1=new arithmatic();
        return a1.square(x);

}

}
public class Interface{
public static void main(String []args){
        int num=5;
        ToTestInt t1=new ToTestInt();
        System.out.println("The square of the number "+num+" "+"is "+ t1.ans(num));
        int x=10,y=20;
        arithmatic a1=new arithmatic();
        System.out.println("Addition "+a1.add(x,y));
}
}
