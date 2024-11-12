/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package londonmusicaltickets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
/**
 *
 * @author aamir
 */
public class FileManager {
    public static ArrayList<Musical> loadMusicalsFromFile(String filePath) {
      ArrayList<Musical> musicals = new ArrayList<>();
      try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
          String line;
          while ((line = br.readLine()) != null) {
              String[] data = line.split(",");

              // Check if the line has enough fields before parsing
              if (data.length >= 13) {
                  String name = data[0];
                  String description = data[1];
                  String category = data[2];
                  double runtime = Double.parseDouble(data[3]);
                  String startDate = data[4];
                  String endDate = data[5];
                  String venue = data[6];
                  int age = Integer.parseInt(data[7]);
                  ImageIcon image = new ImageIcon(data[8]);
                  List<String> showDates = Arrays.asList(data[9].split(";"));
                  double adultTicketPrice = Double.parseDouble(data[10]);
                  double seniorTicketPrice = Double.parseDouble(data[11]);
                  double studentTicketPrice = Double.parseDouble(data[12]);

                  Musical musical = new Musical(name, description, category, runtime, startDate, endDate, showDates, venue, age, image, adultTicketPrice, seniorTicketPrice, studentTicketPrice);
                  musicals.add(musical);
              } else {
                  System.err.println("Invalid line format: " + line);
              }
          }
      } catch (IOException e) {
          e.printStackTrace();
      } catch (NumberFormatException e) {
          System.err.println("Error parsing number: " + e.getMessage());
      }
      return musicals;
  }
}