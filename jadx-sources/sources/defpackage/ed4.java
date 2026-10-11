package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ed4 implements h90, nr, mr6 {
    public static final byte[] A = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] B = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int x;
    public int y;
    public Object z;

    public ed4(int i, int i2, ar1 ar1Var) {
        this.x = i;
        this.y = i2;
        this.z = new zp2(new u42(i, i2, ar1Var));
    }

    public static void f(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(rz5.b(i2));
    }

    @Override // defpackage.h90
    public int a() {
        return this.x;
    }

    @Override // defpackage.h90
    public int c() {
        return this.y;
    }

    @Override // defpackage.h90
    public int d() {
        int i = this.x;
        if (i == -1) {
            return ((zi4) this.z).E();
        }
        return i;
    }

    @Override // defpackage.nr
    public Object h() {
        return ((nr) this.z).h();
    }

    @Override // defpackage.nr
    public void i(int i, Object obj) {
        int i2;
        nr nrVar = (nr) this.z;
        if (this.y == 0) {
            i2 = this.x;
        } else {
            i2 = 0;
        }
        nrVar.i(i + i2, obj);
    }

    @Override // defpackage.nr
    public void j(Object obj) {
        this.y++;
        ((nr) this.z).j(obj);
    }

    @Override // defpackage.nr
    public void k() {
        ((nr) this.z).k();
    }

    @Override // defpackage.nr
    public void l(int i, int i2, int i3) {
        int i4;
        if (this.y == 0) {
            i4 = this.x;
        } else {
            i4 = 0;
        }
        ((nr) this.z).l(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.nr
    public void m(Object obj, ic2 ic2Var) {
        ((nr) this.z).m(obj, ic2Var);
    }

    @Override // defpackage.nr
    public void n(int i, int i2) {
        int i3;
        nr nrVar = (nr) this.z;
        if (this.y == 0) {
            i3 = this.x;
        } else {
            i3 = 0;
        }
        nrVar.n(i + i3, i2);
    }

    @Override // defpackage.kr6
    public rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.z).o(j, rlVar, rlVar2, rlVar3);
    }

    @Override // defpackage.nr
    public void p() {
        if (this.y <= 0) {
            eu0.a("OffsetApplier up called with no corresponding down");
        }
        this.y--;
        ((nr) this.z).p();
    }

    @Override // defpackage.nr
    public void q(int i, Object obj) {
        int i2;
        nr nrVar = (nr) this.z;
        if (this.y == 0) {
            i2 = this.x;
        } else {
            i2 = 0;
        }
        nrVar.q(i + i2, obj);
    }

    @Override // defpackage.mr6
    public int v() {
        return this.y;
    }

    @Override // defpackage.mr6
    public int x() {
        return this.x;
    }

    @Override // defpackage.kr6
    public rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        return ((zp2) this.z).y(j, rlVar, rlVar2, rlVar3);
    }

    public ed4() {
        this.z = new ed4[256];
        this.x = 0;
        this.y = 0;
    }

    public /* synthetic */ ed4(int i, int i2, Object obj) {
        this.x = i;
        this.y = i2;
        this.z = obj;
    }
}
