package com.potter.tracker.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "tracked_item")
public class TrackedItem implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "priority")
    private int priority;

    @ColumnInfo(name = "dateUpdated")
    private long dateUpdated;

    @Ignore
    public TrackedItem(){}

    public TrackedItem(String name, int priority, long dateUpdated) {
        this.name = name;
        this.priority = priority;
        this.dateUpdated = dateUpdated;
    }


    protected TrackedItem(Parcel in) {
        id = in.readLong();
        name = in.readString();
        priority = in.readInt();
        dateUpdated = in.readLong();
    }

    public static final Creator<TrackedItem> CREATOR = new Creator<TrackedItem>() {
        @Override
        public TrackedItem createFromParcel(Parcel in) {
            return new TrackedItem(in);
        }

        @Override
        public TrackedItem[] newArray(int size) {
            return new TrackedItem[size];
        }
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(long dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(name);
        parcel.writeInt(priority);
        parcel.writeLong(dateUpdated);
    }

    @Override
    public String toString() {
        return "TrackedItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", dateUpdated=" + dateUpdated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackedItem that = (TrackedItem) o;
        return id == that.id && priority == that.priority && dateUpdated == that.dateUpdated && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, priority, dateUpdated);
    }
}
