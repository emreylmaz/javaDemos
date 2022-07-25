package entities.concretes;

import core.abstracts.NotificationService;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private NotificationService notificationService;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, String password, NotificationService notificationService) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setNotificationService(notificationService);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public String toString() {
        return"{"+getFirstName()+" "+getLastName()+"}";
    }
}
