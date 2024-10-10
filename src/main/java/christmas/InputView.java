package christmas;

import camp.nextstep.edu.missionutils.Console;

/*
 * 클래스 이름 InputView
 *
 * 버전 정보 V1
 *
 * 날짜 10월 20일
 *
 * 저작권 주의
 */
public class InputView {
    public int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        try{
            String input = Console.readLine();
            int number = Integer.parseInt(input);
            if(number <0 || number >31) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }
            return number;
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }
}
