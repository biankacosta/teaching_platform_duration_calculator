package entities;

public class Task extends Lesson {
	
	protected String description;
	protected int questionCount;
	
	public Task() {
		
	}
	
	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

	@Override
	public int duration() {
		return this.questionCount * 300;
	}
	
	

}
