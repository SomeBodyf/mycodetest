package com.somebody.db;



import beans.Centers;
import beans.Members;
import beans.Staffs;

public interface MapperBon {
	
	public String  sfLogin(Staffs sf);
	public Staffs  sfInfo(Staffs sf);
	public String  meLogin(Members me);
	public Members meInfo(Members me);
	public int insertAccessHistory(Staffs sf);
	
	
	
	
}
