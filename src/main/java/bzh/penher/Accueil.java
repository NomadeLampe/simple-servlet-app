package bzh.penher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kozh on 17/01/16.
 */
@WebServlet(value = {"/index", "/"})
public class Accueil extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("prenom", "toto");
        req.getRequestDispatcher("/aloha.jsp").forward(req, resp);
    }
}
