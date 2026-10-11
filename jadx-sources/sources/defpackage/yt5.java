package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yt5 implements Parcelable.ClassLoaderCreator {
    public static zt5 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = yt5.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new zt5();
        }
        ml4 g = es5.y.g();
        for (int i = 0; i < readInt; i++) {
            g.add(parcel.readValue(classLoader));
        }
        return new zt5(g.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new zt5[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
