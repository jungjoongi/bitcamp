// 파일 업로드
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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

@WebServlet("/step05/exam02")
public class Exam02 extends HttpServlet {
    
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
        Map<String,String> paramMap = new HashMap<>();
        try {
            List<FileItem> items = upload.parseRequest(request);
            
            for (FileItem item : items) {
                if (item.isFormField()) { 
                    out.printf("%s=%s\n", item.getFieldName(), item.getString("UTF-8"));
                } else {
                    out.printf("%s=%s\n", item.getFieldName(), item.getName());
                    ServletContext appEnvInfo = request.getServletContext();
                    String savedPath = appEnvInfo.getRealPath("/");
                    out.println(savedPath);
                    item.write(new File(savedPath + "/" + item.getName()));
                    
                }
            }
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석중 오류 발생!");
        }
    }
}

