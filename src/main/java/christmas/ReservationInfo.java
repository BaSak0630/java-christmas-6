package christmas;
/*
 * 클래스 이름 ReservationInfo
 *
 * 버전 정보 V1
 *
 * 날짜 10월 20일
 *
 * 저작권 주의
 */
public class ReservationInfo {
    private int reservationDate;
    private String orderMenu; //TODO String to map

    public ReservationInfo() {
        reservationDate = -1;
        orderMenu = "";
    }

    public int getReservationDate() {
        return reservationDate;
    }
}
