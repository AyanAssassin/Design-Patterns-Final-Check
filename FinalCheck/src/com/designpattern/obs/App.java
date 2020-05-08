package com.designpattern.obs;

public class App {
	public static void main(String[] args) {
		INotificationService service = new NotificationService();
		INotificationObserver admin1 = new Admin(service, "Avik", 98);
		INotificationObserver admin2 = new Admin(service, "Avik2", 75);
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.notifyObserver();
	}
}
