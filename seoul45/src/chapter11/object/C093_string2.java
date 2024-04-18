package chapter11.object;

public class C093_string2 {

	public static void main(String[] args) {
/*
	String 메서드
		equals		두개의 문자열이 동일한 값을 가지고 있는지 boolean형으로 결과값을 리턴한다.
		indexOf		문자열에서 특정 문자가 시작되는 인덱스를 리턴한다.
		length()    문자열의 길이를 반환한다.
		substring() 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
		            파라미터에 (int startindex) or (int startindex, int endindex)
		toUpperCase()문자열을 모두 대문자로 변경한다.
		toLowerCase()문자열을 모두 소문자로 변경한다.
		concat()    문자열과 문자열을 이어준다.
		startWith() 문자열이 지정한 문자로 시작하는지 판단 후 있으면 true, 없으면 false를 반환한다.(대소문자 구분)
		endWith()	문자열 마지막에 지정한 문자가 있는지를 판단 후 있으면 true, 없으면 false를 반환한다.(대소문자 구분)
		replace()	문자열 중 특정 문자를 다른 문자로 바꾸고 싶을 경우에 사용한다.
		split()     지정한 문자로 문자열을 나눌 수 있다. 나눠진 부분들의 결과 값은 배열로 반환한다.
		trim()		문자열의 시작과 끝에 있는 공백을 없애준다. 중간공백은 없애주지 않는다.
		contains()  두개의 String을 비교해서 비교대상 String값을 포함하고 있으면 true, 다르면 false를 반환한다.
		charAt()    지정한 index번째에 문자를 반환한다.
*/
		//length
		String str = "아름다운 우리나라";
		System.out.println("길이 : " + str.length());
		System.out.println("2번째 문자 : " + str.charAt(2));

		//indexof
		String str2 = "String Search Method of String Class";
		System.out.println("앞쪽 t = " + str2.indexOf('t'));
		System.out.println("뒤쪽 t = " + str2.lastIndexOf('t'));
		System.out.println("앞쪽 z = " + str2.indexOf('z'));
		System.out.println("앞쪽 String = " + str2.indexOf("String"));
		System.out.println("뒤쪽 String = " + str2.lastIndexOf("String"));
		
		//startWith
		String str3 = "girl.jpg";
		System.out.println(str3.startsWith("g"));
		System.out.println(str3.endsWith(".jpg"));
		
		//changecase
		String str4 = "Kim Sang Hyung";
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		// 문자열 자체를 변경하는 것은 아니다.
		str4.toUpperCase();
		System.out.println(str4);
		// 문자열을 변경하려면 다시 대입받아야 한다.
		str4 = str4.toUpperCase(); 
		System.out.println(str4);
		
		//trim
		String str5 = "      Kim Sang Hyung    ";
		System.out.println(str5.trim());
		System.out.println(str5.trim().concat(" BABO"));
		
		//replace
		String str6 = "독도는 일본땅이다. 대마도는 일본땅이다.";
		System.out.println(str6.replace("일본", "한국"));
		System.out.println(str6.replaceFirst("일본", "한국"));
		
		//substring
		String str7 = "0123456789";
		System.out.println(str7.substring(3,7));
		
		//split
		String city = "서울,대전,대구,부산";
		String[] token = city.split(",");
		for (String s : token) {
			System.out.println(s);
		}
		
		//join
		String path = String.join("/", "user", "data", "app", "local");
		System.out.println(path);
	}

}
