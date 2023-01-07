package com.pdf;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.Controller;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.model.Employee;

public class PdfImpl implements PdfFileGen {

	public void PDFgen(String location, List<T> list) {

		Document doc = new Document(PageSize.A4);

		try {
			PdfWriter pdfw = PdfWriter.getInstance(doc, new FileOutputStream("employetostring.pdf"));
			System.out.println("pdf created");

			doc.open();
			for (Object emp : list) {

				doc.add(new Paragraph(emp.toString()));
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			doc.close();
		}

	}
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring.xml");
		Controller con=	(Controller) ap.getBean("con");
		
		PdfImpl v=new PdfImpl();
		List<Employee> e=con.getAll();
	//	v.PDFgen("emp.pdf",e);
		
		
	}

}
