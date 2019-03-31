class Osproject
{
  public static void main(String[] args)
  {
    double page_fault_service_time=8,EAT=200,memory_access_time=200,page_fault_rate;
    page_fault_service_time=(0.7)*20+0.3*8;
    page_fault_rate=((EAT-100)/page_fault_service_time)*Math.pow(10,-6);
    System.out.println("The minimum page fault rate="+page_fault_rate);
    System.out.println("Which is equal to=6.01 x 10^-9");

  }
}
//Description
/**/
