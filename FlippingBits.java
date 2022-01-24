// 1 Liner Solution

public static long flippingBits(long n){
    return (long)(Math.pow(2,32)-1)-n;
}

//Brute Force Solution

public static long flippingBits(long n) {
    long a[]=new long[32];
    int i=31;
    while(i>=0){
        a[i]=n%2;
        i--;
        n/=2;
    }
    
    for(int j=0;j<32;j++){
        if(a[j]==0)
        a[j]=1;
        else
        a[j]=0;
    }
    long w=0;
    i=31;
    for(long l:a){
        System.out.print(l+":");
    }
    System.out.println();
    while(i>=0){
        w = w + a[i]*(long)(Math.pow(2,31-i));
        i--;
    }
    return w;
    }
