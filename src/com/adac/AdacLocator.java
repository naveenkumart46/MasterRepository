package com.adac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdacLocator extends BaseClass {
	public AdacLocator(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement btnLogin;
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotels;
	
	@FindBy(id="room_type")
	private WebElement txtRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement txtRoomnos;
	
	@FindBy(id="datepick_in")
	private WebElement txtInDatepick;
	
	@FindBy(id="datepick_out")
	private WebElement txtOutDatepick;
	
	@FindBy(id="adult_room")
	private WebElement dropAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dropChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCardno;
	
	@FindBy(id="cc_type")
	private WebElement dropCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropCCMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropCCYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="order_no")
	private WebElement scrollOrder;
	
	@FindBy(xpath="//input[@value='314427']")
	private WebElement btnSelectBook;
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement btnCancelSelected;
	
	
	public WebElement getBtnSelectBook() {
		return btnSelectBook;
	}

	public void setBtnSelectBook(WebElement btnSelectBook) {
		this.btnSelectBook = btnSelectBook;
	}

	public WebElement getBtnCancelSelected() {
		return btnCancelSelected;
	}

	public void setBtnCancelSelected(WebElement btnCancelSelected) {
		this.btnCancelSelected = btnCancelSelected;
	}

	public WebElement getScrollOrder() {
		return scrollOrder;
	}

	public void setScrollOrder(WebElement scrollOrder) {
		this.scrollOrder = scrollOrder;
	}

	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public void setBtnMyItinerary(WebElement btnMyItinerary) {
		this.btnMyItinerary = btnMyItinerary;
	}
	@FindBy(id="my_itinerary")
	private WebElement btnMyItinerary;
	

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public void setTxtLastname(WebElement txtLastname) {
		this.txtLastname = txtLastname;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public void setTxtAddress(WebElement txtAddress) {
		this.txtAddress = txtAddress;
	}

	public WebElement getTxtCreditCardno() {
		return txtCreditCardno;
	}

	public void setTxtCreditCardno(WebElement txtCreditCardno) {
		this.txtCreditCardno = txtCreditCardno;
	}

	public WebElement getDropCCType() {
		return dropCCType;
	}

	public void setDropCCType(WebElement dropCCType) {
		this.dropCCType = dropCCType;
	}

	public WebElement getDropCCMonth() {
		return dropCCMonth;
	}

	public void setDropCCMonth(WebElement dropCCMonth) {
		this.dropCCMonth = dropCCMonth;
	}

	public WebElement getDropCCYear() {
		return dropCCYear;
	}

	public void setDropCCYear(WebElement dropCCYear) {
		this.dropCCYear = dropCCYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public void setTxtCVV(WebElement txtCVV) {
		this.txtCVV = txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void setBtnBookNow(WebElement btnBookNow) {
		this.btnBookNow = btnBookNow;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public void setBtnRadio(WebElement btnRadio) {
		this.btnRadio = btnRadio;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public void setTxtHotels(WebElement txtHotels) {
		this.txtHotels = txtHotels;
	}

	public WebElement getTxtRoomtype() {
		return txtRoomtype;
	}

	public void setTxtRoomtype(WebElement txtRoomtype) {
		this.txtRoomtype = txtRoomtype;
	}

	public WebElement getTxtRoomnos() {
		return txtRoomnos;
	}

	public void setTxtRoomnos(WebElement txtRoomnos) {
		this.txtRoomnos = txtRoomnos;
	}

	public WebElement getTxtInDatepick() {
		return txtInDatepick;
	}

	public void setTxtInDatepick(WebElement txtInDatepick) {
		this.txtInDatepick = txtInDatepick;
	}

	public WebElement getTxtOutDatepick() {
		return txtOutDatepick;
	}

	public void setTxtOutDatepick(WebElement txtOutDatepick) {
		this.txtOutDatepick = txtOutDatepick;
	}

	public WebElement getDropAdultRoom() {
		return dropAdultRoom;
	}

	public void setDropAdultRoom(WebElement dropAdultRoom) {
		this.dropAdultRoom = dropAdultRoom;
	}

	public WebElement getDropChildRoom() {
		return dropChildRoom;
	}

	public void setDropChildRoom(WebElement dropChildRoom) {
		this.dropChildRoom = dropChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public void setTxtLocation(WebElement txtLocation) {
		this.txtLocation = txtLocation;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(WebElement txtUsername) {
		this.txtUsername = txtUsername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	

}
