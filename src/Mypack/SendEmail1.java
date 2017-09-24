package Mypack;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail1 
{
	public SendEmail1() {
		// TODO Auto-generated constructor stub
	}
	public void ok(String to) 
	{
//		String to="rituriteshritz@gmail.com";//change accordingly 
		 final String from="employeecanteen@gmail.com";//change accordingly 
		 final	String password="mitali@123";//change accordingly 

		//Get the session object 
		Properties props = new Properties(); 

		props.put("mail.smtp.host", "smtp.gmail.com"); 
		props.put("mail.smtp.socketFactory.port", "465"); 
		props.put("mail.smtp.socketFactory.class", 
		"javax.net.ssl.SSLSocketFactory"); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.port", "465"); 

		Session session = Session.getDefaultInstance(props, 
		new javax.mail.Authenticator() 
		{ 
			protected PasswordAuthentication getPasswordAuthentication() 
			{ 
				return new PasswordAuthentication(from,password); 
			} 
		}); 

		//compose message 
		try{ 
		MimeMessage message = new MimeMessage(session); 
		message.setFrom(new InternetAddress(from)); 
		message.addRecipient(Message.RecipientType.TO,new InternetAddress(to)); 
		message.setSubject("Verification of email.."); 
		//message.setText("Click on this link to verify ur email id/username:  "+link); 
		//send message 
		Transport.send(message); 
		System.out.println("message sent successfully"); 
		} 
		catch(MessagingException e)
		{
			throw new RuntimeException(e);
		} 		
	}
	


} 