// 파일정보조회
package step16.ex1;

import java.io.File;

public class Exam02 {
    public static void main(String[] args) throws Exception{
        File currentDir = new File("./src/step16/Exam01.java");
        System.out.printf("파일명: %s\n", currentDir.getName());
        System.out.printf("경로: %s\n", currentDir.getPath());
        System.out.printf("절대경로: %s\n", currentDir.getAbsolutePath());
        System.out.printf("계산된 절대경로: %s\n", currentDir.getCanonicalPath());
        System.out.printf("총크기: %s\n", currentDir.getTotalSpace());
        System.out.printf("남은크기: %d\n", currentDir.getFreeSpace());
        System.out.printf("가용크기: %d\n", currentDir.getUsableSpace());
        System.out.printf("디렉토리 여부: %b\n", currentDir.isDirectory());
        System.out.printf("파일토리 여부: %b\n", currentDir.isFile());
        System.out.printf("파일토리 여부: %b\n", currentDir.isHidden());
        System.out.printf("존재여부: %b\n", currentDir.exists());
        System.out.printf("실행가능 여부: %b\n", currentDir.canExecute());
        
        System.out.println("-------------------------");
        File paremtDir = new File("/src/step16/Exam01.java");
        System.out.printf("파일명: %s\n", paremtDir.getName());
        System.out.printf("경로: %s\n", paremtDir.getPath());
        System.out.printf("절대경로: %s\n", paremtDir.getAbsolutePath());
        System.out.printf("계산된 절대경로 %s\n", paremtDir.getCanonicalPath());
        System.out.printf("총크기: %d\n", paremtDir.getTotalSpace());
        System.out.printf("남은크기: %d\n", paremtDir.getFreeSpace());
        System.out.printf("가용크기: %d\n", paremtDir.getUsableSpace());
        System.out.printf("디렉토리 여부: %b\n", paremtDir.isDirectory());
        System.out.printf("파일토리 여부: %b\n", paremtDir.isFile());
        System.out.printf("파일토리 여부: %b\n", paremtDir.isHidden());
        System.out.printf("존재여부: %b\n", paremtDir.exists());
        System.out.printf("실행가능 여부: %b\n", paremtDir.canExecute());
        
    }
}
