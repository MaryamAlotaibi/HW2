public class Main {
    //HW1~~~
    static void checkPrime(int n){
            int i,m=0,flag=0;
            m=n/2;
            if(n==0||n==1){
                System.out.println(n+" is not prime number");
            }else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        System.out.println(n+" is not prime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  { System.out.println(n+" is prime number"); }
            }
        }
        public static void main(String args[]){
            checkPrime(2);
            checkPrime(5);
            checkPrime(7);
            checkPrime(20);
            CalculateTax(600);
            CalculateTax(500.5);
            CalculateTax(500);
        }
        //HW2
    public static void CalculateTax(double price){
        if (price<100 || price>500){
            System.out.println("\nthe price outside the given range\n");
            return;
        }
        double tax= price * 15/100;
        System.out.println(tax);
    }


    }
