import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class readToString {
    public static String[] readToString(String filePath) {
        File file = new File(filePath);
        Long filelength = file.length(); // 获取文件长度
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] fileContentArr = new String(filecontent).split("\r\n");
        return fileContentArr;// 返回文件内容,默认编码
    }

    public static void main(String[] args) {


        String[] stringArr = readToString("C:\\number_collection.txt");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int a=0; a<stringArr.length;a++){
            String tmp=stringArr[a];
            if (map.get(tmp) == null) {
                map.put(tmp, 1);
            } else {
                map.put(tmp, map.get(tmp) + 1);
            }
        }
        System.out.print(map);

    }
}
