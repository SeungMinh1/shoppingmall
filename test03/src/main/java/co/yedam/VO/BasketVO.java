package co.yedam.VO;

import lombok.Data;

@Data
public class BasketVO {
	private int basketNo; // sequence
	private String userId; //userId
	private String clothNo; // 옷번호 
	private int basketCnt; /// 상품개수
}
