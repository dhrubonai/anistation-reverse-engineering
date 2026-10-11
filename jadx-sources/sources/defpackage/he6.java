package defpackage;

import android.opengl.GLES20;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class he6 {
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final byte c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public he6(boolean z, int i) {
        this.d = z;
        this.c = i;
        this.a = new ArrayDeque(i);
        this.b = new ArrayDeque(i);
    }

    public final void a(oe2 oe2Var, int i, int i2) {
        int i3;
        oe2 oe2Var2;
        int i4;
        int i5;
        ArrayDeque arrayDeque = this.a;
        io3.B(arrayDeque.isEmpty());
        io3.B(this.b.isEmpty());
        for (int i6 = 0; i6 < this.c; i6++) {
            if (this.d) {
                a34.j(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                a34.p();
                i3 = iArr[0];
                a34.k(3553, i3, 9729);
                i4 = i;
                i5 = i2;
                GLES20.glTexImage2D(3553, 0, 34842, i4, i5, 0, 6408, 5131, null);
                a34.p();
                oe2Var2 = oe2Var;
            } else {
                a34.j(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                a34.p();
                i3 = iArr2[0];
                a34.k(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                a34.p();
                oe2Var2 = oe2Var;
                i4 = i;
                i5 = i2;
            }
            arrayDeque.add(oe2Var2.J(i3, i4, i5));
        }
    }

    public final void b() {
        Iterator e = e();
        while (true) {
            u33 u33Var = (u33) e;
            if (u33Var.hasNext()) {
                ((we2) u33Var.next()).a();
            } else {
                this.a.clear();
                this.b.clear();
                return;
            }
        }
    }

    public final void c(oe2 oe2Var, int i, int i2) {
        if (!((u33) e()).hasNext()) {
            a(oe2Var, i, i2);
            return;
        }
        we2 we2Var = (we2) ((u33) e()).next();
        if (we2Var.c == i && we2Var.d == i2) {
            return;
        }
        b();
        a(oe2Var, i, i2);
    }

    public final int d() {
        if (!((u33) e()).hasNext()) {
            return this.c;
        }
        return this.a.size();
    }

    public final Iterator e() {
        Iterable[] iterableArr = {this.a, this.b};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new a72(iterableArr).iterator();
    }

    public final we2 f() {
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty()) {
            we2 we2Var = (we2) arrayDeque.remove();
            this.b.add(we2Var);
            return we2Var;
        }
        ze0.m("Textures are all in use. Please release in-use textures before calling useTexture.");
        return null;
    }
}
