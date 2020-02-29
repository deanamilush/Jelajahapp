package com.graha.jelajahapps;

import android.os.Parcel;
import android.os.Parcelable;

public class Mount implements Parcelable {

    private String name;
    private String detail;
    private int photo;

    protected Mount(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Mount> CREATOR = new Creator<Mount>() {
        @Override
        public Mount createFromParcel(Parcel in) {
            return new Mount(in);
        }

        @Override
        public Mount[] newArray(int size) {
            return new Mount[size];
        }
    };

    public Mount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}