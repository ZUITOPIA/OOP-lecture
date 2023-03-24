import java.util.*;

class StringBufferTest
{
    public static void main(String[] args)
    {
        StringBuffer buf = new StringBuffer();

        buf.append("Hello, "); // append : 첨가시키는 함수 (API 중 1개)
        buf.append("Juhee Go.");
        System.out.println(buf.toString()); // Hello, Juhee Go.

        Date date = new Date();
        buf.append(date);
        System.out.println(buf.toString()); // Hello, Juhee Go.Mon Mar 13 11:36:26 KST 2023


    }
}