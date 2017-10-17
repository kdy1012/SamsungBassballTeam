package kr.co.tjeit.samsungbassballteam.data;

import java.io.Serializable;

/**
 * Created by admin on 2017-10-17.
 */

public class SeasonMemberData implements Serializable {

    private String roomName;
    private String cost;
    private String allRoom;
    private String remnantRoom;

    public SeasonMemberData() {

    }

    public SeasonMemberData(String roomName, String cost, String allRoom, String remnantRoom) {
        this.roomName = roomName;
        this.cost = cost;
        this.allRoom = allRoom;
        this.remnantRoom = remnantRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getAllRoom() {
        return allRoom;
    }

    public void setAllRoom(String allRoom) {
        this.allRoom = allRoom;
    }

    public String getRemnantRoom() {
        return remnantRoom;
    }

    public void setRemnantRoom(String remnantRoom) {
        this.remnantRoom = remnantRoom;
    }
}
