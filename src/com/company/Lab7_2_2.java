package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Lab7_2_2 {
    public static void main(String[] args) throws FileNotFoundException
    {
        File file=new File("C:\\Users\\Stone\\Desktop\\English.txt");
        Scanner scanner=new Scanner(file);
        HashMap<String, Integer > hashMap=new HashMap<String,Integer>();
        System.out.println("article-----------------------------------");
        while(scanner.hasNextLine())
        {
            String line=scanner.nextLine();
            System.out.println(line);
            String[] lineWords=line.split("\\W+");

            Set<String> wordSet=hashMap.keySet();
            for(int i=0;i<lineWords.length;i++)
            {
                if(wordSet.contains(lineWords[i]))
                {
                    Integer number=hashMap.get(lineWords[i]);
                    number++;
                    hashMap.put(lineWords[i], number);
                }
                else
                {
                    hashMap.put(lineWords[i], 1);
                }
            }

        }
        System.out.println("Word statistics：------------------------------");
        Iterator<String> iterator=hashMap.keySet().iterator();
        while(iterator.hasNext())
        {
            String word=iterator.next();

            System.out.printf("word:%-12s The number of occurrences of the word:%d\n",word,hashMap.get(word));
        }

    }
}
