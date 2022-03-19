import java.util.Scanner;
public class sa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fan Type: ");
        String fantype = input.nextLine();
        System.out.print("Enter Fan Manufacturer Name: ");
        String manufacturer = input.nextLine();
        System.out.print("Enter Model Name: ");
        String model = input.nextLine();
        Fan f1 = new Fan(fantype, manufacturer, model);
        boolean flag = true;
        while (true) {
            System.out.println("******");
            System.out.println(
                    "1. SetFan()\n2. Getfan()\n3. On()\n4. Off()\n5. SpeedUp()\n6. SpeedDown()\n7. Exit\nEnter your choice: ");
            int a = input.nextInt();
            switch (a) {
            case 1:
                System.out.print("Enter Speed between 1 to 5: ");
                int sp = input.nextInt();
                if (sp < 0 || sp > 5) {
                    System.out.println("Invalid Input");
                } else
                    f1.setFan(sp);
                break;
            case 2:
                f1.getFan();
                break;
            case 3:
                f1.on();
                break;
            case 4:
                f1.off();
                break;
            case 5:
                f1.SpeedUP();
                break;
            case 6:
                f1.speeddown();
                break;
            case 7:
                flag = false;
                break;
            default:
                System.out.println("Enter Valid Options");
            }
            if (!flag)
                break;
        }
        input.close();
    }
}