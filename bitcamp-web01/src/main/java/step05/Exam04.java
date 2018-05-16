// 파일 업로드
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step05/exam04")
public class Exam04 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override 
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        response.setContentType("text/plain; charset=UTF8");
        PrintWriter out = response.getWriter();

        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            out.println("멀티파트 형식이 아닙니다.");
            return;
        }

        // 2) 멀티파트 데이터를 추출하여 디스크에 저장할 공장준비
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 3) 멀티파트 데이터 분석기에 공장 객체를 장착한다.
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 4) 멀티파트로 전송된 요청데이터 분석하기
        try {
            Map<String,List<FileItem>> paramMap = upload.parseParameterMap(request);
            out.printf("name=%s\n", paramMap.get("name").get(0).getString("UTF-8"));
            out.printf("name=%s\n", paramMap.get("age").get(0).getString());
            FileItem photo = paramMap.get("photo").get(0);
            String filename = newFilename(photo.getName());
            out.printf("photo=%s\n", photo.getName());
            out.printf("photo=%s\n", filename);
            
            ServletContext appEnvInfo = request.getServletContext();
            String savedPath = appEnvInfo.getRealPath("/");
            out.println(savedPath);
            photo.write(new File(savedPath + "/" + newFilename(photo.getName())));


        } catch (Exception e) {
            out.println("멀티파트 데이터 분석중 오류 발생!");
        }
    }
    
    int count = 0;
    private String newFilename(String originFilename) {
        int lastIndex = originFilename.lastIndexOf(".");
        String extName = "";
        if (lastIndex >= 0) {
            extName = originFilename.substring(lastIndex);
        }
        return String.format("%d-%d%s", System.currentTimeMillis(), ++count, extName);
    }
}

