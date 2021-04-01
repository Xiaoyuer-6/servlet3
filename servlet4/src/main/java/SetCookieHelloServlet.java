import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-01
 * Time: 19:17
 */
public class SetCookieHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request, response);
    }
//cookie的写入
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        Cookie usenameCookie = new Cookie("usename","java");
        //设置cookie的最大存活时间
        usenameCookie.setMaxAge(60);
        //用来告诉客户端cookie的信息
        response.addCookie(usenameCookie);

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Cookie存储成功</h1>");
    }
}
