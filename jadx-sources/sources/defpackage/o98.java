package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o98 extends ia8 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o98(String str, Class cls, boolean z, boolean z2, byte b) {
        super(str, cls, z, z2);
        this.f = b;
    }

    @Override // defpackage.ia8
    public void a(Iterator it, ab8 ab8Var) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        ab8Var.a(next, str);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    ab8Var.a(sb.toString(), str);
                    return;
                }
                return;
            default:
                super.a(it, ab8Var);
                return;
        }
    }

    @Override // defpackage.ia8
    public void b(Object obj, ab8 ab8Var) {
        boolean z;
        switch (this.f) {
            case 1:
                wd7 wd7Var = (wd7) obj;
                if (wd7Var != null) {
                    sd7 sd7Var = wd7Var.a.z;
                    sd7Var.getClass();
                    int i = 0;
                    while (true) {
                        if (i < sd7Var.c() - sd7Var.b()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (i < sd7Var.c() - sd7Var.b()) {
                                ud7 ud7Var = sd7Var.y;
                                int b = sd7Var.b() + i;
                                i++;
                                Map.Entry entry = (Map.Entry) ud7Var.x[b];
                                if (!((Set) entry.getValue()).isEmpty()) {
                                    Iterator it = ((Set) entry.getValue()).iterator();
                                    while (it.hasNext()) {
                                        ab8Var.a(it.next(), (String) entry.getKey());
                                    }
                                } else {
                                    ab8Var.a(null, (String) entry.getKey());
                                }
                            } else {
                                qi2.e();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.b(obj, ab8Var);
                return;
        }
    }
}
