package com.somebody.serviece.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.servlet.ModelAndView;

import com.somebody.db.CommonMethod;
import com.somebody.db.MapperBon;
import com.somebody.db.MapperDong;
import com.somebody.db.MapperUone;
import com.somebody.db.MapperYoung;

import kr.co.icia.plzec.services.Encryption;
import kr.co.icia.plzec.services.ProjectUtils;

@Service
public class Lesson extends CommonMethod{
	@Autowired
	private MapperBon mb;
	@Autowired
	private MapperDong md;
	@Autowired
	private MapperYoung my;
	@Autowired
	private MapperUone mu;
	private ModelAndView mav;
	@Autowired
	private ProjectUtils pu;
	@Autowired
	private Encryption enc;
	@Autowired
	private DataSourceTransactionManager tx;

	private TransactionStatus txStatus;

	private DefaultTransactionDefinition txdef;

	String page = null;

	public void backController(String sCode, Lesson ls) {
		String gs = null;
		String senddata = null;

		switch (sCode) {
		case "L01":
			lessonMg(ls);
			 break;
		case "L02":
			searchLesson(ls);
			break;
		case "L03":
			getLsCaList(ls);
			break;
		case "L04":
			insLsPay(ls);
			break;
		case "L05":
			getMaxLesson(ls);
			break;
		case "L06":
			insLesson(ls);
			break;
		case "L07":
			modLesson(ls);
			break;
		case "L08":
			lsMemDetail(ls);
			break;
		case "L09":
			modLsSuccess(ls);
			break;
		case "L10":
			delLesson(ls);
			break;
		}
		
	}
	public void lessonMg(Lesson ls) {
		
		
	}

	public void searchLesson(Lesson ls) {
		
		
	}

	public void getLsCaList(Lesson ls) {
	
		
	}

	public void insLsPay(Lesson ls) {
		
		
	}

	public void getMaxLesson(Lesson ls) {
		
		
	}

	public void insLesson(Lesson ls) {
	
		
	}

	public void modLesson(Lesson ls) {
	
		
	}

	public void lsMemDetail(Lesson ls) {
		
		
	}
	public void modLsSuccess(Lesson ls) {
		
		
	}
	public void delLesson(Lesson ls) {
	
		
	}
}
