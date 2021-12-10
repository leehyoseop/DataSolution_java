import java.util.Scanner;
public class YMain1 {
//평일 스케줄을 출력해주는 프로그램
//시간을 입력받아서 -> 해당시간에 속하는 내용을 출력 -> 입력한 시간범위가 아니면 다시 입력하도록
//오전 9시 ~ 18시 : 학원에서 공부
//오전 9시, 18시 : QR체크인
//13시 : 점심시간
//18시 넘어서 ~ 20시 : 집에가는 시간 
//6시 ~ 9시 전까지 : "기상 + 씻기 +학원가기"
//20시 ~ 6시 : "여가시간 + 취침"	
	public static int getTime() {
		System.err.println("스케줄 확인을 위해 시간을 입력하세요 : ");
		return new Scanner(System.in).nextInt();
	}
	public static String chkSchedule(int time) {
		System.err.printf("입력한 시간 : %d시\n", time);
		String schedule = "학원에서 공부";
		//if안에 조건 넣고 또 그 안에 if 넣어서 조건하면 괜찮다.
		if (time == 13) {
			schedule = "점심시간";
			return schedule;
		} else if (time == 9 || time == 18) {
			schedule = "QR체크인";
			return schedule;
		} else if (time>9 && time<18) {
			return schedule;
		} else if (time>18 && time<20) {
			schedule = "집에가는 시간";
			return schedule;
		} else if (time>=6 && time<9) {
			schedule = "기상 + 씻기 + 학원가기";
			return schedule;
		} else {
			schedule = "여가시간 + 취침";
			return schedule;
		}
	}
	public static void main(String[] args) {
		int chk = getTime();
		if (chk >=0 && chk <=24 ) {
			System.out.println(chkSchedule(chk));
		} else {
			System.out.println("24시간 범위내에서 입력하세요!");
			int againChk = getTime();
			System.out.println(chkSchedule(againChk));
		}
	}
}