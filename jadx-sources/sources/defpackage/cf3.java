package defpackage;

import java.io.Serializable;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cf3 implements zs7 {
    public volatile Object A;
    public final /* synthetic */ byte x;
    public Object y;
    public final Serializable z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.io.Serializable] */
    public cf3(byte b) {
        this.x = b;
        switch (b) {
            case 2:
                this.y = new Object();
                this.z = a88.class.getName();
                return;
            default:
                op7 op7Var = op7.F;
                this.z = new Object();
                this.A = op7Var;
                return;
        }
    }

    @Override // defpackage.zs7
    public Object a() {
        zs7 zs7Var = (zs7) this.A;
        pp7 pp7Var = pp7.D;
        if (zs7Var != pp7Var) {
            synchronized (((rf0) this.z)) {
                try {
                    if (((zs7) this.A) != pp7Var) {
                        Object a = ((zs7) this.A).a();
                        this.y = a;
                        this.A = pp7Var;
                        return a;
                    }
                } finally {
                }
            }
        }
        return this.y;
    }

    public Logger b() {
        Logger logger = (Logger) this.A;
        if (logger != null) {
            return logger;
        }
        synchronized (this.y) {
            try {
                Logger logger2 = (Logger) this.A;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.z);
                this.A = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger c() {
        Logger logger = (Logger) this.A;
        if (logger != null) {
            return logger;
        }
        synchronized (((rf0) this.y)) {
            try {
                Logger logger2 = (Logger) this.A;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.z);
                this.A = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.x) {
            case 1:
                Object obj = (zs7) this.A;
                if (obj == pp7.D) {
                    String valueOf = String.valueOf(this.y);
                    obj = qx1.q(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
                }
                String valueOf2 = String.valueOf(obj);
                return qx1.q(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
            default:
                return super.toString();
        }
    }

    public cf3(Class cls) {
        this.x = (byte) 0;
        this.y = new Object();
        this.z = cls.getName();
    }
}
