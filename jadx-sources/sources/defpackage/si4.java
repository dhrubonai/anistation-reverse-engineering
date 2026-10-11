package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class si4 implements Parcelable.ClassLoaderCreator {
    public static ti4 a(Parcel parcel, ClassLoader classLoader) {
        tt5 tt5Var;
        if (classLoader == null) {
            classLoader = si4.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    tt5Var = pk2.c0;
                } else {
                    ze0.m(qx1.i(readInt, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
            } else {
                tt5Var = p7.S;
            }
        } else {
            tt5Var = h95.H;
        }
        return new ti4(readValue, tt5Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ti4[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
