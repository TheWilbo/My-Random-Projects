import java.net.URI;

public class Map {
    public static void main(String[] args){
        try {
   
        URI uri= new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        
        java.awt.Desktop.getDesktop().browse(uri);
         System.out.println("Web page opened in browser");
      
       } catch (Exception e) {
        
        e.printStackTrace();
       }
    }
}
