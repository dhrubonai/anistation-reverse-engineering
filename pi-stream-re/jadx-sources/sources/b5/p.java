package b5;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1536a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f1537b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f1538c;

    static {
        new k(l.a("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new k(l.a("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f1536a = new k(l.a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f1537b = new k(l.a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
    }

    public static synchronized void a(Context context) {
        synchronized (p.class) {
            if (f1538c == null) {
                if (context != null) {
                    f1538c = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}
