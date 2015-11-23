package com.meera.struts2.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.dispatcher.DefaultActionSupport;
import com.meera.dao.UserDAO;
import com.meera.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class AddUserAction extends ActionSupport   implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4587665276501838677L;
	
	private String name;
	private String place;
	private String state;
	private User user = new User();
	private List<User> userList = new ArrayList<User>();

	private List<String> validateErrors;
	private UserDAO userDao;
	
	public AddUserAction(UserDAO userDao) {
		this.userDao = userDao;
	}
	@Override
	public User getModel() {
	return user;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		//validateBookmark();
		userDao.saveUser(user);
		setUserList(userDao.listUser());
		System.out.println("List users"+userDao.listUser());
		return SUCCESS;
	}

	 
	/*public void validateBookmark() throws Exception {
		Student studentObject = getNewStudent();
		validateErrors = new ArrayList<String>();
		StudentValidator validator = new StudentValidator();
		
		if(validator.validateStudent(studentObject, validateErrors)) {
			StudentLocalServiceUtil.addStudent(studentObject);
			addActionMessage(MessageStore.STUDENT_ADDED_SUCCESSFUL);
			
		}
		else {
			//handle the error massage 
		addActionError(MessageStore.BOOKMARK_ADDED_FAILED);
			addFieldError("failed", MessageStore.BOOKMARK_ADDED_FAILED);
			Iterator<String> errorIter = validateErrors.iterator();
			int count = 0;
			while (errorIter.hasNext()) {
				String error = errorIter.next();
				addFieldError("error" + count, error);
				count++;
			}
		}
	}*/
	
	/**
	 * Create a new Bookmark Object from the view
	 * @return 
	 */
	/*private User getNewUSer() {
		User user =  new User();
		user.setName(getName());
		user.setPlace(getPlace());
		user.setState(getState());
		
		return user;
	}*/

	/*
	 * Getters and Setters start here
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getValidateErrors() {
		return validateErrors;
	}

	public void setValidateErrors(List<String> validateErrors) {
		this.validateErrors = validateErrors;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public void setUserList(List<User> userList) {
		this.userList = userDao.listUser();
	}
	public List<User> getUserList() {
		return userList;
	}
	
}