class Emp
{
int eid;
String ename;
double esal;
static final String compName="XYZLtd.";
void setEmpRecord(int eid,String ename,double esal)
{
this.eid=eid;
this.ename=ename;
this.esal=esal;
}
void setEmpRecord(String ename,double esal)
{
this.ename=ename;
this.esal=esal;
}
void display()
{
System.out.println(compName);
System.out.println(this.eid);
System.out.println(this.eid);
System.out.println(this.eid);
}
}
class EmpTest
{
public static void main(String ar[])
{
Emp e1=new Emp();
e1.setEmpRecord("Raju",2000);
Emp e2=new Emp();
e2.setEmpRecord(101,"raj",50000);
e1.display();
e2.display();
}
}