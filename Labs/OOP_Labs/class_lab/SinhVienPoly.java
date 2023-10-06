
abstract public class SinhVienPoly 
{
    private String hoTen;
    private String nganh;
    
    public SinhVienPoly( String hoTen, String nganh)
    {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public SinhVienPoly()
    {
        this(" "," ");
    }

    abstract public double getDiem();

    public String getHocLuc()
    {
        if (getDiem() < 5)
            return "Yeu";
        else if (getDiem() >= 5 && getDiem() < 6.5)
            return "Trung binh";
        else if (getDiem() >= 6.5 && getDiem() < 7.5)
            return "Kha";
        else if (getDiem() >= 7.5 && getDiem() < 9)
            return "Gioi";
        else if (getDiem() >= 9)
            return "Xuat sac";
        else 
            return "Ket qua khong hop le";
    }

    //public void xuat()

    public class SinhVienIT extends SinhVienPoly
    {
        private double diemJava;
        private double diemCss;
        private double diemHtml;

        public SinhVienIT()
        {
            this("", 0.0, 0.0, 0.0);
        }

        public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml)
        {
            this.diemJava = diemJava;
            this.diemCss = diemCss;
            this.diemHtml = diemHtml;
        }

        @Override
        public double getDiem()
        {
            return (2*diemJava + diemHtml + diemCss)/4;
        }
    }
}
