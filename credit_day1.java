class credit_day1{
    public static void main(String args[]){
        int limit;
        sample ob=new sample();
        limit=ob.score(458);
        System.out.println("Your credit card limit is "+ limit);
    }
}
class sample{
    sample(){
        System.out.println("Credit Score Range");
    }
    public int score(int x){
      if((x>=800) & (x<850)){
        System.out.println("Your credit score is excellent");
        return 200000;
      }
      else if((x>=740) & (x<800)) {
        System.out.println("Your credit score is very good");
        return 150000;
      } 
      else if((x>=600) & (x<740)){
        System.out.println("Your credit score is fair");
        return 70000;
      }
      else if((x>=0) & (x<600)){
        System.out.println("Your credit score is poor");
        return 25000;
      }
      else{
        System.out.println("Invalid Credit score range  ");
        return 0;
      }
    }
}