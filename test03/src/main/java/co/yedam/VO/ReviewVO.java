package co.yedam.VO;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewVO {
	private int reviewNo; // review번호 시쿼스
	private int clothNo; // 옷번호
	private String userId; //user id
	private String detail; //상품설명
	private String img; //사진
	private Date reviewDate; // 리뷰작성날자
	private int grade; //평점

}
