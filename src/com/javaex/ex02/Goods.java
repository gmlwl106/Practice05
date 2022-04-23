package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	//수정: 기본 생성자 추가 ->parameter 없이 만들어지는 camera 객체를 위해 만들어야함
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//메소드 gs
	public String getName() {
		return name;
	}

	//수정: private->public으로 수정 
	//->private로 만들면 이 클래스에서만 사용할 수 있기때문에 GoodsApp에서도 사용할 수 있는 public으로 수정
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}
/*결과
 * 상품명:니콘, 가격:400000
 * 상품명:머그컵, 가격:2000
 */



