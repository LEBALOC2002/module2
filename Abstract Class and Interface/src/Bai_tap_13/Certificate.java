package Bai_tap_13;

public class Certificate {
    protected int CertificatedID ;
    protected String CertificateName ;
    protected String CertificateRank;
    protected String CertificatedDate ;
    public Certificate (){

    }

    public Certificate(int certificatedID, String certificateName, String certificateRank, String certificatedDate) {
        CertificatedID = certificatedID;
        CertificateName = certificateName;
        CertificateRank = certificateRank;
        CertificatedDate = certificatedDate;
    }

    public int getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public String getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        CertificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "CertificatedID=" + CertificatedID +
                ", CertificateName='" + CertificateName + '\'' +
                ", CertificateRank='" + CertificateRank + '\'' +
                ", CertificatedDate='" + CertificatedDate + '\'' +
                '}';
    }
}
