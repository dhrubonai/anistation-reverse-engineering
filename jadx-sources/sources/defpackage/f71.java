package defpackage;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f71 {
    public int b;
    public long h;
    public long j;
    public boolean k;
    public final SparseArray a = new SparseArray();
    public vv c = vv.e;
    public int d = -1;
    public d71[] e = new d71[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = Long.MAX_VALUE;

    public final int a(vv vvVar, long j) {
        c();
        c();
        vv vvVar2 = this.c;
        if (vvVar.a == vvVar2.a && zz.m(vvVar) && zz.m(vvVar2)) {
            long r = eq6.r(vvVar.a, j - this.f);
            int i = this.b;
            this.b = i + 1;
            this.a.append(i, new e71(this, vvVar, ak0.a(vvVar.b, this.c.b), r));
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
            return i;
        }
        throw new yv("Can not add source. MixerFormat=" + this.c, vvVar);
    }

    public final d71 b(long j) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.d * this.c.d).order(ByteOrder.nativeOrder());
        order.mark();
        return new d71(order, j, j + this.d);
    }

    public final void c() {
        io3.A("Audio mixer is not configured.", !this.c.equals(vv.e));
    }

    public final void d(vv vvVar) {
        io3.A("Audio mixer already configured.", this.c.equals(vv.e));
        if (zz.m(vvVar)) {
            this.c = vvVar;
            this.d = (UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE * vvVar.a) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
            this.f = 0L;
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
            this.e = new d71[]{b(0L), b(this.d)};
            this.g = Math.min(this.i, this.h + this.d);
            return;
        }
        throw new yv("Can not mix to this AudioFormat.", vvVar);
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            if (j < this.j || this.a.size() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        long j;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = this.a;
            String str = eq6.a;
            if (sparseArray.indexOfKey(i) >= 0) {
                z = true;
            } else {
                z = false;
            }
            io3.A("Source not found.", z);
            e71 e71Var = (e71) sparseArray.get(i);
            if (e71Var.a < this.g) {
                long min = Math.min(e71Var.a + (byteBuffer.remaining() / e71Var.b.d), this.g);
                if (e71Var.c.d) {
                    e71Var.a(min, byteBuffer);
                    return;
                }
                long j2 = e71Var.a;
                long j3 = this.h;
                if (j2 < j3) {
                    e71Var.a(Math.min(min, j3), byteBuffer);
                    if (e71Var.a == min) {
                        return;
                    }
                }
                d71[] d71VarArr = this.e;
                int length = d71VarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    d71 d71Var = d71VarArr[i2];
                    long j4 = e71Var.a;
                    if (j4 >= d71Var.y) {
                        j = min;
                    } else {
                        int i3 = ((int) (j4 - d71Var.x)) * this.c.d;
                        ByteBuffer byteBuffer2 = (ByteBuffer) d71Var.z;
                        byteBuffer2.position(byteBuffer2.position() + i3);
                        long min2 = Math.min(min, d71Var.y);
                        ByteBuffer byteBuffer3 = (ByteBuffer) d71Var.z;
                        vv vvVar = this.c;
                        if (min2 >= e71Var.a) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        io3.n(z2);
                        int i4 = (int) (min2 - e71Var.a);
                        vv vvVar2 = e71Var.b;
                        ak0 ak0Var = e71Var.c;
                        e71Var.d.getClass();
                        j = min;
                        zz.Q(byteBuffer, vvVar2, byteBuffer3, vvVar, ak0Var, i4, true);
                        e71Var.a = min2;
                        ((ByteBuffer) d71Var.z).reset();
                        if (e71Var.a == j) {
                            break;
                        }
                    }
                    i2++;
                    min = j;
                }
                LinkedHashMap linkedHashMap = a61.a;
                synchronized (a61.class) {
                }
            }
        }
    }
}
