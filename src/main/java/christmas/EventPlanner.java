package christmas;
/*
 * 클래스 이름 EventPlanner
 *
 * 버전 정보 V1
 *
 * 날짜 10월 20일
 *
 * 저작권 주의
 */
public class EventPlanner {
    private InputView inputView;
    private OutputView outputView;
    private ReservationInfo reservationInfo;

    public EventPlanner() {
        inputView = new InputView();
        outputView = new OutputView();
        reservationInfo = new ReservationInfo();
    }

    public void register() {
        int tmp = inputView.readDate();
        while (tmp <0 && tmp >31){
            tmp = inputView.readDate();
        }
    }
}
