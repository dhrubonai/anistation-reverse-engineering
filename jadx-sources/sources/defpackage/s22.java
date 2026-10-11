package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s22 extends l1 {
    public final /* synthetic */ u22 A;
    public final ArrayDeque z;

    public s22(u22 u22Var) {
        this.A = u22Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.z = arrayDeque;
        File file = (File) u22Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new t22(file));
        } else {
            this.x = (byte) 2;
        }
    }

    @Override // defpackage.l1
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.z;
            t22 t22Var = (t22) arrayDeque.peek();
            if (t22Var == null) {
                file = null;
                break;
            }
            a = t22Var.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(t22Var.a) || !a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file != null) {
            this.y = file;
            this.x = (byte) 1;
        } else {
            this.x = (byte) 2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [t22, o22] */
    /* JADX WARN: Type inference failed for: r1v7, types: [t22, o22] */
    public final o22 b(File file) {
        int ordinal = ((v22) this.A.c).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                file.getClass();
                return new t22(file);
            }
            ze0.l();
            return null;
        }
        file.getClass();
        return new t22(file);
    }
}
