import net.webservicex.GeoIPService;

public class SOAPconsumer {

    public static void main(String[] args) throws Exception {
        if(args.length > 0) {
            String ipAddress = args[0];

            System.out.println(new GeoIPService().getGeoIPServiceSoap().getGeoIP(ipAddress).getCountryName());

        } else {
            throw new Exception("Please provide an IP address.");
        }
    }
}
