package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bj6 extends Thread {
    public final /* synthetic */ ou0 A;
    public final /* synthetic */ fl5 x;
    public final /* synthetic */ Context y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj6(fl5 fl5Var, Context context, String str, ou0 ou0Var) {
        super("TransmuxTranscodeHelper:ResumeMetadata");
        this.x = fl5Var;
        this.y = context;
        this.z = str;
        this.A = ou0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        long j;
        try {
            if (this.x.x instanceof x0) {
                return;
            }
            d71 a = d71.a(this.y, -9223372036854775807L, this.z);
            long j2 = a.y;
            io3.t(4, "initialCapacity");
            Object[] objArr = new Object[4];
            if (j2 != -9223372036854775807L) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < this.A.b.size()) {
                    o15 o15Var = ((rr1) this.A.b.get(i2)).a;
                    long j3 = j2;
                    int i4 = 0;
                    while (i4 < o15Var.A && j3 > 0) {
                        Context context = this.y;
                        ar3 ar3Var = ((qr1) o15Var.get(i4)).a;
                        vq3 vq3Var = ar3Var.b;
                        vq3Var.getClass();
                        String uri = vq3Var.a.toString();
                        qq3 qq3Var = ar3Var.e;
                        long U = eq6.U(qq3Var.a);
                        long j4 = qq3Var.c;
                        if (j4 != Long.MIN_VALUE) {
                            j = eq6.U(j4);
                        } else {
                            j = d71.a(context, -9223372036854775807L, uri).x;
                        }
                        long j5 = j - U;
                        if (j5 > j3) {
                            break;
                        }
                        j3 -= j5;
                        i4++;
                    }
                    j3 = 0;
                    Pair pair = new Pair(Integer.valueOf(i4), Long.valueOf(j3));
                    int i5 = i3 + 1;
                    int b = fw2.b(objArr.length, i5);
                    if (b > objArr.length) {
                        objArr = Arrays.copyOf(objArr, b);
                    }
                    objArr[i3] = pair;
                    i2++;
                    i3 = i5;
                }
                i = i3;
            } else {
                i = 0;
            }
            this.x.l(new dj6(j2, nw2.j(objArr, i), (ea2) a.z));
        } catch (Exception e) {
            this.x.m(e);
        }
    }
}
