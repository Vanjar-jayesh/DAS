import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Scanner;

public class location{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Phone Number Location");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(10, 20, 80, 25);
        panel.add(phoneLabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(100, 20, 165, 25);
        panel.add(phoneText);

        JButton locateButton = new JButton("Get Location");
        locateButton.setBounds(10, 80, 150, 25);
        panel.add(locateButton);

        locateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phoneNumber = phoneText.getText();
                // Simulated Location Fetch
                String mapUrl = getLocationMapURL(phoneNumber);
                openMap(mapUrl);
            }
        });
    }

    private static String getLocationMapURL(String phoneNumber) {
        // Replace this with actual logic to fetch coordinates from the phone number
        // Example: Assume the phone number maps to a lat/lng location
        double latitude = 23.843393;  // example coordinates
         double longitude = 73.003059;

        Scanner sc = new Scanner(System.in);

         //longitude = sc.nextLine();
        //latitude = sc.nextLine();
        // Construct Google Maps URL for the location
        return "https://www.google.com/maps?q=" + latitude + "," + longitude;
    }

    private static void openMap(String mapUrl) {
        try {
            URI uri = new URI(mapUrl);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
