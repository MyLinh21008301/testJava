package iuh.se.control;

import java.io.IOException;
import java.util.Optional;

import iuh.se.models.Account;
import iuh.se.repository.AccountReponsetory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ControlServlet", value = "/control-servlet")
public class ControlServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String getAction = req.getParameter("action"); 
	    if (getAction != null && getAction.equalsIgnoreCase("Login")) {
	        AccountReponsetory accountReponsitory = new AccountReponsetory();
	        Optional<Account> optional = accountReponsitory.layTheoMa(req.getParameter("accountID"), req.getParameter("password"));
	        Account account = optional.orElse(null); 

	        if (account == null) {
	            resp.getWriter().println("Rong!");
	        } else {
	        	req.getServletContext().setAttribute("AccountData", account);
	        	req.getServletContext().getRequestDispatcher("/user-info.jsp").forward(req, resp);
	        }
	    } else {
	        resp.getWriter().println("Action error.");
	    }
	}

}
