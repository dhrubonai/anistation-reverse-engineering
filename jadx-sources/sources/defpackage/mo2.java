package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mo2 {
    public final xy4 c;
    public int f;
    public int g;
    public int a = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    public final ArrayList b = new ArrayList();
    public ak2[] d = new ak2[8];
    public int e = 7;

    public mo2(gp2 gp2Var) {
        this.c = new xy4(gp2Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                ak2 ak2Var = this.d[length];
                ak2Var.getClass();
                int i4 = ak2Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            ak2[] ak2VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(ak2VarArr, i5, ak2VarArr, i5 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final zd0 b(int i) {
        if (i >= 0) {
            ak2[] ak2VarArr = oo2.a;
            if (i <= ak2VarArr.length - 1) {
                return ak2VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - oo2.a.length);
        if (length >= 0) {
            ak2[] ak2VarArr2 = this.d;
            if (length < ak2VarArr2.length) {
                ak2 ak2Var = ak2VarArr2[length];
                ak2Var.getClass();
                return ak2Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(ak2 ak2Var) {
        this.b.add(ak2Var);
        int i = ak2Var.c;
        int i2 = this.a;
        if (i > i2) {
            ak2[] ak2VarArr = this.d;
            ms.E0(0, ak2VarArr.length, null, ak2VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        ak2[] ak2VarArr2 = this.d;
        if (i3 > ak2VarArr2.length) {
            ak2[] ak2VarArr3 = new ak2[ak2VarArr2.length * 2];
            System.arraycopy(ak2VarArr2, 0, ak2VarArr3, ak2VarArr2.length, ak2VarArr2.length);
            this.e = this.d.length - 1;
            this.d = ak2VarArr3;
            ak2VarArr2 = ak2VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        ak2VarArr2[i4] = ak2Var;
        this.f++;
        this.g += i;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, pa0] */
    public final zd0 d() {
        boolean z;
        xy4 xy4Var = this.c;
        byte readByte = xy4Var.readByte();
        byte[] bArr = dq6.a;
        int i = readByte & 255;
        int i2 = 0;
        if ((readByte & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long e = e(i, 127);
        if (z) {
            ?? obj = new Object();
            ed4 ed4Var = ys2.c;
            ed4 ed4Var2 = ed4Var;
            int i3 = 0;
            for (long j = 0; j < e; j++) {
                byte readByte2 = xy4Var.readByte();
                byte[] bArr2 = dq6.a;
                i2 = (i2 << 8) | (readByte2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    ed4[] ed4VarArr = (ed4[]) ed4Var2.z;
                    ed4VarArr.getClass();
                    ed4Var2 = ed4VarArr[(i2 >>> (i3 - 8)) & 255];
                    ed4Var2.getClass();
                    if (((ed4[]) ed4Var2.z) == null) {
                        obj.w0(ed4Var2.x);
                        i3 -= ed4Var2.y;
                        ed4Var2 = ed4Var;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                ed4[] ed4VarArr2 = (ed4[]) ed4Var2.z;
                ed4VarArr2.getClass();
                ed4 ed4Var3 = ed4VarArr2[(i2 << (8 - i3)) & 255];
                ed4Var3.getClass();
                int i4 = ed4Var3.y;
                if (((ed4[]) ed4Var3.z) != null || i4 > i3) {
                    break;
                }
                obj.w0(ed4Var3.x);
                i3 -= i4;
                ed4Var2 = ed4Var;
            }
            return obj.s(obj.y);
        }
        return xy4Var.s(e);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = dq6.a;
            int i5 = readByte & 255;
            if ((readByte & 128) != 0) {
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            } else {
                return i2 + (i5 << i4);
            }
        }
    }
}
