package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u36 extends d04 {
    public final PointerInputEventHandler A;
    public final Object x;
    public final Object y;
    public final Object[] z;

    public u36(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.x = obj;
        this.y = obj2;
        this.z = objArr;
        this.A = pointerInputEventHandler;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new a46(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        a46 a46Var = (a46) xz3Var;
        Object obj = a46Var.L;
        Object obj2 = this.x;
        boolean z = true;
        boolean z2 = !a34.i(obj, obj2);
        a46Var.L = obj2;
        Object obj3 = a46Var.M;
        Object obj4 = this.y;
        if (!a34.i(obj3, obj4)) {
            z2 = true;
        }
        a46Var.M = obj4;
        Object[] objArr = a46Var.N;
        Object[] objArr2 = this.z;
        if (objArr != null && objArr2 == null) {
            z2 = true;
        }
        if (objArr == null && objArr2 != null) {
            z2 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z2 = true;
        }
        a46Var.N = objArr2;
        Class<?> cls = a46Var.O.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.A;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            a46Var.c1();
        }
        a46Var.O = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u36)) {
            return false;
        }
        u36 u36Var = (u36) obj;
        if (!a34.i(this.x, u36Var.x) || !a34.i(this.y, u36Var.y)) {
            return false;
        }
        Object[] objArr = u36Var.z;
        Object[] objArr2 = this.z;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        if (this.A == u36Var.A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.x;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Object obj2 = this.y;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object[] objArr = this.z;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return this.A.hashCode() + ((i5 + i3) * 31);
    }
}
