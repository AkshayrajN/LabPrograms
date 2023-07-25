class Shapes{
void draw(){
        System.out.println("The shape is drawn");
}
void erase(){
        System.out.println("Erased");
        }
}
class Circle extends Shapes{
        void draw(){
                System.out.println("Circle is drawn with radius ");
        }
        void erase(){
                System.out.println("Erased");
        }
}
class Square extends Shapes{
        void draw(){
                System.out.println("Drawing square");
        }
         void erase(){
                System.out.println("Erased");
        }
}
class Triangle extends Shapes{
        void draw(){
                System.out.println("Drawing Triangle");
        }
        void erase(){
                System.out.println("Erased");
        }
}
public class Shape{
public static void main(String []args){
        Shapes obj=new Shapes();
        obj.draw();
        obj=new Circle();
        obj.draw();
        obj.erase();
        obj=new Square();
        obj.draw();
        obj.erase();
        obj=new Triangle();
        obj.draw();
        obj.erase();
}}
