package Model;

public class DanhBa {
    private String phoneNumber;
    private String groupName;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;


    public DanhBa(){

    }

    public DanhBa(String phoneNumber, String group, String name, String gender, String address, String dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.groupName = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Thông tin: " + "| Số điện thoại: " + String.format("%-12s|",phoneNumber) + " Nhóm của danh bạ: "
                + String.format("%-10s |", groupName) + " Tên: " + String.format("%-10s|",name) + " Giới tính: "
                + String.format("%-10s|",gender) + " Địa chỉ: " + String.format("%-12s|",address)  + " Ngày sinh: "
                + String.format("%-10s |",dateOfBirth) + " Email: " + String.format("%-10s |",email);
    }

    public String toStringCSV(){
        return phoneNumber+","+ groupName +","+name+","+gender+","+address+","+dateOfBirth+","+email+"\n";
    }

    public String toStringInfo(){
        return "Thông tin: | " + " Số điện thoại: " + String.format("%-12s|",phoneNumber) + " Nhóm của danh bạ: "
                + String.format("%-10s|", groupName) + " Tên: " + String.format("%-10s|",name) + " Giới tính: "
                + String.format("%-6s|",gender) + " Địa chỉ: " + String.format("%-12s|",address);
    }
}
