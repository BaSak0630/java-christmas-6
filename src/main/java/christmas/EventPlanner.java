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
        readReservationDate();
    }

    private void readReservationDate() {
        int reservationDate = 0;
        while (reservationDate == 0) {
            try {
                reservationDate = inputView.readDate();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
