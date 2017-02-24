package com.javasampleapproach.springjpa.many2many;

import com.javasampleapproach.springjpa.many2many.model.Book;
import com.javasampleapproach.springjpa.many2many.model.BookCategory;
import com.javasampleapproach.springjpa.many2many.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;



@SpringBootApplication
@RestController
public class SpringJpaMany2ManyApplication implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;

	@Autowired
	LocationOldRepository locationOldRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	QuizRepository quizRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMany2ManyApplication.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(SpringJpaMany2ManyApplication.class);

	@Autowired
	private BookCategoryRepository bookCategoryRepository;


//	private void loadLocationQuiz() {
//		Location location1 = new Location("mailbox");
//		Location location2 = new Location("driveway");
//		Location location3 = new Location("well");
//
//		Quiz quiz1 = new Quiz("Quiz1");
//		Quiz quiz2 = new Quiz("Quiz2");
//		Quiz quiz3 = new Quiz("Quiz3");
//
//		/*subjectRepository.save(math);
//		subjectRepository.save(computer);*/
//
//		Set<Quiz> quizzes = new HashSet<Quiz>();
//		quizzes.add(quiz1);
//		quizzes.add(quiz2);
//
//		Set<Quiz> quizzesDoug = new HashSet<Quiz>();
//		quizzesDoug.add(quiz1);
//		quizzesDoug.add(quiz2);
//		quizzesDoug.add(quiz3);
//
//		location1.setQuizzes(quizzes);
//		location2.setQuizzes(quizzes);
//		location3.setQuizzes(quizzesDoug);
//
//		locationRepository.save(location1);
//		locationRepository.save(location2);
//		locationRepository.save(location3);
//
//		Set<Location> locations = new HashSet<Location>();
//		locations.add(location1);
//		locations.add(location2);
//		locations.add(location3);
//
//		quiz1.setLocations(locations);
//		quiz2.setLocations(locations);
//		quiz3.setLocations(locations);
//
//		quizRepository.save(quiz1);
//		quizRepository.save(quiz2);
//
//		List<Location> locationList = locationRepository.findAll();
//		List<Quiz> quizList = quizRepository.findAll();
//
////		List<Location> location = locationRepository.findByName("Doug");
//
//	}
	@Override
	@Transactional
	public void run(String... strings) throws Exception {

//		loadLocationQuiz();

//		LocationOld locationOld = new LocationOld();
//		locationOld.setName("mailbox");
//
//		Set quizzAs = new HashSet<QuizOld>(){{
//			add(new QuizOld("1", locationOld));
//			add(new QuizOld("1", locationOld));
//			add(new QuizOld("1", locationOld));
//		}};
//
//		locationOld.setQuizzes(quizzAs);
//
//
//		LocationOld locationOld1 = new LocationOld();
//		locationOld1.setName("driveway");
//		Set quizzBs = new HashSet<QuizOld>(){{
//			add(new QuizOld("1", locationOld));
//			add(new QuizOld("1", locationOld));
//			add(new QuizOld("1", locationOld));
//		}};
//
//		locationOld.setQuizzes(quizzBs);
//
//		locationOldRepository.save(new HashSet<LocationOld>() {{
//			add(locationOld);
//			add(locationOld1);
//		}});
//
//
//		// fetch all categories
//		for (LocationOld locationOld2 : locationOldRepository.findAll()) {
//			logger.info(locationOld2.toString());
//		}
//
//
		// save a couple of categories
		BookCategory categoryA = new BookCategory("Category A");
		Set bookAs = new HashSet<Book>(){{
			add(new Book("Book A1", categoryA));
			add(new Book("Book A2", categoryA));
			add(new Book("Book A3", categoryA));
		}};
		categoryA.setBooks(bookAs);

		BookCategory categoryB = new BookCategory("Category B");
		Set bookBs = new HashSet<Book>(){{
			add(new Book("Book B1", categoryB));
			add(new Book("Book B2", categoryB));
			add(new Book("Book B3", categoryB));
		}};
		categoryB.setBooks(bookBs);

		bookCategoryRepository.save(new HashSet<BookCategory>() {{
			add(categoryA);
			add(categoryB);
		}});

		// fetch all categories
		for (BookCategory bookCategory : bookCategoryRepository.findAll()) {
			logger.info(bookCategory.toString());
		}

//	@Transactional
//	@Override
//	public void run(String... arg0) throws Exception {

//		Answer answerDoug = new Answer("doug", "testing",
//				  "block");
//		Answer answerBob = new Answer("bob", "jump","cliff");
//
//		Quiz quizFirstComment = new Quiz("first quiz comment");
//		Quiz quizSecondComment = new Quiz("second quiz comment");
//
//
//		Set<Quiz> quizzes = new HashSet<Quiz>();
//		quizzes.add(quizFirstComment);
//		quizzes.add(quizSecondComment);

//		answerDoug.setQuizzes(quizzes);
//		answerBob.setQuizzes(quizzes);
//
//		answerRepository.save(answerDoug);
//		answerRepository.save(answerBob);
//
//		Set<Answer> answers = new HashSet<Answer>();
//		answers.add(answerDoug);
//		answers.add(answerBob);

//		quizFirstComment.setAnswers(answers);
//		quizSecondComment.setAnswers(answers);

//		answerRepository.save(answerDoug);
//		answerRepository.save(answerBob);

//		Set <Quiz>

//		List<Answer> answerList = answerRepository.findAll();
//		List<Quiz> quizList = quizRepository.findAll();
//
//
//		System.out.println("AnswerList Size" + answerList.size());
//		System.out.println("QuizList size" + quizList.size());
//
//		System.out.println("===================Answer info:==================");
//		answerList.forEach(answer->System.out.println(answer.toString()));
//
//		System.out.println("===================Answer info:==================");
//		quizList.forEach(quiz->System.out.println(quiz.toString()));
//
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//
//
//


//		==========================================================
//		Location mailbox = new Location("mailbox");
//		Location driveway = new Location("driveway");
//
//		Quiz quiz2 = new Quiz("third quiz2 comment");
//		Quiz quiz3 = new Quiz("forth quiz3 comment");
//
//
//		Set<Quiz> quizzes1 = new HashSet<Quiz>();
//		quizzes1.add(quiz2);
//		quizzes1.add(quiz3);
//
//		mailbox.setQuizzes(quizzes1);
//		driveway.setQuizzes(quizzes1);
//
//		Set<Location> locations = new HashSet<Location>();
//		locations.add(mailbox);
//		locations.add(driveway);
//
////		quiz2.setLocations(locations);
////		quiz3.setLocations(locations);
//
//
//		locationOldRepository.save(mailbox);
//		locationOldRepository.save(driveway);
//
////		Set <Quiz>
//
//		List<Location> locationList = locationOldRepository.findAll();
//		List<Quiz> quizList = quizRepository.findAll();



//		System.out.println("LocationList Size" + locationList.size());
//		System.out.println("QuizList size" + quizList.size());
//
//		System.out.println("===================Location info:==================");
//		locationList.forEach(location->System.out.println(location.toString()));
//
//		System.out.println("===================Location info:==================");
//		quizList.forEach(quiz->System.out.println(quiz.toString()));
//
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//		System.out.println("===========================================================");
//		================================================================


//		Student jack = new Student("Jack");
//		Student peter = new Student("Peter");
//		Student doug = new Student("Doug");
//
//		Subject math = new Subject("Mathematics");
//		Subject computer = new Subject("Computer");
//		Subject english = new Subject("English");
//
//		/*subjectRepository.save(math);
//		subjectRepository.save(computer);*/
//
//		Set<Subject> subjects = new HashSet<Subject>();
//		subjects.add(math);
//		subjects.add(computer);
//
//		Set<Subject> subjectsDoug = new HashSet<Subject>();
//		subjectsDoug.add(math);
//		subjectsDoug.add(computer);
//		subjectsDoug.add(english);
//
//		jack.setSubjects(subjects);
//		peter.setSubjects(subjects);http://127.0.0.1/
//		doug.setSubjects(subjectsDoug);
//
//		studentRepository.save(jack);
//		studentRepository.save(peter);
//		studentRepository.save(doug);
//
//		Set<Student> students = new HashSet<Student>();
//		students.add(jack);
//		students.add(peter);
//		students.add(doug);
//
//		math.setStudents(students);
//		computer.setStudents(students);
//		english.setStudents(students);
//
//		subjectRepository.save(math);
//		subjectRepository.save(computer);
//
//		List<Student> studentLst = studentRepository.findAll();
//		List<Subject> subLst = subjectRepository.findAll();
//
//		List<Student> dougList = studentRepository.findByName("Doug");
//
//		System.out.println(studentLst.size());
//		System.out.println(subLst.size());
//
//
//		System.out.println("===================Students info:==================");
//		studentLst.forEach(student->System.out.println(student.toString()));
//
//		System.out.println("===================Students info:==================");
//		subLst.forEach(subject->System.out.println(subject.toString()));
	}
}
