package net.javaee.crud.usermanagement;


/**
 * Book.java
 * This is a model class represents a book entity
 * @author www.codejava.net
 *
 */
public class User {
    protected int id;
    protected String first_name;
    protected String last_name;
    protected String pn;
    protected String email;
 
    public User() {
    }
 
    public User(int id) {
        this.id = id;
    }
 
    public User(int id, String first_name,String last_name,String pn,String email) {
        this(first_name,last_name,pn,email);
        this.id = id;
    }
     
    public User(String first_name,String last_name,String pn,String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pn = pn;
        this.email = email;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
 
    
}