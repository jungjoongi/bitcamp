package bitcamp2.java106.pms;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("도움말 -> help");
        Team[] teams = new Team[1000];
        int teamIndex = 0;
 
        while (true) {
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null;
            if (arr.length == 2) {
                option = arr[1];
            }


            if(menu.toLowerCase().equals("quit")) {
                System.out.println("안녕히 가세요!");
                break;
            } else if (menu.equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                System.out.println();
            
            } else if (menu.equals("team/add")) {
                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();

                System.out.print("설명? ");
                team.what = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.max = keyScan.nextLine();
                keyScan.nextLine(); 

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();

                // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
                teams[teamIndex++] = team;

                //System.out.printf("%s, %s, %d, %s, %s\n", 
                //    team.name, team.description, team.maxQty, team.startDate, team.endDate);
                System.out.println();
                
            } else if (menu.equals("team/list")) {
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                    System.out.printf("%s, %s, %s ~ %s\n", 
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
                    System.out.printf("최대인원: %s\n", team.max);
                    System.out.printf("기간: %s ~ %s\n", 
                        team.startDate, team.endDate);
                }
            }
            System.out.println();
        }
    }
}