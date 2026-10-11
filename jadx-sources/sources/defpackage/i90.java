package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i90 {
    public int a;
    public boolean b;
    public final Object c;
    public Object d;

    public i90(Context context, y9 y9Var) {
        this.c = y9Var;
        this.a = 0;
        this.d = new GestureDetector(context, new my2(this));
    }

    public static i90 c(char c) {
        return new i90(new sn3((Object) new zk0(c, (byte) 0), (byte) 18));
    }

    public static i90 d(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("The separator may not be the empty string.", z);
        if (str.length() == 1) {
            return c(str.charAt(0));
        }
        return new i90(new tv(str, (char) 0));
    }

    public vi5 a(Object obj) {
        vi5 vi5Var;
        synchronized (this.c) {
            try {
                int b = b();
                vi5Var = new vi5(b, obj);
                if (this.b) {
                    vi5Var.q();
                } else {
                    ((js) this.d).put(Integer.valueOf(b), vi5Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vi5Var;
    }

    public int b() {
        int i;
        synchronized (this.c) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public List e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator u = ((rw5) this.d).u(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            pw5 pw5Var = (pw5) u;
            if (pw5Var.hasNext()) {
                arrayList.add((String) pw5Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public i90(rw5 rw5Var, boolean z, cl0 cl0Var, int i) {
        this.d = rw5Var;
        this.b = z;
        this.c = cl0Var;
        this.a = i;
    }

    public i90(rw5 rw5Var) {
        this(rw5Var, false, wk0.C, Integer.MAX_VALUE);
    }

    public i90(int i) {
        this.c = new wg6[i];
        this.b = false;
    }

    public i90() {
        this.c = new Object();
        this.d = new so5(0);
    }
}
