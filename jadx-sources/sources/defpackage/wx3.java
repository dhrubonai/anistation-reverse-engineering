package defpackage;

import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wx3 implements g95 {
    public final int C;
    public byte[] D;
    public long E;
    public boolean F;
    public boolean G;
    public final lv4 x;
    public final lv4 y;
    public final pz2 z = new pz2((byte) 25, false);
    public final q61 A = new q61(1);
    public final LongSparseArray B = new LongSparseArray();

    public wx3(lv4 lv4Var, lv4 lv4Var2, ea2 ea2Var) {
        int i;
        this.x = lv4Var;
        this.y = lv4Var2;
        int i2 = ea2Var.r;
        if (i2 != -1) {
            i = i2 + 2;
        } else {
            i = 18;
        }
        this.C = i;
        this.E = -9223372036854775807L;
    }

    @Override // defpackage.g95
    public final int G() {
        return this.x.G();
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        byte[] bArr;
        boolean z;
        int i2;
        int i3;
        int I = this.x.I(pz2Var, q61Var, i);
        if (I == -4) {
            int i4 = 4;
            if (!q61Var.d(4) && (i & 4) == 0) {
                boolean z2 = true;
                if ((i & 1) == 0 && !this.F) {
                    long j = q61Var.D;
                    boolean z3 = this.G;
                    byte[] bArr2 = null;
                    LongSparseArray longSparseArray = this.B;
                    if (!z3) {
                        while (true) {
                            q61 q61Var2 = this.A;
                            q61Var2.f();
                            lv4 lv4Var = this.y;
                            pz2 pz2Var2 = this.z;
                            int I2 = lv4Var.I(pz2Var2, q61Var2, 0);
                            if (I2 == -3) {
                                break;
                            }
                            if (I2 != -5) {
                                if (q61Var2.d(i4)) {
                                    this.G = z2;
                                    break;
                                }
                                long j2 = q61Var2.D;
                                long j3 = this.E;
                                if (j3 != -9223372036854775807L && j2 < j3) {
                                    this.F = z2;
                                    longSparseArray.clear();
                                    this.D = bArr2;
                                }
                                this.E = j2;
                                ByteBuffer byteBuffer = q61Var2.B;
                                if (!this.F && byteBuffer != null) {
                                    q61Var2.k();
                                    ea2 ea2Var = (ea2) pz2Var2.z;
                                    if (ea2Var != null) {
                                        List list = ea2Var.s;
                                        i2 = 0;
                                        for (int i5 = 0; i5 < list.size(); i5++) {
                                            i2 += ((byte[]) list.get(i5)).length;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    byte[] bArr3 = new byte[byteBuffer.remaining() + i2];
                                    if (ea2Var != null) {
                                        List list2 = ea2Var.s;
                                        int i6 = 0;
                                        i3 = 0;
                                        while (i6 < list2.size()) {
                                            byte[] bArr4 = (byte[]) list2.get(i6);
                                            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                                            i3 += bArr4.length;
                                            i6++;
                                            z2 = z2;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    z = z2;
                                    byteBuffer.get(bArr3, i3, byteBuffer.remaining());
                                    longSparseArray.put(j2, bArr3);
                                    while (longSparseArray.size() > this.C) {
                                        longSparseArray.removeAt(0);
                                    }
                                } else {
                                    z = z2;
                                }
                                if (j2 > j) {
                                    break;
                                }
                                z2 = z;
                                i4 = 4;
                                bArr2 = null;
                            }
                        }
                    }
                    long j4 = q61Var.D;
                    int size = longSparseArray.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            if (longSparseArray.keyAt(size) <= j4) {
                                bArr = (byte[]) longSparseArray.valueAt(size);
                                break;
                            }
                            size--;
                        } else {
                            bArr = null;
                            break;
                        }
                    }
                    if (bArr != null) {
                        this.D = bArr;
                    }
                    byte[] bArr5 = this.D;
                    if (bArr5 != null) {
                        int length = bArr5.length;
                        ByteBuffer byteBuffer2 = q61Var.E;
                        if (byteBuffer2 != null && byteBuffer2.capacity() >= length) {
                            q61Var.E.clear();
                        } else {
                            q61Var.E = ByteBuffer.allocate(length);
                        }
                        q61Var.E.put(bArr5);
                        q61Var.b(268435456);
                        return I;
                    }
                }
            }
        }
        return I;
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        return this.x.isReady();
    }

    @Override // defpackage.g95
    public final void s() {
        this.x.s();
        if (!this.F) {
            this.y.s();
        }
    }

    @Override // defpackage.g95
    public final int t(long j) {
        return this.x.t(j);
    }
}
