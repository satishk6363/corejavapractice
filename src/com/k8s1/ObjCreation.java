package com.k8s1;

public class ObjCreation {
	int a;
	int b;
	

	public ObjCreation() {
		a= 20;
		b=30;
			}
	public ObjCreation(int a,int b ) {
		this.a = a;
		this.b= b;
	}
	public int add() {
		return a+b;
	}
	
	

	public static void main(String[] args) {
		ObjCreation ob1 = new ObjCreation();
		ObjCreation ob2 = new ObjCreation(30,600);
		ObjCreation ob3 = new ObjCreation(40,50);
		System.out.println(ob1.add());
		System.out.println(ob2.add());
		System.out.println(ob3.add());
		
		System.out.println(ob1!=ob2);
		System.out.println(ob2==ob3);
	

	}

}
