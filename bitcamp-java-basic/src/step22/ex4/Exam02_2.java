// 객체읽기 - 파일이 데이터를 읽어 인스턴스로 만들기
package step22.ex4;


public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream("temp/test4.data"); 
        
        Member member = null;
        
        member = new Member();
        
        //1) 이름읽기
        member.name = in.readUTF();
        
        //2) 나이읽기
        member.age += in.readInt();
        
        //3) 
        member.gender = in.readBoolean();
        
        in.close();
        
        System.out.printf("%s\n", in.read());
    }
}






