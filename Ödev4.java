package org.javaturk.oopj.ch08;

import java.util.Scanner;

public class Ödev4 {

	public static void main(String[] args) {
// 2 boyutlu düzlemde nokta temsili için Point sınıfı oluştur ve bu sınıfa koordinate bilgileri ile set/get metotları koy
		
		class Point{			
			double xCoordinate1;
			double yCoordinate1;
			double xCoordinate2;
			double yCoordinate2;
			
			
			Point point1 = new Point();
				
			public double getxCoordinate1() {
				return xCoordinate1;
			}

			public void setxCoordinate1(double xCoordinate1) {
				this.xCoordinate1 = xCoordinate1;
			}

			public double getyCoordinate1() {
				return yCoordinate1;
			}

			public void setyCoordinate1(double yCoordinate1) {
				this.yCoordinate1 = yCoordinate1;
			}

			public Point getPoint1() {
				return point1;
			}

			public void setPoint1(Point point1) {
				this.point1 = point1;
			}
			public double getInfo1() {
				double coordinates1 = xCoordinate1 + yCoordinate1;
				System.out.println("The coordinates of point1 is: " +coordinates1);
				return coordinates1 ;
			}
			
			
//			double xCoordinate2;
//			double yCoordinate2;
			
			Point point2 = new Point();

			public double getxCoordinate2() {
				return xCoordinate2;
			}

			public void setxCoordinate2(double xCoordinate2) {
				this.xCoordinate2 = xCoordinate2;
			}

			public double getyCoordinate2() {
				return yCoordinate2;
			}

			public void setyCoordinate2(double yCoordinate2) {
				this.yCoordinate2 = yCoordinate2;
			}

			public Point getPoint2() {
				return point2;
			}

			public void setPoint2(Point point2) {
				this.point2 = point2;
			}
			public double getInfo2() {
				double coordinates2 = xCoordinate2 + yCoordinate2;
				System.out.println("The coordinates of point2 is: " +coordinates2);
				return coordinates2;
			}
		
			
			
			
// Oluşturulan Point nesnesinin merkeze uzaklığını hesaplayan metot koy

			public double findDistanceToCenter(double d0) {
				d0 = Math.sqrt((xCoordinate1*xCoordinate1)+(yCoordinate1*yCoordinate1));
				double distToCenter = d0;
				System.out.println("The distance of point"+ " " + point1+ "to the center is" +distToCenter);
				return distToCenter;
			}
// Oluşturulan Point nesnesinin geçilen başka bir Point nesnesine uzaklığını hesaplayan metot koy.
			public double findDistanceToAPoint(double d1){
				d1 = Math.sqrt(Math.abs(xCoordinate1-xCoordinate2)*Math.abs(xCoordinate1-xCoordinate2) 
						+ Math.abs(yCoordinate1-yCoordinate2)*(Math.abs(yCoordinate1-yCoordinate2)));
				double distBetweenPoints = d1;
				System.out.println("The distance between point1: "+ " "+point1+ "and point2: "+ " "+point2+ "is" 
				+distBetweenPoints);
				return d1;
			}
// Sınıfın üzerine clone isimli metot koy. Bu metotla aynı koordinatlara sahip bir başka Point nesnesi oluşturup
// döndürün
			public Point clone(double xrandom, double yrandom, Point  pointrand){
				this.point2 = pointrand;
				return pointrand;				
			}
			
		}

		
		 
		 


		    
		
		
		
		
		
		
		
		
		
	}
	

}
