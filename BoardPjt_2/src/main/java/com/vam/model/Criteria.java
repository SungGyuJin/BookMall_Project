package com.vam.model;

public class Criteria {

	// 현재페이지
	private int pageNum;
	
	// 한 페이지에 보여질 게시물 갯수
	private int amount;
	
	// 기본생성자 -> pageNum과 amount 세팅
	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
