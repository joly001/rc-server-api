package com.zcsoft.rc.api.mileage.entity;

public class WorkSegmentTodayRsp {

    /**
     * id
     */
    private String id;
    /**
     * 作业面名称
     */
    private String workSegmentName;
    /**
     * 开始位置经度
     */
    private Double startLongitude;
    /**
     * 开始位置纬度
     */
    private Double startLatitude;
    /**
     * 结束位置经度
     */
    private Double endLongitude;
    /**
     * 结束位置纬度
     */
    private Double endLatitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentTodayRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append('}');
        return sb.toString();
    }
}
