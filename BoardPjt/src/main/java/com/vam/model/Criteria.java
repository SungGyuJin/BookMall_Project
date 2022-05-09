package com.vam.model;

public class Criteria {
	
	// 현재 페이지
	private int pageNum;

	// 한 페이지에 보여질 게시물 갯수
	private int amount; // 보여지는 리스트항목 개수
	
	// 기본 생성자 -> 기본 세팅: pageNum = 1, amount = 10
	public Criteria() {
		this(1, 10);
	}
	
	// 생성자 -> 원하는 pageNum, 원하는 amount
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
	
	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + "]";
	}

}
