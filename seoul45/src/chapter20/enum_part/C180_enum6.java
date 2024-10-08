package chapter20.enum_part;

public class C180_enum6 {

	public static void main(String[] args) {
		/*
		 * 섭씨(Celsius), 화씨(Fahrenheit), 켈빈(Kelvin)은 모두 온도를 측정하는 데 사용되는 단위
		 * 	- 섭씨: 전 세계적으로 가장 널리 사용되는 온도 단위
		 *  - 화씨: 주로 미국에서 사용되는 온도 단위
		 *  - 켈빈: 주로 과학적 목적으로 사용되는 온도 단위로, 절대 온도를 나타냄. 
		 *  	  절대 영도(분자 운동이 완전히 멈추는 온도)를 기준으로 한 온도 체계
		 */
		
		// 섭씨, 화씨, 켈빈 각각이 다른 방식으로 온도를 변환
		double tempInCelsius = 100; // 100도 섭씨

        // 섭씨 -> 화씨 변환
        double tempInFahrenheit = TemperatureScale.FAHRENHEIT.fromCelsius(tempInCelsius);
        System.out.println("섭씨 100도는 화씨 " + tempInFahrenheit + "도입니다.");

        // 섭씨 -> 켈빈 변환
        double tempInKelvin = TemperatureScale.KELVIN.fromCelsius(tempInCelsius);
        System.out.println("섭씨 100도는 켈빈 " + tempInKelvin + "도입니다.");

        // 화씨 -> 섭씨 변환
        double fahrenheit = 32; // 32도 화씨
        double celsiusFromFahrenheit = TemperatureScale.FAHRENHEIT.toCelsius(fahrenheit);
        System.out.println("화씨 32도는 섭씨 " + celsiusFromFahrenheit + "도입니다.");

        // 켈빈 -> 섭씨 변환
        double kelvin = 373.15; // 373.15도 켈빈
        double celsiusFromKelvin = TemperatureScale.KELVIN.toCelsius(kelvin);
        System.out.println("켈빈 373.15도는 섭씨 " + celsiusFromKelvin + "도입니다.");
	}

}

enum TemperatureScale {
    CELSIUS("C") {
        @Override
        public double toCelsius(double value) {
            return value; // 이미 섭씨
        }
        @Override
        public double fromCelsius(double value) {
            return value; // 그대로 반환
        }
    },
    FAHRENHEIT("F") {
        @Override
        public double toCelsius(double value) {
            return (value - 32) * 5 / 9; // 화씨 -> 섭씨 변환
        }
        @Override
        public double fromCelsius(double value) {
            return (value * 9 / 5) + 32; // 섭씨 -> 화씨 변환
        }
    },
    KELVIN("K") {
        @Override
        public double toCelsius(double value) {
            return value - 273.15; // 켈빈 -> 섭씨 변환
        }
        @Override
        public double fromCelsius(double value) {
            return value + 273.15; // 섭씨 -> 켈빈 변환
        }
    };

    private final String symbol;

    // 생성자
    TemperatureScale(String symbol) {
        this.symbol = symbol;
    }

    // 기호를 반환하는 메서드
    @Override
    public String toString() {
        return symbol;
    }

    // 추상 메서드: 각 온도 단위에서 섭씨로 변환
    public abstract double toCelsius(double value);

    // 추상 메서드: 섭씨에서 해당 온도 단위로 변환
    public abstract double fromCelsius(double value);
}
