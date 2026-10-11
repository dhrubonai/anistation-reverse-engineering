package defpackage;

import androidx.work.OverwritingInputMerger;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.adplayer.DisplayRecoverer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z77 {
    public static final String z = xk3.f("WorkSpec");
    public final String a;
    public j77 b;
    public final String c;
    public final String d;
    public e41 e;
    public final e41 f;
    public long g;
    public long h;
    public long i;
    public qx0 j;
    public final int k;
    public c00 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final wg4 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    public /* synthetic */ z77(String str, j77 j77Var, String str2, String str3, e41 e41Var, e41 e41Var2, long j, long j2, long j3, qx0 qx0Var, int i, c00 c00Var, long j4, long j5, long j6, long j7, boolean z2, wg4 wg4Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? j77.x : j77Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? e41.b : e41Var, (i5 & 32) != 0 ? e41.b : e41Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? qx0.j : qx0Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? c00.x : c00Var, (i5 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? wg4.x : wg4Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static z77 b(z77 z77Var, String str, j77 j77Var, e41 e41Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str2;
        j77 j77Var2;
        String str3;
        e41 e41Var2;
        int i6;
        long j3;
        int i7;
        int i8;
        long j4;
        int i9;
        if ((i5 & 1) != 0) {
            str2 = z77Var.a;
        } else {
            str2 = str;
        }
        if ((i5 & 2) != 0) {
            j77Var2 = z77Var.b;
        } else {
            j77Var2 = j77Var;
        }
        if ((i5 & 4) != 0) {
            str3 = z77Var.c;
        } else {
            str3 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        }
        String str4 = str3;
        String str5 = z77Var.d;
        if ((i5 & 16) != 0) {
            e41Var2 = z77Var.e;
        } else {
            e41Var2 = e41Var;
        }
        e41 e41Var3 = z77Var.f;
        long j5 = z77Var.g;
        long j6 = z77Var.h;
        long j7 = z77Var.i;
        qx0 qx0Var = z77Var.j;
        if ((i5 & 1024) != 0) {
            i6 = z77Var.k;
        } else {
            i6 = i;
        }
        c00 c00Var = z77Var.l;
        long j8 = z77Var.m;
        if ((i5 & 8192) != 0) {
            j3 = z77Var.n;
        } else {
            j3 = j;
        }
        long j9 = z77Var.o;
        long j10 = z77Var.p;
        boolean z2 = z77Var.q;
        wg4 wg4Var = z77Var.r;
        if ((i5 & 262144) != 0) {
            i7 = z77Var.s;
        } else {
            i7 = i2;
        }
        if ((i5 & 524288) != 0) {
            i8 = z77Var.t;
        } else {
            i8 = i3;
        }
        if ((i5 & 1048576) != 0) {
            j4 = z77Var.u;
        } else {
            j4 = j2;
        }
        if ((i5 & 2097152) != 0) {
            i9 = z77Var.v;
        } else {
            i9 = i4;
        }
        int i10 = z77Var.w;
        String str6 = z77Var.x;
        Boolean bool = z77Var.y;
        str2.getClass();
        j77Var2.getClass();
        str4.getClass();
        str5.getClass();
        e41Var2.getClass();
        e41Var3.getClass();
        qx0Var.getClass();
        c00Var.getClass();
        wg4Var.getClass();
        return new z77(str2, j77Var2, str4, str5, e41Var2, e41Var3, j5, j6, j7, qx0Var, i6, c00Var, j8, j3, j9, j10, z2, wg4Var, i7, i8, j4, i9, i10, str6, bool);
    }

    public final long a() {
        boolean z2;
        long j;
        long scalb;
        j77 j77Var = this.b;
        j77 j77Var2 = j77.x;
        int i = this.k;
        if (j77Var == j77Var2 && i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c00 c00Var = this.l;
        long j2 = this.m;
        long j3 = this.n;
        boolean c = c();
        long j4 = this.g;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.u;
        c00Var.getClass();
        int i2 = this.s;
        if (j7 != Long.MAX_VALUE && c) {
            if (i2 != 0) {
                long j8 = j3 + 900000;
                if (j7 < j8) {
                    return j8;
                }
                return j7;
            }
            return j7;
        }
        if (z2) {
            if (c00Var == c00.y) {
                scalb = j2 * i;
            } else {
                scalb = Math.scalb((float) j2, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j3 + scalb;
        }
        if (c) {
            if (i2 == 0) {
                j = j3 + j4;
            } else {
                j = j3 + j6;
            }
            long j9 = j;
            if (j5 != j6 && i2 == 0) {
                return j9 + (j6 - j5);
            }
            return j9;
        }
        if (j3 == -1) {
            return Long.MAX_VALUE;
        }
        return j3 + j4;
    }

    public final boolean c() {
        if (this.h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z77)) {
            return false;
        }
        z77 z77Var = (z77) obj;
        if (a34.i(this.a, z77Var.a) && this.b == z77Var.b && a34.i(this.c, z77Var.c) && a34.i(this.d, z77Var.d) && a34.i(this.e, z77Var.e) && a34.i(this.f, z77Var.f) && this.g == z77Var.g && this.h == z77Var.h && this.i == z77Var.i && a34.i(this.j, z77Var.j) && this.k == z77Var.k && this.l == z77Var.l && this.m == z77Var.m && this.n == z77Var.n && this.o == z77Var.o && this.p == z77Var.p && this.q == z77Var.q && this.r == z77Var.r && this.s == z77Var.s && this.t == z77Var.t && this.u == z77Var.u && this.v == z77Var.v && this.w == z77Var.w && a34.i(this.x, z77Var.x) && a34.i(this.y, z77Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = qx1.c(this.w, qx1.c(this.v, qx1.d(qx1.c(this.t, qx1.c(this.s, (this.r.hashCode() + zo5.g(qx1.d(qx1.d(qx1.d(qx1.d((this.l.hashCode() + qx1.c(this.k, (this.j.hashCode() + qx1.d(qx1.d(qx1.d((this.f.hashCode() + ((this.e.hashCode() + zo5.i(this.d, zo5.i(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31, this.q)) * 31, 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return qx1.m("{WorkSpec: ", this.a, "}");
    }

    public z77(String str, j77 j77Var, String str2, String str3, e41 e41Var, e41 e41Var2, long j, long j2, long j3, qx0 qx0Var, int i, c00 c00Var, long j4, long j5, long j6, long j7, boolean z2, wg4 wg4Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        j77Var.getClass();
        str2.getClass();
        str3.getClass();
        e41Var.getClass();
        e41Var2.getClass();
        qx0Var.getClass();
        c00Var.getClass();
        wg4Var.getClass();
        this.a = str;
        this.b = j77Var;
        this.c = str2;
        this.d = str3;
        this.e = e41Var;
        this.f = e41Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = qx0Var;
        this.k = i;
        this.l = c00Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = wg4Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
