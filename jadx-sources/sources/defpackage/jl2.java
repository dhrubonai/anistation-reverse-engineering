package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jl2 extends pl0 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.mj3
    public final void a() {
        try {
            this.i.h(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    bArr = Arrays.copyOf(bArr, bArr.length + 16384);
                    this.j = bArr;
                }
                i = this.i.read(bArr, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            io3.F(this.i);
        } catch (Throwable th) {
            io3.F(this.i);
            throw th;
        }
    }

    @Override // defpackage.mj3
    public final void b() {
        this.k = true;
    }
}
