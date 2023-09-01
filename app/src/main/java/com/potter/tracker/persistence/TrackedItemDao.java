package com.potter.tracker.persistence;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.potter.tracker.model.TrackedItem;

import java.util.List;

@Dao
public interface TrackedItemDao {
    @Insert
    long[] insertTrackedItems(TrackedItem... trackedItems);

    @Query("SELECT * FROM tracked_item")
    LiveData<List<TrackedItem>> getTrackedItems();

    @Query("SELECT * FROM tracked_item WHERE id = :id")
    LiveData<List<TrackedItem>> getTrackedItems(long id);

    @Query("SELECT * FROM tracked_item WHERE name = :name")
    LiveData<List<TrackedItem>> getTrackedItems(String name);

    @Query("SELECT * FROM tracked_item WHERE name = :name ORDER BY priority DESC")
    LiveData<List<TrackedItem>> getTrackedItemsByPriority(String name);


    @Delete
    long deleteTrackedItems(TrackedItem... trackedItems);

    @Update
    long updateTrackedItems(TrackedItem... trackedItems);

}
