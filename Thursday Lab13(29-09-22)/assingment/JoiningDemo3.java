package hibernate.com.assingment;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class JoiningDemo3 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
//		Instructor instructor1=new Instructor();
//		instructor1.setInstructorId(101);
//		instructor1.setInstructorName("Alakh Pandey");
//		instructor1.setInstructorCity("Prayagraj");
//		
//		Instructor instructor2=new Instructor();
//		instructor2.setInstructorId(102);
//		instructor2.setInstructorName("Khan Sir");
//		instructor2.setInstructorCity("Patna");
//		
//		Course course1=new Course();
//		course1.setCourseName("JEE Mains");
//		course1.setCourseFee(4000);
//		course1.setCourseDuration("6 Months");
//		course1.setInstructor(instructor1);
//		
//		Course course2=new Course();
//		course2.setCourseName("JEE Advance");
//		course2.setCourseFee(5000);
//		course2.setCourseDuration("6 Months");
//		course2.setInstructor(instructor1);
//		
//		Course course3=new Course();
//		course3.setCourseName("NEET");
//		course3.setCourseFee(3000);
//		course3.setCourseDuration("3 Months");
//		course3.setInstructor(instructor1);
////		
////
//		Course course4=new Course();
//		course4.setCourseName("NDA");
//		course4.setCourseFee(500);
//		course4.setCourseDuration("2 Months");
//		course4.setInstructor(instructor2);
//		
//		Course course5=new Course();
//		course5.setCourseName("SSC/BANK");
//		course5.setCourseFee(800);
//		course5.setCourseDuration("6 Months");
//		course5.setInstructor(instructor2);
//		
//		
//	List<Course> courses1=new ArrayList<Course>();
//				 courses1.add(course1);
//				 courses1.add(course2);
//				 courses1.add(course3);
//
//				instructor1.setCourses(courses1);
//				
//
//	List<Course> courses2= new ArrayList<Course>();
//				courses2.add(course4);
//			courses2.add(course5);
//				
//				instructor2.setCourses(courses2);
//				
//				
//				session.save(instructor1);
//				session.save(instructor2);
//				
//				tx.commit();
//		
		
		
		
		//Retrieve data
//		Instructor instructor1=session.get(Instructor.class, 101);
//		System.out.println("Instructor Name: "+instructor1.getInstructorName());
//		
//		System.out.println("Course Details");
//		for(Course course:instructor1.courses)
//		{
//		System.out.println("Course Name: "+course.courseName+"\t Course  Fee: "+course.courseFee+
//				"\t  Course Duration: "+course.courseDuration);
//	}
		
		
		
		
		
		
			//fetching Instructor details Ushing HQL
		
//				String query1="from Instructor";
//				Query q=session.createQuery(query1);
//				List<Instructor> ilist=q.getResultList();
//				for(Instructor instructors:ilist)
//				{
//					System.out.println("Instructor Name: "+instructors.getInstructorName()+
//									   "Instructor City:"+instructors.getInstructorCity());
//				}
//				
				
				
				
				
				
				
		
		
				
		
		
		//delete Querry
//		Query q=session.createQuery("delete from Instructor b where b.instructorId=:b");
//		q.setParameter("b", 101);
//		
//		int row =q.executeUpdate();
//		System.out.println(row+"record delete succesfully...");
//		tx.commit();
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
		
		
		
				
		
		
		
		
		
		
		session.close();
    	factory.close();
		
	}
}
