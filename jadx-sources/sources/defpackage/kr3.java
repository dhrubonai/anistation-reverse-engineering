package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kr3 implements Parcelable {
    public static final String[] A;
    public static final Parcelable.Creator<kr3> CREATOR;
    public static final js z;
    public final Bundle x;
    public MediaMetadata y;

    /* JADX WARN: Type inference failed for: r0v0, types: [so5, js] */
    static {
        ?? so5Var = new so5(0);
        z = so5Var;
        so5Var.put("android.media.metadata.TITLE", 1);
        so5Var.put("android.media.metadata.ARTIST", 1);
        so5Var.put("android.media.metadata.DURATION", 0);
        so5Var.put("android.media.metadata.ALBUM", 1);
        so5Var.put("android.media.metadata.AUTHOR", 1);
        so5Var.put("android.media.metadata.WRITER", 1);
        so5Var.put("android.media.metadata.COMPOSER", 1);
        so5Var.put("android.media.metadata.COMPILATION", 1);
        so5Var.put("android.media.metadata.DATE", 1);
        so5Var.put("android.media.metadata.YEAR", 0);
        so5Var.put("android.media.metadata.GENRE", 1);
        so5Var.put("android.media.metadata.TRACK_NUMBER", 0);
        so5Var.put("android.media.metadata.NUM_TRACKS", 0);
        so5Var.put("android.media.metadata.DISC_NUMBER", 0);
        so5Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        so5Var.put("android.media.metadata.ART", 2);
        so5Var.put("android.media.metadata.ART_URI", 1);
        so5Var.put("android.media.metadata.ALBUM_ART", 2);
        so5Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        so5Var.put("android.media.metadata.USER_RATING", 3);
        so5Var.put("android.media.metadata.RATING", 3);
        so5Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        so5Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        so5Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        so5Var.put("android.media.metadata.DISPLAY_ICON", 2);
        so5Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        so5Var.put("android.media.metadata.MEDIA_ID", 1);
        so5Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        so5Var.put("android.media.metadata.MEDIA_URI", 1);
        so5Var.put("android.media.metadata.ADVERTISEMENT", 0);
        so5Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        A = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new hc7((byte) 12);
    }

    public kr3(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.x = bundle2;
        ClassLoader classLoader = rt3.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.x);
    }

    public kr3(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(rt3.class.getClassLoader());
        readBundle.getClass();
        this.x = readBundle;
    }
}
