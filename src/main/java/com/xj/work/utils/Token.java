package com.xj.work.utils;


import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * @author： chenr
 * @date： Created on 2020/6/11 17:17
 * @version： v1.0
 * @modified By:
 */
public class Token {
    public static void main(String[] args) {
        String client_id = "ztgl-app-b11522d2-d558-437c-81b2-b61827b42ed7";
        String client_secret = "oIvVoUjiU8DE8UEwU66KgP3+fn54m1gojFGluL2BLLTPJn0rbObaViw9jIP9uKtEToIAcmgJi5MWrOLRudYljXCmIwLqv7fnuef4CkxvCSWCvlxhj77pZbKfimVoOcqM9";
        String auth = client_id + ":"+client_secret;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authorization= "Basic " + new String(encodedAuth);
        System.out.println(authorization);
        String str = "www.qq.com";
        char [] chars =  str.toCharArray();
        Set<String> strings = new HashSet<>();
        for (int i=0;i<chars.length;i++){
            for(int j=i+1; j<chars.length+1;j++){
                String s = str.substring(i,j);
                strings.add(s);

            }

        }
        System.out.println(strings.size());


    }
}
