package chap6_Spring;

import java.util.Map;
import java.util.LinkedList;


public class StudentRegisterService {

    String jdbcUrl;
    LinkedList<String> listData;
    Map<String,String> MapData;

    public StudentRegisterService(StudentDao dao){

    }

    public void setJdbcUrl(String jdbcUrl){
        this.jdbcUrl = jdbcUrl;
    }

    public void setListData(LinkedList<String> listData){
        this.listData = listData;
    }

    public void setHashMapData(Map<String,String> MapData){
        this.MapData = MapData;
    }
}
