package com.meera.struts2.action;


import org.apache.struts2.dispatcher.DefaultActionSupport;

public class NavigateAction extends DefaultActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4587665276501838677L;
	@Override
	public String execute() throws Exception {
		String success="success";
			return success;
	}
	
	public String navigateToAddStudentJsp() throws Exception {
		String success="adduser";
			return success;
	}
	
}