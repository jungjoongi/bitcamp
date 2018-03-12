package bitcamp.java106.pms;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Team[] teams = new Team[1000];
        int teamIndex = 0;
        
        
        while (true) {
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null; // 문자열 없음!
            if (arr.length == 2) {
                option = arr[1];
            }


            if (menu.equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;
            }else if (menu.equals("help")) {
                System.out.println("[도움말]");
                System.out.println("team/add");
                System.out.println("team/list");
                System.out.println("team/view 팀명");
                System.out.println("member/add");
                System.out.println("member/list");
                System.out.println("member/view 아이디");
                System.out.println("quit");
            } else if (menu.equals("team/add")) {
                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();

                System.out.print("설명? ");
                team.what = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.max = keyScan.nextLine();

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                teams[teamIndex++] = team;
        

                
            } else if (menu.equals("team/list")) {
                 System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                    System.out.printf("%s, %s, %s ~ %s%n",
                    teams[i].name, teams[i].max,
                    teams[i].startDate, teams[i].endDate);
                    
                }
            } else if (menu.equals("team/view")) {
                System.out.println("[팀 정보 조회]");
                if (option == null) {
                System.out.println("팀명을 입력하시기 바랍니다.");
                System.out.println();
                continue;
                }

                for(int i = 0;  i < teamIndex; i++) {
                    if (option.equals(teams[i].name.toLowerCase())) {
                        System.out.printf("팀명: %s%n", teams[i].name);
                        System.out.printf("설명: %s%n", teams[i].what);
                        System.out.printf("최대인원: %s%n", teams[i].max);
                        System.out.printf("기간: %s%n",
                            teams[i].startDate, teams[i].endDate);
                        
                    }
                }
                System.out.println(option);
            }
            System.out.println();
            
        }

    }
}