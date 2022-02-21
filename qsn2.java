import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

class circle{
        void area(int r){
            System.out.println(Math.PI*r*r);
        }
        void perimeter(int r){
            System.out.println(2*Math.PI*r);
        }
    }
   
    
    class rectangle{
        public void area(int l,int b){
            System.out.println(l*b);
        }
       public  void perimeter(int l,int b){
            System.out.println(2*(l+b));
        }
    }

    class triangle{
        public void area(int h,int b){
            System.out.println(0.5*h*b);
        }
       public  void perimeter(int l,int b){
            System.out.println(2*(l+b));
        }
    }
    class square{
        public void area(int a){
            System.out.println(a*a);
        }
       public  void perimeter(int a){
            System.out.println(4*a);
        }
    }
    class sphere extends circle{
        void area(int r){
            System.out.println(4*Math.PI*r*r);
        }
       
        
       public  void volume(int r){
            System.out.println((4/3)*Math.PI*r*r*r);
        }
    }
    class cylinder extends circle{
        void area(int r, int h){
            System.out.println((2+h)*Math.PI*r*r); 
        }
       
        
       public  void volume(int r,int h){
            System.out.println(Math.PI*r*r*h);
        }
    }
class qsn2{

    public static void main(String[] args) {
        System.out.println("Select the shape to calculate area and perimeters for :")
        System.out.println("1:Circle");
        System.out.println("2:Rectangle");
        System.out.println("3:Triangle");
        System.out.println("4:Square");
        System.out.println("5:Sphere");
        System.out.println("6:Cylinder");
        System.out.println("7:exit");
       
        

        while(true){
            int f;
            Scanner sc=new Scanner(System.in);
            f=sc.nextInt();
            
            switch (f) {
                case 1:
                int r=sc.nextInt();
                circle c=new circle();
                c.area(r);
                c.perimeter(r);     
                break;
                case 2:
                int l=sc.nextInt();
                int b=sc.nextInt();
                rectangle t=new rectangle();
                t.area(l,b);
                t.perimeter(l,b);

                
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 5:
                
                break;
                case 6:
                    
                break;
                case 7:
                    
                break;
                
                
            }
        }
        
    }
}