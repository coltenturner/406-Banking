package persistence.DataBomb;

import Accounts.BankAccounts.Debt.CreditCard;
import Accounts.BankAccounts.Debt.LongTermLoan;
import Accounts.BankAccounts.Debt.ShortTermLoan;
import Accounts.BankAccounts.Money.CDs;
import Accounts.BankAccounts.Money.Checking;
import Accounts.BankAccounts.Money.RegSavings;
import Accounts.Interest;
import Accounts.People.Customer;
import Accounts.People.Managment;
import Accounts.People.Teller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;

public class DataBomb {

    public void CustBomb(){
        File CustFile = new File("src/main/java/persistence/DataBases/Customers.txt");
        Gson gson = new GsonBuilder().create();

        Customer a=new Customer("423-45-3245","Ronald", "Jones", "114 North 4th", "Clarkesdale","MO", "64493","2899653222933490");
        Customer b=new Customer("345-65-3425","Mark","Ingrem","1805 Jules","St. Joseph","MO","64503","4387917994924947");
        Customer c=new Customer("423-14-8894","Sherry","Harrison","2109 Sylviana","St. Joesph","MO","64501","7915365294629613");
        Customer d=new Customer("677-87-9013","John","Morgeson","4305 West 3rd","Wathena","KS","54910","8343891648427859");
        Customer e=new Customer("345-59-9870","Gary","Gilkerson","221 south highly","St. Joesph","MO","64503","5445687789148812");
        Customer f=new Customer("423-56-7890","Mary","Francis","335 Jules","St. Joesph","MO","64503","1592169184752658");
        Customer g=new Customer("345-81-2332","Carolyn","Johnson","1402 Mocking Bird","St. Joesph","MO","64502","2669835839645524");
        Customer h=new Customer("345-87-9912","Larry","Waite","2105 Senior DR.","St. Joesph","MO","64503","6342943423865693");
        Customer i=new Customer("423-16-8945","Marilyn","Macklin","1801 Lovers Ln","St. Joesph","MO","64502","5227566878576698");
        Customer j=new Customer("235-44-5789","Lana","McGlynn","2508 Stonecrest","St. Joesph","MO","64501","1883867798187521");
        Customer k=new Customer("436-78-9213","John","Munzer","4156 N. Mulbury","St. Joesph","MO","64502","");
        Customer l=new Customer("233-43-5656","Mary","White","1525 Kioa","Ellwood","KS","56708","");
        Customer m=new Customer("435-67-8787","Jerry","Gronius","8902 Martha Ln","Gower","MO","63301","");
        Customer n=new Customer("563-43-2913","Martin","Williams","1532 Lovers Ln","St. Joesph","MO","64502","");
        Customer o=new Customer("345-67-9898","Broderick","Jones","703 Park LN","St. Joesph","MO","64501","");



        try(FileWriter writer = new FileWriter(CustFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
            gson.toJson(f, writer);
            writer.write("\n");
            gson.toJson(g, writer);
            writer.write("\n");
            gson.toJson(h, writer);
            writer.write("\n");
            gson.toJson(i, writer);
            writer.write("\n");
            gson.toJson(j, writer);
            writer.write("\n");
            gson.toJson(k, writer);
            writer.write("\n");
            gson.toJson(l, writer);
            writer.write("\n");
            gson.toJson(m, writer);
            writer.write("\n");
            gson.toJson(n, writer);
            writer.write("\n");
            gson.toJson(o, writer);

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void ManagBomb(){
        File ManagFile = new File("src/main/java/persistence/DataBases/Managment.txt");
        Gson gson = new GsonBuilder().create();

        Managment a= new Managment("000-00-0000","Boss","Baby");

        try(FileWriter writer = new FileWriter(ManagFile)) {
            gson.toJson(a, writer);
            writer.write("\n");

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void TellerBomb(){
        File TellerFile = new File("src/main/java/persistence/DataBases/Teller.txt");
        Gson gson = new GsonBuilder().create();

        Teller a= new Teller("111-11-1111","Teller1","Yeet");

        try(FileWriter writer = new FileWriter(TellerFile)) {
            gson.toJson(a, writer);
            writer.write("\n");

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void CheckBomb(){
        File CheckFile = new File("src/main/java/persistence/DataBases/Checking.txt");
        Gson gson = new GsonBuilder().create();

        Checking a= new Checking("1","423-45-3245",6.23,"12-01-2002",0,"1","2899653222933490",null,null,null,null,null,null);
        Checking b= new Checking("2","345-65-3425",52.9,"01-28-2003",0,"2","4387917994924947",null,null,null,null,null,null);
        Checking c= new Checking("3","423-14-8894",2200.11,"11-05-2000",1,"3","7915365294629613",null,null,null,null,null,null);
        Checking d= new Checking("4","677-87-9013",1378.2,"07-08-2008",1,"4","8343891648427859",null,null,null,null,null,null);
        Checking e= new Checking("5","345-59-9870",522.89,"07-26-2017",0,"5","5445687789148812",null,null,null,null,null,null);
        Checking f= new Checking("6","423-56-7890",1896.44,"09-12-2011",1,"6","1592169184752658",null,null,null,null,null,null);
        Checking g= new Checking("7","345-81-2332",7955,"02-20-2001",1,"7","2669835839645524",null,null,null,null,null,null);
        Checking h= new Checking("8","345-87-9912",85.12,"12-08-2002",0,"8","6342943423865693",null,null,null,null,null,null);
        Checking i= new Checking("9","423-16-8945",133.7,"11-13-2011",0,"9","5227566878576698",null,null,null,null,null,null);
        Checking j= new Checking("10","235-44-5789",12.42,"12-26-2002",0,"10","1883867798187521",null,null,null,null,null,null);
        Checking k= new Checking("11","436-78-9213",8779.55,"12-29-2010",0,"","",null,null,null,null,null,null);
        Checking l= new Checking("12","233-43-5656",1056.88,"06-01-1998",1,"","",null,null,null,null,null,null);
        Checking o= new Checking("13","345-67-9898",3299.33,"08-19-2019",1,"","",null,null,null,null,null,null);

        a.addPaidCheck("100",123.62,"04-03-2005");
        a.addPaidCheck("101",145.67,"08-17-2007");
        a.addDeniedCheck("102",5.06,"09-14-2009");
        a.addCheck(3.60);


        b.addPaidCheck("200",89.56,"02-19-2004");
        b.addPaidCheck("201",653.69,"03-01-2004");
        b.addDeniedCheck("202",945.39,"05-07-2004");
        b.addPaidCheck("203",1839.36,"09-09-2007");
        b.addPaidCheck("204",532.68,"02-16-2008");
        b.addCheck(20.52);
        b.addCheck(15.73);
        b.addCheck(30.42);


        c.addPaidCheck("300",486.96,"11-08-2000");
        c.addPaidCheck("301",2693.86,"05-02-2012");
        c.addCheck(1100.93);
        c.addCheck(200.00);



        d.addDeniedCheck("400",902.30,"07-09-2008");
        d.addDeniedCheck("401",536.96,"07-10-2008");
        d.addPaidCheck("402",1269.38,"07-14-2008");
        d.addPaidCheck("403",1538.69,"02-27-2018");
        d.addCheck(874.23);


        e.addPaidCheck("500",736.86,"07-28-2017");
        e.addPaidCheck("501",528.96,"10-10-2018");
        e.addPaidCheck("502",423.38,"08-25-2019");



        f.addPaidCheck("600",53.85,"11-19-2011");
        f.addDeniedCheck("601",208.53,"04-03-2012");
        f.addPaidCheck("602",403.87,"07-01-2013");
        f.addPaidCheck("603",705.15,"05-05-2015");
        f.addCheck(23.90);
        f.addCheck(10.20);
        f.addCheck(40.00);

        g.addPaidCheck("700",403.42,"07-03-2003");
        g.addPaidCheck("701",1005.12,"12-04-2006");
        g.addPaidCheck("702",603.58,"12-14-2013");
        g.addCheck(93.54);


        h.addPaidCheck("800",355.25,"01-05-2003");
        h.addPaidCheck("801",462.29,"05-13-2007");
        h.addPaidCheck("802",153.43,"10-11-2014");
        h.addPaidCheck("803",428.73,"09-18-2018");
        h.addPaidCheck("804",975.48,"03-19-2019");
        h.addCheck(80.32);


        i.addDeniedCheck("900",189.85,"11-14-2011");
        i.addDeniedCheck("901",703.86,"12-06-2011");
        i.addDeniedCheck("902",835.82,"12-30-2011");
        i.addPaidCheck("902",568.24,"02-03-2012");
        i.addPaidCheck("903",766.85,"05-16-2015");
        i.addCheck(100.7);
        i.addCheck(32.00);

        j.addPaidCheck("1000",1583.78,"12-27-2002");
        j.addPaidCheck("1001",1433.33,"06-27-2003");
        j.addPaidCheck("1002",7056.86,"08-21-2003");
        j.addPaidCheck("1003",400.00,"09-05-2004");
        j.addPaidCheck("1004",758.26,"03-01-2005");
        j.addCheck(7.54);

        k.addPaidCheck("1100",593.99,"10-19-2019");
        k.addPaidCheck("1101",839.69,"10-21-2019");
        k.addDeniedCheck("1102",453.25,"10-22-2019");
        k.addCheck(7023.54);
        k.addCheck(10.00);

        l.addPaidCheck("1200",233.82,"12-15-2016");
        l.addPaidCheck("1201",399.39,"12-16-2016");
        l.addPaidCheck("1202",180.90,"02-10-2017");
        l.addPaidCheck("1203",832.85,"07-19-2017");
        l.addCheck(52.00);


        o.addPaidCheck("1300",608.25,"08-19-2019");
        o.addPaidCheck("1301",733.58,"08-20-2019");
        o.addPaidCheck("1302",165.55,"08-27-2019");
        o.addPaidCheck("1303",572.63,"09-19-2019");
        o.addPaidCheck("1304",672.53,"09-20-2019");
        o.addCheck(64.24);
        o.addCheck(1000.00);
        o.addCheck(700.00);
        o.addCheck(532.56);
        o.addCheck(40.25);
        o.addCheck(63.00);
        o.addCheck(50.32);




        try(FileWriter writer = new FileWriter(CheckFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
            gson.toJson(f, writer);
            writer.write("\n");
            gson.toJson(g, writer);
            writer.write("\n");
            gson.toJson(h, writer);
            writer.write("\n");
            gson.toJson(i, writer);
            writer.write("\n");
            gson.toJson(j, writer);
            writer.write("\n");
            gson.toJson(k, writer);
            writer.write("\n");
            gson.toJson(l, writer);
            writer.write("\n");
            gson.toJson(o, writer);

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void SaveBomb(){
        File SavingFile = new File("src/main/java/persistence/DataBases/RegSaving.txt");
        Gson gson = new GsonBuilder().create();

        RegSavings a= new RegSavings("1","423-45-3245", 200,"12-01-2002",0.022,"");
        RegSavings b= new RegSavings("2","345-65-3425", 100,"02-18-2004",0.023,"");
        RegSavings c= new RegSavings("3","423-14-8894",875.54,"09-15-1998",0.028,"" );
        RegSavings d= new RegSavings("4","677-87-9013",1200.82,"07-08-2008",0.021,"");
        RegSavings e= new RegSavings("5","345-59-9870",1500,"07-26-2017",0.021,"");
        RegSavings f= new RegSavings("6","423-56-7890",1898.07,"01-12-2001",0.021,"");
        RegSavings g= new RegSavings("7","345-81-2332",5000.99,"06-30-2003",0.02,"");
        RegSavings h= new RegSavings("8","345-87-9912",125.54,"12-08-2002",0.029,"");
        RegSavings i= new RegSavings("9","423-16-8945",198.56,"11-1-2011",0.028,"");
        RegSavings j= new RegSavings("10","235-44-5789",98.56,"12-01-2002",0.029,"");
        RegSavings k= new RegSavings("15","345-67-9898",1700,"08-19-2019",0.024,"");

        try(FileWriter writer = new FileWriter(SavingFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
            gson.toJson(f, writer);
            writer.write("\n");
            gson.toJson(g, writer);
            writer.write("\n");
            gson.toJson(h, writer);
            writer.write("\n");
            gson.toJson(i, writer);
            writer.write("\n");
            gson.toJson(j, writer);
            writer.write("\n");
            gson.toJson(k, writer);

        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void CDBomb(){
        File CDFile = new File("src/main/java/persistence/DataBases/CD.txt");
        Gson gson = new GsonBuilder().create();

        CDs a= new CDs("11","235-44-5789",1500,"10-19-2019","10-19-2023",0.03,"");
        CDs b = new CDs("12","423-16-8945",1200, "12-14-2016", "12-14-2019",0.03,"");
        CDs c= new CDs("13","345-59-9870", 8000,"02-28-2017","02-28-2017",0.03,"");
        CDs d= new CDs("14","345-65-3425", 4000,"02-19-2017","02-19-2020",0.03,"");

        try(FileWriter writer = new FileWriter(CDFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void ShortLoanBomb(){
        File ShortLoanFile = new File("src/main/java/persistence/DataBases/ShortTermLoan.txt");
        Gson gson = new GsonBuilder().create();

        ShortTermLoan a = new ShortTermLoan("1", "423-14-8894", 3579.00, 0.15, "27",
                "1", 95.83, 'N', "8-20-2019", "", 0,
                null, null, null);
        ShortTermLoan b = new ShortTermLoan("2", "423-56-7890", 3698.00, 0.12, "27",
                "1", 112.00, 'Y', "10-12-2019", "", 0,
                null, null, null);
        ShortTermLoan c = new ShortTermLoan("3", "423-45-3245", 6149.00, 0.08, "27",
                "1", 144.00, 'N', "9-16-2019", "", 0,
                null, null, null);
        ShortTermLoan d = new ShortTermLoan("4", "345-87-9912", 2136.00, 0.05, "27",
                "1", 140.00, 'N', "10-22-2019", "", 0,
                null, null, null);
        ShortTermLoan e = new ShortTermLoan("5", "345-59-9870", 7216.00, 0.12, "27",
                "1", 168.00, 'N', "10-26-2019", "", 0,
                null, null, null);

        try(FileWriter writer = new FileWriter(ShortLoanFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
        }
        catch (Exception x){
            x.printStackTrace();
        }

    }

    public void LongLoanBomb(){
        File LongLoanFile = new File("src/main/java/persistence/DataBases/LongTermLoan.txt");
        Gson gson = new GsonBuilder().create();

        LongTermLoan a = new LongTermLoan("1", "436-78-9123", 44763.00, 0.10, "27",
                "1", 1650.00, 'N', "10-9-2019", "", 0,
                null, null, null);

        LongTermLoan b = new LongTermLoan("2", "345-65-3425", 54712.00, 0.05, "27",
                "1", 1750.00, 'N', "9-17-2019", "", 0,
                null, null, null);

        LongTermLoan c = new LongTermLoan("3", "345-81-2332", 65489.00, 0.07, "27",
                "1", 1783.33, 'N', "9-27-2019", "", 0,
                null, null, null);

        LongTermLoan d = new LongTermLoan("4", "677-87-9013", 95464.00, 0.09, "27",
                "1", 2180.00, 'Y', "10-13-2019", "", 0,
                null, null, null);

        LongTermLoan e = new LongTermLoan("5", "235-44-5789", 80569.00, 0.08, "27",
                "1", 2520.00, 'N', "10-27-2019", "", 0,
                null, null, null);

        try(FileWriter writer = new FileWriter(LongLoanFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
        }
        catch (Exception x){
            x.printStackTrace();
        }
    }

    public void CCLoanBomb(){
        File CCFile = new File("src/main/java/persistence/DataBases/CreditCard.txt");
        Gson gson = new GsonBuilder().create();

        CreditCard a = new CreditCard("1", "423-14-8894", 3579.00, 0.15, "27",
                "1", 82.32, 'N', "8-20-2019", 0, null,
                1000.0,null,null);
        CreditCard b = new CreditCard("2", "423-56-7890", 3698.00, 0.12, "27",
                "1", 82.84, 'Y', "10-12-2019", 0, null,
                1000.0,null,null);
        CreditCard c = new CreditCard("3", "423-45-3245", 6149.00, 0.08, "27",
                "1", 132.82, 'N', "9-16-2019", 0, null,
                10000.0,null,null);
        CreditCard d = new CreditCard("4", "345-87-9912", 2136.00, 0.05, "27",
                "1", 44.86, 'N', "10-22-2019", 0, null,
                500.0,null,null);
        CreditCard e = new CreditCard("5", "345-59-9870", 7216.00, 0.12, "27",
                "1", 161.64, 'N', "10-26-2019", 0, null,
                700.0,null,null);

        b.makeCreditPurchase(100,"gold");


        try(FileWriter writer = new FileWriter(CCFile)) {
            gson.toJson(a, writer);
            writer.write("\n");
            gson.toJson(b, writer);
            writer.write("\n");
            gson.toJson(c, writer);
            writer.write("\n");
            gson.toJson(d, writer);
            writer.write("\n");
            gson.toJson(e, writer);
            writer.write("\n");
        }
        catch (Exception x){
            x.printStackTrace();
        }

    }

    public void intrestBomb(){
        Interest x = new Interest(1.008,1.001,1.001,1.001,1.001);

        File intFile = new File("src/main/java/persistence/DataBases/interest.txt");
        Gson gson = new GsonBuilder().create();


        try(FileWriter writer = new FileWriter(intFile)) {
            gson.toJson(x, writer);
        }
        catch (Exception f){
            f.printStackTrace();
        }
    }

}
