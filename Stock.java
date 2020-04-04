package javaensyu2;

class Test {

	// メンバ変数の定義
	private String studentName;
	private int japanese;
	private int math;
	private int english;

	//コンストラクタの定義
	public Test(String studentName, int japanese, int math, int english) {
		this.studentName = studentName;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	// メソッドの定義
	public String getStudentName() {
		return studentName;
}
	public int getJapanese() {
		return japanese;
}
	public int getMath() {
		return math;
}
	public int getEnglish() {
		return english;
}
//平均値
	public int getAverage() {
		return (( japanese + math + english ) / 3);
}
}

