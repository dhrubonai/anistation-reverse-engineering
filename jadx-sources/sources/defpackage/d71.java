package defpackage;

import android.content.Context;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d71 implements kr6 {
    public final long x;
    public final long y;
    public final Object z;

    public d71(mr6 mr6Var) {
        this.z = mr6Var;
        this.x = (mr6Var.x() + mr6Var.v()) * 1000000;
        this.y = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [d42, java.lang.Object] */
    public static d71 a(Context context, long j, String str) {
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        ea2 ea2Var;
        ea2 ea2Var2;
        boolean z3;
        long[] jArr;
        t14 t14Var = new t14(16, w16.o);
        v14 v14Var = new v14((byte) 0);
        HashMap hashMap = (HashMap) v14Var.B;
        s71 s71Var = new s71(context, new d91(new rt3((byte) 27)));
        Map map = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        io3.w(parse, "The uri must be set.");
        try {
            long h = s71Var.h(new v41(parse, 0L, 1, null, map, 0L, -1L, null, 0));
            if (h != 0) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            p81 p81Var = new p81(s71Var, 0L, h);
            io3.A("The MP4 file is invalid", t14Var.b(p81Var));
            t14Var.e(v14Var);
            ?? obj = new Object();
            while (!v14Var.z) {
                int a = t14Var.a(p81Var, obj);
                if (a == 1) {
                    s71Var.close();
                    Map map2 = Collections.EMPTY_MAP;
                    Uri parse2 = Uri.parse(str);
                    long j5 = obj.a;
                    io3.w(parse2, "The uri must be set.");
                    long h2 = s71Var.h(new v41(parse2, 0L, 1, null, map2, j5, -1L, null, 0));
                    if (h2 != -1) {
                        h2 += obj.a;
                    }
                    p81Var = new p81(s71Var, obj.a, h2);
                } else if (a == -1 && !v14Var.z) {
                    throw new IllegalStateException("The MP4 file is invalid");
                }
            }
            vg6 vg6Var = (vg6) v14Var.A;
            vg6Var.getClass();
            long h3 = vg6Var.h();
            long j6 = -9223372036854775807L;
            if (v14Var.x != -1) {
                u14 u14Var = (u14) hashMap.get(2);
                u14Var.getClass();
                ea2 ea2Var3 = u14Var.a;
                ea2Var3.getClass();
                if (h3 != -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                io3.B(z3);
                long j7 = -9223372036854775807L;
                j6 = vg6Var.d(v14Var.x, h3).a.a;
                if (j != -9223372036854775807L) {
                    gf5 d = vg6Var.d(v14Var.x, j);
                    long j8 = d.a.a;
                    if (j != j8) {
                        j8 = d.b.a;
                        if (j > j8) {
                            j8 = Long.MIN_VALUE;
                        }
                    }
                    int i = v14Var.x;
                    s14[] s14VarArr = t14Var.G;
                    if (s14VarArr.length <= i) {
                        jArr = new long[0];
                    } else {
                        jArr = s14VarArr[i].b.f;
                    }
                    if (jArr.length > 0) {
                        j7 = jArr[0];
                    }
                    int b = eq6.b(jArr, j, true);
                    if (b < jArr.length && jArr[b] == j8) {
                        ea2Var = ea2Var3;
                        j4 = j8;
                        z2 = true;
                    } else {
                        z2 = false;
                        ea2Var = ea2Var3;
                        j4 = j8;
                    }
                    j2 = h3;
                    j3 = j7;
                } else {
                    z2 = false;
                    ea2Var = ea2Var3;
                    j2 = h3;
                    j3 = -9223372036854775807L;
                    j4 = -9223372036854775807L;
                }
            } else {
                z2 = false;
                j2 = h3;
                j3 = -9223372036854775807L;
                j4 = -9223372036854775807L;
                ea2Var = null;
            }
            if (v14Var.y != -1) {
                u14 u14Var2 = (u14) hashMap.get(1);
                u14Var2.getClass();
                ea2 ea2Var4 = u14Var2.a;
                ea2Var4.getClass();
                ea2Var2 = ea2Var4;
            } else {
                ea2Var2 = null;
            }
            d71 d71Var = new d71(j2, j6, j3, j4, z2, ea2Var, ea2Var2);
            io3.F(s71Var);
            return d71Var;
        } catch (Throwable th) {
            io3.F(s71Var);
            throw th;
        }
    }

    @Override // defpackage.kr6
    public boolean b() {
        return true;
    }

    public long c(long j) {
        long j2 = j + this.y;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.x;
        return j2 - ((j2 / j3) * j3);
    }

    public rl d(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        long j2 = this.y;
        long j3 = j + j2;
        long j4 = this.x;
        if (j3 > j4) {
            return ((mr6) this.z).o(j4 - j2, rlVar, rlVar3, rlVar2);
        }
        return rlVar2;
    }

    @Override // defpackage.kr6
    public long e(rl rlVar, rl rlVar2, rl rlVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.kr6
    public rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((mr6) this.z).o(c(j), rlVar, rlVar2, d(j, rlVar, rlVar3, rlVar2));
    }

    @Override // defpackage.kr6
    public rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((mr6) this.z).y(c(j), rlVar, rlVar2, d(j, rlVar, rlVar3, rlVar2));
    }

    public d71(ByteBuffer byteBuffer, long j, long j2) {
        this.z = byteBuffer;
        this.x = j;
        this.y = j2;
    }

    public d71(long j, long j2, long j3, long j4, boolean z, ea2 ea2Var, ea2 ea2Var2) {
        this.x = j;
        this.y = j2;
        this.z = ea2Var;
    }
}
