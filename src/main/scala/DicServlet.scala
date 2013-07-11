package main.java

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.{RequestDispatcher, ServletException}
import com.yuilsang.dic.Dic

/**
 * Created with IntelliJ IDEA.
 * User: ilzzang
 * Date: 13. 7. 10.
 * Time: 오후 10:04
 * To change this template use File | Settings | File Templates.
 */
class DicServlet extends HttpServlet {
  val dic:Dic = new Dic()

  override def doGet(req: HttpServletRequest, res: HttpServletResponse) {
    val word = req.getParameter("word")
    val result = dic.search(word)

    if(result == None) {
      req.setAttribute("word", null)
    } else {
      req.setAttribute("word", result.get)
    }

    val dispatcher: RequestDispatcher = req.getRequestDispatcher("/WEB-INF/views/dic/index.jsp")
    dispatcher.forward(req, res)
  }
}
