package ch03.quiz03;

import java.util.regex.Pattern;

public class Member {
	private String email;
	private String phone;
	
	//이메일 정규식
	public static final String PATTERN1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	  
	 //전화번호 정규식
	public static final String PATTERN2 = "(02|010)-\\d{3,4}-\\d{4}";

	//정규식 체크 메소드
	public String result() {
		boolean checkEmail = Pattern.matches(PATTERN1, email);
		boolean checkPhone = Pattern.matches(PATTERN2, phone);
		
		if(checkEmail && checkPhone) {
			return "환영합니다!";
		} else {
			return "유효성 검사에 통과하지 못했습니다.";
		}
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
