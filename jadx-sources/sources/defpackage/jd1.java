package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jd1 extends op5 implements n16 {
    public final y16 n;

    public jd1(y16 y16Var) {
        super(new u16[2], new bj0[2]);
        boolean z;
        int i = this.g;
        q61[] q61VarArr = this.e;
        if (i == q61VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        for (q61 q61Var : q61VarArr) {
            q61Var.j(1024);
        }
        this.n = y16Var;
    }

    @Override // defpackage.op5
    public final q61 f() {
        return new q61(1);
    }

    @Override // defpackage.op5
    public final r61 g() {
        return new bj0(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o61, java.lang.Exception] */
    @Override // defpackage.op5
    public final o61 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override // defpackage.op5
    public final o61 i(q61 q61Var, r61 r61Var, boolean z) {
        u16 u16Var = (u16) q61Var;
        bj0 bj0Var = (bj0) r61Var;
        try {
            ByteBuffer byteBuffer = u16Var.B;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            y16 y16Var = this.n;
            if (z) {
                y16Var.reset();
            }
            k16 h = y16Var.h(array, 0, limit);
            long j = u16Var.D;
            long j2 = u16Var.G;
            bj0Var.z = j;
            bj0Var.B = h;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            bj0Var.C = j;
            bj0Var.A = false;
            return null;
        } catch (o16 e) {
            return e;
        }
    }

    @Override // defpackage.n16
    public final void b(long j) {
    }
}
