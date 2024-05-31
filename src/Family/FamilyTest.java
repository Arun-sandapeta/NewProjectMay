package Family;

public class FamilyTest {

    public static void main(String[] args){

        Family generation1 = new Family();

        Address address = new Address();

        Family[] kids = new Family[2];


        address.street="saiRamColony";
        address.area="hafeezpet";
        address.pinCode=500049;
        address.city="hyderabad";


        generation1.name="pentaiah";
        generation1.aadhaar=123456789123L;
        generation1.address=address;
        generation1.family=kids;

        Family[] grandKid = new Family[2];
        Family[] grandKid1 = new Family[2];

        Family kid1 = new Family();
        kid1.name="Suresh";
        kid1.address=address;
        kid1.aadhaar=98745632101L;
        kid1.family=grandKid;


        Family kid2 = new Family();
        kid2.name="ramesh";
        kid2.aadhaar=12536489710L;
        kid2.address=address;
        kid2.family=grandKid1;

        Family grandKids = new Family();
        grandKids.name="Arun";
        grandKids.aadhaar=123456789456L;
        grandKids.address=address;


        Family grandKids2 = new Family();
        grandKids2.name="kanni";
        grandKids2.aadhaar=123456987456L;
        grandKids2.address=address;


        kids[0]=kid1;
        kids[1]=kid2;

        grandKid[0] = grandKids;
        grandKid[1] = grandKids2;


        System.out.println(kid1.name);
        System.out.println(generation1.address.area);






    }
}
