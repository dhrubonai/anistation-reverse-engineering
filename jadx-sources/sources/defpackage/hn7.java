package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hn7 {
    public final zp2 a;
    public vs7 b;
    public final l87 c;
    public final fk7 d;

    /* JADX WARN: Type inference failed for: r1v5, types: [fk7, java.lang.Object] */
    public hn7() {
        zp2 zp2Var = new zp2((byte) 28);
        this.a = zp2Var;
        this.b = ((vs7) zp2Var.y).e();
        final byte b = 1;
        this.c = new l87((byte) 1);
        ?? obj = new Object();
        obj.x = new TreeMap();
        obj.y = new TreeMap();
        this.d = obj;
        Callable callable = new Callable(this) { // from class: bc7
            public final /* synthetic */ hn7 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                byte b2 = b;
                hn7 hn7Var = this.b;
                switch (b2) {
                    case 0:
                        return new ow7(hn7Var.c);
                    default:
                        return new ow7(hn7Var.d);
                }
            }
        };
        HashMap hashMap = (HashMap) ((fq3) zp2Var.A).y;
        hashMap.put("internal.registerCallback", callable);
        final byte b2 = 0;
        hashMap.put("internal.eventLogger", new Callable(this) { // from class: bc7
            public final /* synthetic */ hn7 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                byte b22 = b2;
                hn7 hn7Var = this.b;
                switch (b22) {
                    case 0:
                        return new ow7(hn7Var.c);
                    default:
                        return new ow7(hn7Var.d);
                }
            }
        });
    }

    public final boolean a(mc7 mc7Var) {
        l87 l87Var = this.c;
        try {
            l87Var.y = mc7Var;
            l87Var.z = mc7Var.clone();
            ((ArrayList) l87Var.A).clear();
            ((vs7) this.a.z).g("runtime.counter", new xh7(Double.valueOf(0.0d)));
            this.d.g(this.b.e(), l87Var);
            if (((mc7) l87Var.z).equals((mc7) l87Var.y)) {
                if (((ArrayList) l87Var.A).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void b(mv7 mv7Var) {
        ti7 ti7Var;
        try {
            zp2 zp2Var = this.a;
            this.b = ((vs7) zp2Var.y).e();
            if (!(zp2Var.J(this.b, (ov7[]) mv7Var.r().toArray(new ov7[0])) instanceof eh7)) {
                for (gv7 gv7Var : mv7Var.s().r()) {
                    List s = gv7Var.s();
                    String r = gv7Var.r();
                    Iterator it = s.iterator();
                    while (it.hasNext()) {
                        ik7 J = zp2Var.J(this.b, (ov7) it.next());
                        if (J instanceof zj7) {
                            vs7 vs7Var = this.b;
                            if (!vs7Var.f(r)) {
                                ti7Var = null;
                            } else {
                                ik7 i = vs7Var.i(r);
                                if (i instanceof ti7) {
                                    ti7Var = (ti7) i;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(r)));
                                }
                            }
                            if (ti7Var != null) {
                                ti7Var.a(this.b, Collections.singletonList(J));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(r)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
