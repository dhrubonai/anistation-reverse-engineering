package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nq7 extends ua7 implements IInterface {
    public final /* synthetic */ p76 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq7(wb7 wb7Var, p76 p76Var) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", (byte) 1);
        this.f = p76Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [pq7, java.lang.Object] */
    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) nn7.a(parcel, Status.CREATOR);
                fr7 fr7Var = (fr7) nn7.a(parcel, fr7.CREATOR);
                nn7.d(parcel);
                or7 or7Var = new or7(fr7Var);
                ?? obj = new Object();
                obj.a = or7Var;
                fz5.m(status, obj, this.f);
                return true;
            case 3:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 4:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 5:
                nn7.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 6:
                parcel.createStringArrayList();
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 7:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 8:
                parcel.readInt();
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 9:
                nn7.d(parcel);
                ze0.m("Not implemented");
                return false;
            case 10:
                nn7.d(parcel);
                ze0.m("Not implemented");
                return false;
            case 11:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 12:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 13:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 14:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            case 15:
                nn7.d(parcel);
                ze0.m("Not implemented.");
                return false;
            default:
                return false;
        }
    }
}
