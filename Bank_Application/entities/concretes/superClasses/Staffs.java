package entities.concretes.superClasses;

public class Staffs{
    private int staffs_id;
    private String authority;
    private String staffs_name;



    public int getStaffs_id() {
        return staffs_id;
    }
    public void setStaffs_id(int staffs_id) {
        this.staffs_id = staffs_id;
    }

    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getStaffs_name() {
        return staffs_name;
    }
    public void setStaffs_name(String staffs_name) {
        this.staffs_name = staffs_name;
    }
}