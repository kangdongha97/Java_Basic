package Basic0827;

//ex30 Math 클래스 사용)
public class Math30 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-5)); // 절대값
		System.out.println(Math.ceil(-5.63)); // 소수 첫 째 자리에서 올림 음수 주의
		System.out.println(Math.floor(-5.63)); // 소수 첫 째 자리에서 버림 음수 주의
		System.out.println(Math.max(5, 9)); // 가장 높은 수
		System.out.println(Math.min(5, 9)); // 가장 낮은 수
		System.out.println(Math.rint(8.213)); // 가장 가까운 정수 값
		System.out.println(Math.round(4.55)); // 소수 첫 째자리에서 반올림
	}
}
