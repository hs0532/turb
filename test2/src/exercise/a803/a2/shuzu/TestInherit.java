package exercise.a803.a2.shuzu;


class Test3 {
	  static int count=9;
	  public static void count1(){
	   count=10;
	   System.out.println("count1="+count);
	  }
	  public void count2(){
	   System.out.println("count2="+count);
	   count1();
	  }
	} 

class Test {  
	 final int age;
	 public Test(){
	   age=10;
	 }
	static  int m;
	public static void fun() {
     System.out.println(m);
  }
 } 

 class Person1 {
	  public String name;
	  public Person1(String name) {
	   this.name = name;
	  }
	 }
 class Test1 {
	     public static void main(String[] args) {
	         final Person1 person = new Person1("欧欧");
	         person.name = "美美";
//	         person = new Person1("亚亚");
	     }
	}    
			
	class Person {
		public Person() {
			System.out.println("execute Person()");
		}
		public Person(int x){
		}
	}

	class Student extends Person {
		public Student() {
			System.out.println("execute Student() ");
		}
	}

	class PostGraduate extends Student {
		public PostGraduate() {
			System.out.println("execute PostGraduate()");
		}
	}
	public  class TestInherit {
		public static void main(String[] args) {
			new PostGraduate();
			 Test3 t=new Test3();
			   Test3.count1();
			   t.count2();
			   System.out.println(new Test().age);
		}
}

	
		



