package defpackage;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z97 implements ja7 {
    public static final z97 f;
    public og5 a;
    public Date b;
    public boolean c;
    public ka7 d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r0v0, types: [z97, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ka7, java.lang.Object] */
    static {
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.a = new og5((byte) 9);
        obj2.d = obj;
        f = obj2;
    }

    @Override // defpackage.ja7
    public final void a(boolean z) {
        Date date;
        if (!this.e && z) {
            this.a.getClass();
            Date date2 = new Date();
            Date date3 = this.b;
            if (date3 == null || date2.after(date3)) {
                this.b = date2;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(ia7.c.b).iterator();
                    while (it.hasNext()) {
                        k6 k6Var = ((ba7) it.next()).e;
                        Date date4 = this.b;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        k6Var.c(date);
                    }
                }
            }
        }
        this.e = z;
    }
}
