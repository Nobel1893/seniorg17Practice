package route.com.practiceg17.Model;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 10/13/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class Contact {

    String name;
    String phone;
    int image;

    public Contact(String name, String phone, int image) {
        this.name = name;
        this.phone = phone;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
