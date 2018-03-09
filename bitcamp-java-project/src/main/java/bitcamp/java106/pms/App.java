package bitcamp.java106.pms;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String help, view;
        Team[] teams = new Team[100];
        Member[] members = new Member[100];
        int i, ii, iii;
        int count1 = 0;
        int count2 = 0;
       
        for(;;){

            help = sc.nextLine();
            if(help.toLowerCase().equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : memver/list");
                System.out.println("회원 상세 조회 명령 : member/view");
                System.out.println("종료 : quit");
            }
            else if(help.toLowerCase().equals("team/add")) {
                for(i = count1; i < teams.length ; ){
                    ++count1;
                    teams[i] = new Team();
                    System.out.println("팀명? ");
                    teams[i].name = sc.nextLine();
                    
                    System.out.println("설명? ");
                    teams[i].what = sc.nextLine();
                    
                    System.out.println("최대인원? ");
                    teams[i].max = sc.nextLine();
                    
                    System.out.println("시작일? ");
                    teams[i].startDate = sc.nextLine();
                    
                    System.out.println("종료일? ");
                    teams[i].endDate = sc.nextLine();
                    break;
                }
            }else if(help.toLowerCase().equals("team/list")) {
                for(int b = 0 ; b < count1 ; b++ ) {
                    System.out.printf("%s, %s, %s ~ %s %n",
                        teams[b].name, teams[b].max, teams[b].startDate, teams[b].endDate);
                }
            }
            else if(help.toLowerCase().equals("team/view 비트오케이")) {
                System.out.print("해당 이름의 팀이 없습니다.");
          
            }else if(help.toLowerCase().equals("member")) {
                System.out.println("팀명을 입력하시기 바랍니다.");
            }
    
            else if(help.toLowerCase().equals("member/add")) {
                for(iii = count2; iii < members.length ; ){
                    ++count2;
                    members[iii] = new Member();
    
                    System.out.println("아이디? ");
                    members[iii].id = sc.nextLine();
                    
                    System.out.println("이메일? ");
                    members[iii].email = sc.nextLine();
                    
                    System.out.println("암호? ");
                    members[iii].pw = sc.nextLine();
                        
                        break;
                    }
            }
    
            else if(help.toLowerCase().equals("member/list")) {
                for(int a = 0; a < count2 ; a++ ) {
                    System.out.printf("%s, %s, %s %n",
                        members[a].id, members[a].email, members[a].pw);
                }
            }

            else if(help.toLowerCase().equals("quit")){
                break;
        }
    }
        
    }
}

