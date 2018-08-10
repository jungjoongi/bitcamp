// 비트 이동 연산자 : 응용 II
package step04;

public class Exam04_5 {
    public static void main(String[] args) {
        // Yes/No 또는 true/false 값을 저장할때
        // 비트연산자를 사용하면 메모리를 절약할 수 있다.

        // 비트연산자 사용전
        // => 필요한 메모리는 32바이트가 소요된다.
        boolean c, cpp, java, js, python, php, html, css;
        c = true;
        cpp = false;
        java = true;
        js = false;
        python = true;
        php = false;
        html = true;
        css = false;

        // 8개의 테이터를 저장하기위해 8바이트가 필요
        boolean[] lang = new boolean[8];
        lang[0] = true;
        lang[1] = false;
        lang[2] = true;
        lang[3] = false;
        lang[4] = true;
        lang[5] = false;
        lang[6] = true;
        lang[7] = false;

        // 비트연산자 사용 후
        // => 4바이트 변수 1개만 있으면 최대 32개의 데이터를 저장가능
        // how?
        int lang2 = 0;
        lang2 = 0x80; // c = true
        lang2 = 0x00; // cpp = false
        lang2 = 0x20; // cpp = false
        lang2 = 0x08; // cpp = false
        lang2 = 0x00; // cpp = false
        lang2 = 0x02; // cpp = false
        lang2 = 0x00; // cpp = false
        
    }
}