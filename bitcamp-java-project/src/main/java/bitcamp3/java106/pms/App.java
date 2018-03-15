package bitcamp3.java106.pms;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Team[] teams = new Team[1000];
        int teamIndex = 0;


        while(true) {
            System.out.println("명령> ");

            String arr[] = keyScan.nextLine().toLowerCase().split(" ");
            String option = null;
            String menu = arr[0];
            if (arr.length ==2) {
                option = arr[1];
            }

            if (menu.equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;
            
            } else if (menu.equals("help")) {
                System.out.println("팀 등록 명령: team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
         
            } else if (menu.equals("team/add")) {
                Team team = new Team();
                System.out.println("팀명? ");
                team.name = keyScan.nextLine();
                
                System.out.println("설명? ");
                team.what = keyScan.nextLine();
                
                System.out.println("최대인원? ");
                team.max = keyScan.nextLine();
                
                System.out.println("시작일? ");
                team.startDate = keyScan.nextLine();
                
                System.out.println("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team;

            } else if (menu.equals("team/list")) {
                for (int i = 0 ; i < teamIndex ; i++) {
                    System.out.printf("%s. %s, %s, %s%n", 
                    teams[i].name, teams[i].what, teams[i].startDate, teams[i].endDate);
                }

            } else if (menu.equals("team/view")) {
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    continue;
                } 

                Team team = null;
                for (int i = 0; i < teamIndex; i++) {
                    if (option.equals(teams[i].name.toLowerCase())) {
                        team = teams[i];
                        break;
                    }
                }
                if (team == null) {
                    System.out.println("해당 이름의 팀이 없습니다.");
                } else {
                    System.out.printf("팀명: %s\n", team.name);
                    System.out.printf("설명: %s\n", team.what);
                    System.out.printf("최대인원: %d\n", team.max);
                    System.out.printf("기간: %s ~ %s\n", 
                        team.startDate, team.endDate);
                }



            } 

        }

    }
}