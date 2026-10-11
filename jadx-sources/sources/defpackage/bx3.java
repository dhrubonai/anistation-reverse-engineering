package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bx3 extends y2 {
    public static final Parcelable.Creator<bx3> CREATOR;
    public double A;
    public int B;
    public int C;
    public long D;
    public long E;
    public double F;
    public boolean G;
    public long[] H;
    public int I;
    public int J;
    public String K;
    public JSONObject L;
    public int M;
    public boolean O;
    public s5 P;
    public it6 Q;
    public er3 R;
    public tr3 S;
    public boolean T;
    public MediaInfo x;
    public long y;
    public int z;
    public final ArrayList N = new ArrayList();
    public final SparseArray U = new SparseArray();

    static {
        a34.v("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new an7((byte) 7);
    }

    public bx3(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, s5 s5Var, it6 it6Var, er3 er3Var, tr3 tr3Var) {
        this.x = mediaInfo;
        this.y = j;
        this.z = i;
        this.A = d;
        this.B = i2;
        this.C = i3;
        this.D = j2;
        this.E = j3;
        this.F = d2;
        this.G = z;
        this.H = jArr;
        this.I = i4;
        this.J = i5;
        this.K = str;
        if (str != null) {
            try {
                this.L = new JSONObject(this.K);
            } catch (JSONException unused) {
                this.L = null;
                this.K = null;
            }
        } else {
            this.L = null;
        }
        this.M = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(arrayList);
        }
        this.O = z2;
        this.P = s5Var;
        this.Q = it6Var;
        this.R = er3Var;
        this.S = tr3Var;
        boolean z3 = false;
        if (tr3Var != null && tr3Var.G) {
            z3 = true;
        }
        this.T = z3;
    }

    public final ur3 c(int i) {
        Integer num = (Integer) this.U.get(i);
        if (num == null) {
            return null;
        }
        return (ur3) this.N.get(num.intValue());
    }

    public final boolean d(long j) {
        if ((this.E & j) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof bx3) {
                bx3 bx3Var = (bx3) obj;
                if (this.L != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (bx3Var.L != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z == z2 && this.y == bx3Var.y && this.z == bx3Var.z && this.A == bx3Var.A && this.B == bx3Var.B && this.C == bx3Var.C && this.D == bx3Var.D && this.F == bx3Var.F && this.G == bx3Var.G && this.I == bx3Var.I && this.J == bx3Var.J && this.M == bx3Var.M && Arrays.equals(this.H, bx3Var.H) && qi0.c(Long.valueOf(this.E), Long.valueOf(bx3Var.E)) && qi0.c(this.N, bx3Var.N) && qi0.c(this.x, bx3Var.x) && (((jSONObject = this.L) == null || (jSONObject2 = bx3Var.L) == null || w63.a(jSONObject, jSONObject2)) && this.O == bx3Var.O && qi0.c(this.P, bx3Var.P) && qi0.c(this.Q, bx3Var.Q) && qi0.c(this.R, bx3Var.R) && bx7.q(this.S, bx3Var.S) && this.T == bx3Var.T)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023d, code lost:
    
        if (r13 != 3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0246, code lost:
    
        if (r3 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x01ad, code lost:
    
        if (r2 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x037b A[Catch: JSONException -> 0x0386, TryCatch #2 {JSONException -> 0x0386, blocks: (B:312:0x0355, B:314:0x037b, B:315:0x037c), top: B:311:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Type inference failed for: r13v11, types: [tr3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [sr3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(org.json.JSONObject r32, int r33) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx3.f(org.json.JSONObject, int):int");
    }

    public final void g(List list) {
        ArrayList arrayList = this.N;
        arrayList.clear();
        SparseArray sparseArray = this.U;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            ur3 ur3Var = (ur3) list.get(i);
            arrayList.add(ur3Var);
            sparseArray.put(ur3Var.y, Integer.valueOf(i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, Long.valueOf(this.y), Integer.valueOf(this.z), Double.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), Long.valueOf(this.D), Long.valueOf(this.E), Double.valueOf(this.F), Boolean.valueOf(this.G), Integer.valueOf(Arrays.hashCode(this.H)), Integer.valueOf(this.I), Integer.valueOf(this.J), String.valueOf(this.L), Integer.valueOf(this.M), this.N, Boolean.valueOf(this.O), this.P, this.Q, this.R, this.S});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.L;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.K = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 2, this.x, i);
        long j = this.y;
        z51.r0(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.A;
        z51.r0(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.B;
        z51.r0(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.C;
        z51.r0(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.D;
        z51.r0(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.E;
        z51.r0(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.F;
        z51.r0(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.G;
        z51.r0(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        z51.i0(parcel, 12, this.H);
        int i5 = this.I;
        z51.r0(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.J;
        z51.r0(parcel, 14, 4);
        parcel.writeInt(i6);
        z51.m0(parcel, 15, this.K);
        int i7 = this.M;
        z51.r0(parcel, 16, 4);
        parcel.writeInt(i7);
        z51.p0(parcel, 17, this.N);
        boolean z2 = this.O;
        z51.r0(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        z51.l0(parcel, 19, this.P, i);
        z51.l0(parcel, 20, this.Q, i);
        z51.l0(parcel, 21, this.R, i);
        z51.l0(parcel, 22, this.S, i);
        z51.t0(parcel, s0);
    }
}
