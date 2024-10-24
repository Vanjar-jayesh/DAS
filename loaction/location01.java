public class location01 {

    public static void main(String[] args) {
        try {


            String latitude = "mau"; // Replace with actual latitude
            String longitude = "bhiloda"; // Replace with actual longitude

            String url = "https://www.google.com/maps?q=" + latitude + "," + longitude;

            // Open the URL in a browser
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
