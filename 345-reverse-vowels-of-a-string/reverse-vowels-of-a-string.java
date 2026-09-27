class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int n = s.length() - 1;
        char temp;

        char[] arr = s.toCharArray();

        while (i < n) {

            if (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i'
                    && arr[i] != 'o' && arr[i] != 'u'
                    && arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I'
                    && arr[i] != 'O' && arr[i] != 'U') {

                i++;
            }

            else if (arr[n] != 'a' && arr[n] != 'e' && arr[n] != 'i'
                    && arr[n] != 'o' && arr[n] != 'u'
                    && arr[n] != 'A' && arr[n] != 'E' && arr[n] != 'I'
                    && arr[n] != 'O' && arr[n] != 'U') {

                n--;
            }

            else {
                temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;

                i++;
                n--;
            }
        }

        return new String(arr);
    }
}