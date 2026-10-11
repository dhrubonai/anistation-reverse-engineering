package androidx.fragment.app;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class w extends RuntimeException {
    public /* synthetic */ w(a3.g gVar) {
    }

    public /* synthetic */ w(Object obj) {
        super("Context cannot be null");
    }

    public w(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    public w() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
