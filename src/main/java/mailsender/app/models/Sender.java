package mailsender.app.models;

public class Sender {
	public String to;
	public String from;
	public String subject;
	public String body;
	public Sender() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	@Override
	public String toString() {
		return "Sender [to=" + to + ", from=" + from + ", subject=" + subject + ", body=" + body + "]";
	}
	public Sender(String to, String from, String subject, String body) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
