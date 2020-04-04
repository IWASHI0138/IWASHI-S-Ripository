package javaensyu2;

class TestTest {
	public static void main(String[] args) {

		// オブジェクトの作成と初期化
		Test data = new Test ("高橋", 100, 95, 90);

		// 表示
		System.out.print(data.getStudentName() + "：");
		System.out.println(data.getAverage());
	}

}
