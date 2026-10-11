package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tg6 {
    public final int a;
    public final ea2 b;
    public boolean i;
    public byte[] j;
    public final boolean l;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final HashMap h = new HashMap();
    public long k = -9223372036854775807L;

    public tg6(int i, ea2 ea2Var, boolean z) {
        this.a = i;
        this.b = ea2Var;
        this.l = z;
    }

    public final int a() {
        ea2 ea2Var = this.b;
        if (qy3.i(ea2Var.p)) {
            int i = ea2Var.L;
            if (i != -1) {
                return i;
            }
            return 48000;
        }
        return 90000;
    }
}
