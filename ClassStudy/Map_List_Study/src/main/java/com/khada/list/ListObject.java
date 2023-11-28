package com.khada.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListObject {

    public static void main(String[] args) {

        List<String> dongrock = new ArrayList<>();

        ArrayList<String> qwer = new ArrayList<>();

        dongrock.add(0, "ㅎ하이요");
        dongrock.add(1, "ㅂㅈㄷㄱ");
        dongrock.add(2, "ㅁㄴㅇㄹ");


        Map<String, Integer> df = new HashMap<>();

        df.put("멍청비용", 30);
        df.put("하이", 10);
        df.put("동락", 26);
        df.put("현강", 28);

        Map<String, DRDTO> zxc = new HashMap<>();

        zxc.put("취미", new DRDTO("동락",26));
        zxc.put("공부", new DRDTO("현강",24));

        DRDTO dr = new DRDTO("동락", 26);

        System.out.println(dr.getName());
        System.out.println("====================================");
        System.out.println(zxc.get("취미").getAge());

        MapObject mp = new MapObject();

         String str = "아 " + mp.mungchung();

        System.out.println(str);
    }


}
