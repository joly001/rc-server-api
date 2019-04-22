package com.zcsoft.rc.api.machinery.entity;

public class MachineryListReq {

    /**
     * 司机
     */
    private String nick;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineryListReq{");
        sb.append("nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
