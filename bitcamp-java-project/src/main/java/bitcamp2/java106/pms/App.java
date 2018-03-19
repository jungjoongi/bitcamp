package bitcamp2.java106.pms;
import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

public class App {
    
    static Team[] teams = new Team[1000];
    static int teamIndex = 0;
    static String option = null;
    static Scanner keyScan = new Scanner(System.in);
    static Object staticFieldObject;
    static String[] prompt() {
        System.out.print("명령> ");           
        return keyScan.nextLine().toLowerCase().split(" ");
    }
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }
    static void onHelp() {
        System.out.println("[도움말]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("팀 변경 : team/update 팀명");
        System.out.println("팀 삭제 : team/delete 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("회원 변경 : member/update 아이디");
        System.out.println("회원 삭제 : member/delete 아이디");
        System.out.println("게시글 등록 : board/add");
        System.out.println("게시글 목록 : board/list");
        System.out.println("게시글 조회 : board/view 게시글");
        System.out.println("게시글 변경 : board/update 게시글");
        System.out.println("게시글 변경 : board/delete 게시글");
        System.out.println("종료 : quit");
    }
    
    int i = 2;
    static void onTeamAdd() {
        System.out.println("[팀 정보 입력]");
        Team team = new Team();
    
        System.out.print("팀명? ");
        team.name = keyScan.nextLine();
    
        System.out.print("설명? ");
        team.description = keyScan.nextLine();
    
        System.out.print("최대인원? ");
        team.maxQty = keyScan.nextInt();
        keyScan.nextLine(); 
    
        System.out.print("시작일? ");
        team.startDate = keyScan.nextLine();
    
        System.out.print("종료일? ");
        team.endDate = keyScan.nextLine();
    
    
        teams[teamIndex++] = team;
    }

    static void onTeamList() {

        System.out.println("[팀 목록]");
        for (int i = 0; i < teamIndex; i++) {
            System.out.printf("%s, %d, %s ~ %s%n",
            teams[i].name, teams[i].maxQty,
            teams[i].startDate, teams[i].endDate);
        }
    }

    static void onTeamView() {

        if (option == null) {
            System.out.println("팀명을 입력해주세요!");
        } else  {
            for (int i = 0 ; i < teamIndex ; i++) {
                if (option.equals(teams[i].name)) {
                    System.out.printf("팀명 :%s%n", teams[i].name);
                    System.out.printf("설명 :%s%n", teams[i].description);
                    System.out.printf("최대인원 :%s%n", teams[i].maxQty);
                    System.out.printf("기간 :%s ~ %s%n", teams[i].startDate, teams[i].endDate);
                    
                    break;
                } else {
                    System.out.println("해당 팀 이름이 없습니다.");
                    
                }
            }
        }

    }

    static void onTeamUpdate() {

        if (option == null) {
            System.out.println("팀명을 입력해주세요!");
        } else  {
            for (int i = 0 ; i < teamIndex ; i++) {
                Team updateTeam = new Team();
                if (option.equals(teams[i].name)) {
                    System.out.printf("팀명(%s)%n", teams[i].name);
                    updateTeam.name = keyScan.nextLine();
                  
                    System.out.printf("설명(%s)%n", teams[i].description);
                    updateTeam.description = keyScan.nextLine();
                  
                    System.out.printf("최대인원(%s)%n", teams[i].maxQty);
                    updateTeam.maxQty = keyScan.nextInt();
                    keyScan.nextLine(); 
                  
                    System.out.printf("시작일(%s)%n", teams[i].startDate);
                    updateTeam.startDate = keyScan.nextLine();
                  
                    System.out.printf("종료일(%s)%n", teams[i].endDate);
                    updateTeam.endDate = keyScan.nextLine();

                    teams[i] = updateTeam;

                } else {
                    System.out.println("해당 팀 이름이 없습니다.");
                    
                }
            }
        }

    }
    
    static void onTeamDelete() {
        String delete = keyScan.nextLine();
        

        if (option == null) {
            System.out.println("팀명을 입력해주세요!");
        } else {
            Team deleteTeam = new Team();
            for (int i = 0 ; i < teamIndex ; i++) {
                if (option.equals(teams[i].name)) {
                     System.out.println("정말로 삭제하시겠습니까? y/N");
                        if (delete.equals("y")) {
                            deleteTeam = null;
                            teams[i] = deleteTeam;
                        } else {
                            continue;
                            
                        }
                }
            }
        }

    }

    public static void main(String[] args) {
        
        while(true) {
            String arr[] = prompt();
            String prompt = arr[0];
            
            if (arr.length == 2) {
                option = arr[1];
            }

            if (prompt.equals("quit")) {
                onQuit();
                break;
            } else if (prompt.equals("help")) {
                onHelp();
                
                
            } else if (prompt.equals("team/add")) {
                onTeamAdd();
            

            } else if(prompt.equals("team/list")) {
                onTeamList();
            
            } else if (prompt.equals("team/view")) {
                onTeamView();
         
            } else if (prompt.equals("team/update")) {
                onTeamUpdate();
 
            } else if (prompt.equals("team/delete")) {
                onTeamDelete();
            }

            
            
            
            
            
            
        }
    
    }
}