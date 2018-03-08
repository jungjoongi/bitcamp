package bitcamp.java106.pms;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        int i;
        Project[] arr = new Project[5];
        
        for(i = 0; i < arr.length; i++) {
            arr[i] = new Project();
            System.out.println("팀명? ");
            arr[i].name = sc.nextLine();
            System.out.println("설명? ");
            arr[i].what = sc.nextLine();
            System.out.println("최대인원? ");
            arr[i].many = sc.nextLine();
            System.out.println("시작일? ");
            arr[i].startDate = sc.nextLine();
            System.out.println("종료일? ");
            arr[i].endDate = sc.nextLine();
       
            System.out.println("계속 입력하시겠습니까? Y/n ");
            choice = sc.nextLine();
                if(choice.equals("y")) {
                   
                }else if(choice.equals("n")){
                    i += 1;
                    break ;
                }
            }
            System.out.println("--------------------------");
            for(int a = 0; a < i; a++) {
                System.out.printf("%s, %s, %s명, %s ~ %s %n",
                arr[a].name, arr[a].what, arr[a].many, arr[a].startDate, arr[a].endDate);
        }
    }
}