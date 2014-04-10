package gov.polisen.orm.models;

public class CaseKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cases.deviceid
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Integer deviceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cases.caseid
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Integer caseid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cases
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public CaseKey(Integer deviceid, Integer caseid) {
        this.deviceid = deviceid;
        this.caseid = caseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cases.deviceid
     *
     * @return the value of cases.deviceid
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cases.caseid
     *
     * @return the value of cases.caseid
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Integer getCaseid() {
        return caseid;
    }
}