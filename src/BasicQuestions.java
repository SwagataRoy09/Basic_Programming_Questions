import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class BasicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static  boolean isPrime(int n){
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long  f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2;i<=n;i++){
            int n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
class combination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2;i<=n;i++){
            int n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
class PerinnNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 3;
        int n2 = 0;
        int n3 = 2;
        int n4 = 0;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        for(int i=2;i<n;i++){
            n4 = n2+n1;
            System.out.println(n4);
            n1=n2;
            n2=n3;
            n3=n4;
        }
        //System.out.println(n4);
    }
}
class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for(int i = str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        System.out.println(ans);
    }
}
class reverseRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(rev(str.toCharArray(),0,str.length()-1));
    }
    public static String rev(char[] str,int i ,int j){
        if(i>j){
            return String.valueOf(str);
        }
        char temp = str[i];
        str[i]=str[j];
        str[j]=temp;
        return rev(str,i+1,j-1);
    }
}
class isPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = rev(str.toCharArray(),0,str.length()-1);
        if(ans.equals(str)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static String rev(char[] str,int i,int j ){
        if(i>j){
            return String.valueOf(str);
        }
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        return rev(str,i+1,j-1);
    }
}
class isPalindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n =str.length();
        boolean ans = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                ans = false;
                break;
            }
        }
        if(!ans){
            System.out.println("FALSE");
        }
        else{
            System.out.println("TRUE");
        }
    }
}
class numberOfOccurence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] hash = new int[26];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        char ans = 'a';
        int max = 0;
        for(int i=0;i<26;i++){
            if(max<hash[i]){
                max = hash[i];
                ans = (char)(i+'a');
            }
        }
        System.out.println(ans+" "+max);
    }
}
class numberOfVowelandConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int v = 0 , c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println(v+" "+c);
    }
}
class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[] hash = new int[26];
        str1.toLowerCase();
        str2.toLowerCase();
        for(int i=0;i<str1.length();i++){
            hash[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            hash[str2.charAt(i)-'a']--;
        }
        boolean flag = true;
        for(int i=0;i<26;i++){
            if(hash[i]!=0){
                flag = false;
                System.out.println("false");
                break;
            }
            else{
                flag = true;
            }
        }
        if(flag)
            System.out.println(true);
    }
}
class primecheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isprime(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    static boolean isprime(int n){
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
class secondhigh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =Integer.MIN_VALUE, secmax =Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]>secmax) {
                secmax = arr[i];
            }
        }
        System.out.println(secmax+" "+max);
    }
}
class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binary(arr,0,n,k));
    }
    public static int binary(int[] arr,int l,int r,int k){
        if(l>=r){
            return -1;
        }
        int mid =  (l+r)/2;
        if (arr[mid]==k){
            return mid;
        }
        if (arr[mid]>k){
            return binary(arr,l,mid-1,k);
        }
        return binary(arr,mid+1,r,k);
    }
}
class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count=0,d=0;
        while(n!=0){
            int rem = n%10;
            count++;
            n/=10;
        }
        int num1=num;
        while(num!=0){
            int rem = num%10;
            d+=Math.pow(rem,count);
            num/=10;
        }
        if(d==num1){
            System.out.println("TRUE");
        }
        else System.out.println("FALSE");
    }
}
class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
class coprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (gcd(n1,n2)==1){
            System.out.println("CO-PRIME");
        }
        else System.out.println("NOT COPRIME");
    }
    public static int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
}
class ducknumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        boolean flag = false;
        while (n1!=0){
            int rem = n1%10;
            if(rem==0){
                flag = true;
            }
            n1/=10;
        }
        if (!flag){
            System.out.println("NOT DUCK NUMBER");
        }
        else {
            System.out.println("IS A DUCK NUMBER");
        }
    }
}
class factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        boolean flag = false;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                System.out.println(i);
            }
        }
    }
}
class lcmmm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println((n1*n2)/gcdd(n1,n2));
    }
    public static int gcdd(int n1,int n2){
        if (n2==0){
            return n1;
        }
        return gcdd(n2,n1%n2);
    }
}
class floydtriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(++k+" ");
            }
            System.out.println();
        }
    }
}
class NeonNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int num = n;
        while(n!=0){
            int rem=n%10;
            sum+=Math.pow(rem,2);
            n/=10;
        }
        int sum2=0;
        while (sum!=0){
            int rem = sum%10;
            sum2+=rem;
            sum/=10;
        }
        if (sum2==num){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
class palindromenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int d=0;
        while(n!=0){
            int rem = n%10;
            d=d*10+rem;
            n/=10;
        }
        if (d==num){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
class specialNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        long sum=0;
        while (n!=0){
            int rem=n%10;
            sum+=(long) fact(rem);
            n/=10;
        }
        if(sum==num){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static int fact(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
}
class uniqueNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean flag = true;
        while (n!=0){
            int rem = n%10;
            if (set.contains(rem)){
                flag=false;
            }
            else set.add(rem);
            n/=10;
        }
        if (flag) {
            System.out.println("UNIQUE");
        }
        else System.out.println("NOT UNIQUE");
    }
}
class DisariumNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int num = n,num1=n;
        int sum=0;
        while(n!=0){
            count++;
            n/=10;
        }
        while (num!=0){
            int rem = num%10;
            sum+=Math.pow(rem,count);
            num/=10;
            count--;
        }
        if (sum==num1){
            System.out.println("DisariumNumber");
        }
        else{
            System.out.println("Not DisariumNumber");
        }
    }
}
class magicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n>9) {
            while (n!=0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            n=sum;
            sum=0;
        }
        if (n==1){
            System.out.println("MAGIC NUMBER");
        }
        else
            System.out.println("NOT MAGIC NUMBER");
    }
}
class pascalTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if (j==0||j==i){
                    ans.add(1);
                }
                else{
                    ans.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
            list.add(ans);
        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.println();
        }
    }
}
class fiboUsingRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int i){
        if (i==0||i==1){
            return i;
        }
        return fib(i-1)+fib(i-2);
    }
}