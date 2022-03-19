
import java.util.Scanner;




   
    
    class rectangle{
        public void area(int l,int b){
            System.out.println(l*b);
        }
       public  void perimeter(int l,int b){
            System.out.println(2*(l+b));
        }
    }

    class triangle{
        public void area(double a,double b,double c){
            double s=(a+b+c)/(double)2;
            System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
       public  void perimeter(double a,double b,double c){
            System.out.println(a+b+c);
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

    class circle{
        public int r;
     
         public circle(int a){
             r=a;
     
         }
             double area(){
                 return (Math.PI*r*r);
             }
             double perimeter(){
                 return (2*Math.PI*r);
             }
         }
    class sphere extends circle{
        public sphere(){
            super(a);
        }
       
        
         double area(){
            return area()*4;
        }
       
        
       public  double volume(){
            return ((4/3)*area()*r);
        }
    }
    class cylinder extends circle{
        public cylinder (int a, int h){
            super(a);
            height=h;
        }
        double area(){
            return (2+h)*area(); 
        }
       
        
       public  double volume(){
            return (area()*h);
        }
    }
class qsn2{

    public static void main(String[] args) {
        System.out.println("Select the shape to calculate area and perimeters for :  \n 1:Circle \n 2:Rectangle \n 3:Triangle \n 4:Square \n 5:Sphere  \n 6:Cylinder  \n 7:exit  ");
      
       
        

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
                double p=sc.nextDouble();
                double q=sc.nextDouble();
                double z=sc.nextDouble();
                triangle v=new triangle();
                v.area(p, q, z);


                break;
                case 4:
                    
                break;
                case 5:
                
                break;
                case 6:
                cylinder cyl=new cylinder(10, 10);
                System.out.println(cyl.area());
                System.out.println(cyl.volume());
                    
                break;
                case 7:
                    return;
                
                
                
            }
        }
        
    }
}