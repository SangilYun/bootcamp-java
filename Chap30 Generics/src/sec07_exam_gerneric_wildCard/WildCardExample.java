package sec07_exam_gerneric_wildCard;

import java.util.Arrays;

public class WildCardExample {
   
   //Course<T>란 제네릭타입으로 선언된 부분에 ?가 오면, 어떠한 객체가 들어가도 상관이 없다.
   public static void registerCourse(Course<?> course) {
      System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));         
   }
   //Course<T>란 제네릭타입으로 선언된 부분에 ? extends Student가 오면, Student이거나
   //Student의 자손클래스의 객체만 올 수 있다.
   public static void registerCourseStudent(Course<? extends Student> course) {
      System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
   }
   //Course<T>란 제네릭타입으로 선언된 부분에 ? super Worker가 오면, Worker이거나
   //Worker의 조상클래스의 객체만 올 수 있다.
   public static void registerCourseWorker(Course<? super Worker> course) {
      System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
   }
   
   public static void main(String[] args) {
      //먼저 실행하기전에 만들어진 클래스들의 상속계층도를 그려보자.
      //그럼 이해가 쉬워진다.
      registerCourse(new Course<Person>("일반인 과정", 5));
      registerCourse(new Course<Student>("학생 과정", 5));
      registerCourse(new Course<Worker>("근로자 과정", 5));
      registerCourse(new Course<HighStudent>("고등학생 과정", 5));
      System.out.println();
      //registerCourseStudent(new Course<Person>("일반인 과정", 5));   //에러난다. 왜?
      registerCourseStudent(new Course<Student>("학생 과정", 5));
      //registerCourseStudent(new Course<Worker>("근로자 과정", 5));   //에러난다. 왜?
      registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));
      System.out.println();
      registerCourseWorker(new Course<Person>("일반인 과정", 5));
      //registerCourseWorker(new Course<Student>("학생 과정", 5));   //에러난다. 왜?
      registerCourseWorker(new Course<Worker>("근로자 과정", 5));
      //registerCourseWorker(new Course<HighStudent>("고등학생 과정", 5));   //에러난다. 왜?
      System.out.println();
      System.out.println("직접 생성후 추가");
      
      //2. 직접 Course생성해서 확인하는 과정
      Course<Person> personCourse = new Course<>("일반인 과정", 4);
      personCourse.add(new Person("일반인"));
      personCourse.add(new Person("직장인"));
      personCourse.add(new Person("학생"));
      personCourse.add(new Person("고등학생"));

      Course<Worker> workerCourse = new Course<>("직장인 과정", 3);
      workerCourse.add(new Worker("슈틸리케"));
      workerCourse.add(new Worker("박지성"));
      
      Course<Student> studentCourse = new Course<>("학생 과정", 5);
      studentCourse.add(new Student("송재경"));
      studentCourse.add(new Student("임종민"));
      studentCourse.add(new Student("최준호"));
      studentCourse.add(new Student("박창욱"));
      studentCourse.add(new Student("도원록"));

      Course<HighStudent> HighStudentCourse = new Course<>("고등학생 과정", 5);
      HighStudentCourse.add(new HighStudent("신동호"));
      HighStudentCourse.add(new HighStudent("김기리"));
      HighStudentCourse.add(new HighStudent("신용권"));
      
      registerCourse(personCourse);
      registerCourse(workerCourse);
      registerCourse(studentCourse);
      registerCourse(HighStudentCourse);
      System.out.println();
      //registerCourseStudent(personCourse);   //에러난다. 왜? --> extends Student라서 하위타입만올 수 있다. 
      //registerCourseStudent(workerCourse);   //에러난다. 왜?
      registerCourseStudent(studentCourse);
      registerCourseStudent(HighStudentCourse);
      System.out.println();
      registerCourseWorker(personCourse);
      registerCourseWorker(workerCourse);
      //registerCourseWorker(studentCourse);   //에러난다. 왜?	--> super Worker라서 상위타입만 올 수 있다. 
      //registerCourseWorker(highStudentCourse);   //에러난다. 왜?
   }
}