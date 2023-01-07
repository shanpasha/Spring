package com.pdf;

import java.io.FileNotFoundException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.Controller;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.model.Employee;




public class GeneratePdf {
public static void main(String args[])  {  
	ApplicationContext ap=new ClassPathXmlApplicationContext("Spring.xml");
	Controller con=	(Controller) ap.getBean("con");
	List ll=new List();
	ll.add("hello");
	//java.util.List<Employee> ss=con.getAll();
	
   
 try {
	PdfWriter pf=new PdfWriter("G:\\logs\\emm.pdf");
	PdfDocument pdfdocument = new PdfDocument(pf);
	Document document = new Document(pdfdocument);
//	document.cr
//	document.add(ll);
	document.flush();
	System.out.println("sucess");
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 




}
}