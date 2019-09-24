package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleDictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println("<html>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<head>\n" +
                "  <title>Simple Dictionary</title>\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Vietnamese Dictionary</h2>\n" +
                "<form action='/result' method='post'>\n" +
                "  <input type=\"text\" name=\"txtSearch\" placeholder=\"Enter your word: \"/>\n" +
                "  <input type = \"submit\" id = \"submit\" value = \"Search\"/>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }
}
