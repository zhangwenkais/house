package aaa.com.Entity;

public class Statistics {
    private Integer sid;
    private Integer h_id_sta;//订单编号，外键房源表
    private Double smoney;//交易金额
    private String date_issued;
    private String date_make;
    private House_info house_info;//外键

    public Statistics() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getH_id_sta() {
        return h_id_sta;
    }

    public void setH_id_sta(Integer h_id_sta) {
        this.h_id_sta = h_id_sta;
    }

    public Double getSmoney() {
        return smoney;
    }

    public void setSmoney(Double smoney) {
        this.smoney = smoney;
    }

    public String getDate_issued() {
        return date_issued;
    }

    public void setDate_issued(String date_issued) {
        this.date_issued = date_issued;
    }

    public String getDate_make() {
        return date_make;
    }

    public void setDate_make(String date_make) {
        this.date_make = date_make;
    }

    public House_info getHouse_info() {
        return house_info;
    }

    public void setHouse_info(House_info house_info) {
        this.house_info = house_info;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "sid=" + sid +
                ", h_id_sta=" + h_id_sta +
                ", smoney=" + smoney +
                ", date_issued='" + date_issued + '\'' +
                ", date_make='" + date_make + '\'' +
                ", house_info=" + house_info +
                '}';
    }
}
