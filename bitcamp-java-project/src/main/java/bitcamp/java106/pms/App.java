package bitcamp.java106.pms;
import java.util.Scanner;

public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    static Team[] teams = new Team[1000];
    static int teamIndex = 0;
    static String option = null;
    static String e = "";
    


    static String[] prompt() {
        System.out.println("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }

    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }

    static void onHelp() {
        System.out.println("팀 등록 명령: team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
    }

    static void onTeamAdd() {
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
    }

    public static void onTeamList() {
        for (int i = 0 ; i < teamIndex ; i++) {
            if(teams[i] == null) continue;
            System.out.printf("%s. %s, %s, %s%n", 
            teams[i].name, teams[i].what, teams[i].startDate, teams[i].endDate);
        }
    }

    public static void onTemaView() {
        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        } 

        Team team = null;
        for (int i = 0; i < teamIndex; i++) {
            if(teams[i] == null) continue;
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

    public static void onTeamUpdate() {
        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        } 

        for (int i = 0; i < teamIndex; i++) {
            if(teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())) {

                String before1 = teams[i].name;
                String before2 = teams[i].what;
                String before3 = teams[i].max;
                String before4 = teams[i].startDate;
                String before5 = teams[i].endDate;
              
                System.out.println("팀명? ");
                teams[i].name = keyScan.nextLine();
                
                System.out.println("설명? ");
                teams[i].what = keyScan.nextLine();
                
                System.out.println("최대인원? ");
                teams[i].max = keyScan.nextLine();
                
                System.out.println("시작일? ");
                teams[i].startDate = keyScan.nextLine();
                
                System.out.println("종료일? ");
                teams[i].endDate = keyScan.nextLine();
                
                System.out.printf("팀명: %s이(가)서 %s로 변경되었습니다.%n", before1, teams[i].name);
                System.out.printf("설명: %s이(가)서 %s로 변경되었습니다.%n", before2, teams[i].what);
                System.out.printf("팀명: %s이(가)서 %s로 변경되었습니다.%n", before3, teams[i].max);
                System.out.printf("기간: %s ~ %s가 기간: %s ~ %s로 변경되었습니다.%n", 
                before4, before5, teams[i].startDate, teams[i].endDate);
                break;
            }else 
            System.out.println("해당 이름의 팀이 없습니다.");
        }
    }
    public static void onTeamDelete() {
        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        } 

        for (int i = 0; i < teamIndex; i++) {
            if(teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())) {
                System.out.println("정말로 삭제하시겠습니까?(y/N)");
                if (keyScan.nextLine().equals("y")){
                    teams[i] = null;
                 
    
                   System.out.println("삭제하였습니다.");
                   break;
                } else 
                    return;

            }else 
            System.out.println("해당 이름의 팀이 없습니다.");
            break;
        }
    }
    
    public static void onDelete2() {
        
    }

    public static void main(String[] args) {

        while(true) {

            String[] arr = prompt();
            
            String menu = arr[0];
            if (arr.length ==2) {
                option = arr[1];
            }

            if (menu.equals("quit")) {
                onQuit();
                break;
            
            } else if (menu.equals("help")) {
                onHelp();
         
            } else if (menu.equals("team/add")) {
                onTeamAdd();

            } else if (menu.equals("team/list")) {
                onTeamList();
                

            } else if (menu.equals("team/view")) {
                onTemaView();

            } else if (menu.equals("team/update")) {
                onTeamUpdate();
            }
            else if (menu.equals("team/delete")) {
                onTeamDelete();
            }

             
        }
    }
}