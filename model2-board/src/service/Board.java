package service;

//Board.class
public class Board { //extends Object{  클래스는 extends가 항상 있어야 한다. 상속받을 내용이 없을 경우 extends object
	 private int boardNo;
	 private String boardPw;
	 private String boardTitle;
	 private String boardContent;
	 private String boardUser;
	 private String boardDate;
	 
	 public int getBoardNo() {
	     return boardNo;
	 }
	 public void setBoardNo(int boardNo) {
	     this.boardNo = boardNo;
	 }
	 public String getBoardPw() {
	     return boardPw;
	 }
	 public void setBoardPw(String boardPw) {
	     this.boardPw = boardPw;
	 }
	 public String getBoardTitle() {
	     return boardTitle;
	 }
	 public void setBoardTitle(String boardTitle) {
	     this.boardTitle = boardTitle;
	 }
	 public String getBoardContent() {
	     return boardContent;
	 }
	 public void setBoardContent(String boardContent) {
	     this.boardContent = boardContent;
	 }
	 public String getBoardUser() {
	     return boardUser;
	 }
	 public void setBoardUser(String boardUser) {
	     this.boardUser = boardUser;
	 }
	 public String getBoardDate() {
	     return boardDate;
	 }
	 public void setBoardDate(String boardDate) {
	     this.boardDate = boardDate;
	 }
	 
	 @Override // 우클릭 -> source -> Generate toString()
	 public String toString() {
	     return "Board [boardNo=" + boardNo + ", boardPw=" + boardPw + ", boardTitle=" + boardTitle + ", boardContent="
	             + boardContent + ", boardUser=" + boardUser + ", boardDate=" + boardDate + "]";
	 }
}