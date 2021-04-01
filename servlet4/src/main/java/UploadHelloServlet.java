import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-01
 * Time: 21:10
 */
@MultipartConfig
public class UploadHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
        UUID uuid = UUID.randomUUID();//全球唯一

            Part part = request.getPart("myfile");
            part.write(String.format("D:\\%s%s",
                    uuid,part.getSubmittedFileName()));
            PrintWriter writer = response.getWriter();
            writer.println(String.format("<h1>上传成功<h1>"));
        }
    }
