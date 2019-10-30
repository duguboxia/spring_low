package com.cn.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Animal {

    private List<String> type;
    private Set<String> color;
    private Map<Integer,String> infos;//信息
    private Properties mysqlInfos;//数据库信息

    private  String[] members;
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public Set<String> getColor() {
        return color;
    }

    public void setColor(Set<String> color) {
        this.color = color;
    }

    public Map<Integer, String> getInfos() {
        return infos;
    }

    public void setInfos(Map<Integer, String> infos) {
        this.infos = infos;
    }

    public Properties getMysqlInfos() {
        return mysqlInfos;
    }

    public void setMysqlInfos(Properties mysqlInfos) {
        this.mysqlInfos = mysqlInfos;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }
}
