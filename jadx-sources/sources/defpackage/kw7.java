package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kw7 extends rm7 {
    public final /* synthetic */ byte e = 1;
    public final Object f;

    public kw7(p76 p76Var) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f = p76Var;
    }

    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (this.e) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) tm7.a(parcel, Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                tm7.d(parcel);
                p76 p76Var = (p76) this.f;
                if (status.x <= 0) {
                    try {
                        ff7 ff7Var = ff7.a;
                        int i2 = se7.a;
                        fz5.m(status, e08.t(createByteArray, ff7.b), p76Var);
                    } catch (ag7 e) {
                        p76Var.a(e);
                    }
                } else {
                    fz5.m(status, null, p76Var);
                }
                return true;
            case 1:
                p76 p76Var2 = (p76) this.f;
                switch (i) {
                    case 1:
                        Status status2 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status2, null, p76Var2);
                        break;
                    case 2:
                        Status status3 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status3, null, p76Var2);
                        break;
                    case 3:
                        Status status4 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status4, null, p76Var2);
                        break;
                    case 4:
                        Status status5 = (Status) tm7.a(parcel, Status.CREATOR);
                        sv7 sv7Var = (sv7) tm7.a(parcel, sv7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status5, sv7Var, p76Var2);
                        break;
                    case 5:
                        Status status6 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status6, null, p76Var2);
                        break;
                    case 6:
                        Status status7 = (Status) tm7.a(parcel, Status.CREATOR);
                        yv7 yv7Var = (yv7) tm7.a(parcel, yv7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status7, yv7Var, p76Var2);
                        break;
                    case 7:
                        Status status8 = (Status) tm7.a(parcel, Status.CREATOR);
                        vv7 vv7Var = (vv7) tm7.a(parcel, vv7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status8, vv7Var, p76Var2);
                        break;
                    case 8:
                        Status status9 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status9, null, p76Var2);
                        break;
                    case 9:
                        Status status10 = (Status) tm7.a(parcel, Status.CREATOR);
                        zv7 zv7Var = (zv7) tm7.a(parcel, zv7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status10, zv7Var, p76Var2);
                        break;
                    case 10:
                        Status status11 = (Status) tm7.a(parcel, Status.CREATOR);
                        sv7 sv7Var2 = (sv7) tm7.a(parcel, sv7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status11, sv7Var2, p76Var2);
                        break;
                    case 11:
                        Status status12 = (Status) tm7.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        tm7.d(parcel);
                        fz5.m(status12, null, p76Var2);
                        break;
                    case 12:
                        Status status13 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status13, null, p76Var2);
                        break;
                    case 13:
                        Status status14 = (Status) tm7.a(parcel, Status.CREATOR);
                        ew7 ew7Var = (ew7) tm7.a(parcel, ew7.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status14, ew7Var, p76Var2);
                        break;
                    case 14:
                        Status status15 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status15, null, p76Var2);
                        break;
                    case 15:
                        Status status16 = (Status) tm7.a(parcel, Status.CREATOR);
                        tm7.d(parcel);
                        fz5.m(status16, null, p76Var2);
                        break;
                    case 16:
                        Status status17 = (Status) tm7.a(parcel, Status.CREATOR);
                        long readLong = parcel.readLong();
                        tm7.d(parcel);
                        fz5.m(status17, Long.valueOf(readLong), p76Var2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                tm7.d(parcel);
                qb7 qb7Var = new qb7(this, createByteArray2);
                gs1 gs1Var = (gs1) this.f;
                ((lj2) gs1Var.a).execute(new yc2((Object) gs1Var, (Object) qb7Var, (byte) 11));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw7(ww7 ww7Var, gs1 gs1Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f = gs1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw7(ww7 ww7Var, p76 p76Var) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f = p76Var;
    }
}
