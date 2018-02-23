package com.heejin.student;

public class StudentAddService implements Action{
	//execute메서드생성
	//내용은 매개변수로 받은 학생들
	//StudentDatabase의 students배열에 추가
	//배열 한칸 생성해서 학생을 추가
	//null이 아니라면 
	public void execute() {
		StudentInput si = new StudentInput();
		Student student = new Student();

		if(StudentDataBase.students==null){
			StudentDataBase.students=new Student[1];
			StudentDataBase.students[0]=student;
		}else {
			int count = StudentDataBase.students.length;
			Student [] s = new Student[count+1];
			
			for(int i=0;i<count;i++) {
				s[i]=StudentDataBase.students[i];
			}
			
			s[count]=student;
		}
		
		
	}
}
