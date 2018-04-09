package com.dom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-03-16
 * Time: 12:55
 */
@Controller
public class MyController {
Logger logger =Logger.getLogger(MyController.class.getName());
    @RequestMapping("/view")
    public ModelAndView view(HttpServletRequest request){
        logger.log(Level.INFO,"------------------------------------------------------");
        String path = request.getParameter("path") + "";
        ModelAndView mav = new ModelAndView();
        String contextPath = request.getContextPath();
        mav.addObject("contextPath" , contextPath);
        mav.setViewName(path);
        return mav;
    }
    @RequestMapping("/getData")
    public ModelAndView getModel(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        String path = request.getParameter("path") + "";
        String contextPath = request.getContextPath();
        mav.addObject("key","this is test content");
        mav.addObject("contextPath" , contextPath);
        mav.setViewName(path);
        return mav;
    }
}
