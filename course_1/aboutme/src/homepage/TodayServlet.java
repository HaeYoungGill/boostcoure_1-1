package homepage;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TodayServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html; charset=euc-kr");
	        
	        LocalDateTime currentDateTime = LocalDateTime.now();
	 
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>");
	        writer.println("<head><title>���� �ð�</title></head>");
	        writer.println("<body>");
	        writer.print("<a href='index.html'>����ȭ��</a>");
	        writer.println("<br>");
	        writer.println("���� �ð�:");
	        writer.println(currentDateTime.toString());
	        writer.println("</body>");
	        writer.println("</html>");
	 
            writer.close();
	}
}
