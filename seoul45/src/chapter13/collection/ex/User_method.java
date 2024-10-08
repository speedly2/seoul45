package chapter13.collection.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class User_method {
	Scanner scan = new Scanner(System.in);
	// 유저등록 리스트
	List<User> userList = new ArrayList<>();

	public void printMenu() {
		System.out.println();
		System.out.println("== 유저관리 프로그램 ==");
		System.out.println("  1. 유저정보 등록"	 );
		System.out.println("  2. 유저정보 조회"	 );
		System.out.println("  3. 전체정보 조회"	 );
		System.out.println("  0. 종　　 　　료"	 );
		System.out.println("================");
		System.out.print("→ 메뉴의 번호 : ");
	}

	public void createUser() {
		System.out.println();
		System.out.println("----------------");
		System.out.println("유저정보를 등록합니다.");
		System.out.print("→ 아이디 : ");
		String id = scan.nextLine();
		System.out.print("→ 비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("→ 이름 : ");
		String name = scan.nextLine();
		System.out.print("→ 핸드폰번호 : ");
		String phone = scan.nextLine();
		System.out.print("→ 주소 : ");
		String address = scan.nextLine();
		
		User user = new User(id, pw, name, phone, address);
		
		for (User u : userList) {
			if(u.getId().equals(id)) {
				System.out.println("[등록실패] 존재하는 ID입니다.");
				return;
			}
		}
		
		System.out.println("[등록성공] 유저를 등록합니다.");
		userList.add(user);
	}

	public void selectUser() {
		System.out.println();
		if (userList.isEmpty()) {
			System.out.println("[조회실패] 등록된 유저가 없습니다.");
			return;
		}
		System.out.println("----------------");
		System.out.println("유저정보를 조회합니다.");
		System.out.print("→ 조회할 아이디 : ");
		String searchId = scan.nextLine();
		System.out.print("→ 비밀번호 확인 : ");
		String checkPw = scan.nextLine();
		
		for (User user : userList) {
			if (user.getId().equals(searchId)) {
				if (user.getPw().equals(checkPw)) {
					System.out.println("[조회성공] 유저정보를 출력합니다.");
					System.out.println(user);	
				} else {
					System.out.println("[조회실패] 패스워드가 틀렸습니다.");
					return;
				}
			}
		}
	}

	public void selectALL() {
		System.out.println();
		if (userList.isEmpty()) {
			System.out.println("[조회실패] 등록된 유저가 없습니다.");
			return;
		}
		System.out.println("----------------");
		System.out.println("전체정보를 조회합니다.");
		
		Collections.sort(userList, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getName().compareTo(u2.getName());
			}
		});
		
		for (User user : userList) {
			System.out.println(user);
		}
	}

}
