package TheFifth;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLfir {
    String temp = null;
    public URLfir() {
        try {
            URL url = new URL("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=16111804");
            InputStream input = url.openStream();
            Scanner scan = new Scanner(input);
            scan.useDelimiter("\n");
            while (scan.hasNext()) {
                temp = temp + scan.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
