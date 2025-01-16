package rrr;

import java.util.HashMap;
import java.util.Map;

public class SVIT_Global 
{

	
	public static void main(String[] args) {
        String str = "Programming";
        int count =2;
       getCount(str);
       getCount(str,count);
    }
   
    public static void getCount(String str){
         int count =2;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int occ = map.get(ch);
                    map.put(ch,++occ);
                }else{
                    map.put(ch,1);
                }
           
        }
        System.out.println(map);
        // for(Map.Entry<Character,Integer> entry : map.entrySet()){
        //     if(entry.getValue()==count){
        //         System.out.println(entry.getKey()+" = "+entry.getValue());
        //     }
        // }
    }
   
    public static void getCount(String str, int count){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int occ = map.get(ch);
                    map.put(ch,++occ);
                }else{
                    map.put(ch,1);
                }
           
        }
       
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==count){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }}
