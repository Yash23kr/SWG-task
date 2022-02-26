import java.util.*;
public class Student {
	String name;
	double attendance;
	float marks;
	Student(String nam,float mark,double attend)
	{
		name=nam;
		marks=mark;
		attendance=attend;
		if(marks<0)
			marks=0;
		
	}
	public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public double getAttendance() {
        return attendance;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return marks;
    }
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student obj1=new Student("Yash",40,85);
		Student obj2=new Student("Aagat",90,60);
		if(obj1.getAttendance()>75)
			obj1.setMarks(obj1.getMarks()*(float)1.1);
		System.out.println("Marks obtained by "+obj1.getName()+" is "+obj1.getMarks());
		if(obj2.getAttendance()>75)
			obj2.setMarks(obj2.getMarks()*(float)1.1);
		System.out.println("Marks obtained by "+obj2.getName()+" is "+obj2.getMarks());
	}
}
