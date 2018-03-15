package bitcamp.java106.pms.controller;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;
import java.util.Scanner;

public class BoardController {
    public static Scanner keyScan;
    static Board[] boards = new Board[1000];
    static int boardIndex = 0;

    public static void service(String menu, String option) {
        if (menu.equals("board/add")) {
            onBoardAdd();
        } else if (menu.equals("board/list")) {
            onBoardList();
        } else if (menu.equals("board/view")) {
            onBoardView(option);
        } else if (menu.equals("board/update")) {
            onBoardUpdate(option);
        } else if (menu.equals("board/delete")) {
            onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    static int getBoardIndex(String name) {
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (name.equals(boards[i].title.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
    static void onBoardAdd() {
        System.out.println("[팀 정보 입력]");
        Board board = new Board();

        System.out.print("제목? ");
        board.title = keyScan.nextLine();

        System.out.print("내용? ");
        board.post = keyScan.nextLine();

        System.out.print("등록일? ");
        board.date = keyScan.nextLine();
        
        // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        boards[boardIndex++] = board;
    }

    static void onBoardList() {
        System.out.println("[게시글 목록]");
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            System.out.printf("%d, %s, %s\n", 
                i, boards[i].title, boards[i].date);
        }
    }

    static void onBoardView(String name) {
        System.out.println("[팀 정보 조회]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; // 값을 리턴하면 안되기 때문에 return 명령만 작성한다.
                    // 의미? 즉시 메서드 실행을 멈추고 이전 위치로 돌아간다.
        }
        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Board board = boards[i];
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.post);
            System.out.printf("등록일: %s\n", board.date);
        }
    }

    static void onBoardUpdate(String name) {
        System.out.println("게시글 변경]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Board board = boards[i];
            Board updateBoard = new Board();
            System.out.printf("제목(%s)? ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s)? ", board.post);
            updateBoard.post = keyScan.nextLine();

            boards[i] = updateBoard;
            System.out.println("변경하였습니다.");
        }
    }

    static void onBoardDelete(String name) {
        System.out.println("[팀 정보 삭제]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        int i = getBoardIndex(name);

        if (i == -1) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?(y/N) ")) {
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
}
