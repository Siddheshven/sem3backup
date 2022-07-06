package cyber;

import java.util.logging.*;

public class MyLogger {
    public static void main(String[] args){
        Logger l = Logger.getLogger(MyLogger.class.getName());
        FileHandler fh;
        try{
            fh = new FileHandler("E:/mylogfile.log",true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            l.info("MY First Log");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        l.info("Hi, How r u ?");
    }
}
