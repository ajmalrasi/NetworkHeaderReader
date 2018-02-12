package catchytube.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by kpajm on 15-07-2017.
 */
public class HeaderReader {
    private HttpURLConnection connection = null;
    private InputStream remoteFileIn = null;
    private FileOutputStream chunkFile;
    private File file;
    private URL url;


    public HeaderReader(String url) {
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public boolean connect(){
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        connection.setConnectTimeout(0);
        connection.setReadTimeout(0);
        connection.setRequestProperty("Range", "bytes=" + "1048576" + "-" + "5242880");
        try {
            connection.connect();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void createFile(String address){
        this.file = new File(address);
    }

    public void open(){
        int status = 0;
        try {
            status = connection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        switch (status) {
//            case 416:
//                remoteFileIn = connection.getErrorStream();
//                break;
//            default:
//                try {
//                    remoteFileIn = connection.getInputStream();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                break;
//        }
//        System.out.println(status);
    }

    public void readHeaders(){
        for (Map.Entry<String, List<String>> k : connection.getHeaderFields().entrySet()) {
            for (String v : k.getValue()){
                System.out.println(k.getKey() + ":" + v);
            }
        }
    }


}
