class constructor {
    int a,b;
    constructor(int m){
        a = m;
        System.out.println("initializing value of a as "+ a);
    }
    constructor(int m, int n){
        a = m;
        b = n;
        System.out.println("initializing value of a as "+ a + " & b as "+ b);
    }
}

public class Overloading_MethodConst { 

	public int sum_of2(int x, int y){ 
        return (x + y); 
    } 
	public int sum_of3(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	public static void main(String args[]) 
	{ 
		Overloading_MethodConst a = new Overloading_MethodConst(); 
		System.out.println("10 + 20 = "  + a.sum_of2(10, 20)); 
		System.out.println("10 + 20 + 30 = " + a.sum_of3(10, 20, 30)); 
		
        constructor c = new constructor(3);
        constructor c1 = new constructor(6,8);
	} 
}
