/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-26 10:17:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pojo.User_table;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Sign up|Blog</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"../js/jquery-easyui/themes/default/easyui.css\" type=\"text/css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../js/jquery-easyui/themes/icon.css\"\r\n");
      out.write("\ttype=\"text/css\"></link>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tfont: normal 14px/1.4 \"Helvetica Neue\", \"HelveticaNeue\", Helvetica,\r\n");
      out.write("\t\tArial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\topacity: 1;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input, button {\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("::-moz-focus-inner {\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("} /*å»é¤æé®ç¹å»æ¶åºç°çèçº¿è¾¹æ¡*/\r\n");
      out.write(".login_bg {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_header {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 50px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#subheading {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 517px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin: 10px 0 16px -258px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup_forms {\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup_forms_container {\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_user, .form_password, form_username {\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_password, .form_username, .form_confirm_password {\r\n");
      out.write("\tborder-top: 1px solid #e3e3e3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup_forms input {\r\n");
      out.write("\tpadding: 11px 10px 11px 13px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tbackground: 0;\r\n");
      out.write("\tfont: 16px/1.4 \"Helvetica Neue\", \"HelveticaNeue\", Helvetica, Arial,\r\n");
      out.write("\t\tsans-serif;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#signup_forms_submit {\r\n");
      out.write("\tmargin-top: 8px;\r\n");
      out.write("\twidth: 260px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tbackground: #529ECC;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\t<!--\r\n");
      out.write("\tCSSå±æ§è®¾ç½®é¼ æ ä¸ºæå--\r\n");
      out.write("\t>\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#signup_forms_submit span {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont: \"Helvetica Neue\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\ttop: auto;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer_signup_link {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 141px;\r\n");
      out.write("\theight: 78px;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tpadding: 0 20px;\r\n");
      out.write("\tmargin: 0 0 13px 0;\r\n");
      out.write("\tline-height: 25px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\topacity: 1;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".signup_link {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tpadding: 0 10px;\r\n");
      out.write("\tmargin: 0 0 8px 0;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tline-height: 45px;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.33);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".link {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tpadding-right: 5px;\r\n");
      out.write("\tmargin-right: 12px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".design_show {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\tpadding: 0 12px;\r\n");
      out.write("\tmargin: 0 0 13px 0;\r\n");
      out.write("\tline-height: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".designer_info {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#face {\r\n");
      out.write("\tmargin: 0 0 0 10px;\r\n");
      out.write("\tborder-radius: 20px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\twidth: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bclom {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\twidth: 14px;\r\n");
      out.write("\theight: 14px;\r\n");
      out.write("\tbackground-position: 0 -288px;\r\n");
      out.write("\tbackground-image: url(../images/glb_v2.png);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bclom2 {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tfont-family: \"黑体\";\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divline {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar nameflag=true;\r\n");
      out.write("\t\tvar pflag=true;\r\n");
      out.write("\t\t$('#signup_confirm_password').blur(function() {\r\n");
      out.write("\t\t\tif($(\"#password\").val()!=$(\"#signup_confirm_password\").val()){\r\n");
      out.write("\t\t\t\t$.messager.alert('Waring!','两次密码不一致');\r\n");
      out.write("\t\t\t\t$(\"#signup_confirm_password\").val(\"\");\r\n");
      out.write("\t\t\t\tpflag=false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tpflag=true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#username').blur(function() {\r\n");
      out.write("\t\t\tvar username = $(\"#username\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"checkUsername/\" + escape(username),\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t//alert(data);\r\n");
      out.write("\t\t\t\t\tif (\"success\" == data) {\r\n");
      out.write("\t\t\t\t\t\t//alert(\"用户名可用\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#b1\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#b2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t\t\t\tnameflag=true;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//alert(\"已被使用\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#b2\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#b1\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t\t\t\tnameflag=false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"button\")\r\n");
      out.write("\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tif ($(\"#email\").val() == \"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t|| $(\"#password\").val() == \"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t|| $(\"#signup_confirm_password\").val() == \"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t|| $(\"#username\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.alert('Waring!',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'email password and username mustn\\'t be empty!');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (nameflag==false||pflag==false) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.messager.alert('Waring',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'Your password is not same!');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.post(\"userRegister\", $(\"#sign_form\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.serialize(),\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction(result) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$.messager\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.alert(JSON.stringify(result));\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location.href = 'login';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"login_bg\" class=\"login_bg\"\r\n");
      out.write("\t\tstyle=\"background-image: url(../images/blog_bg.jpg);\"></div>\r\n");
      out.write("\t<div class=\"login_header\">\r\n");
      out.write("\t\t<span></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"form_header\">\r\n");
      out.write("\t\t\t<h1 id=\"logo\">Blog.</h1>\r\n");
      out.write("\t\t\t<h2 id=\"subheading\">To follow me,just sign up</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"signup_forms\" class=\"signup_forms\">\r\n");
      out.write("\t\t\t<div id=\"signup_forms_container\" class=\"signup_forms_container\">\r\n");
      out.write("\t\t\t\t<form class=\"signup_form_form\" id=\"sign_form\" method=\"post\"\r\n");
      out.write("\t\t\t\t\taction=\"userRegister\">\r\n");
      out.write("\t\t\t\t\t<div class=\"signup_account\" id=\"signup_account\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form_user\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" placeholder=\"Email\" id=\"email\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form_username\">\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"display: inline-block\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"username\" placeholder=\"Username\" id=\"username\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"display: inline-block\"> <b class=\"bclom\" id=\"b1\"></b>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b class=\"bclom2\" id=\"b2\">用户名已存在，请重新输入</b>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form_password\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form_confirm_password\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Confirm the password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"signup_confirm_password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"signup_forms_submit\">\r\n");
      out.write("\t\t\t\t<span style=\"font-size: 16px;\"><strong>Sign up</strong></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"footer_signup_link\">\r\n");
      out.write("\t\t\t<a class=\"signup_link\" href=\"login\">Log in</a> <a\r\n");
      out.write("\t\t\t\thref=\"https://www.baidu.com\" target=\"_blank\" class=\"link unnamed_1\">Contact</a>\r\n");
      out.write("\t\t\t<a href=\"#\" target=\"_blank\" class=\"link unnamed_2\">About</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"design_show\">\r\n");
      out.write("\t\t\t<div class=\"designer_info\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">Designed by Class 2 Software 11 <strong>Ray</strong></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\" target=\"_blank\" class=\"face\"><img id=\"face\"\r\n");
      out.write("\t\t\t\t\tsrc=\"../images/face.jpg\" alt=\"designed by RayZhang\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
