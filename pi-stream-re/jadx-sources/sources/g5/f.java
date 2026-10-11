package g5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int q02 = q6.g.q0(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        String str = null;
        String str2 = null;
        f5.b bVar = null;
        while (parcel.dataPosition() < q02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = q6.g.Q(readInt, parcel);
                    break;
                case 2:
                    i11 = q6.g.Q(readInt, parcel);
                    break;
                case 3:
                    z9 = q6.g.N(readInt, parcel);
                    break;
                case 4:
                    i12 = q6.g.Q(readInt, parcel);
                    break;
                case 5:
                    z10 = q6.g.N(readInt, parcel);
                    break;
                case 6:
                    str = q6.g.p(readInt, parcel);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    i13 = q6.g.Q(readInt, parcel);
                    break;
                case '\b':
                    str2 = q6.g.p(readInt, parcel);
                    break;
                case '\t':
                    bVar = (f5.b) q6.g.o(parcel, readInt, f5.b.CREATOR);
                    break;
                default:
                    q6.g.l0(readInt, parcel);
                    break;
            }
        }
        q6.g.w(q02, parcel);
        return new a(i10, i11, z9, i12, z10, str, i13, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
