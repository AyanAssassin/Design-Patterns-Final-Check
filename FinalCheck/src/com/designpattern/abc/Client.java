package com.designpattern.abc;

public class Client {

	public static void main(String[] args) {

		Order order1 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		Order order2 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.TOYS);
		Order order3 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		Order order4 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.FURNITURE);

		order1.processOrder();
		order2.processOrder();
		
		System.out.println();

		order3.processOrder();
		order4.processOrder();
	}

}
