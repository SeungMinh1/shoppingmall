package co.yedam.VO;

import java.util.Date;

import lombok.Data;

@Data
public class OrderVO {
	private int orderNo;  // sequence
	private int clothNo;  // 옷번호
	private String uidOrder; //user id
	private int orderCnt; //주문 개수
	private Date ordDate; //주문날짜
	private int ordPirce; //주문금액
	private String deliveryState; //배송상태
	

}
