package com.bridgelabs;

public class Stock {
	private String stockNames;
	private Double numOfShare;
	private Double sharePrice;
	
	
	public Stock() {
		super();
	}

	//Parameterized constructor
	public Stock(String stockNames, Double numOfShare, Double sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}
	
//getters and setters
	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public Double getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(Double numOfShare) {
		this.numOfShare = numOfShare;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}
}
