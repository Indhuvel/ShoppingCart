package com.niit.shoppingkartback;
//import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingkart.dao.MykartDAO;
import com.niit.shoppingkartback.domain.Mykart;

public class MykartTest {
@Autowired static AnnotationConfigApplicationContext context;
	
	@Autowired  static MykartDAO  mykartDAO;
	
	@Autowired  static Mykart mykart;
	
	public MykartTest(){
		initialize();
		createMykartTest();
	}
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingkart");
		context.refresh();
		
		//get the userDAO from context
		mykartDAO =  (MykartDAO) context.getBean("MykartDAO");
		
		//get the user from context
		
		mykart = (Mykart)context.getBean("mykart");
		
	}
	@Test
	public void createMykartTest()
	{
		
		mykart.setUsername("Jenu");
		mykart.setQuantity(1);
		mykart.setPrice(365);
/*		mykart.setDate(2013-05-06);
*/		mykart.setTotal(65);

		boolean flag =  mykartDAO.saveOrUpdate(mykart);
		System.out.println(flag);
	}
}
