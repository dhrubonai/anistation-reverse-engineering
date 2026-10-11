package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class p3 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f600a;

    public /* synthetic */ p3(int i10) {
        this.f600a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f600a) {
            case 0:
                return new q3(parcel, classLoader);
            case 1:
                return new f4(parcel, classLoader);
            case 2:
                return new u.e(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return n0.b.f7896b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new m3.t0(parcel, classLoader);
            case 5:
                return new u5.b(parcel, classLoader);
            case 6:
                return new w5.c(parcel, classLoader);
            case zzaja.zze.zzg /* 7 */:
                return new x5.b(parcel, classLoader);
            case 8:
                return new e6.a(parcel, classLoader);
            case 9:
                return new k6.b(parcel, classLoader);
            default:
                return new m6.z(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f600a) {
            case 0:
                return new q3[i10];
            case 1:
                return new f4[i10];
            case 2:
                return new u.e[i10];
            case 3:
                return new n0.b[i10];
            case 4:
                return new m3.t0[i10];
            case 5:
                return new u5.b[i10];
            case 6:
                return new w5.c[i10];
            case zzaja.zze.zzg /* 7 */:
                return new x5.b[i10];
            case 8:
                return new e6.a[i10];
            case 9:
                return new k6.b[i10];
            default:
                return new m6.z[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f600a) {
            case 0:
                return new q3(parcel, null);
            case 1:
                return new f4(parcel, null);
            case 2:
                return new u.e(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return n0.b.f7896b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new m3.t0(parcel, null);
            case 5:
                return new u5.b(parcel, null);
            case 6:
                return new w5.c(parcel, (ClassLoader) null);
            case zzaja.zze.zzg /* 7 */:
                return new x5.b(parcel, null);
            case 8:
                return new e6.a(parcel, null);
            case 9:
                return new k6.b(parcel, (ClassLoader) null);
            default:
                return new m6.z(parcel, null);
        }
    }
}
