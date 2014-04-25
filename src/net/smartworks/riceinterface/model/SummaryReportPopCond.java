/* 
 * $Id$
 * created by    : yukm
 * creation-date : 2014. 4. 22.
 * =========================================================
 * Copyright (c) 2014 ManinSoft, Inc. All rights reserved.
 */

package net.smartworks.riceinterface.model;

import java.util.Date;

import net.smartworks.common.Cond;

public class SummaryReportPopCond extends Cond {
	
	private Date fromDate;
	private Date toDate;
	private String selector;
	private String selectTestDate;

	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getSelector() {
		return selector;
	}
	public void setSelector(String selector) {
		this.selector = selector;
	}
	public String getSelectTestDate() {
		return selectTestDate;
	}
	public void setSelectTestDate(String selectTestDate) {
		this.selectTestDate = selectTestDate;
	}
}