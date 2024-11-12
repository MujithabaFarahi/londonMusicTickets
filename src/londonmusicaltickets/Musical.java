/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package londonmusicaltickets;

import javax.swing.ImageIcon;
import java.util.List;
/**
 *
 * @author aamir
 */
public class Musical {
    private String name;
    private String description;
    private String category;
    private double runtime; // Runtime in minutes
    private String startDate; // Start date of the musical
    private String endDate; // End date of the musical
    private List<String> showDates; // Show times (e.g., Morning, Noon, Evening)
    private String venue; // Venue of the musical
    private int age; // Recommended age
    private ImageIcon image; // Image of the musical
    private double adultTicketPrice; // Adult ticket price
    private double seniorTicketPrice; // Senior ticket price
    private double studentTicketPrice; // Student ticket price

    // Constructor to initialize all attributes
    public Musical(String name, String description, String category, double runtime, String startDate, String endDate, List<String> showDates, String venue, int age, ImageIcon image, double adultTicketPrice, double seniorTicketPrice, double studentTicketPrice) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.runtime = runtime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.showDates = showDates;
        this.venue = venue;
        this.age = age;
        this.image = image;
        this.adultTicketPrice = adultTicketPrice; // Initialize adult ticket price
        this.seniorTicketPrice = seniorTicketPrice; // Initialize senior ticket price
        this.studentTicketPrice = studentTicketPrice; // Initialize student ticket price
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getRuntime() {
        return runtime;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<String> getShowDates() {
        return showDates;
    }

    public String getVenue() {
        return venue;
    }

    public double getAge() {
        return age;
    }

    public ImageIcon getImage() {
        return image;
    }

    public double getAdultPrice() {
        return adultTicketPrice;
    }

    public double getSeniorPrice() {
        return seniorTicketPrice;
    }

    public double getStudentPrice() {
        return studentTicketPrice;
    }

    // Setters (if needed)
    public void setShowDates(List<String> showDates) {
        this.showDates = showDates;
    }

    public void setAdultPrice(double adultTicketPrice) {
        this.adultTicketPrice = adultTicketPrice;
    }

    public void setSeniorPrice(double seniorTicketPrice) {
        this.seniorTicketPrice = seniorTicketPrice;
    }

    public void setStudentPrice(double studentTicketPrice) {
        this.studentTicketPrice = studentTicketPrice;
    }

   /* 
    @Override
    public String toString() {
        return name + "\n" + description + "\n" + category + " (" + runtime + " mins)" + venue + "\n" + age;
    }*/
    // Add other methods as needed for functionality (e.g., toString, equals, hashCode)
}
