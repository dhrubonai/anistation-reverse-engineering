package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c55 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ c55(byte b) {
        this.a = b;
    }

    public static void a(mm7 mm7Var, Parcel parcel, int i) {
        String str = mm7Var.x;
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, str);
        z51.l0(parcel, 3, mm7Var.y, i);
        z51.m0(parcel, 4, mm7Var.z);
        long j = mm7Var.A;
        z51.r0(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = mm7Var.B;
        z51.r0(parcel, 6, 8);
        parcel.writeLong(j2);
        z51.t0(parcel, s0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 699
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c55.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new e55[i];
            case 1:
                return new vy5[i];
            case 2:
                return new x76[i];
            case 3:
                return new ra7[i];
            case 4:
                return new GoogleSignInAccount[i];
            case 5:
                return new e37[i];
            case 6:
                return new ob7[i];
            case 7:
                return new sb7[i];
            case 8:
                return new ny3[i];
            case 9:
                return new yb7[i];
            case 10:
                return new zb7[i];
            case 11:
                return new q5[i];
            case 12:
                return new zh0[i];
            case 13:
                return new hw0[i];
            case 14:
                return new oc7[i];
            case 15:
                return new le7[i];
            case 16:
                return new j75[i];
            case 17:
                return new mg7[i];
            case 18:
                return new yh7[i];
            case 19:
                return new l21[i];
            case 20:
                return new dk7[i];
            case 21:
                return new jk7[i];
            case 22:
                return new kk7[i];
            case 23:
                return new r5[i];
            case 24:
                return new fc7[i];
            case 25:
                return new q12[i];
            case 26:
                return new im7[i];
            case 27:
                return new mm7[i];
            case 28:
                return new aa3[i];
            default:
                return new MediaError[i];
        }
    }
}
