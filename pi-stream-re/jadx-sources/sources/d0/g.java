package d0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.appcompat.widget.r;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final n.j f3022a = new n.j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3023b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3024c;

    /* renamed from: d, reason: collision with root package name */
    public static final n.k f3025d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3023b = threadPoolExecutor;
        f3024c = new Object();
        f3025d = new n.k();
    }

    public static f a(String str, Context context, r rVar, int i10) {
        int i11;
        n.j jVar = f3022a;
        Typeface typeface = (Typeface) jVar.get(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            h H = w7.b.H(context, rVar);
            int i12 = H.f3026a;
            int i13 = 1;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                i[] iVarArr = (i[]) H.f3027b;
                if (iVarArr != null && iVarArr.length != 0) {
                    for (i iVar : iVarArr) {
                        int i14 = iVar.f3032e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                    i13 = 0;
                }
                i11 = i13;
            }
            if (i11 != 0) {
                return new f(i11);
            }
            Typeface z9 = z.i.f11865a.z(context, (i[]) H.f3027b, i10);
            if (z9 != null) {
                jVar.put(str, z9);
                return new f(z9);
            }
            return new f(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
