package step22.ex7;

import java.io.FileOutputStream;

public class Exam01_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream FileOut = new FileOutputStream("temp/test7.data");
        DataOutputStream out = new DataOutputStream(FileOut);
        
        Member member = new Member(); 
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        out.writeUTF(member.name);
        out.writeInt(member.age);
        out.writeBoolean(member.gender);
        
        out.close();

        System.out.println("데이터 출력 완료!");

    }
}