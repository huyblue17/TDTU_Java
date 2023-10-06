public class IDCard {
      // code here
      private int IDnum;
      private String Fullname;
      private String Gender;
      private String Date;
      private String Address;
      private int Phonenumber;

      public IDCard(int IDnum, String Fullname, String Gender, String Date, String Address, int Phonenumber) {
            this.IDnum = IDnum;
            this.Fullname = Fullname;
            this.Gender = Gender;
            this.Date = Date;
            this.Address = Address;
            this.Phonenumber = Phonenumber;
      }


      //getter
      public int getIDNum() {
            return this.IDnum;
      }

      public String getFullname() {
            return this.Fullname;
      }

      public String getGender() {
            return this.Gender;
      }

      public String getDate() {
            return this.Date;
      }

      public String getAddress() {
            return this.Address;
      }

      public int getPhonenumber() {
            return this.Phonenumber;
      }


      //setter
      public void setIDNum(int IDnum) {
            this.IDnum = IDnum;
      }

      public void setFullname(String Fullname) {
            this.Fullname = Fullname;
      }

      public void setGender(String Gender) {
            this.Gender = Gender;
      }

      public void setDate(String Date) {
            this.Date = Date;
      }

      public void setAddress(String Address) {
            this.Address = Address;
      }

      public void setPhonenumber(int Phonenumber) {
            this.Phonenumber = Phonenumber;
      }

      @Override
      public String toString() {
            return IDnum + "," + Fullname + "," + Gender + "," + Date + "," + Address + "," + Phonenumber;
      }
      
}
