/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package londonmusicaltickets;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;
import java.util.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author aamir
 */
public class BookTickets extends javax.swing.JFrame {

    /**
     * Creates new form BookTickets
     */
    private ArrayList<Musical> musicals;
    private ArrayList<Double> totalSum = new ArrayList<>();
    private ArrayList<Integer> totalNoOfTickets = new ArrayList<>();

    private DefaultListModel<String> listModel;
    //   private List<String> availableSeats;
    //   private List<String> selectedSeats;

    public BookTickets() {
        /*  this.availableSeats = List.of("1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C");
        this.selectedSeats = new ArrayList<>();*/
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ticketTypeGroup = new javax.swing.ButtonGroup();
        musicalComboBox = new javax.swing.JComboBox<>();
        selectMusicalLabel = new javax.swing.JLabel();
        bookTicketsLabel = new javax.swing.JLabel();
        selectDateLabel = new javax.swing.JLabel();
        adultButton = new javax.swing.JRadioButton();
        seniorButton = new javax.swing.JRadioButton();
        studentButton = new javax.swing.JRadioButton();
        noOfTicketsLabel = new javax.swing.JLabel();
        typeOfTicketLabel = new javax.swing.JLabel();
        ticketSpinner = new javax.swing.JSpinner(new SpinnerNumberModel(1,1,8,1));
        addToCartButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        showTimeLabel = new javax.swing.JLabel();
        selectShowTimeComboBox = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartList = new javax.swing.JList<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        musicalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        musicalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicalComboBoxActionPerformed(evt);
            }
        });

        selectMusicalLabel.setText("Select Musical:");

        bookTicketsLabel.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        bookTicketsLabel.setText("Book Tickets");

        selectDateLabel.setText("Select Show Date:");

        ticketTypeGroup.add(adultButton);
        adultButton.setText("Adult");

        ticketTypeGroup.add(seniorButton);
        seniorButton.setText("Senior");
        seniorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seniorButtonActionPerformed(evt);
            }
        });

        ticketTypeGroup.add(studentButton);
        studentButton.setText("Student");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        noOfTicketsLabel.setText("Number of Tickets:");

        typeOfTicketLabel.setText("Type of Ticket:");

        addToCartButton.setText("Add to Cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        imageLabel.setText("Select a Musical to see its poster");

        showTimeLabel.setText("Select Show Time:");

        selectShowTimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectShowTimeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectShowTimeComboBoxActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Selected Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listModel = new DefaultListModel<>();
        cartList = new JList<>(listModel);
        musicals = FileManager.loadMusicalsFromFile("musicals.csv");
        if (musicals == null || musicals.isEmpty()) {
            System.out.println("No musicals loaded from the CSV file.");
        }

        /*
        cartList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        */
        cartList.setModel(listModel);
        jScrollPane2.setViewportView(cartList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bookTicketsLabel)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noOfTicketsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adultButton)
                                .addGap(18, 18, 18)
                                .addComponent(seniorButton)
                                .addGap(18, 18, 18)
                                .addComponent(studentButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeOfTicketLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(musicalComboBox, 0, 124, Short.MAX_VALUE)
                                        .addComponent(showTimeLabel)
                                        .addComponent(selectShowTimeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(selectDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(selectMusicalLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addToCartButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imageLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)))
                                .addGap(56, 56, 56)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bookTicketsLabel)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectMusicalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(musicalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectDateLabel)
                        .addGap(2, 2, 2)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectShowTimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(typeOfTicketLabel))
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultButton)
                    .addComponent(seniorButton)
                    .addComponent(studentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfTicketsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCartButton)
                    .addComponent(payButton)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton3.getAccessibleContext().setAccessibleName("resetButton");
        jButton1.getAccessibleContext().setAccessibleName("deleteButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*    // Populate the seat panel with buttons for seat selection
    private void populateSeatPanel() {
        seatPanel.removeAll();
        for (String seat : availableSeats) {
            JButton seatButton = new JButton(seat);
            seatButton.setBackground(Color.GREEN);

            seatButton.addActionListener(e -> {
                if (seatButton.getBackground() == Color.GREEN) {
                    seatButton.setBackground(Color.RED);
                    selectedSeats.add(seat);
                } else {
                    seatButton.setBackground(Color.GREEN);
                    selectedSeats.remove(seat);
                }
            });

            seatPanel.add(seatButton);
        }
        seatPanel.revalidate();
        seatPanel.repaint();
    }
     */
    public void setMusicals(ArrayList<Musical> musicals) {
        this.musicals = musicals;
        populateMusicalComboBox();  // Call a method to update the JComboBox with musicals
    }

    private void populateMusicalComboBox() {
        musicalComboBox.removeAllItems();
        for (Musical musical : musicals) {
            musicalComboBox.addItem(musical.getName());  // Assuming Musical has a getName() method
        }
    }


    private void musicalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicalComboBoxActionPerformed
        // TODO add your handling code here:
        // Get the selected musical's name from the combo box

        // Find the matching Musical object from the list
        selectShowTimeComboBox.removeAllItems();
        int selectedIndex = musicalComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            Musical selectedMusical = musicals.get(selectedIndex);
            for (String showtime : selectedMusical.getShowDates()) {
                selectShowTimeComboBox.addItem(showtime);
            }

            try {
                String startDateString = selectedMusical.getStartDate().trim();  // Assuming Musical has a startDate
                String endDateString = selectedMusical.getEndDate();

                var dateFormat = new SimpleDateFormat("M/d/yyyy");

                Date startDate = dateFormat.parse(startDateString);
                Date endDate = dateFormat.parse(endDateString);

                dateChooser.setMinSelectableDate(startDate);
                dateChooser.setMaxSelectableDate(endDate);

                dateChooser.setDate(startDate);

            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error setting minimum selectable date.");
            }

            ImageIcon icon = selectedMusical.getImage();
            if (icon != null && icon.getIconWidth() > 0) {
                // Resize the image to fit the label dimensions
                Image scaledImage = icon.getImage().getScaledInstance(
                        imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH
                );
                imageLabel.setIcon(new ImageIcon(scaledImage));
                imageLabel.setText(""); // Clear text if an image is displayed
            } else {
                imageLabel.setIcon(null); // Clear the icon if no image is available
                imageLabel.setText("Image not available"); // Default text if no image is found
            }
        } else {
            // Clear imageLabel if no musical is selected
            imageLabel.setIcon(null);
            imageLabel.setText("");
        }


    }//GEN-LAST:event_musicalComboBoxActionPerformed
    private void populateShowTimeComboBox() {

    }


    private void seniorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seniorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seniorButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:

        int selectedMusicalIndex = musicalComboBox.getSelectedIndex();
        if (selectedMusicalIndex != -1) {
            Musical selectedMusical = musicals.get(selectedMusicalIndex);

            Date selectedDate = dateChooser.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Please select a date");
                return;
            }

            // Format the date (optional, for better readability)
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);

            String selectedShowTime = (String) selectShowTimeComboBox.getSelectedItem();

            String ticketType = adultButton.isSelected() ? "Adult" : seniorButton.isSelected() ? "Senior" : studentButton.isSelected() ? "Student" : "Unknown";

            double price = 0;

            if (ticketType == "Unknown") {
                JOptionPane.showMessageDialog(this, "Please select a Ticket Type");
                return;
            } else if (ticketType == "Adult") {
                price = selectedMusical.getAdultPrice();
            } else if (ticketType == "Senior") {
                price = selectedMusical.getSeniorPrice();
            } else if (ticketType == "Student") {
                price = selectedMusical.getStudentPrice();
            }

            int numberOfTickets = (Integer) ticketSpinner.getValue();

            double totalPrice = numberOfTickets * price;

            totalNoOfTickets.add(numberOfTickets);
            totalSum.add(totalPrice);

            String cartItem = selectedMusical.getName() + " - "
                    + formattedDate
                    + " - " + selectedShowTime + " - " + ticketType + " - " + numberOfTickets + " tickets" + " - " + "Total Price - $ " + totalPrice + "\n";

            listModel.addElement(cartItem);

        } else {
            JOptionPane.showMessageDialog(this, "Please select a musical and date.");
        }

    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Check if the cart is empty
        if (listModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Your Cart is Empty!", "Cart Empty",JOptionPane.INFORMATION_MESSAGE );
            return; // Exit the method if the cart is empty
        }

        // Generate the cart contents as a string
        StringBuilder cartContents = new StringBuilder();
        for (int i = 0; i < listModel.size(); i++) {
            cartContents.append(listModel.getElementAt(i)).append("\n");
        }

        // Create a text area to display the cart contents
        JTextArea confirmationTextArea = new JTextArea(cartContents.toString());
        confirmationTextArea.setEditable(false);
        confirmationTextArea.setLineWrap(true);
        confirmationTextArea.setWrapStyleWord(true);

        // Create a scroll pane for better readability
        JScrollPane scrollPane = new JScrollPane(confirmationTextArea);
        scrollPane.setPreferredSize(new Dimension(300, 150)); // Set a fixed height for scrollable content

        // Calculate total sum and total number of tickets
        double sum = 0;
        for (double price : totalSum) {
            sum += price;
        }

        int ticketSum = 0;
        for (int tickets : totalNoOfTickets) {
            ticketSum += tickets;
        }

        // Create labels for total number of tickets and total price
        JLabel totalTicketsLabel = new JLabel("Total Number of Tickets: " + ticketSum);
        JLabel totalPriceLabel = new JLabel("Total Amount: $" + sum);

        // Create a panel to hold the labels and the scroll pane
        JPanel panel = new JPanel(new BorderLayout());
        JPanel summaryPanel = new JPanel(new GridLayout(2, 1)); // Panel to organize labels
        summaryPanel.add(totalTicketsLabel);
        summaryPanel.add(totalPriceLabel);

        panel.add(scrollPane, BorderLayout.CENTER); // Add scroll pane with cart items
        panel.add(summaryPanel, BorderLayout.SOUTH); // Add labels below the cart contents

        // Show the custom confirmation dialog
        int response = JOptionPane.showConfirmDialog(this,
                panel, // Custom panel with cart contents and labels
                "Confirm Booking", // Dialog title
                JOptionPane.YES_NO_OPTION, // Options to display
                JOptionPane.PLAIN_MESSAGE); // Message type

        if (response == JOptionPane.YES_OPTION) {
            // If the user clicks "Confirm", write to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("booking_receipt.txt"))) {
                writer.write(cartContents.toString() + "\n"
                        + "Total Number of Tickets: " + ticketSum + "\n"
                        + "Total Amount: $" + sum);
                JOptionPane.showMessageDialog(this, "Booking confirmed! Receipt saved.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving the receipt.");
            }
        } else {
            // If the user clicks "Cancel"
            JOptionPane.showMessageDialog(this, "Booking canceled.");
        }
    }


    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentButtonActionPerformed

    private void selectShowTimeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectShowTimeComboBoxActionPerformed
        // TODO add your handling cod        
        int selectedIndex = selectShowTimeComboBox.getSelectedIndex();
    }//GEN-LAST:event_selectShowTimeComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        listModel.clear();
        totalSum.clear();
        totalNoOfTickets.clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cartList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
            totalSum.remove(selectedIndex);
            totalNoOfTickets.remove(selectedIndex);

        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to remove.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JRadioButton adultButton;
    private javax.swing.JLabel bookTicketsLabel;
    private javax.swing.JList<String> cartList;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> musicalComboBox;
    private javax.swing.JLabel noOfTicketsLabel;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel selectDateLabel;
    private javax.swing.JLabel selectMusicalLabel;
    private javax.swing.JComboBox<String> selectShowTimeComboBox;
    private javax.swing.JRadioButton seniorButton;
    private javax.swing.JLabel showTimeLabel;
    private javax.swing.JRadioButton studentButton;
    private javax.swing.JSpinner ticketSpinner;
    private javax.swing.ButtonGroup ticketTypeGroup;
    private javax.swing.JLabel typeOfTicketLabel;
    // End of variables declaration//GEN-END:variables
}