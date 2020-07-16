package com.wujieshuju.huidou.room.dao;

import com.wujieshuju.huidou.room.model.DyHistory;
import java.util.List;

public interface DyHistoryDao {
    void delete(DyHistory... dyHistoryArr);

    List<DyHistory> getAllHistory();

    void insert(DyHistory... dyHistoryArr);
}
