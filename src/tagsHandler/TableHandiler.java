package tagsHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import models.User;

public class TableHandiler extends SimpleTagSupport implements DynamicAttributes{

	private ArrayList<String>columns;
	private ArrayList<User>users;
	
	public void setColumns(ArrayList<String> columns) {
		this.columns = columns;
	}
	
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.print("<table ");
		for(String key: attr.keySet()) {
			out.print(String.format(ATTR_TEMPLATE, key,attr.get(key)));
		}
		out.print(">");
		out.print("<thead class='thead-dark'>");
		out.print("<tr>");
		for(String col : columns)
			out.print(String.format(TH_TEMPLATE, col));
		out.print("</tr>");
		out.print("</thead>");
		
		for(User user : users) {
			out.print("<tr>");
			out.print(String.format(TD_TEMPLATE, user.getId()));
			out.print(String.format(TD_TEMPLATE, user.getUsername()));
			out.print(String.format(TD_TEMPLATE, user.getPassword()));
			out.print(String.format(TD_TEMPLATE, user.getFavMovie()));
			out.print("</tr>");
		}
		
		out.print("</table");
	}

	
	private Map<String,Object>attr=new HashMap<>();
	@Override
	public void setDynamicAttribute(String uri, String localName, Object value) throws JspException {
		
		attr.put(localName, value);
	}
	
	private static String ATTR_TEMPLATE=
			" %s='%s' ";
	private static String TH_TEMPLATE=
			"<td>%s</td";
	private static String TD_TEMPLATE=
			"<td>%s</td";
}	
