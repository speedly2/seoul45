package chapter13.collection.ex;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class School_method {
	Scanner scan = new Scanner(System.in);
	TreeSet<Student> ts = new TreeSet<>();

	public void printMenu() {
		System.out.println();
		System.out.println("== 학사관리 프로그램 ==");
		System.out.println("  1. 학생정보 등록"	 );
		System.out.println("  2. 학생정보 조회"	 );
		System.out.println("  3. 전체정보 조회"	 );
		System.out.println("  0. 종　　　  료"	 );
		System.out.println("================");
		System.out.print("→ 메뉴의 번호 : ");
	}

	public void enterStudent() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("학생정보를 등록합니다.");
		System.out.print("→ 이름 : ");
		String stdName = scan.next();
		System.out.print("→ 전공 : ");
		String major = scan.next();
		
		Student student = new Student(stdName, major);
		boolean result = ts.contains(student);
		
		if (result)	
			System.out.println("[취소] 등록된 학생입니다.");
		else {
			ts.add(student);
			System.out.println("[성공] 등록되었습니다.");
		}
	}

	public void selectStudent() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("학생정보를 조회합니다.");
		if (ts.isEmpty()) {
			System.out.println("*학생정보가 없습니다.");
			return;
		}
		System.out.print("→ 조회할 이름 : ");
		String searchName = scan.next();
		
		Iterator<Student> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStdName().equals(searchName)) {
            	System.out.println(student);
                return;
            }
        }
        
        System.out.println("*학생정보가 없습니다.");
	}

	public void selectAll() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("전체학생정보를 조회합니다.");
		if (ts.isEmpty()) {
			System.out.println("*학생정보가 없습니다.");
			return;
		}
		
		Iterator<Student> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
        System.out.println();
	}
}
