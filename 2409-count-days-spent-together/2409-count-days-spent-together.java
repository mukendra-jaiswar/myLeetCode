
class Solution {
    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public int countDaysTogether(String a1, String l1, String a2, String l2) {
        int start = Math.max(convert(a1), convert(a2));
        int end = Math.min(convert(l1), convert(l2));

        return Math.max(0, end - start + 1);
    }

    int convert(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        for (int i = 0; i < month - 1; i++)
            day += days[i];

        return day;
    }
}
