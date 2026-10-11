package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ob4 extends y2 {
    public static final Parcelable.Creator<ob4> CREATOR;
    public static final hu7 f0;
    public static final int[] g0;
    public final String A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final ep7 c0;
    public final boolean d0;
    public final boolean e0;
    public final ArrayList x;
    public final int[] y;
    public final long z;

    static {
        ot7 ot7Var = st7.A;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i = 0; i < 2; i++) {
            rz5.g(i, objArr[i]);
        }
        f0 = st7.h(objArr, 2);
        g0 = new int[]{0, 1};
        CREATOR = new aw7((byte) 19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ob4(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        ep7 sa7Var;
        this.x = new ArrayList(list);
        this.y = Arrays.copyOf(iArr, iArr.length);
        this.z = j;
        this.A = str;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        this.F = i5;
        this.G = i6;
        this.H = i7;
        this.I = i8;
        this.J = i9;
        this.K = i10;
        this.L = i11;
        this.M = i12;
        this.N = i13;
        this.O = i14;
        this.P = i15;
        this.Q = i16;
        this.R = i17;
        this.S = i18;
        this.T = i19;
        this.U = i20;
        this.V = i21;
        this.W = i22;
        this.X = i23;
        this.Y = i24;
        this.Z = i25;
        this.a0 = i26;
        this.b0 = i27;
        this.d0 = z;
        this.e0 = z2;
        if (iBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof ep7) {
                sa7Var = (ep7) queryLocalInterface;
            } else {
                sa7Var = new sa7(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", (byte) 1);
            }
        }
        this.c0 = sa7Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int s0 = z51.s0(parcel, 20293);
        z51.n0(parcel, 2, this.x);
        int[] iArr = this.y;
        z51.d0(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        z51.r0(parcel, 4, 8);
        parcel.writeLong(this.z);
        z51.m0(parcel, 5, this.A);
        z51.r0(parcel, 6, 4);
        parcel.writeInt(this.B);
        z51.r0(parcel, 7, 4);
        parcel.writeInt(this.C);
        z51.r0(parcel, 8, 4);
        parcel.writeInt(this.D);
        z51.r0(parcel, 9, 4);
        parcel.writeInt(this.E);
        z51.r0(parcel, 10, 4);
        parcel.writeInt(this.F);
        z51.r0(parcel, 11, 4);
        parcel.writeInt(this.G);
        z51.r0(parcel, 12, 4);
        parcel.writeInt(this.H);
        z51.r0(parcel, 13, 4);
        parcel.writeInt(this.I);
        z51.r0(parcel, 14, 4);
        parcel.writeInt(this.J);
        z51.r0(parcel, 15, 4);
        parcel.writeInt(this.K);
        z51.r0(parcel, 16, 4);
        parcel.writeInt(this.L);
        z51.r0(parcel, 17, 4);
        parcel.writeInt(this.M);
        z51.r0(parcel, 18, 4);
        parcel.writeInt(this.N);
        z51.r0(parcel, 19, 4);
        parcel.writeInt(this.O);
        z51.r0(parcel, 20, 4);
        parcel.writeInt(this.P);
        z51.r0(parcel, 21, 4);
        parcel.writeInt(this.Q);
        z51.r0(parcel, 22, 4);
        parcel.writeInt(this.R);
        z51.r0(parcel, 23, 4);
        parcel.writeInt(this.S);
        z51.r0(parcel, 24, 4);
        parcel.writeInt(this.T);
        z51.r0(parcel, 25, 4);
        parcel.writeInt(this.U);
        z51.r0(parcel, 26, 4);
        parcel.writeInt(this.V);
        z51.r0(parcel, 27, 4);
        parcel.writeInt(this.W);
        z51.r0(parcel, 28, 4);
        parcel.writeInt(this.X);
        z51.r0(parcel, 29, 4);
        parcel.writeInt(this.Y);
        z51.r0(parcel, 30, 4);
        parcel.writeInt(this.Z);
        z51.r0(parcel, 31, 4);
        parcel.writeInt(this.a0);
        z51.r0(parcel, 32, 4);
        parcel.writeInt(this.b0);
        ep7 ep7Var = this.c0;
        if (ep7Var == null) {
            iBinder = null;
        } else {
            iBinder = ep7Var.f;
        }
        z51.c0(parcel, 33, iBinder);
        z51.r0(parcel, 34, 4);
        parcel.writeInt(this.d0 ? 1 : 0);
        z51.r0(parcel, 35, 4);
        parcel.writeInt(this.e0 ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
