package enity;

import java.util.Date;

/**
 * Created by ASUS on 2019/1/15.
 */
public class bookmanage {
    private int  b_id;
    private String b_name;
    private String b_author;
    private Date b_time;
    private String b_type;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public Date getB_time() {
        return b_time;
    }

    public void setB_time(Date b_time) {
        this.b_time = b_time;
    }

    public String getB_type() {
        return b_type;
    }

    public void setB_type(String b_type) {
        this.b_type = b_type;
    }

    @Override
    public String toString() {
        return "bookmanage{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_author='" + b_author + '\'' +
                ", b_time=" + b_time +
                ", b_type='" + b_type + '\'' +
                '}';
    }
}
