public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost){
        System.out.println("Connect to " + serverhost);
    }
}
