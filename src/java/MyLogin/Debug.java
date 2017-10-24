/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLogin;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *
 * @author 684243
 */
public class Debug extends BodyTagSupport {

    /**
     * Creates new instance of tag handler
     */
    public Debug() {
        super();
    }


     
    @Override
    public int doStartTag() throws JspException {
        String url = pageContext.getRequest().getServerName();
        String id = pageContext.getSession().getId(); 
        System.out.println(id);
        
        
        if(pageContext.getRequest().getParameter("debug") == null){
                return SKIP_BODY;
        }else{
                return EVAL_BODY_INCLUDE;
        }

    }

  
    
}
