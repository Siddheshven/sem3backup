package cyber;

import java.io.*;

public class dirSearch {
    public static void main(String[] args)throws Exception {
        String d="";
        final String f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the directory you have to search");
        d=br.readLine();
        System.out.println("Enter filter of file you want to search");
        f=br.readLine();
        File dir = new File(d);
        FilenameFilter filter = new FilenameFilter(){
            public boolean accept(File dir,String name){
                return name.startsWith(f);
            }
        };
        String [] children=dir.list(filter);
        if(children==null){
            System.out.println("dir does not exist");
        }else{
            for(int i=0;i<children.length;i++){
                String Filename = children[i];
                System.out.println(Filename);
            }
        }
    }
}
